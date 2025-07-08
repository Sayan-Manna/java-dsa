package Arrays.Medium;

import java.util.*;

// Leetcode - 15
//Input: nums = [-1,0,1,2,-1,-4] // [-4,-1,-1,0,1,2]
//Output: [[-1,-1,2],[-1,0,1]] -> all triplets sums to 0
public class ThreeSum {
    // O(N * N); Aux Space: O(1)
    static List<List<Integer>> Solution(int[] arr) {
        // // Optimized
        List<List<Integer>> ans = new LinkedList<>();
        // Sort the array
        Arrays.sort(arr);
        // Now we know the condition a+b+c = 0, where a will be constant
        // Loop for 'a' to change position
        // loop till n-3 as this is the last position till we get a triplet
        for (int i = 0; i < arr.length - 2; i++) {
            // Now we gonna iterate 'a' to a position which is not equals to the previous
            // number it was before
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int low = i + 1, high = arr.length - 1;
                // Now conditions for low and high
                while (low < high) {
                    int sum = arr[i] + arr[low] + arr[high];
                    if (sum == 0) {
                        ans.add(Arrays.asList(arr[i], arr[low], arr[high]));
                        low++;
                        high--;
                        // if the next item after low is the same as low, then skip
                        while (low < high && arr[low] == arr[low - 1])
                            low++;
                        // if the previous item of high is the same as high, then skip
                        while (low < high && arr[high] == arr[high + 1])
                            high--;
                    } else if (sum < 0)
                        low++;
                    else if (sum > 0)
                        high--;
                }
            }
        }
        return ans;
        // // Hashing : O(n^2)
        // Set<List<Integer>> st = new HashSet<>();
        // for (int i=0; i<arr.length-1; i++) {
        // Set<Integer> set = new HashSet<>();
        // for (int j=i+1; j<arr.length; j++) {
        // int third_one = -(arr[i]+arr[j]);
        // if (set.contains(third_one)) {
        // List<Integer> list = Arrays.asList(arr[i],arr[j], third_one);
        //// list.add(arr[i]);
        //// list.add(arr[j]);
        //// list.add(third_one);
        // Collections.sort(list);
        // st.add(list);
        // }
        // set.add(arr[j]);
        // }
        // }
        // return new ArrayList<>(st);

        // Naive -1 : 3loops + hashSet + list + list sorting
        // List<List<Integer>> ans = new ArrayList<>();
        // HashSet<List<Integer>> set = new HashSet<>(); // extra
        // for (int i=0; i<arr.length-2; i++) {
        // for (int j=i+1; j<arr.length-1; j++) {
        // for (int k=j+1; k<arr.length; k++) {
        // if (arr[i]+arr[j]+arr[k] == 0) {
        // List<Integer> list = new ArrayList<>(); // extra
        // list.add(arr[i]);
        // list.add(arr[j]);
        // list.add(arr[k]);
        // Collections.sort(list);
        // if (!set.contains(list)) {
        // set.add(list);
        // ans.add(list);
        // }
        // }
        // }
        // }
        // }
        // return ans;
        // Naive - 2 : Updated: 3loop + sorting (list sort) + 1 arrayList extra
        // Arrays.sort(arr);
        // List<List<Integer>> ans = new ArrayList<>();
        // for (int i=0; i<arr.length-2; i++) {
        // for (int j=i+1; j<arr.length-1; j++) {
        // for (int k=j+1; k<arr.length; k++) {
        // if (arr[i]+arr[j]+arr[k] == 0) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(arr[i]);
        // list.add(arr[j]);
        // list.add(arr[k]);
        // if (!ans.contains(list)) {
        // ans.add(list);
        // }
        // }
        // }
        // }
        // }
        // return ans;

    }

    public static void main(String[] args) {
        // int[] arr = new int[]{-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};
        int[] arr = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> list = Solution(arr);
        System.out.println(list);
    }
}

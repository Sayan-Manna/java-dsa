package Arrays.Medium;
//Leetcode:229:Given an integer array of size n, find *all elements* that appear more than ⌊n/3⌋ times

import java.util.ArrayList;
import java.util.List;

public class majorityElement2 {
    private static List<Integer> majorityElems(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        // Boyer Moore Voting Algo : Optimal
        //  To handle case when the arr is [-1,-1,-1], don't use -1 in majors
        int firstMajor = Integer.MIN_VALUE, firstVote = 0, secondMajor = Integer.MIN_VALUE, secondVote = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstMajor) {
                firstVote++;
            } else if (arr[i] == secondMajor) {
                secondVote++;
            } else if (firstVote == 0) {
                firstMajor = arr[i];
                firstVote = 1;
            } else if (secondVote == 0) {
                secondMajor = arr[i];
                secondVote = 1;
            } else {
                firstVote--;
                secondVote--;
            }
        }
        // As this point any one of the two or the two could be my majority elements, we
        // need to check for that
        // So let's calculates the votes
        firstVote = secondVote = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstMajor) {
                firstVote++;
            } else if (arr[i] == secondMajor) {
                secondVote++;
            }
        }
        if (firstVote > arr.length / 3) {
            ans.add(firstMajor);
        }
        if (secondVote > arr.length / 3) {
            ans.add(secondMajor);
        }
        // --------------------
        // Hashing

        // ---------------------
        // Brute-force
//        for(int i=0;i<arr.length; i++){
//            int count = 1;
//            for(int j=i+1;j<arr.length; j++){
//                if(arr[i] == arr[j]){
//                    count++;
//                }
//            }
//
//            if(count > (arr.length/3)){
//                if(!ans.contains(arr[i])){
//                    ans.add(arr[i]);
//                }
//
//            }
//        }
// OR
//        int maxCount = -1, index = -1;
//        for (int i=0; i<arr.length; i++) {
//            int count = 0;
//            for (int j=0; j<arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                }
//            }
//            if (maxCount < count) {
//                maxCount = count;
//                index = i;
//            }
//        }
//        if (maxCount > arr.length/3) {
//            if (!ans.contains(arr[index])) {
//                ans.add(arr[index]);
//            }
//        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,1,2,3};
        List<Integer> list = majorityElems(arr);
        for (int i : list) {
            System.out.print(i +" ");
        }
    }
}

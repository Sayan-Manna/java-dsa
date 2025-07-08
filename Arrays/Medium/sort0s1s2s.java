package Arrays.Medium;
// Leetcode - 75 : Sort an array of 0s, 1s and 2s
public class sort0s1s2s {
    private static void Sort(int[] arr) {
        // 3-pointer approach: a variation of Dutch-National Flag Algorithm
        /*
        - low, mid, high -> low, mid = 0 initially
        - while mid <= high
            - if arr[mid] == 0
                - swap arr[low] and arr[mid]
                - increment low and mid
            - if arr[mid] == 1
                - increment mid
            - if arr[mid] == 2
                - swap arr[mid] and arr[high]
                - decrement high

         */
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        int temp;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0 -> {
                    // Swap low and high and increment low and mid
                    temp = arr[low];
                    arr[low] = arr[high];
                    arr[high] = temp;
                    mid++;
                    low++;
                }
                case 1 ->
                    // Just increment mid
                    mid++;

                case 2 -> {
                    // Swap mid with high
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    // Decrement high
                    high--;
                }
            }
        }
        // Using Count Sort : O(N)+O(N)
//        int count_0 = 0;
//        int count_1 = 0;
//        int count_2 = 0;
//        for (int i=0; i<arr.length; i++) { // 0001111222
//            if (arr[i] == 0) count_0++;
//            if (arr[i] == 1) count_1++;
//            if (arr[i] == 2) count_2++;
//        }
//        for (int i=0; i<count_0; i++) {
//            arr[i] = 0;
//        }
//        // if 0s count > 1s count, then lower index is bigger, so doesn't make any sense, that's why
//        // sum it up the total length till 1 => count_0+count_1
//        for (int i=count_0; i<(count_0+count_1); i++) {
//            arr[i] = 1;
//        }
//        // here also i < count_0 + count_1 + count_2
//        for (int i=(count_0+count_1); i<arr.length; i++) {
//            arr[i] = 2;
//        }
//        for (int i:arr) {
//            System.out.print(i+" ");
//        }
        // Using Sorting : O(nlog(n))
    }

    public static void main(String[] args) {
        int[] arr = {1,2,0,1,0,0,2,0,1};
        Sort(arr);
    }
}

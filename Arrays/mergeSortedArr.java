package Arrays;
// LC-88
public class mergeSortedArr {
    private static void merge(int[] arr1, int m, int[] arr2, int n) {
        // Using mergesort w/o extra space => O(n+m) | O(1)
        // Now as arr1 has extra spaces stored as 0 for remaining elements
        // we gonna use this
        // ----
        // Store the last index in index1 and index2
        int index1 = m-1, index2 = n-1;
        // (m+n)th index == last index of arr having size m+n
        int resultIndex = m+n-1;
        // loop will until indices reaches to -1
        while (index1 >= 0 && index2 >= 0) {
            if (arr1[index1] >= arr2[index2]) {
                arr1[resultIndex--] = arr1[index1--];
            }else{
                arr1[resultIndex--] = arr2[index2--];
            }
        }
        // There might be some case when there are some elements are left as they have bigger size
        // than arr1 and the above loop only traverses until either one of them finishes 1st
        while (index2 >= 0) {
            arr1[resultIndex--] = arr2[index2--];
        }

        // Using Mergesort + extra space => O(n+m) | O(n+m)
//        int[] result = new int[m+n];
//        int index1 = 0;
//        int index2 = 0;
//        int resultIndex = 0;
//        while(index1 < m && index2 < n) {
//            if (arr1[index1] < arr2[index2]) {
//                result[resultIndex++] = arr1[index1++];
//            } else {
//                result[resultIndex++] = arr2[index2++];
//            }
//        }
//        while (index1 < m) {
//            result[resultIndex++] = arr1[index1++];
//        }
//        while (index2 < n) {
//            result[resultIndex++] = arr2[index2++];
//        }
//        for(int i =0; i < m+n; i++) {
//            arr1[i] = result[i];
//        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,6,0,0,0};
        int m = 3;
        int[] arr2 = {1,2,3};
        int n = 3;
        merge(arr1, m, arr2, n);
    }
}

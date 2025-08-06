package StackAndQueue;

public class LargestRectangleInHistogram {

    private static int largestRectangleArea(int[] arr) {
        // Brute-force
        int count = 0;
        int total = 0;
        for (int i=0; i<arr.length; i++) {

            if (i==0) {
                int idx = 0;
                while (idx < arr.length && arr[idx+1] >= arr[i]) {
                    count++;
                    idx++;
                }
                if (idx > 0) {
                    total += arr[i] * idx;
                }
            }else if (i==arr.length-1) {
                int idx = arr.length-1;
                while (idx >0 && arr[idx-1] >= arr[i]) {
                    count++;
                    idx--;
                }
                if (idx > 0) {
                    total += arr[i] * idx;
                }
            }else {
                int idx = 0;
                while (idx < arr.length-1 && arr[idx+1] >= arr[i]) {
                    count++;
                    idx++;
                }
                if (idx > 0) {
                    total += arr[i] * idx;
                }
                idx = arr.length-1;
                while (idx >0 && arr[idx-1] >= arr[i]) {
                    count++;
                    idx--;
                }
                if (idx > 0) {
                    total += arr[i] * idx;
                }

            }

        }
        return total;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(arr));
    }
}

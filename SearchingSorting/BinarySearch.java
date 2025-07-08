package SearchingSorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int k = 6;
        int low = 0, high = arr.length-1;
        int ans = -1;
        while (low <= high) {
            int mid = (low+high)/2;
            if (arr[mid] > k) {
                high = mid-1;
            }else if (arr[mid] < k) {
                low = mid+1;
            }else{
                ans = arr[mid];
                break;
            }
        }
        System.out.println(ans-1); // index of the searchable number
    }
}

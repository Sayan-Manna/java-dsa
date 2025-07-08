package Arrays;
// 1, 2, 4, 5, 6, 7 || o/p: 2 (4-5-6 and 5-6-7)

public class countTriples {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        int count = 0;
        for (int i=0; i<arr.length; i++) {
            try {
                if (arr[i+1]-arr[i] == 1 && arr[i+2]-arr[i+1] == 1) {
                    count++;
                }
            }catch (Exception e) {
                break;
            }

        }
        System.out.println(count);
    }
}

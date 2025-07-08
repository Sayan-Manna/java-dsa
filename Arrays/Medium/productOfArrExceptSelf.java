package Arrays.Medium;
import java.util.Arrays;

public class productOfArrExceptSelf {
    static void Solution(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res,1);
        // Brute-Force => 2 loops
//        for (int i=0; i<n; i++) {
//            for (int j=0; j<n; j++) {
//                if (i == j) {
//                    continue;
//                }else{
//                    res[i] *= arr[j];
//                }
//            }
//        }

        // 2-pointer
        // Optimal => division => won't work in Leetcode as product might exceed the constraint
//        int product =1;
//        int countZero=0;
//        for(int i = 0 ; i < n ; i++){
//            if(arr[i] == 0){
//                countZero++;
//            }else{
//                product *= arr[i]; // multiply only non-zeros
//            }
//        }
//        if(countZero == 0){
//            for(int i = 0 ; i < n ; i++){
//                res[i] = product/arr[i];
//            }
//        }
//        else if(countZero == 1){
//            for(int i = 0 ; i < n ; i++){
//                if(arr[i] == 0){
//                    res[i] = product; // in place of 0, the product of non-zero nums will be there
//                }else{
//                    res[i] = 0;
//                }
//            }
//        }
//        else{ // if more than 1 zero
//            for(int i = 0 ; i < n ; i++){
//                res[i] = 0;
//            }
//        }
        // Optimal

        for (int i=1; i<n; i++) {
            res[i] *= arr[i-1]*res[i-1];
        }
        int product=1;
        for (int i=n-1; i>=0; i--) {
            res[i] *= product;
            product *= arr[i];
        }
        System.out.println(Arrays.toString(res));
    }
    public static void main(String[] args) {
        // Brute
        int[] arr = {1,2,3,4};
        Solution(arr);
    }
}

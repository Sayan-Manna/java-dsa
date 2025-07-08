package Arrays;

import java.util.HashSet;
public class MissingElemIn2ndArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,5};
//        Hash set : O(n+m)/O(m)
//        HashSet<Integer> set = new HashSet<>();
//        // Put elements of 2nd element in hashset
//        for (int i=0; i< arr2.length; i++) {
//            set.add(arr2[i]);
//        }
//        // Print all elements of 1st array which are not present in the hashset
//        for (int i=0; i< arr1.length; i++) {
//            if (!set.contains(arr1[i])) {
//                System.out.print(arr1[i]+" ");
//            }
//        }

        // O(n*m)
        boolean flag = false;
        for (int i=0; i<arr1.length; i++) {
            flag = false;
            for (int j=0; j<arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.print(arr1[i]+" ");
            }

        }
    }
}

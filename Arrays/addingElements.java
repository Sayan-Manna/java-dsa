package Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addingElements {
    private static void insertAtBegin(Integer[] arr, int value) {
        // Using a larger array (it doesn't change the original array)
         int[] newArr = new int[arr.length+1];
         for (int i = 1; i < newArr.length; i++) {
             newArr[i] = arr[i-1];
         }
         newArr[0] = value;
         System.out.println(Arrays.toString(newArr));

        // using ArrayList
//       List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//       list.add(0, value);
//       arr = list.toArray(arr);
//       System.out.println(Arrays.toString(arr));

    }
    private static void insertAtEnd(Integer[] arr, int value) {
        int[] newArr = new int[arr.length+1];
        for (int i=0; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length-1] = value;
        System.out.println(Arrays.toString(newArr));

        // using ArrayList
//        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//        list.add(value);
//        arr = list.toArray(arr);
//        System.out.println(Arrays.toString(arr));
    }
    private static void insertAtMiddle(Integer[] arr, int value) {
        int[] newArr = new int[arr.length+1];
        for (int i=0; i<arr.length/2; i++) {
            newArr[i] = arr[i];
        }
        newArr[(arr.length/2)] = value;
        for (int i=(arr.length/2)+1; i<arr.length; i++) {
            newArr[i] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));
    }
    private static void insertAtPosition(Integer[] arr, int pos, int value) {
        // In one traversal - both solution
        int[] newArr = new int[arr.length+1];
        int j = 0; // in case position found, we won't increment that to get the next value
        for (int i = 0; i < newArr.length; i++) {
            if (i == pos-1) {
                newArr[i] = value;
            }else{
                newArr[i] = arr[j];
                j++;
            }
        }
        // or
//        for (int i=0; i<newArr.length; i++) {
//            if (i < pos-1) {
//                newArr[i] = arr[i];
//            }else if (i == pos-1) {
//                newArr[i] = value;
//            }else if (i > pos-1) {
//                newArr[i] = arr[i-1];
//            }
//        }

        System.out.println(Arrays.toString(newArr));

        // using ArrayList
//       List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//       list.add(pos-1, value);
//       arr = list.toArray(arr);
//       System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] arr = {10,9,14,8,20,48,16,9};
        int value = 40;
        int pos = 4;
        insertAtBegin(arr,value);
        insertAtEnd(arr, value);
        insertAtMiddle(arr, value);
        insertAtPosition(arr, pos, value);
        System.out.println();

    }
}

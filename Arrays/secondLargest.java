package Arrays;

public class secondLargest {
    public static void main(String[] args) {
        int[] arr = {7,2,3,4,5,6};
        // without sorting
        // efficient
        int largest = 0;
        int secondLargest = -1;
        for (int i=0; i<arr.length; i++) {
            if (arr[i] > arr[largest]) {
                secondLargest = largest;
                largest = i;
            }else{
                secondLargest = i;
            }
        }
        System.out.println(arr[secondLargest]);

        // 3rd largest - 1 : gfg
//        int thirdLargest(int a[], int n)
//        {
//            // Your code here
//            int f=0, s=0, t=0;
//            for (int i=0; i<n; i++) {
//                if (a[i]>f){
//                    t = s;
//                    s = f;
//                    f = a[i];
//                }else if (a[i] > s && a[i] < f) {
//                    t = s;
//                    s = a[i];
//                }else if (a[i]>t && a[i]<s) {
//                    t=a[i];
//                }
//            }
//            return t;
//        }
        // or
        // much more sense
    //   int a=0,b=0,c=0;
    //   for(int i=0; i<n;i++){
    //       if(arr[i]  > a && arr[i] > b ){
    //          a=arr[i];
    //       }else if (arr[i]  < a && arr[i] > b ){
    //           b=arr[i];
    //       }else  if(arr[i] <a && arr[i] < b && arr[i] > c){
    //           c = arr[i];
    //       }
    //   }
    //   return c;


//           Process 1 : find the largest, then exclude it And find the largest again

//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//        for (int i : arr)
//            largest = Math.max(largest, i);
//
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] != largest) {
//                if (secondLargest < arr[i]) {
//                    secondLargest = arr[i];
//                }
//
//            }
//        }
//        System.out.println(secondLargest);
    }
}

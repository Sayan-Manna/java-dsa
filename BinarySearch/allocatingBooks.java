package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
// similar problem : painter's partition
// similar problem : allocate minimum number of pages
public class allocatingBooks {
    public static int countStudents(ArrayList<Integer> arr, int maxPage) {
//        int noOfStudents = 0;
//        int sum = 0;
//        for (int i=0; i<arr.size(); i++) {
//            sum += arr.get(i);
//            if (sum > maxPage) {
//                noOfStudents++;
//                sum = arr.get(i);
//            }
//        }
//        return noOfStudents+1;
        // or
        //
        int noOfStudents = 1;
        int pagesStudent = 0;
        for (int i=0; i<arr.size(); i++) {
            if (pagesStudent + arr.get(i) > maxPage) {
                noOfStudents++;
                pagesStudent = arr.get(i);
            }else pagesStudent += arr.get(i);
        }
        return noOfStudents;
    }
    private static int findPages(ArrayList<Integer> arr, int n, int students) {
        if (students > n) return -1;
        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        // Binary Search
        while (low <= high) {
            int mid = low + ((high-low) >> 1);
            if (countStudents(arr, mid) > students) low=mid+1;
            else high = mid-1;
        }
        return low;
        // Brute-force
        // -1 case

//        for (int pages = low; pages <= high; pages++) {
//            if (countStudents(arr, pages) == students) {
//                return pages;
//            }
//        }
//        return low;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(25, 46, 28, 49, 24));
        int n = arr.size();
        int students = 4;
        System.out.println(findPages(arr, n, students));
    }
}

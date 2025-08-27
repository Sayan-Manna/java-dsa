package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pattern132 {
  private static boolean findPattern(int[] nums) {

    // Monotonic Stack
    int n = nums.length;
    if (n < 3)
      return false;
    int second = Integer.MIN_VALUE;
    Deque<Integer> dq = new ArrayDeque<>();
    for (int i = n - 1; i >= 0; --i) {
      if (nums[i] < second)
        return true;
      while (!dq.isEmpty() && nums[i] > dq.peek()) {
        second = dq.poll();
      }
      dq.offer(nums[i]);
    }
    return false;

    // Brute-force ------------ O(n^3)
//      for (int i = 0; i < nums.length; i++) {
//          for (int j = i + 1; j < nums.length; j++) {
//              for (int k = j + 1; k < nums.length; k++) {
//                  if (nums[i] < nums[k] && nums[j] > nums[k]) {
//                      return true;
//                  }
//              }
//          }
//      }
//      return false;
  }

  public static void main(String[] args) {
    int[] arr = { -1, 3, 2, 0 };
    System.out.println(findPattern(arr));

  }
}

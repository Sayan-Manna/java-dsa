package StackAndQueue;
/*
We are given an array asteroids of integers representing asteroids in a row.
The indices of the asteriod in the array represent their relative position in space.

For each asteroid, the absolute value represents its size, and the sign represents
its direction (positive meaning right, negative meaning left).
Each asteroid moves at the same speed.

Find out the state of the asteroids after all collisions. If two asteroids meet,
the smaller one will explode. If both are the same size, both will explode.
Two asteroids moving in the same direction will never meet.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class AsteroidCollision {
    private static int[] asteroidCollision(int[] asteroids) {
        // List solution also possible
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            // if all are +ve -> moving in right -> no collision
            if (asteroid > 0) stack.push(asteroid);
            // If -ve found -> Collision will happen until the stack is empty otherwise with which we should compare the asteroid size
            // all 3 conditions must be true to prevent infinite loop
            while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                stack.pop();
            }
            // if stack is empty or stack has a -ve asteriod -> PUSH -> No Collision -> [4,17,15,-18,-19] case
            if (stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroid);
            }
            // If 10 and -10 -> both are gone
            if (stack.peek() == -asteroid) {
                stack.pop();
            }
        }
        return stack.stream().mapToInt(Integer::valueOf).toArray();

        // Brute-force --- 2nd
//        List<Integer> list = new ArrayList<>();
//        int j = -1;
//        for (int i=0; i< asteroids.length; i++) {
//            if (asteroids[i] >= 0) {
//                list.add(asteroids[i]);
//                j++;
//            }
//            else {
//                boolean destroyed = false;
//                while (!list.isEmpty() && j>=0 && list.get(j) > 0) {
//                    if (Math.abs(asteroids[i]) > list.get(j)) {
//                        list.remove(j);
//                        --j;
//                    }else if(Math.abs(asteroids[i]) == list.get(j)){
//                            list.remove(j);
//                            destroyed = true;
//                            --j;
//                            break;
//                    }
//                    else {
//                        destroyed = true;
//                        break;
//                    }
//                }
//                if (!destroyed) {
//                    list.add(asteroids[i]);
//                    j++;
//                }
//            }
//        }
//        return list.stream().mapToInt(Integer::valueOf).toArray();


        // Brute-force ------------------||
//        List<Integer> list = new ArrayList<>();
//        for (int asteroid : asteroids) {
//            list.add(asteroid);
//        }
//        int i = 0;
//        // Use while for simplicity
//        while (i < list.size()-1) {
//            // Check if collision will occur between current and next asteroid
//            if (list.get(i) > 0 && list.get(i+1) < 0) {
//                int curr = Math.abs(list.get(i));
//                int next = Math.abs(list.get(i+1));
//                if (curr > next) {
//                    list.remove(i+1);
//                    i = Math.max(0, i - 1); // Include here also to catch chain reactions
//                } else if (curr < next) {
//                    list.remove(i);
//                    // Go back one step to check for more collisions
//                    // For ex: [2, 4, -5, 5]
//                    // i = 1 -> curr = 4, next = |-5|
//                    // as 4 is smaller than 5, we remove 4 and go back one step to check if another collision will occur
//                    i = Math.max(0, i-1);
//                } else {
//                    list.remove(i);
//                    list.remove(i);
//                    // Go back one step to check for more collisions
//                    i = Math.max(0, i-1);
//                }
//            }else {
//                // No collision -> move to next asteroid
//                i++;
//            }
//        }
//        return list.stream().mapToInt(Integer::valueOf).toArray();

    }
    /*
    * NOTE:
    * Here's an example to illustrate: Let's say we have:
    - stack = [3]
    - asteroid = -2

    * In the **infinite loop version**:
    while (!stack.isEmpty() && stack.peek() > 0) {
        if stack.peek() < -asteroid stack.pop();
    }
    1. while loop checks: stack not empty ✓ and peek() > 0 ✓
    2. if check: 3 < |-2| (3 < 2) ❌ - no pop happens
    3. Returns to while loop with same state
    4. Repeats forever...

    * In the **correct version**:
    1. Checks all conditions: not empty ✓, peek > 0 ✓, 3 < 2 ❌
    2. Loop terminates immediately because one condition is false

    The correct version ensures we only enter the loop if we're actually going to pop an element, preventing any possibility of an infinite loop.

     */

    public static void main(String[] args) {
//        int[] asteroids = {4,7,1,1,2,-3,-7,17,15,-16};
        int[] asteroids = {4, 17, 15, -18, -19};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}

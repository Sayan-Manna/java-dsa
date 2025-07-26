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
import java.util.Arrays;

public class AsteroidCollision {
    private static int[] asteroidCollision(int[] asteroids) {

    }

    public static void main(String[] args) {
        int[] asteroids = {5,10,-5};
        System.out.println(Arrays.toString(asteroidCollision(asteroids)));
    }
}

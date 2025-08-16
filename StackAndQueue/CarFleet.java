package StackAndQueue;

import java.util.Arrays;

public class CarFleet {

  private static int carFleet(int target, int[] position, int[] speed) {

    // --------------------| O(NlogN) |
    int n = position.length;
    if (n == 0)
      return 0;

    Integer[] indices = new Integer[n];
    /* [0,1,2,3...] */
    for (int i = 0; i < n; i++) {
      indices[i] = i;
    }

    // Sort by position closer to target first
    /*
     * [0,1,3,4,2] -> so order is : pos = 10, pos = 8, ....
     */
    Arrays.sort(indices, (a, b) -> Integer.compare(position[b], position[a]));

    int fleets = 0;
    double maxTime = 0;

    // Traverse from closest to furthest
    for (int i = 0; i < n; i++) {
      int index = indices[i];
      double time = (double) (target - position[i]) / speed[index];

      // If the car is taking longerm it forms a new fleet
      if (time > maxTime) {
        fleets++;
        maxTime = time;
      }
      // Else it joins the existing fleet
    }
    return fleets;

    // Brute --------------------| O(NlogN + 2N) | O(2N) : cars array of size N
    // int n = position.length;
    // if (n == 0)
    // return 0;

    // // Pair of position and speed to reach target
    /*
     * [[10,1.0], [8,1.0],[0,12.0],....]
     */
    // double[][] cars = new double[n][2];
    // for (int i = 0; i < n; i++) {
    // cars[i][0] = position[i];
    // cars[i][1] = (double) (target - position[i]) / speed[i];
    // }
    // // Sort by position closer to target first
    /*
     * [[10,1.0],[8,1.0],[5,7.0],...]
     */
    // Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

    // int fleets = 0;
    // double maxTime = 0;

    // // Traverse from closest to furtheest
    // for (int i = 0; i < n; i++) {
    // double time = cars[i][1];
    // // If the car is taking longerm it forms a new fleet
    // if (time > maxTime) {
    // fleets++;
    // maxTime = time;
    // }
    // // Else it joins the existing fleet
    // }
    // return fleets;
  }

  public static void main(String[] args) {
    int target = 12;
    int[] position = { 10, 8, 0, 5, 3 };
    int[] speed = { 2, 4, 1, 1, 3 };
    System.out.println(carFleet(target, position, speed));

  }

}

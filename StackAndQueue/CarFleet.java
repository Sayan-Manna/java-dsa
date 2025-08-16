package StackAndQueue;

import java.util.Arrays;

public class CarFleet {

  private static int carFleet(int target, int[] position, int[] speed) {
    // Brute-force
    int n = position.length;
    if (n == 0)
      return 0;

    // Pair of position and speed to reach target
    double[][] cars = new double[n][2];
    for (int i = 0; i < n; i++) {
      cars[i][0] = position[i];
      cars[i][1] = (double) (target - position[i]) / speed[i];
    }
    // Sort by position closer to target first
    Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));

    int fleets = 0;
    double maxTime = 0;

    // Traverse from closest to furtheest
    for (int i = 0; i < n; i++) {
      double time = cars[i][1];
      // If the car is taking longerm it forms a new fleet
      if (time > maxTime) {
        fleets++;
        maxTime = time;
      }
      // Else it joins the existing fleet
    }
    return fleets;
  }

  public static void main(String[] args) {
    int target = 12;
    int[] position = { 10, 8, 0, 5, 3 };
    int[] speed = { 2, 4, 1, 1, 3 };
    System.out.println(carFleet(target, position, speed));

  }

}

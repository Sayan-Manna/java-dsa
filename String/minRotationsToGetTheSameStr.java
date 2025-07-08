package String;
// i/p: geeks, o/p: 5
// i/p: abc, o/p: 3
public class minRotationsToGetTheSameStr {
    private static int minRotation(String s) {
        // Better, O(N^2) | O(1)
        for (int i=1; i<s.length(); i++) {
            if (s.equals(s.substring(i)+s.substring(0, i))) {
                return i;
            }
        }
        return s.length();

        // O(N^2) | O(N) beacause of temp
//        String temp = s + s;
//        boolean found = false;
//        int minNum = 1;
//        for (int i=1; i< s.length(); i++) { // from 1 => bcoz we know 1st string will be equal, but we want to
//            // to check how many rotations it takes to get there,
//            String rotatedStr = temp.substring(i, i+s.length());
//            if (rotatedStr.equals(s)) {
//                found = true;
//                break;
//            }
//            minNum = i;
//        }
//        return !found ? minNum+1 : minNum;
    }
    public static void main(String[] args) {
        String s = "geeks";
        System.out.println(minRotation(s));
    }
}

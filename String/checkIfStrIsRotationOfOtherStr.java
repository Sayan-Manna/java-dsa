package String;

public class checkIfStrIsRotationOfOtherStr {
    public static void main(String[] args) {
        String s1 = "pokemon";
        String s2 = "kemonpo";
        // O(N) as .contains() takes n time | O(N) as temp is having 2N size
        String temp = s1+s1; // add s1 with s1 and store it for iteration
        if (s1.length() == s2.length() && temp.contains(s2)) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

////         O(N^2) because of substring and equals | O(N) because of temp
//        boolean flag = false;
////         Find all rotations then check if the rotation is equals to s2
//        for (int i=0; i<s1.length(); i++) {
//            String rotated = temp.substring(i, i+s1.length()); // xxx  yyy
//            if (rotated.equals(s2)) {
//                flag = true;
//                System.out.println("yes");
//                break;
//            }
//        }
//        if (!flag) {
//            System.out.println("No");
//        }
    }
}

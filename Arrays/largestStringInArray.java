package Arrays;

public class largestStringInArray {
    public static void main(String[] args) {
        String[] names = {"sayan", "debasmita", "kanchu"};
        String largest="";
        for (int i=0; i<names.length; i++) {
            if (names[i].length() > largest.length()) {
                largest = names[i];
            }
        }
        System.out.println(largest);
    }
}

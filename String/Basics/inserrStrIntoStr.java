package String.Basics;
// Input: originalString = "GeeksGeeks", stringToBeInserted = "For", index = 4
//Output: "GeeksForGeeks"
public class inserrStrIntoStr {
    public static void main(String[] args) {
        String originalString = "Computer Portal";
        String stringToBeInserted = "Science ";
        int index = 8;

        String res="";
        // W/o substring()
        for (int i=0; i<originalString.length(); i++) {
            res += originalString.charAt(i);
            if (i == index) {
                res += stringToBeInserted;
            }
        }
        // Using substring()
//        res = originalString.substring(0, index+1) + stringToBeInserted + originalString.substring(index+1);
        System.out.println(res);
    }
}

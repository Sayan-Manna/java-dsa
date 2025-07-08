package String;
//Pokemon
//okemonP
//kemonPo
//emonPok
//monPoke
//onPokem
//nPokemo
public class allRotationsOfStr {
    public static void main(String[] args) {
        String s = "Pokemon";
        int n = s.length();

        for (int i=0; i<n; i++) { // or i=1 -> i<=n for 1st one to be last
            System.out.println(s.substring(i)+s.substring(0,i));
        }
        // O(N^2) | O(N)
//        s = s + s;
//        for (int i=0; i<n; i++) { //if for (i=1 -> i<=n) => it will print the 1st string("Pokemon") at last
//            System.out.println(s.substring(i, i+n));
//        }
    }
}

package Digital;
//i/p: Tec7hno56Name
//o/p: TechnoName
//i/p: Tec7h5no6Name
//o/p: Tech5no6Name
public class remove7And56 {
    public static void main(String[] args) {
        String s = "Tec7h5no6Name";
        // Without space
        s = s.replace("7", "");
        s = s.replace("56","");
        System.out.println(s);

        // With space
//        String res="";
//        for (int i=0; i<s.length(); i++) {
//            if (s.charAt(i) == '7' || ((s.charAt(i) == '5' ) && (s.charAt(i+1)=='6'))) {
//                i++;
//            }else{
//                res += s.charAt(i);
//            }
//        }
//        System.out.println(res);
    }
}


public class subString {

    public static String returnsubString(String str , int si ,  int ei){

        String Substr="";
        for(int i=si;i<ei;i++){
            Substr+=str.charAt(i);

        }

        return Substr;
    }

    public static void main(String[] args) {
        
        String h = "helllllooooo";

        System.out.println(returnsubString(h, 2, 7));


        System.out.println(h.substring(0,4));
    }


    
}

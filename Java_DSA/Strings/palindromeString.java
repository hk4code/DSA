

public class palindromeString {

    public static boolean checkForPalindromeString(String str){

        int n=str.length();

        for(int i=0;i<(str.length())/2;i++){

            if(str.charAt(i)!=str.charAt(n-1-i)){
                    return false;
            }

        }

        return true;

    }

    public static void main(String[] args) {

        String str ="racecar";

        System.out.println(checkForPalindromeString(str));


        

    }
    
}

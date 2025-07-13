import java.util.Scanner;

public class basicString {

    public static void main(String[] args) {
        
        char arr[] = {'a','b','c','d'};

       //String declaration method 
        
        String str = "abcd";
        String str2 = new String("xyz");

        //String are immutable 

        Scanner sc = new Scanner(System.in);
        String name;
        name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.length());


        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }



    }
    
}

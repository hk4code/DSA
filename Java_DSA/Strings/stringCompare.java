

public class stringCompare {

    public static void main(String[] args) {
        
        String s1 ="Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        if(s1==s2){
            System.out.println("string equals");

        }else{
            System.out.println("not eqaul string");

        }

        if(s1==s3){
            System.out.println("string equals");

        }else{
            System.out.println("not eqaul string");
            
        }

        if(s1.equals(s3)){
            System.out.println("string equals");

        }else{
            System.out.println("not eqaul string");
            
        }


    }
    
}

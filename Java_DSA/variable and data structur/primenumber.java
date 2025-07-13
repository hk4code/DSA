

public class primenumber {
    public static void main(String[] args) {
        
        int n =11234567;
        int flag=0 ;

        for(int i = 2 ;i<=n/2;i++){
            if(n%i==0){
                System.out.println("number is not prime");
                flag=1;
                break;
            }
        }
            if(flag==0){
                System.out.println("number is prime");
            }

    }
    
}

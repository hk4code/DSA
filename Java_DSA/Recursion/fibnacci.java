

public class fibnacci {

    public static int calculatefib(int n){
        if(n==0||n==1){
            return n;

        }
        int fn = calculatefib(n-1) + calculatefib(n-2);
        return fn;
    }


    public static void main(String[] args) {
        int n =49;
        System.out.println(calculatefib(n));
    }
    
}




  
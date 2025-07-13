

public class sumOfNNaturalsNum {

    public static int calculateSum(int n){
        if(n==1){
            return 1;
        }
        int sn = n + calculateSum(n-1);
        return sn;

    }
    public static void main(String[] args) {
        System.out.println(calculateSum(10));
        
    }
    
}

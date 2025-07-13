public class xToThePowerN {

    //O(N)
    public static int pow (int x ,int n){
      if(n==0){
        return 1;
      }
      return x*pow(x, n-1); 
    }

    //FASTER APPROACH 0(Log N)
    public static int powfaster(int x,int n){
        if(n==0){
            return 1;
        }

      int halfpower =  powfaster(x, n/2);
      int halfpow = halfpower*halfpower;
          
      //if n is odd
      if(n%2!=0){
        halfpow = x * halfpow;
      }
      return halfpow;
    }





    public static void main(String[] args) {
        System.out.println(pow(2, 30));
        System.out.println(powfaster(2, 30));
        
    }
    
}

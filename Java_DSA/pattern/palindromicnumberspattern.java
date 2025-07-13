public class palindromicnumberspattern {
    public static void main(String[] args) {
        patten(5);
        alternate_way_for_patten(5);
    }

    public static void patten (int n){
            int k ;
        for(int i =1;i<=n;i++){
                k=i+1;
            for(int j=1 ; j<=n-i;j++){
                System.out.print(" ");
            }
           
            for(int j=1 ; j<=i;j++){

                k--;
                System.out.print(k);
               
            }
            
            for(int j=1 ; j<=i-1;j++){

                   k++;
                System.out.print(k);
                
            }
            System.out.println("");
            
        }


    }
    public static void alternate_way_for_patten (int n){
        
        for(int i =1;i<=n;i++){
               
            for(int j=1 ; j<=n-i;j++){
                System.out.print(" ");
            }
           
            for(int j=i ; j>=1;j--){
                System.out.print(j);
            }
            
            for(int j=2 ; j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
            
        }
    }

}

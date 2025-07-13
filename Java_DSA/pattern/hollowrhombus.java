public class hollowrhombus{
    public static void main(String[] args) {
        hollowrhombuspattern(24);
    }

    public static void hollowrhombuspattern(int n){
        
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
    
            //stars
            if(i==1||i==n){
                for(int j =1;j<=n;j++){
                    System.out.print("*");
                }
            }else{

                System.out.print("*");

                for(int j =1;j<=n-2;j++){
                    System.out.print(" ");
                }

                System.out.print("*");

            }
            
            System.out.println("");
        }
    }
}
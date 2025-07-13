public class rhombus {


    public static void main(String[] args) {
        rhombuspattern(10);
    }

    public static void rhombuspattern(int n){
        for(int i =1;i<=n;i++){
            //spaces
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
    
            //stars
            for(int j =1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
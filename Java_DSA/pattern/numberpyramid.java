public class numberpyramid {
    public static void main(String[] args) {
        numberpyramidpattern(9);
    }

    public static void numberpyramidpattern(int n){

        for(int i =1;i<=n;i++){
            //space
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

            //numberpattern
            for(int j =1;j<=i;j++){
                System.out.print(i+" ");
               
            }
            System.out.println("");
        }


    }
}
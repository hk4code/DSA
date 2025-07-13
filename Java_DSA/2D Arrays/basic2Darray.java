import java.util.Scanner;

public class basic2Darray {


    public static void main(String[] args) {
        
        int mat[][] = new int[2][3];

        Scanner sc = new Scanner(System.in) ;

        for(int i = 0;i<=mat.length;i++){
            for(int j=0;i<=mat[0].length;j++){

                mat[i][j]=sc.nextInt();
            }
        }

        for(int i = 0;i<=mat.length;i++){
            for(int j=0;i<=mat[0].length;j++){
                System.out.print( mat[i][j]);
               
            }
        }
    }
    
}

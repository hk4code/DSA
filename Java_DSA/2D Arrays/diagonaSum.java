

public class diagonaSum {

    public static int DiagonalSumMethod(int matrix[][]){

       int sum=0;
   
         //BRUTE FORCE APPROACH O(N^2)
        // for(int i=0;i<matrix.length;i++){
        //     for(int j=0;j<matrix[0].length;j++){

        //         if(i==j){
        //             sum+= matrix[i][j];
        //         }
        //         else if(i+j==matrix.length-1){
        //             sum=+matrix[i][j];
        //         }
        //     }
        // }



        //OPTIMAL APPROACH O(n)
            for(int i=0;i<matrix.length;i++){
                //primary diagonal
                sum+=matrix[i][i];
                //secondary diagonal
                if(i!=matrix.length-1-i){
                    sum+=matrix[i][matrix.length-i-1];
}
                
            }


     
            return sum;
        }







     

    public static void main(String[] args) {
        

        int matrix[][]={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}}; 
        
        
        int matrix_1[][]={{0,1,2,},
    {3,4,5},
    {6,7,8,},
    };
    int result_1 = DiagonalSumMethod(matrix);
      int result = DiagonalSumMethod(matrix_1);

      System.out.println(result_1+ "for even");
      System.out.println(result + "for odd");
    }

    
  
}

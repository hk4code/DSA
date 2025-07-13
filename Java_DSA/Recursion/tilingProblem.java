



public class tilingProblem {

    public static int tilingProblemSolution(int n){
        
        //base case
        if(n==0||n==1){
            return 1;

        }

        //kaam
        
        //vertical choice
        int fnm1 =tilingProblemSolution(n-1);

        //horizontal choice
        int fnm2=tilingProblemSolution(n-2);

        int totways = fnm1+fnm2;
        return totways;
    }


    public static void main(String[] args) {
        System.out.println(tilingProblemSolution(10));
    }




    
}

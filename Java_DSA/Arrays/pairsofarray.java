
public class pairsofarray   {

    public static void pairsprinting(int num[]){

        for(int i =0;i<=num.length-1;i++){
            for(int j=i+1;j<=num.length-1;j++){
                    System.out.print("("+num[i]+","+num[j]+")");
            }
            System.out.println("");
        }


    }
    
 public static void main(String[] args) {
    int nums[]={2,5,6,3};

    pairsprinting(nums);
    
 }   
}

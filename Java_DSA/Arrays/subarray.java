

public class subarray {

    public static void subarrayprinting(int num[]){

        for(int i=0;i<=num.length-1;i++){
            for(int j=i;j<=num.length-1;j++){
                System.out.print("[");
                for(int k=i;k<=j;k++){
                    System.out.print(num[k]+",");

                }
                System.out.print("]");
                System.out.print(" ,");
            }
            System.out.println("");
        }
    }
                
    public static void main(String[] args) {
        int nums[]={1,4,5,2,9,3};
        subarrayprinting(nums);
    }
}

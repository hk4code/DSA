
public class Bubblesort {

    public static void Bubblesorting(int num[]){
        int temp;

        for(int turn=0;turn<=num.length-2;turn++){
            int swaps=0;
            for(int j=0;j<=num.length-2;j++){

                if(num[j]>=num[j+1]){
                    //swapping
                    temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                    swaps++;
                }
            
            }
            if(swaps==0){
                break;
            }
           
        }
       

    }

    public static void printarr(int num[]){

        for(int i=0;i<=num.length-1;i++){
            System.out.print(num[i]+" ");
        }
    }

    public static void main(String[] args) {
        
        int nums[]={1,2,3,4,5,6,7,8};

        Bubblesorting(nums);
        printarr(nums);


    }
    
}

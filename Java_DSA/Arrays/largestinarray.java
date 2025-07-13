


public class largestinarray {

    public static int largestnuminnarray(int num[])
    {
        int largest = Integer.MIN_VALUE;
    
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
    
            }
        }
        return largest;

    }
    public static void main(String[] args) {
        int numbers[]={3,4,6,7,33,2,9,52,13,1};
        int largenum=largestnuminnarray(numbers);
         System.out.println("the largest num in the array is "+largenum);
    }
    
}



public class reversearray {


    public static void reverse_array_method(int num[]){
        int start=0,end=num.length-1,temp;

        while(start<=end){

            temp=num[start];
            num[start]=num[end];
            num[end]=temp;

            start++;
            end--;

        }

    }
    public static void main(String[] args) {
        
        int num[]={1,4,5,6,9,10,13};
      
            
        System.out.println("original array");
        for(int i=0;i<=num.length-1;i++){
            System.out.println(num[i]);
        }
        
        reverse_array_method(num);
        
        System.out.println("reversed array");
        for(int i=0;i<=num.length-1;i++){
            System.out.println(num[i]);
        }
    }


    
}
public class Binarysearch {

        public static int binary_search_method(int num[],int key){

            int start=0,end=num.length-1,mid;

            while(start<=end){

                     mid = (start+end)/2;

                     if(num[mid]==key){
                        return mid;
                     }
                     if(num[mid]<key){
                       start=mid+1;
                     }else{
                        end=mid-1;
                     }

            
                    }


            return -1;
        }
    public static void main(String[] args) {

        int nums[]={1,2,4,6,9,12,20,25,30,50,66};

       int result= binary_search_method(nums,9);
        if(result!=-1){
            System.out.println("the element is found at index " + result );
        }else{
            System.out.println("the element is not found in the array" );
        }
       
        
    }
    
}

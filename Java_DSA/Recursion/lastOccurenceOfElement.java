

public class lastOccurenceOfElement {

    public static int findLastOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        
        if( findLastOccurence(arr, key, i+1)==-1 && arr[i]==key){
            return i;
        }

        return findLastOccurence(arr, key, i+1);
    }



    public static void main(String[] args) {

        int arr[] = {3,4,55,76,4,6,8,9,0,23};

        System.out.println(findLastOccurence(arr, 4,0));
        
    }
    

    
}

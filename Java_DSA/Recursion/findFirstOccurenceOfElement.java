

public class findFirstOccurenceOfElement {

    public static int findFirstOccurence(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        
        if(arr[i]==key){
            return i;
        }

        return findFirstOccurence(arr, key, i+1);
    }



    public static void main(String[] args) {

        int arr[] = {3,4,55,76,4,6,8,9,0,23};

        System.out.println(findFirstOccurence(arr, 6,0));;
        
    }
    

    
}

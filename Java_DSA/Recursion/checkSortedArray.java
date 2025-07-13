

public class checkSortedArray {

    public static boolean checkSorting(int arr[],int n){
        if(n==arr.length-1){
            return true;
        }
        return (arr[n]<arr[n+1] && checkSorting(arr, n+1));
    }




    public static void main(String[] args) {


        int arr[] ={1,2,56,78,90,123,567,999};
        
       System.out.println(checkSorting(arr, 0)); 
        
    }
    
}

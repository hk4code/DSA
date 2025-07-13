

public class updateithBit {

    public static int clearithBitOfNumber(int n,int i)
    {

        int bitMask = ~(1<<i);

        return n & bitMask;


    }

    public static int setbit(int n,int i){

        int bitMask = 1<<i;

        return n|bitMask;




    }

    public static int updateithbitOfNumber(int n , int i , int newBit){
        
        //APPROACH 1 :

        // if(newBit==0){
        //     return clearithBitOfNumber(n, i);
        // }else{
        //     return setbit(n,i);
        // }
 
        //APPROACH 2 : 

        n = clearithBitOfNumber(n,i);
        int BitMask = newBit<<i;
        return n|BitMask;




    }

    public static void main(String[] args) {

        System.out.println(updateithbitOfNumber(10,2 , 1));


        
    }

    


 
    
}


public class clearithBit {
    
    public static int clearithBitOfNumber(int n,int i)
    {

        int bitMask = ~(1<<i);

        return n & bitMask;


    }
    public static void main(String[] args) {

        System.out.println(clearithBitOfNumber(10,3 ));
        
    }
    
}

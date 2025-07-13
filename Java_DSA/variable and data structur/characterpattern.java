public class characterpattern {
    public static void main(String[] args) {
        int p = 5;
         char ch ='A';
        for(int i =1;i<=p;i++){
            for (int j = 1; j <=i; j++) {
                
                System.out.print(ch);
                ch++;
            }
            System.out.print("\n");
            
        }
    }
}

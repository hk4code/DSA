public class invertedstar {
    
        public static void main(String[] args) {
            int p = 8;
    
            for(int i =1;i<=p;i++){
                for (int j = 1; j <=p-i+1; j++) {
                    System.out.print("*");
                }
                System.out.print("\n");
                
            }
        }
    
}

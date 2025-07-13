public class invertedandrotatedhalfpyramid {
   
       
    public static void main (String[] args) {
        
        int n=10;

        for(int i=1;i<=n;i++){

            //for space
           for(int j=1;j<=n-i;j++){
            System.out.print(" ");        
           }
           //for star
           for(int k=1;k<=i;k++){
            System.out.print("*");    
           }

           //next line space
           System.out.println();
        }

        
    }

    public void  alternateway(int l){
       
              
        
                for (int i = 1; i <= l; i++) {
                    // Print spaces
                    for (int j = 1; j <= i - 1; j++) {
                        System.out.print(" ");
                    }
        
                    // Print stars
                    for (int k = 1; k <= l - i + 1; k++) {
                        System.out.print("*");
                    }
        
                    // Move to the next line
                    System.out.println();
                }
      
        
    }
}
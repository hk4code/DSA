public class sellandbuystocks {

    public static int maxprofit(int num[]){

        int buy_price = Integer.MAX_VALUE;
        int max_profit=0;
        int profit;

        for(int i =0;i<=num.length-1;i++){

            if(buy_price>num[i]){
                buy_price=num[i];
            }else{
                profit=num[i]-buy_price;
                max_profit=Math.max(max_profit,profit);
            }

        }

      

                return max_profit;

    }





    public static void main(String[] args) {
        int price[]={7,1,5,3,6,4};
  
        int result=maxprofit(price);
        System.out.println("the maxixmum profit is "+result);

        
    }
    
}

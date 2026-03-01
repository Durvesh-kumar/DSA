public class Basic {
    public static void buyandsellStocks(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int max_profit = 0;
        for(int i=0; i<price.length; i++){
            
            if(buyPrice < price[i]){
                
                int profit = price[i]-buyPrice;
                max_profit = Math.max(max_profit, profit);
                // max_profit +=profit;
            } else{
                buyPrice = price[i];
            }
        }
        System.out.println("max_profit: " + max_profit);
        System.out.println("buy_price: " + buyPrice);
    }
    public static void main(String args[]){
        int price[] = {7,1,5,3,6,4};
        buyandsellStocks(price);
    }
}
package Kadane.Easy;

public class BuySellStock {

    public int maxProfit(int[] prices) {

        //basic approach =N^2 soltn
        int maxprofit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){

            for(int j=i+1;j<prices.length;j++){

               int profit= prices[j]-prices[i];

               if(maxprofit<profit){
                   maxprofit=profit;
               }

            }
        }
        return maxprofit;
    }

    public int maxProfitKadane(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;

        int sum=0;
        for(int i=1;i<prices.length;i++){
            int profit=prices[i]-prices[i-1];

            sum +=profit;
            if(maxProfit<sum){
                maxProfit=sum;
            }
            if(sum<0){
                sum = 0;
            }
        }


        return maxProfit;
    }

    public static void main(String[] args){

    BuySellStock obj=new BuySellStock();
    //int[] arr={7,1,5,3,6,4};
    int [] arr={7,6,4,3,1};

    //int result= obj.maxProfit(arr);
    int result= obj.maxProfitKadane(arr);
    System.out.println(result);
    }



}

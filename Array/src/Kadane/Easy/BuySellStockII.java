package Kadane.Easy;

public class BuySellStockII {

    public int maxProfit(int[] prices) {

        int totalProfit=0;
        int sum=0;
        for(int i=1;i<prices.length;i++){

            int profit=prices[i]-prices[i-1];

            if(profit <0){
                sum=0;
            }else{
                sum = profit;
            }

            totalProfit +=sum;
        }
        return totalProfit;
    }

    public static void main(String[] args){

    BuySellStockII obj=new BuySellStockII();
    int[] arr={ 7, 1, 5 ,3 , 6 , 4 };

    //int[] arr={1,2,3,4,5};

    int result= obj.maxProfit(arr);

    System.out.println(result);
    }

}

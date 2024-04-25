//TIME COMPLEXITY --> O(n)
public class BUYSELL_STOCKS
{
    public static void buysellStocks(int [] prices)
    {
        int buyprice = Integer.MAX_VALUE;
        int maxProfit=0, currprofit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(buyprice < prices[i])
            {
                currprofit = prices[i]-buyprice;
                maxProfit = Math.max(maxProfit, currprofit);
            }
            else
                buyprice = prices[i];
        }
        System.out.println(maxProfit);
    }
    public static void main(String[] args)
    {
        int prices[] = {7,1,5,3,6,4};
        buysellStocks(prices);
    }
}

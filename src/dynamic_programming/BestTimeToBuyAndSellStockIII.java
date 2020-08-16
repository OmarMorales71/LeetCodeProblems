package dynamic_programming;

public class BestTimeToBuyAndSellStockIII {
    public static void main(String[] args) {
        BestTimeToBuyAndSellStockIII obj = new BestTimeToBuyAndSellStockIII();

        System.out.println(obj.maxProfit2(new int[]{1,2,3,4,5}));
    }

    public int maxProfit(int[] prices) {
        if(prices==null || prices.length<2){
            return 0;
        }

        int firstBuy=-prices[0], firstSell=0;
        int secondBuy=-prices[0], secondSell=0;

        for(int i=1; i< prices.length;i++){
            firstBuy = Math.max(firstBuy, -prices[i]);
            firstSell=Math.max(firstSell, firstBuy+prices[i]);

            secondBuy = Math.max(secondBuy, firstSell- prices[i]);
            secondSell= Math.max(secondSell, secondBuy+ prices[i]);
        }

        return secondSell;
    }

    public int maxProfit2(int[] prices) {//doesn´t work
        if(prices==null || prices.length<2){
            return 0;
        }

        int[] profit1 = new int[prices.length];
        int p1=prices[0];

        int[] profit2 = new int[prices.length];
        int p2=prices[prices.length-1];
        int j= prices.length-2;

        int[] profitFinal= new int[prices.length];
    int ans=0;
        for(int i=1; i< prices.length;i++){

            if(prices[i]-p1>profit1[i-1]){
                profit1[i]=prices[i]-p1;
                p1=0;
            }else{
                profit1[i]=profit1[i-1];
            }
            p2=Math.max(p2, prices[j]);
            if(p2-prices[j]>profit2[j+1]){
                profit2[j]=p2-prices[j];

            }else{
                profit2[j]=profit2[j+1];
            }

            profitFinal[i]+=profit1[i];

            profitFinal[j]+=profit2[j];

            ans=Math.max(ans,Math.max(profitFinal[i],profitFinal[j]));
            j--;


        }

        return ans;
    }
}

package greedy;

public class BestTimeToBuyAndSellStock2 {

	public static void main(String[] args) {
		int[] prices = { 7,6,4,3,1};

		System.out.println(maxProfit(prices));

	}

	public static int maxProfit(int[] prices) {
		if (prices.length == 0 || prices.length == 1)
			return 0;
		int maxProfit = 0;
		int i = 0, j = 1;
		boolean comprando = true;

		for (; j < prices.length; j++) {
			if (comprando) {
				if (prices[i] < prices[j]) {
					comprando = false;
					maxProfit -= prices[i];

				}

			} else {
				if (prices[i] > prices[j]) {
					comprando = true;
					maxProfit += prices[i];

				}

			}
			i++;
		}

		if (!comprando)
			maxProfit += prices[prices.length - 1];

		return maxProfit;
	}

}

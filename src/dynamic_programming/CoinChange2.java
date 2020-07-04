package dynamic_programming;

public class CoinChange2 {

	public static void main(String[] args) {
		CoinChange2 obj = new CoinChange2();
		
		System.out.println(obj.change(4, new int[] {1,2,5}));

	}
	public int change(int amount, int[] coins) {
        if(amount==0)return 1;
        
		int[] ans = new int[amount+1];
		ans[0]=1;
		
		for(int i = 0; i<coins.length;i++) {
			for(int j = coins[i]; j<ans.length;j++) {
				
					ans[j]+=ans[j-coins[i]];
				
			}
		}
		return ans[ans.length-1];
    }
}

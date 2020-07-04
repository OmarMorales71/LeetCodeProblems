package strings.and.arrays;

public class CountingBits {

	public static void main(String[] args) {
		CountingBits obj = new CountingBits();
		
		System.out.println(obj.countBits(5));

	}
	
	public int[] countBits(int num) {
        int [] ans = new int[num+1];
        if(num==0)return ans;
        ans[1]=1;
        
        for(int i=2; i<=num;i++) {
        	if(i%2==0){
        		int index = i/2;
        		ans[i]=ans[index];
        	}else {
        		ans[i]=ans[i-1]+1;
        	}
        }
        return ans;
    }

}

package strings.and.arrays;



public class Remove_K_Digits_Solution1ms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeKdigits("12305607890", 4));
	}
	
	public static String removeKdigits(String num, int k) {
        if (num==null || k<=0) return num;
        char[] c=num.toCharArray();
		int right=0;
		int left=0;
		while(right<c.length){
            if(left==0){
                if(c[right]=='0') // 3  <-0  : 30 (rather than 0)
                    right++;
                else // 3  <-1  : 1 
                    c[left++]=c[right++];
            }
            else if(k>0 && c[left-1]>c[right]){
				left--;
				k--;
			}
            else {
				c[left++]=c[right++];
			}
           
		}
		while (k>0) {
			left--;
            k--;
		}
		return left<=0?"0":new String(c, 0, left);
    }
	


}

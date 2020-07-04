package dynamic_programming;

public class IsSubsequence {

	public static void main(String[] args) {
		IsSubsequence obj = new IsSubsequence();
		
		System.out.println(obj.isSubsequence("acb", "ahbgdc"));
	}

	/*public boolean isSubsequence(String s, String t) {
		if(s.length()==0) return true;
		
		int[][] ans = new int[s.length()+1][t.length()+1];
		
		for(int i = 1; i<ans.length;i++) {
			for(int j = 1; j<ans[0].length;j++) {
				if(s.charAt(i-1)==t.charAt(j-1)) {
					ans[i][j]=ans[i-1][j-1]+1;
				}else {
					ans[i][j]=Math.max(ans[i][j-1], ans[i-1][j]);
				}
			}
		}
		
		
		return s.length()==ans[ans.length-1][ans[0].length-1];

	}*/
	
	public boolean isSubsequence(String s, String t) {
		if(s.length()==0) return true;
		
		int i = -1;
		for(char c: s.toCharArray()) {
			i = t.indexOf(c,i+1);
			if(i==-1) return false;
			
		}
		
		
		return true;

	}

}

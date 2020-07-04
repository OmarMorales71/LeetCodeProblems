package strings.and.arrays;

public class Random_Pick_with_Weight {

	public static void main(String[] args) {
		Solution obj = new Solution(new int[] {3,14,1,7});
		
		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

		System.out.println(obj.pickIndex());

	}

	
	
}
class Solution {

    int[] weights;
    int total;
    java.util.Random rand = new java.util.Random();
    public Solution(int[] w) {
        int sum = 0;
        this.weights = new int[w.length];
        for(int i=0;i<w.length;i++){
            sum += w[i];
            weights[i] = sum;
        }
        this.total = sum;
    }
    
    public int pickIndex() {
        int val = rand.nextInt(total);
        int l=0, r=weights.length-1;
        while(l<r){
            int m = (l+r)/2;
            if(weights[m] > val){
                r = m;
            }else{
                l = m+1;
            }
        }
       
        return l;
    }
}
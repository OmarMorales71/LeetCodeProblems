package strings.and.arrays;

public class MaximumProductSubarray {
    public static void main(String[] args) {

    }

    public int maxProduct(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;

        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++ ){
            int product=nums[i];
            ans=Math.max(product,ans);
            for(int j=i+1; j< nums.length;j++){
                product=product*nums[j];
                ans=Math.max(product,ans);
            }
        }
        return ans;
    }

    public int maxProduct2(int[] nums) {
        if(nums==null || nums.length==0)
            return 0;
        int product=1;
        int ans = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++ ){
            product*=nums[i];
            ans=Math.max(product,ans);
            if(product==0)
                product=1;
        }

        product=1;
        for(int i= nums.length-1;i>=0;i-- ){
            product*=nums[i];
            ans=Math.max(product,ans);
            if(product==0)
                product=1;
        }

        return ans;
    }
}

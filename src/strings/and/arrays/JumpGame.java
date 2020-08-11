package strings.and.arrays;

public class JumpGame {
    public static void main(String[] args) {
JumpGame obj = new JumpGame();
        System.out.println(obj.canJump(new int[]{2,3,1,1,4}));
    }

    public boolean canJump(int[] nums) {
        if(nums.length<2){
            return true;
        }
        int j =1;
        boolean valid=true;
        for(int i= nums.length-2;i>=0;i--){
            if(nums[i]>=j){
                valid=true;
                j=1;
            }else{
                valid=false;
                j++;
            }
        }
        return valid;
    }
}

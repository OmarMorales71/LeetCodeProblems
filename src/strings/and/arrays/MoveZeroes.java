package strings.and.arrays;

public class MoveZeroes {
    public static void main(String[] args) {

    }

    public void moveZeroes(int[] nums) {
        int lastZero = -1;
        for(int i=0;i<nums.length;i++){
            if (nums[i]==0 && lastZero==-1)
                lastZero=i;

            if(nums[i]!=0 && lastZero!=-1){
                int aux=nums[i];
                nums[i]=nums[lastZero];
                nums[lastZero]=aux;
                lastZero++;
            }
        }
    }
}

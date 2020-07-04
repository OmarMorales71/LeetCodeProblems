package strings.and.arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        FindTheDuplicateNumber obj = new FindTheDuplicateNumber();

        System.out.println(obj.findDuplicate2(new int []{1,3,4,2,2}));
    }

    public int findDuplicate(int[] nums) {

        for(int i = 0; i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(nums[i]==nums[j])
                    return nums[i];
            }
        }
        return -1;
    }
    public int findDuplicate2(int[] nums) {
        int rabbit = 0, turtle = 0;
        do{
            rabbit=nums[rabbit];
            rabbit=nums[rabbit];//two steps

            turtle=nums[turtle];

        }while(rabbit!=turtle);
        turtle=0;

        while(turtle!=rabbit){
            rabbit=nums[rabbit];
            turtle=nums[turtle];
        }
        return rabbit;
    }
}

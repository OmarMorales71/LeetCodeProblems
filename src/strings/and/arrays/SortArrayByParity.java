package strings.and.arrays;

public class SortArrayByParity {
    public static void main(String[] args) {

    }

    public int[] sortArrayByParity(int[] A) {
        if(A==null)
            return null;

        int[] ans = new int[A.length];

        int even=0, odd=A.length-1;

        for(int i = 0; i<A.length; i++){
            if(A[i]%2==0){
                ans[even]=A[i];
                even++;
            }else{
                ans[odd]=A[i];
                odd--;
            }
        }

        return ans;
    }
}

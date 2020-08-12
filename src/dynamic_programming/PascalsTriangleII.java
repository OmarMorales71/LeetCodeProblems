package dynamic_programming;



import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args) {

        PascalsTriangleII obj = new PascalsTriangleII();

        System.out.println(obj.getRow(6));
    }

    public List<Integer> getRow(int rowIndex) {

        List<Integer> dp = new ArrayList<>();

        if(rowIndex==0){
            dp.add(1);
            return dp;
        }
        dp.add(1);
        dp.add(1);

        for(int i = 2; i<=rowIndex; i++){
            for(int j=i; j>0;j--){
                if(j==i){
                    dp.add(1);
                }else{
                    dp.set(j,dp.get(j-1)+dp.get(j));
                }
            }
        }

        return dp;
    }
}

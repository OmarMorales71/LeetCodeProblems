package strings.and.arrays;

import java.util.Arrays;

public class LargestTimeForGivenDigits {
    public static void main(String[] args) {
        LargestTimeForGivenDigits obj = new LargestTimeForGivenDigits();
        System.out.println(obj.largestTimeFromDigits(new int[]{2,0,6,6}));
    }

    public String largestTimeFromDigits(int[] A) {
        String result="";
        for(int i=0; i<=3;i++){
            for(int j=0; j<=3;j++){
                for(int k=0; k<=3;k++){
                    if(i==j || j==k || k==i) continue;

                    String hh = Integer.toString(A[i])+Integer.toString(A[j]);
                    String mm = Integer.toString(A[k])+Integer.toString(A[6-i-j-k]);
                    String time = hh+":"+mm;

                    if(hh.compareTo("24")<0 && mm.compareTo("60")<0 && result.compareTo(time)<0) {
                        result=time;
                    }

                }
            }
        }

        return result;


    }


}

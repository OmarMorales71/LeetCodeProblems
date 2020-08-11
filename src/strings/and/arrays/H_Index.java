package strings.and.arrays;

import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) {

    }

    public int hIndex(int[] citations) {
        if (citations == null || citations.length == 0) {
            return 0;
        }

        Arrays.sort(citations);

        int hIndex=0;
        for(int i=0;i< citations.length;i++){
            int x= citations.length - i;
            if(x<=citations[i]){
                hIndex=x;
                break;
            }
        }

        return hIndex;
    }
}

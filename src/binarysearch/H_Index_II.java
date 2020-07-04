package binarysearch;

public class H_Index_II {
    int ayuda;
    String a;
    public static void main(String[] args) {
    H_Index_II obj = new H_Index_II();
      //  System.out.println(obj.hIndex(new int []{0,1}));

        System.out.println(obj.a);
    }

    public int hIndex(int[] citations) {
        if (citations.length == 0)
            return 0;
        int value = 0;
        int l = 0;
        int h = citations.length - 1;
        int middle = 0;
        while (l <= h) {
            middle = (l + h) / 2;
            int valueAux = citations.length-middle;

            if (valueAux <= citations[middle]) {
                value = Math.max(value, valueAux);
            }
            if(citations[middle]<=valueAux){
                l=middle+1;
            }else{
                h=middle-1;
            }


        }
        return value;
    }
}

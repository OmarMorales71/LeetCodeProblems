package binarysearch;


public class SearchA2DMatrix {
    public static void main(String[] args) {
        SearchA2DMatrix obj = new SearchA2DMatrix();
        //  System.out.println(obj.hIndex(new int []{0,1}));

        System.out.println(obj.searchMatrix(new int[][]{{1,3,5,7}, {10, 11, 16, 20},{23,30,34,60}}, 3));
    }

    public boolean searchMatrix(int[][] matrix, int target) {

        int lo = 0, hi=matrix.length-1;
        int[] row = null;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(target<matrix[mid][0]){
                hi=mid-1;
            }else if(target>matrix[mid][matrix[0].length-1]){
                lo=mid+1;
            }else{
                row=matrix[mid];
                break;
            }
        }

        if(row==null){
            return false;
        }

        lo=0;
        hi=row.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;

            if(target<row[mid]){
                hi=mid-1;
            }else if(target>row[mid]){
                lo=mid+1;
            }else if(target==row[mid]){
                return true;
            }
        }

        return false;

    }
}


package strings.and.arrays;

public class SearchA2DArrayll {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for(int i=0; i<matrix[0].length; i++){
            if(target>=matrix[0][i] && target<=matrix[matrix.length-1][i]){

                int l=0;
                int h=matrix.length-1;
                while(l<=h){
                    int mid = (l+h)/2;

                    if(target>matrix[mid][i]){
                        l=mid+1;
                    }else if(target<matrix[mid][i]){
                        h=mid-1;
                    }else if(target==matrix[mid][i]){
                        return true;
                    }
                }

            }
        }
        return false;
    }
}

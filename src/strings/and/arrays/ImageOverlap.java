package strings.and.arrays;

public class ImageOverlap {
    public static void main(String[] args) {

    }

    public int largestOverlap(int[][] A, int[][] B) {
        int n = A.length;
        int ans = 0;
        for(int i =-n+1; i<n;i++){
            for(int j=-n+1; j<n;j++){
                ans = Math.max(ans, overlapping(A,B,i,j));
            }
        }

        return ans;
    }

    private int overlapping(int[][] a, int[][] b, int i, int j) {
        int ones = 0;

        for (int ii=0; ii<a.length;ii++){
            for(int jj=0; jj<a[0].length;jj++){
                //Saber si es un pixel sobrepuesto, si no lo es continua el ciclo
                if((i+ii<0 || i+ii>=a.length) || (j+jj<0 || j+jj>=a.length)) continue;

                if(a[ii][jj] + b[i+ii][j+jj]==2)
                    ones++;

            }
        }
        return ones;
    }
}

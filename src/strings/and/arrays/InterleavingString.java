package strings.and.arrays;

public class InterleavingString {

    public static void main(String[] args) {
        InterleavingString obj = new InterleavingString();
        String s2 = "aabcc", s1 = "dbbca", s3="aadbbcbcac";
        System.out.println(obj.isInterleave(s1,s2,s3));
    }
    public boolean isInterleave(String s1, String s2, String s3) {
        if(s1.length() + s2.length() != s3.length())
            return false;
        s1 = "-" + s1;
        s2 = "-" + s2;
        s3 = "-" + s3;
        char[] sc1 = s1.toCharArray();
        char[] sc2 = s2.toCharArray();
        char[] sc3 = s3.toCharArray();
        boolean[][] interleaving = new boolean[sc1.length][sc2.length];
        interleaving[0][0] = true;

        for(int i=1; i<sc1.length; i++){
            if(sc1[i]==sc3[i] && interleaving[i-1][0]){
                interleaving[i][0] = true;
            }
        }

        for(int i=1; i<sc2.length; i++){
            if(sc2[i]==sc3[i] && interleaving[0][i-1]){
                interleaving[0][i] = true;
            }
        }


        for(int i=1; i<sc1.length; i++){
            for(int j=1; j<sc2.length; j++){
                if(sc3[i+j]==sc1[i] && interleaving[i-1][j]){
                    interleaving[i][j] = true;
                }else if(sc3[i+j]==sc2[j] && interleaving[i][j-1]){
                    interleaving[i][j] = true;
                }
            }
        }
        return interleaving[sc1.length-1][sc2.length-1];
    }
}

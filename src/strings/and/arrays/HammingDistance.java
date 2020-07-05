package strings.and.arrays;

public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance obj = new HammingDistance();
        System.out.println(obj.hammingDistance(1,4));
    }

    public int hammingDistance(int x, int y) {
        String binary_x = Integer.toString(x,2);
        String binary_y = Integer.toString(y,2);

        int minLength = Math.min(binary_x.length(), binary_y.length());

        int ans = 0;
        for(int i = 0; i<minLength;i++){
            if(binary_x.charAt(binary_x.length()-1-i)!=binary_y.charAt(binary_y.length()-1-i))
                ans++;
        }
        String rest = "";
        if(binary_x.length()>binary_y.length()){
            rest=binary_x.substring(0,binary_x.length()-minLength);
        }else if (binary_y.length()>binary_x.length()){
            rest=binary_y.substring(0,binary_y.length()-minLength);
        }

        for(int i = 0; i<rest.length();i++){
            if(rest.charAt(i)=='1')
                ans++;
        }
        return ans;
    }

}

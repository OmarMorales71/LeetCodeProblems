package strings.and.arrays;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        RepeatedSubstringPattern obj = new RepeatedSubstringPattern();
        System.out.println(obj.repeatedSubstringPattern("aaa"));
    }

    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        if(length<2)
            return false;

        for(int i=0; i<length/2;i++){
            String substring= s.substring(0,i+1);

            if(length%substring.length()!=0)
                continue;

            int laps = length/substring.length();

            String test="";
            for(int j=0; j<laps; j++){
                test+=substring;
            }

            if(test.equals(s))
                return true;

        }

        return false;


    }
}

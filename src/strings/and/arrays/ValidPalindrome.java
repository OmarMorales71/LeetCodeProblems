package strings.and.arrays;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.isPalindrome("0P"));
    }

    public boolean isPalindrome(String s) {
    if(s.length()==0)return true;
        s = s.toLowerCase();
    int l = 0;
    int r = s.length()-1;
    try {
        while (l < r) {
            char begin, end;
            while (s.charAt(l) < 97 || s.charAt(l) > 122) {
                if((s.charAt(l)>=48 && s.charAt(l)<=57))
                    break;
                l++;
            }
            begin = s.charAt(l);
            while (s.charAt(r) < 97 || s.charAt(r) > 122) {
                if((s.charAt(r)>=48 && s.charAt(r)<=57))
                    break;
                r--;
            }
            end = s.charAt(r);
            if (begin != end)
                return false;

            l++;
            r--;
        }
    }catch (StringIndexOutOfBoundsException ex){
        return true;
    }
    return true;
    }
}

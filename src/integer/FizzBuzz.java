package integer;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
    FizzBuzz obj = new FizzBuzz();

        System.out.println(obj.fizzBuzz(2));
    }

    public List<String> fizzBuzz(int n) {
        List<String> ans = new ArrayList<>();
        for(int i=1; i<=n;i++){
            String s = "";

            if(i%9==0 || i%9==3 || i%9==6)
                s+="Fizz";


            if(i%10==0 || i%10==5)
                s+="Buzz";


            if(s.length()==0)
                s=Integer.toString(i);

            ans.add(s);
        }

        return ans;
    }
}

package oralce;

public class GeneralProblem {

    public static void main(String[] args) {

    }
    public static void unoDissapear(String phrase){
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<phrase.length();i++){
            if(phrase.charAt(i)=='u' || phrase.charAt(i)=='n' || phrase.charAt(i)=='o'){
                continue;
            }

            ans.append(phrase.charAt(i));
        }

        System.out.println(ans.toString());
    }
}

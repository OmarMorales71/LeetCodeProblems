package integer;

public class AddDigits {

    public static void main(String[] args) {

    }

    public int addDigits(int num) {
        int rest = 0;
        int div = 0;

        while(num>9){
            rest=num%10;
            div=num/10;

            num=rest+div;
        }
        return num;
    }
}

package integer;

public class ArrangingCoins {

    public static void main(String[] args) {
    ArrangingCoins ob = new ArrangingCoins();
        System.out.println(ob.arrangeCoins(2147483647));
        System.out.println(Integer.MAX_VALUE);
    }

    public int arrangeCoins(int n) {

        long k= (long) Math.sqrt(2*(long)n);
        long sum = (k*(k+1))/2;
        if(sum>n) return (int)k-1;
        else return (int)k;

    }
}

package integer;

public class PowerOfFour {

    public static void main(String[] args) {
        /*System.out.println(2%10);
        System.out.println(24%10);
        System.out.println(Integer.toBinaryString(256));
        String s="100010";
        System.out.println(s.indexOf("1"));
        System.out.println(s.lastIndexOf("1"));*/
        PowerOfFour powerOfFour=new PowerOfFour();
        System.out.println(powerOfFour.isPowerOfFour(6));
    }
    public boolean isPowerOfFour(int num) {
        if(num==1)return true;

        if(num%10!=4 && num%10!=6){
            return false;
        }
        String bin = Integer.toBinaryString(num);

        if(bin.indexOf("1")!=bin.lastIndexOf("1")){
            return false;
        }

        if((bin.length()%2)==0)
            return false;




    return  true;
    }
}

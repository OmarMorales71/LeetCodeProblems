package strings.and.arrays;

public class ValidateIPAddress {
    public static void main(String[] args){
        System.out.println(Integer.parseInt("-0"));
        System.out.println(new ValidateIPAddress().validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334:"));
    }

    public String validIPAddress(String IP) {
        String ans = "Neither";
        try {
            if (IP.contains(".")) {
                String[] blocks = IP.split("\\.");
                if (blocks.length != 4)
                    return ans;

                for (String block : blocks) {
                    if (block.charAt(0) == '0' && block.length() != 1 || block.charAt(0) == '-')
                        return ans;
                    int n = Integer.parseInt(block);
                    if (n < 0 || n > 255)
                        return ans;

                }
                ans = IP.charAt(0)=='.' || IP.charAt(IP.length()-1)=='.'?"Neither":"IPv4";

            } else if (IP.contains(":")) {
                String[] blocks = IP.split(":");
                if (blocks.length != 8)
                    return ans;

                for (String block : blocks) {
                    if ((block.length() > 4) || block.charAt(0) == '-')
                        return ans;
                    int n = Integer.parseInt(block, 16);
                    if (n < 0 || n > 65535)
                        return ans;

                }
                ans = IP.charAt(0)==':' || IP.charAt(IP.length()-1)==':'?"Neither":"IPv6";

            } else {
                return ans;
            }

            return ans;
        }catch(Exception e){
            return ans;
        }
    }

}

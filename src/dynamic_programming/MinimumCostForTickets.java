package dynamic_programming;

public class MinimumCostForTickets {
    public static void main(String[] args) {

    }

    public int mincostTickets(int[] days, int[] costs) {

        int lastDayTravel = days[days.length-1];

        boolean[] travelDay = new boolean[lastDayTravel+1];
        int[] dp = new int[lastDayTravel+1];
        for(Integer day: days){
            travelDay[day]=true;
        }

        for(int i=1; i<lastDayTravel+1;i++){
            if(travelDay[i]){
                int oneDayPass=dp[i-1]+costs[0];
                int sevenDayPass=dp[Math.max(i-7,0)]+costs[1];
                int thirtyDayPass=dp[Math.max(i-30,0)]+costs[2];

                dp[i]= Math.min(oneDayPass,Math.min(sevenDayPass,thirtyDayPass));
            }else{
                dp[i]=dp[i-1];
            }
        }

        return dp[lastDayTravel];
    }
}

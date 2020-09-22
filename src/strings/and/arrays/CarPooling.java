package strings.and.arrays;

import java.util.Arrays;

public class CarPooling {
    public static void main(String[] args) {

    }
    public boolean carPooling(int[][] trips, int capacity) {
        RequestTrip[] t = new RequestTrip[trips.length*2];
        int i=0;
        for(int[] trip:trips){
            t[i++]= new RequestTrip(trip[0],true, trip[1]);
            t[i++]= new RequestTrip(trip[0],false, trip[2]);
        }

        Arrays.sort(t);
        for(RequestTrip stop:t){
            if(stop.in){
                capacity-=stop.passengers;
                if(capacity<0)
                    return false;
            }else{
                capacity+=stop.passengers;
            }
        }

        return true;
    }


}

class RequestTrip implements Comparable<RequestTrip>{
    int passengers;
    boolean in;
    int km;

    public RequestTrip(int passengers, boolean in, int km) {
        this.passengers = passengers;
        this.in = in;
        this.km = km;
    }

    @Override
    public int compareTo(RequestTrip o) {
        if(km==o.km){
            if(in==false){
                return -1;
            }
            if(o.in==false){
                return 1;
            }
        }
        return this.km-o.km;
    }
}

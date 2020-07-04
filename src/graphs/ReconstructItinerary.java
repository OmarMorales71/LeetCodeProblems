package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class ReconstructItinerary {

    public static void main(String[] args) {
        ReconstructItinerary obj = new ReconstructItinerary();
        List<List<String>> itinerary = new ArrayList<>();

        ArrayList<String> a = new ArrayList<>();
        a.add("JFK");
        a.add("SFO");

        ArrayList<String> b = new ArrayList<>();
        b.add("JFK");
        b.add("ATL");

        ArrayList<String> c = new ArrayList<>();
        c.add("SFO");
        c.add("ATL");

        ArrayList<String> d = new ArrayList<>();
        d.add("ATL");
        d.add("JFK");

        ArrayList<String> e = new ArrayList<>();
        e.add("ATL");
        e.add("SFO");

        itinerary.add(a);
        itinerary.add(b);
        itinerary.add(c);
        itinerary.add(d);
        itinerary.add(e);

        obj.findItinerary(itinerary);
    }
    HashMap<String, PriorityQueue<String>> listAdy = new HashMap<String, PriorityQueue<String>>();
    public List<String> findItinerary(List<List<String>> tickets) {


        for (List<String> flight : tickets) {
            if (listAdy.containsKey(flight.get(0))) {
                listAdy.get(flight.get(0)).add(flight.get(1));
            } else {
                PriorityQueue<String> y = new PriorityQueue<String>();
                y.add(flight.get(1));
                listAdy.put(flight.get(0), y);
            }
        }
        ArrayList<String> ans = new ArrayList<>();

        String currentCity="JFK";

        dfs(currentCity,ans);

        return ans;
    }

    private void dfs(String currentCity, ArrayList<String> ans) {
        PriorityQueue<String> arrivals = listAdy.get(currentCity);

        while(arrivals!=null && !arrivals.isEmpty()){
            dfs(arrivals.poll(), ans);
        }

        ans.add(0,currentCity);
    }
}



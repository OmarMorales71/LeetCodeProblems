package greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaximumPerformanceOfATeam {

    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        Engineer[] engineers = new Engineer[n];
        for(int i = 0; i<n; i++){
            Engineer engineer = new Engineer(speed[i], efficiency[i]);
            engineers[i] = engineer;
        }
        Arrays.sort(engineers, new Comparator<Engineer>() {
            @Override
            public int compare(Engineer o1, Engineer o2) {
                return 0;
            }
        });
        return 0;
    }
}

class Engineer{
    int speed;
    int efficiency;

    public Engineer(int speed, int efficiency){
        this.speed = speed;
        this.efficiency = efficiency;
    }
}

package list;

import java.util.*;

public class Insert_Delete_GetRandom {

    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();

        System.out.println(obj.insert(3));


        System.out.println(obj.insert(5));

        System.out.println(obj.getRandom());
    }
}

class RandomizedSet {
    HashMap<Integer,Integer> map;
    ArrayList<Integer> data;
    Random random;
    public RandomizedSet() {
        map= new HashMap<Integer,Integer>();
        data=new ArrayList<Integer>();
        random=new Random();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;

        map.put(val,data.size());
        data.add(val);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if(!map.containsKey(val))
            return false;

        int index = map.remove(val);
        int lastData=data.get(data.size()-1);
        if(lastData != val) {
            data.set(index, lastData); //meter el index especificado el ultimo dato
            map.put(lastData, index);
        }
        data.remove(data.size() - 1);
        return  true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return data.get(random.nextInt(data.size()));
    }
}

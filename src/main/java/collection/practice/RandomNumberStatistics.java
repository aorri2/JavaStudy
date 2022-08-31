package collection.practice;

import java.util.Hashtable;
import java.util.Random;
import java.util.Set;

public class RandomNumberStatistics {
    Random random = new Random();
    private static final int DATA_BOUNDARY = 50;
    Hashtable<Integer,Integer> hashtable = new Hashtable<>();

    public static void main(String[] args) {
        RandomNumberStatistics sample = new RandomNumberStatistics();
        sample.getRandomNumberStatistic();
    }

    public void getRandomNumberStatistic(){
        for (int loop = 0; loop < 5000; loop++) {
            int randomNumber = random.nextInt(DATA_BOUNDARY) + 1;
        putCurrentNumber(randomNumber);
        }
        printStatistics();
    }

    public void putCurrentNumber(int tempNumber){
        if (hashtable.containsKey(tempNumber)) {
            hashtable.put(tempNumber,hashtable.get(tempNumber)+1);
        }else{
            hashtable.put(tempNumber,1);
        }
    }

    public void printStatistics(){
        Set<Integer> keySet = hashtable.keySet();
        for (Integer key : keySet) {
            int count = hashtable.get(key);
            if(key%10-1 == 0){
                System.out.println();
            }
            System.out.print(key + "="+count+" ");
        }
    }


}

package collection;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberMaker {
    Random random = new Random();
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        randomNumberMaker.makeRandomNumbers(10);

    }

    private  void makeRandomNumbers(int count) {
        for (int loop = 0; loop < count; loop++) {
             HashSet<Integer> set = getSixNumber();
            System.out.println(set);

        }
    }

    private  HashSet<Integer> getSixNumber(){
        Set<Integer> numberSet = new HashSet<>();
        while(true){
            int tempNumber = random.nextInt(44) + 1;
            numberSet.add(tempNumber);
            if(numberSet.size() == 6)
                break;
        }
        return (HashSet<Integer>) numberSet;
    }

}

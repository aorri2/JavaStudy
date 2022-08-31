package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {
        SetSample sample = new SetSample();
        String cars[] = new String[]{
                "Tico","BMW","Benz","Sonata","ETC"
                ,"TIco","Tico","BMW"
        };

        System.out.println(sample.getCarkindsWithForLoop(cars));
    }

    private int getCarkindsWithForLoop(String[] cars){
        Set<String> carSet = new HashSet<>();
        for (String car : cars) {
            carSet.add(car);
        }

        return carSet.size();
    }
    private int getCarkindsWithIterator(Set<String> carSet){
        Iterator<String> iterator = carSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next() + " ");

        }
        System.out.println();


        return carSet.size();
    }
}

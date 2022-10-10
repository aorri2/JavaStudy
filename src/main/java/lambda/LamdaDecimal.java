package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LamdaDecimal {
    public static void main(String[] args) {

//        IntStream.range(1,100).filter(i->i%3==0).forEach(System.out::println);
//        IntStream.range(1,100).filter(i-> (i % 3 == 0 && i % 5 == 0)).forEach(System.out::println);
        int sum = IntStream.range(1, 100).map(i -> i * 3).sum();
    }
}

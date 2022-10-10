package parallelSort;

import java.util.Arrays;

public class ParallelSortSample {

    public static void main(String[] args) {
    int[] intValues = new int[]{12, 28, 37, 4, 5, 56, 7, 88, 69, 100};
        Arrays.parallelSort(intValues);
        Arrays.stream(intValues).forEach(i-> System.out.println(i));
    }
}

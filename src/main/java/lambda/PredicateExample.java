package lambda;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        PredicateExample sample = new PredicateExample();

        Predicate<String> predicateStringLength5 = (a) ->a.length() > 5;
        Predicate<String> predicateStringstartWithGod = (a) ->a.startsWith("God");
        String testString1 = "GodofJava";
        String testString2 = "Java";


        sample.predicateTest(predicateStringLength5,testString1);
        sample.predicateTest(predicateStringLength5,testString2);

        sample.predicateTestOr(predicateStringLength5,predicateStringstartWithGod,testString1);
        sample.predicateTestOr(predicateStringLength5,predicateStringstartWithGod,testString2);

        sample.predicateTestAnd(predicateStringLength5,predicateStringstartWithGod,testString1);
        sample.predicateTestAnd(predicateStringLength5,predicateStringstartWithGod,testString2);

        sample.predicateNegate(predicateStringLength5,testString1);
        sample.predicateNegate(predicateStringstartWithGod,testString2);
    }

    private void predicateTest(Predicate<String> stringPredicate, String testString) {
        System.out.println(stringPredicate.test(testString));
    }
    private void predicateTestOr(Predicate<String> stringPredicate1,Predicate<String> stringPredicate2, String testString) {
        System.out.println(stringPredicate1.or(stringPredicate2).test(testString));
    }
    private void predicateTestAnd(Predicate<String> stringPredicate,Predicate<String> stringPredicate2, String testString) {
        System.out.println(stringPredicate.and(stringPredicate2).test(testString));
    }
    private void predicateNegate(Predicate<String> stringPredicate, String data){
        System.out.println(stringPredicate.negate().test(data));
    }
}

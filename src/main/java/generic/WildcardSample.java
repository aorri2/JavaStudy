package generic;

import java.util.stream.Stream;

class WildcardGeneric<W> {
    W wildcard;

    public W getWildcard() {
        return wildcard;
    }

    public void setWildcard(W wildcard) {
        this.wildcard = wildcard;
    }
}

public class WildcardSample {
    public static void main(String[] args) {
        WildcardSample sample = new WildcardSample();
        sample.callWildcardMethod();

    }

    private void callWildcardMethod() {
        WildcardGeneric<String> wildcard = new WildcardGeneric<String>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
        wildcard.setWildcard("B");
        wildcardStringMethod(wildcard);
    }

    private void wildcardStringMethod(WildcardGeneric<?> c) {
        Object value = c.getWildcard();
        System.out.println(value);
        Stream.of(value).forEach(System.out::println);
    }
}

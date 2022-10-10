package optional;

import java.util.Optional;
import java.util.function.Supplier;

public class OptinalSample {
    public static void main(String[] args) throws Exception {
        OptinalSample sampel = new OptinalSample();
//        sampel.createOptinalObjects();
//        sampel.checkOptinalData();
        sampel.getOptinalData(Optional.of("data"));
    }

    private void createOptinalObjects(){
        Optional<String> emptyString = Optional.empty();
        System.out.println("emptyString = " + emptyString);
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);
        System.out.println("nullableString = " + nullableString);
        common = "common";
        Optional<String> commonString = Optional.of(common);
        System.out.println("commonString = " + commonString);
    }

    private void checkOptinalData(){
        System.out.println(Optional.of("present").isPresent());
        System.out.println(Optional.ofNullable(null).isPresent());
    }

    private void getOptinalData(Optional<String> data)throws Exception{
        String defaultValue = "default";
        String result1 = data.get();
        String result2 = data.orElse(defaultValue);
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GodofJava";
            }
        };
        String result3 = data.orElseGet(stringSupplier);
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception("Exception occur!!!");
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);
    }
}

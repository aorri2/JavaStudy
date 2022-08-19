package generic;

import java.util.function.Consumer;

public class GenericSample {
    public static void main(String[] args) {
        GenericSample sample = new GenericSample();
        sample.checkCastingDTO();
        sample.callGenericMethod();

    }

    private void callGenericMethod(){
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericMethod(wildcard,"Data");
    }

    private <T> void genericMethod(WildcardGeneric<T> c, T addValue){
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    private void checkCastingDTO() {
        CastingDTO<String> dto1 = new CastingDTO<>();
        dto1.setObejct(new String("abc"));

        CastingDTO<StringBuffer> dto2 = new CastingDTO<>();
        dto2.setObejct(new StringBuffer());

        CastingDTO<StringBuilder> dto3 = new CastingDTO<>();
        dto3.setObejct(new StringBuilder());

        String tem1 = dto1.getObject();
        StringBuffer tem2 = dto2.getObject();
        StringBuilder tem3 = dto3.getObject();



    }

    class CastingDTO<T> {
        private T object;

        public void setObejct(T obejct) {
            this.object = obejct;
        }

        public T getObject() {
            return object;
        }
    }
}

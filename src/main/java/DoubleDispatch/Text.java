package DoubleDispatch;

public class Text implements Post {


    @Override
    public void postOn(Sns sns) {
        sns.post(this);
    }
}

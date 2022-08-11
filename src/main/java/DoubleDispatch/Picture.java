package DoubleDispatch;

public class Picture implements Post {
    @Override
    public void postOn(Sns sns) {
        sns.post(this);
    }
}

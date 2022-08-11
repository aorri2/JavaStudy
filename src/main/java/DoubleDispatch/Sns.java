package DoubleDispatch;

public interface Sns {
    void post(Text text);
    void post(Picture picture);
}

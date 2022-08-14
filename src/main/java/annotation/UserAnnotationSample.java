package annotation;

@UserAnnotation2(number = 0)
public class UserAnnotationSample {

    @UserAnnotation2(number=0)
    public static void main(String[] args) {
        UserAnnotationSample sample = new UserAnnotationSample();
    }

    @UserAnnotation2(number = 1)
    public void annotatinSample1(){}
    @UserAnnotation2(number = 2, text = "two")
    public void annotatinSample2(){}
    @UserAnnotation2(number = 3, text = "three")
    public void annotatinSample3(){}

}

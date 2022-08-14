package annotation;

import java.lang.reflect.Method;

public class UserAnnotationCheck {
    public static void main(String[] args) {
        UserAnnotationCheck sample = new UserAnnotationCheck();
        sample.checkAnnotations(UserAnnotationSample.class);

    }

    public void checkAnnotations(Class useClass){
        Method[] declaredMethods = useClass.getDeclaredMethods();
        for (Method tempMethod : declaredMethods) {
            UserAnnotation2 annotation = tempMethod.getAnnotation(UserAnnotation2.class);
            if(annotation != null){
                int number = annotation.number();
                String text = annotation.text();
                System.out.println(tempMethod.getName()+" : number = "+number+" text = "+text);
            }else {
                System.out.println(tempMethod.getName()+"is null.");
            }
        }
    }
}

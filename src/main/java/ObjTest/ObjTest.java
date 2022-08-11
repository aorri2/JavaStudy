package ObjTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObjTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class aClass = Class.forName("java.lang.Object");
//        Constructor constructor = aClass.getConstructor(Object.class);
        Constructor<?> constructor = aClass.getConstructor();
        Object obj = constructor.newInstance();
        Method method = aClass.getMethod("toString");
        method.invoke(obj);
    }
}

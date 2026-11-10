package CoreJava.javaoops.constructors;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class WaysToCreateObject {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException, NoSuchMethodException, InvocationTargetException, CloneNotSupportedException {

        // 1. Using the new keyword
        WaysToCreateObject c1 = new WaysToCreateObject();

        // 2. Using Reflection (Class.newInstance())
        Class aClass = Class.forName("CoreJava.javaoops.constructors.WaysToCreateObject");
        WaysToCreateObject c2 = (WaysToCreateObject) aClass.newInstance();

        WaysToCreateObject c3 = WaysToCreateObject.class.newInstance();

        // newInstance is deprecated since java 9
        // Modern Alternative using Constructor.newInstance()

        // 3. Using Constructor.newInstance()
        Constructor<WaysToCreateObject> constructor = WaysToCreateObject.class.getDeclaredConstructor();
        WaysToCreateObject c4 = (WaysToCreateObject) constructor.newInstance();


        // 4. Using clone() -> Creates a copy of an existing object.

        WaysToCreateObject c5 = (WaysToCreateObject) c4.clone();

    }
}

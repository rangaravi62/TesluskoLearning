package com.javareflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("com.javareflectionapi.Product");  //loads the class

        Product product = (Product) c.newInstance();  // gives the instance of the class

        Method m = c.getDeclaredMethod("repair", Double.class);
        m.setAccessible(true);  // to access private methods
        m.invoke(product,995.00);
        m.setAccessible(false);















//        System.out.println(c.getName());
//
//        System.out.println(c.getConstructors().length);
//
//        Constructor[] constructor = c.getConstructors();
//        Arrays.stream(constructor).forEach(System.out::println);
//
//        Field[] fields = c.getFields(); // will give the public fields
//        Arrays.stream(fields).forEach(System.out::println);
//        System.out.println();
//
//        Field[] fields1 = c.getDeclaredFields();  // private and public
//        Arrays.stream(fields1).forEach(System.out::println);


    }

}

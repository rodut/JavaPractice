package com.reflection;

import com.reflexion.rabbit.RabbitAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionChecker {

    /**
     * Showing class name on the console
     */
    public void showClassName(Object object) {
        Class clazz = object.getClass();
        System.out.println(clazz.getName());
    }

    public void showClassFields(Object object) {
        Class clazz = object.getClass();

        /**
         * Getting all the private fields
         */
        Field[] fields = clazz.getDeclaredFields();

        /**
         * Printing all the private fields
         */
        for (Field field : fields) {
            System.out.println(field.getName());
        }
    }

    /**
     * Printing the list of methods
     */

    public void showClassMethods(Object object) {
        Class clazz = object.getClass();
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }

    public void showFieldsAnnotations(Object object) {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation[] annotations = field.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(field.getName() + " : " + annotation.toString());
            }
        }
    }

    public void fillPrivateFields(Object object) throws IllegalAccessException {
        Class clazz = object.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(RabbitAnnotation.class);
            if(annotation == null){
                continue;
            }
            field.setAccessible(true);
            field.set(object, "Field");
            field.setAccessible(false);
        }
    }

    public Object createNewObject(Object object) throws IllegalAccessException, InstantiationException {
        Class clazz = object.getClass();
        return clazz.newInstance();
    }
}

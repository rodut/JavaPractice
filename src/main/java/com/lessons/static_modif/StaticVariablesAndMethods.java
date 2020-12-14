/**
 * https://www.youtube.com/watch?v=nbqgPwZJqU4&list=PLEd6LarmkKnWkeHqu9_ngkHN-AnWQD6VM&index=18
 */

package com.lessons.static_modif;

public class StaticVariablesAndMethods {

    /**
     * Variabilele si metodele statice tin de clasa si nu de obiect!
     */
    public static int firstVariable;
    public int secondVariable;

    public static void doSomething(){
        /** We cannot use the "secondVariable", only "firstVariable" */
//        System.out.println(secondVariable);
        System.out.println(firstVariable);

        /** We cannot access a non-static method in a static one */
//        showNonStaticSomething();
        showStaticSomething();
    }

    public void showNonStaticSomething(){
        System.out.println("No.");

        /** In a non-static method we can access a static method */
        doSomething();
    }

    public static void showStaticSomething(){
        System.out.println("Yes.");
    }
}

package com.lessons.static_modif;

public class Main {

    public static void main(String[] args) {

        StaticVariablesAndMethods s1 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s2 = new StaticVariablesAndMethods();
        StaticVariablesAndMethods s3 = new StaticVariablesAndMethods();

        /** It's not correct to access the variable like this, we can access it through class name */
        s1.firstVariable = 5;
        s2.firstVariable = 10;
        s3.firstVariable = 20;

        System.out.println(s1.firstVariable);
        System.out.println(s2.firstVariable);
        System.out.println(s3.firstVariable);

        /** We can access the static variable through class name */
        StaticVariablesAndMethods.firstVariable = 5;
    }
}

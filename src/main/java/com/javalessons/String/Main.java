package com.javalessons.String;

public class Main {
    public static void main(String[] args) {

        String firstString = "I like black coffee";

        /**
         *  To call a method from another class we use operator "."
         */
        System.out.println(firstString.toUpperCase());
        System.out.println(firstString.toLowerCase());

        String secondString = "I like coffee";
        String thirdString = "I like coffee!!!";

        /**
         *  "==" will verify if the addresses in memory of the two strings are equal
         */
        boolean result = secondString == firstString;
        System.out.println("The result is: " + result);

        String thirdSubString = thirdString.substring(0, 13);
        System.out.println("The result of third substring is: " + (thirdSubString == secondString));

        String fourthString = new String("I like coffee");
        System.out.println("The result of comparison between the second and fourth string using '==' is: " + (secondString == fourthString));

        /**
         *  So we must compare string not with "==" but with ".equals()"
         */
        System.out.println("The result of comparison between the second and fourth string using '.equals()' is: " + (secondString.equals(fourthString)));

        boolean starts = firstString.startsWith(" like", 1);
        boolean ends = firstString.endsWith("fee");
        System.out.println(starts);
        System.out.println(ends);

        String replace = firstString.replace("black", "white");
        System.out.println(replace);

        int indexOf = thirdString.indexOf("!!!");
        System.out.println(indexOf);

    }
}

package com.javalessons.operators;

public class Operators {
    public static void main(String[] args) {
        /**
         * + - / * %
         * Variables initialization (when we are giving them values)
         */
        int a = 10;
        int b = 3;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        double f = (double) a / b;
        int g = a % b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);

        a = a + 5; // a += 5;

        a++; //a = a + 1; OR a += 1;
        System.out.println("New a = " + a);

        b--;
        System.out.println("New b = " + b);

        int n = 7;
        int m = 7;

        int res1 = 2 * n++;
        int res2 = 2 * ++m;
        System.out.println("Result 1 = " + res1);
        System.out.println("Result 2 = " + res2);

        /**
         *   ==  !=  <  >  <=  >=  &&  ||  ?:     (the result will be a boolean)
         *   true && true -> true
         *   true && false -> false
         *   true || false -> true
         *   false || false -> false
         */

        int x = 3;
        int y = 5;
        int z = 8;

        boolean booleanValue = n >= m;
        System.out.println("Boolean value = " + booleanValue);

        boolean newBoolValue = y > z;
        boolean resultBoolean = booleanValue && newBoolValue;
        boolean secondResult = booleanValue || newBoolValue;
        System.out.println("Boolean result: " + resultBoolean);
        System.out.println("Second result: " + secondResult);

         /**
         * Ternary operator
         * variable x = (expression) ? value if true : value if false
         */
        int firstTernaryResult = x < y ? x : y;
        int secondTernaryResult = (x > y) && (z < y) ? x : y;
        System.out.println("First ternary result: " + firstTernaryResult);
        System.out.println("Second ternary result: " + secondTernaryResult);

        /**
         * Operators by priority:
         *   [] . ()
         *   ++ -- (post-increment)
         *   ++ -- (pre-increment) + - ! ~
         *   () cast    new
         *   * / %
         *   + -
         *
         * */



    }
}

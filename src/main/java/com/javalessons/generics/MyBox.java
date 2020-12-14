package com.javalessons.generics;

public class MyBox<X> {

    /** Constructor */
   public <T> MyBox(T param){
       System.out.println(param.getClass().getSimpleName());
   }

   public static <U> U returnValue(U param){  // return type "U"
       return param;
   }
}

package com.lessons.encapsulation;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        /** Accesarea direct a variabilei si modificarea lor */
        example.firstPublicVar = 10;

        /** Nu putem accesa o variabila cu private access modifier */
//        example.firstPrivateVar

        System.out.println(example.showResult());

        /** Folosim setter pentru firstPrivateVar ca sa modificam valoarea de la 15 la 100 */
        example.setFirstPrivateVar(100);

        /** Folosim getter pentru firstPrivateVar ca sa extragem valoarea deja modificata */
        System.out.println(example.getFirstPrivateVar());

        System.out.println(example.getPi());
    }
}

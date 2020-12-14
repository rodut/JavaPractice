package com.javalessons.innerclass;

/**
 * A class can contain not only methods, but also classes.
 * There are nested classes (declared static) and inner classes (declared non-static)
 */

public class Main {
    public static void main(String[] args) {

        CellPhone phone = new CellPhone("Motorola", "XT1575");
        phone.turnOn();
        phone.call("123456789O");



    }
}

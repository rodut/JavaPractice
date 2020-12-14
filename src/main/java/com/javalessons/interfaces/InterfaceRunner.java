package com.javalessons.interfaces;

/**
 * Interface ne permite sa legam obecte ce n-au nimic comun intre ele.
 * In cazul nostru avem pizza, cellphone, frige, ele n-am nimic in comun, insa ele pot fi livrate!
 * In an interface all the methods are abstracts.
 * We cannot create a constructor in an interface.
 * We can use only constants (all capital letters), so the variables can be only public, static, final.
 * All the methods of an interface bust be implemented when a class "implements" an interface,
 * or we can make that class abstract!
 * We cannot make a new object from an interface.
 * A functional interface have only one abstract method, so we use an annotation "@FunctionalInterface".
 * If a method is "default" in an interface he can have an implementation.
 * Starting with Java 8 we can also have static methods in interfaces.
 */

public class InterfaceRunner {

    public static void main(String[] args) {

        Priceable pizza = new Pizza("Neapolitana", 1, 20, Size.L);
        Priceable cellPhone = new CellPhone("Motorola", "XT1575", 1, 250);
        Priceable fridge = new Fridge("LG", "E9900", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(cellPhone);
        printDeliveryPrice(fridge);

    }

    private static void printDeliveryPrice(Priceable deliverable) {
        System.out.println("Delivery price " + deliverable.calcDeliveryPrice());
        System.out.println("Order price " + deliverable.calcOrderPrice());
    }
}

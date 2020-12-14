/**
 * Reflection - un mecanism de manipulare cu obiectele ocolind mecanismele standard in RUNTIME!
 * Cu ajutorul Reflection putem accesa toata informatia despre o clasa anumita.
 * Cu Reflection putem afla informatia ce se contine in obiect si s-o modificam, chiar daca variabilele-s private si protected.
 * Minusurile Reflection: viteza mica si neglijarea encapsularii ca un concept de baza a POO.
 *
 */

package com.reflection;

import com.reflexion.rabbit.RabbitClass;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionChecker checker = new ReflectionChecker();
        RabbitClass rabbit = new RabbitClass();

//        checker.showClassName(rabbit);
//        checker.showClassFields(rabbit);
//        checker.showClassMethods(checker);
//        checker.showFieldsAnnotations(rabbit);

//        checker.fillPrivateFields(rabbit);
//        System.out.println(rabbit.getRabbitAge());
//        System.out.println(rabbit.getRabbitName());
//        System.out.println(rabbit.getRabbitColor());
//        System.out.println(rabbit.getRabbitSpeed());

        Object clone = checker.createNewObject(rabbit);
        checker.showClassName(clone);
    }

}

package com.lessons.collections2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Colectia nu-i altceva decit o lista de elemente
         */
        List<Person> list = new ArrayList<>();
        List<Person> names = new ArrayList<>();

        Person firstPerson = new Person("Jack");
        Person secondPerson = new Person("Carl");
        Person thirdPerson = new Person("Jack");
        Person fourthPerson = new Person("Bob");


        /**
         * Adaugarea in colectie
         */
        list.add(firstPerson);
        list.add(secondPerson);

        names.add(thirdPerson);
        names.add(fourthPerson);

        /**
         * Extragerea din collectie
         */
        Person firstPersonFromCollection = list.get(0);
        Person secondPersonFromCollection = list.get(1);

        System.out.println(firstPersonFromCollection);
        System.out.println(secondPersonFromCollection);

        /**
         * Stergerea din collectie, returneaza boolean - ne zice daca a fost sters sau nu elementul
         */
        boolean remove = list.remove(firstPerson);
        System.out.println(remove);

        /**
         * Marimea "list"
         */
        System.out.println(list.size());

        /**
         * Verificam daca "list" contine ceva sau nu, intoarce un boolean inapoi
         */
        System.out.println(list.isEmpty());

        /**
         * Adaunarea unei colectii la alta
         */
        list.addAll(names);
        System.out.println(list);

        /**
         * Daca intr-o lista se contine sau nu un element dat - returneaza boolean
         */
        System.out.println(list.contains(firstPerson));

        /**
         * Ca sa aflam index-ul unul element din colectie
         */
        System.out.println(list.indexOf(fourthPerson));

        /**
         * Iterator - cu ajutorul lui putem accesa elementele din lista.
         * Are trei metode principale: hasNext(), next(), remove().
         */
        Iterator<Person> iterator = list.iterator();

//        while(iterator.hasNext()){
//            Person iteratorPerson = iterator.next();
//            System.out.println(iteratorPerson);
//        }

        // using for-each operator
//        for (Person person: list) {
//            list.remove(person);
//        }

        System.out.println("************** LINKED LIST **************");
        /**
         * LinkedList - fiecare obiect din lista are un link la precedentul si la urmatorul obiect.
         * E util cind des stergem/adaugam elemente in colectie. Spre deosebire de ArrayList nu trebuie sa mutam obiectle intr-o parte sau alta.
         */
        LinkedList<Person> linkedList = new LinkedList<>();

        Person linkedFirstPerson = new Person("Abigail");
        Person linkedSecondPerson = new Person("Bridget");
        Person linkedThirdPerson = new Person("Charlotte");

        linkedList.add(linkedFirstPerson);
        linkedList.add(linkedSecondPerson);
        linkedList.add(linkedThirdPerson);

        System.out.println(linkedList);

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());

        System.out.println("************** End of Linked List **************");



        System.out.println("************** ITERATOR **************");

        List<Person> iteratorList = new ArrayList<>();
        Person iteratorFirstPerson = new Person("Abigail");
        Person iteratorSecondPerson = new Person("Bridget");
        Person iteratorThirdPerson = new Person("Charlotte");

        iteratorList.add(iteratorFirstPerson);
        iteratorList.add(iteratorSecondPerson);
        iteratorList.add(iteratorThirdPerson);

        System.out.println(iteratorList);

        Iterator<Person> newIterator = iteratorList.iterator();
        while (newIterator.hasNext()){
            newIterator.next();
            newIterator.remove();
        }

        for(Person ignored : iteratorList){
            iteratorList.remove(iteratorFirstPerson);

        }
        
    }
}

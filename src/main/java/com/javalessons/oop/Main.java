package com.javalessons.oop;

public class Main {
    public static void main(String[] args) {

        /**  A static method or variable it's a attribute of a class, not of an object of that class. */
        System.out.println("Dogs count " + Dog.getDogsCount());

        /**
         *  Instance of the class Dog.
         */
        Dog foxTerrier = new Dog();
        foxTerrier.setName("Tati");
        foxTerrier.setBreed("Fox Terrier");
        foxTerrier.setSize(Size.SMALL);
        foxTerrier.bite();

        Dog sheppard = new Dog();
        sheppard.setName("Rex");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Bob");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.AVERAGE);
        doberman.bite();

/*        System.out.println("Fox Terrier name is " +  foxTerrier.getName());
        System.out.println("Sheppard name is " + sheppard.getName());*/

        Size s = Size.SMALL;
        Size s1 = Size.valueOf("VERY_BIG");
//        System.out.println(s1);

        /**  Array of all the enum elements */
        Size[] values = Size.values();
        for(int i=0; i<values.length; i++){
            System.out.println(values[i]);
        }
    }
}

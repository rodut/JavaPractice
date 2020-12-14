package com.javalessons.oop;

public class Dog {

    /**
     * It's not necessary to initialize an int, it's a primitive so he will get a zero as a default value.
     */
    private static int dogsCount;

    /**
     * We use "final" keyword to make a constant from a variable + we change all letters to capital.
     * We can also use "public" access modifier with a constant, because no one will be able to change it.
     */
    public static final int PAWS = 4;
    public static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    /**
     * Constructor have no return type
     * Every time that a new Dog object is created it will add +1.
     */
    public Dog() {
        dogsCount++;
        System.out.println("Number of dogs " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        /**  The SWITCH is not necessary to have a "default:" value */
        switch (size){
            case BIG: case VERY_BIG:
                System.out.println("Wof-wof");
                break;
            case AVERAGE:
                System.out.println("Raf-raf");
                break;
            case SMALL: case VERY_SMALL:
                System.out.println("Tiaf-Tiaf");
                break;
            default:
                System.out.println("Dog's size is undefined.");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("Dogs are biting.");
        } else {
            bark();
        }
    }
}

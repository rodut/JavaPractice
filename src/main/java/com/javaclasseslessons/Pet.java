package com.javaclasseslessons;

public class Pet {
    private String name;
    private String animal;
    private int age;

    public Pet(String name, String animal, int age) {
        this.name = name;
        this.animal = animal;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

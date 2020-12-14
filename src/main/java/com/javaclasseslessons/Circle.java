package com.javaclasseslessons;

import com.javalessons.interfaces.Pizza;

public class Circle {
    double radius;
    double PI = 3.1415;

    public static void main(String[] args) {

    }

    public Circle(){
        radius = 1.0;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return PI * Math.pow(radius, 2);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

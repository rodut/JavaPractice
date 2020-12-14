package com.javaclasseslessons;

public class Sample {
    private int x;
    private double y;

    public Sample() {
        x = 0;
        y = 0;
    }

    public Sample(int a, double b) {
        x = a;
        y = b;
    }

    public void setQ1Sample() {
        x = 10;
        y = 25.8;
    }

    public void print() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        Sample s = new Sample(20, 35.0);
        s.print();
    }

}

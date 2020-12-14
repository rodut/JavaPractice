package com.practice.datatypes;

import java.util.Scanner;

public class testing {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the $/h: ");
        double salaryHour = scanner.nextDouble();

        double salaryYear = salaryHour * 8 * 262;
        double salaryNoTax = salaryYear * 75 / 100;
        System.out.println("Salary per year: " + salaryNoTax);
        System.out.println("Salary per month: " + salaryNoTax / 12);
    }
}

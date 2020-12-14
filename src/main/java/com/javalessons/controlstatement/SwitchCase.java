package com.javalessons.controlstatement;


public class SwitchCase {
    public static void main(String[] args) {

        int choice = 5;

        /**
         * We will use switch when there are 5+ if/else
         */

        switch (choice){
            case 1:
                System.out.println("You chose one");
                break;
            case 2:
                System.out.println("You chose two");
                break;
            case 3:
                System.out.println("You chose three");
                break;
            case 4:
                System.out.println("You chose four");
                break;
            default:
                System.out.println("Unsupported option");
        }
        System.out.println("Final string");
        System.out.println("******************");

        String dayOfTheWeek = "friday";
        switch (dayOfTheWeek.toLowerCase()){
            case "monday":
                System.out.println("The first working day");
                break;
            case "tuesday":
                System.out.println("The second working day");
                break;
            case "wednesday":
                System.out.println("The third working day");
                break;
            case "thursday":
                System.out.println("The fourth working day");
                break;
            case "friday":
                System.out.println("The fifth working day");
                break;
            case "saturday":  case "sunday":
                System.out.println("Finally weekend");
                break;
            default:
                System.out.println("Not a day of the week");
        }
    }
}

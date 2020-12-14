/**
 * Arrays have a disadvantage, they have a fixed length.
 * That's why we will use ArrayList.
 */

package com.javalessons.collections.list;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListRunner {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        /**  To add new elements to an existing array, we can do like this.
//         *   But this is not practical!
//         */
//        int[] array = new int[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = i * 2;
//        }
//
//        int[] nArray = new int[10];
//        System.arraycopy(array, 0, nArray, 0, array.length);
//        nArray[6] = 100;
//        System.out.println(Arrays.toString(nArray));

        ToDoList list = new ToDoList();
        printOut();
        int param = scanner.nextInt();
        while (param != 0) {
            switch (param) {
                case 1:
                    System.out.println("Enter a task to add: ");
                    scanner.nextLine();
                    String task1 = scanner.nextLine();
                    list.addToList(task1);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Printing out the list");
                    list.printToDoList();
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Update an existing item");
                    scanner.nextLine();
                    int i = scanner.nextInt();
                    System.out.println("Enter a new task");
                    scanner.nextLine();
                    String task3 = scanner.nextLine();
                    list.changeTask(i, task3);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("Enter a task to remove");
                    scanner.nextLine();
                    String task4 = scanner.nextLine();
                    list.removeTask(task4);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("Enter the task to get priority");
                    scanner.nextLine();
                    String task5 = scanner.nextLine();
                    System.out.println("Priority of the task is "+ list.getTaskPriority(task5));
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                case 6:
                    System.out.println("Enter a number of position for the task");
                    scanner.nextLine();
                    int position = scanner.nextInt();
                    System.out.println("Enter a new task");
                    scanner.nextLine();
                    String task6 = scanner.nextLine();
                    list.addToListAtPosition(position, task6);
                    System.out.println("Choose an action by typing [0-6]");
                    param = scanner.nextInt();
                    break;
                default:
                    param = 0;
            }
        }
    }

    private static void printOut() {
        System.out.println("Choose an action. Press: \n"
                + "1 to add a new item into the list\n"
                + "2 to print out the list\n"
                + "3 to update an existing item\n"
                + "4 to remove an item from the list\n"
                + "5 to get task priority or number in the list\n"
                + "6 to add a new item at a specific position\n"
                + "0 to exit\n\n"
                + "After choosing an option please press Enter.");
    }
}

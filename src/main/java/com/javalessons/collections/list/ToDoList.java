package com.javalessons.collections.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ToDoList {

    /**
     * List it's a parameterized collection.
     * List it's a ordered collection.
     * If we will save integers, we must write <Integer>, if strings we must write <String>.
     */
    private LinkedList<String> toDoList = new LinkedList<>();

    public void addToList(String task) {
//        toDoList.add(task);
        addInAlphabeticalOrder(task);

    }

    private void addInAlphabeticalOrder(String task) {
        ListIterator<String> listIterator = toDoList.listIterator();

        while (listIterator.hasNext()) {
            int compared = listIterator.next().compareTo(task);

            if (compared == 0) {
                System.out.println("Task already exists in the list.");
                return;
            } else if (compared > 0) {
                listIterator.previous();
                listIterator.add(task);
                return;
            }
        }
        toDoList.add(task);
    }

    public void addToListAtPosition(int position, String task) {
        toDoList.add(position, task);
    }

    public void printToDoList() {

//        /** It's a for-each cycle*/
//        for(String s: toDoList){
//            System.out.println(s);
//        }

//        for (int i = 0; i < toDoList.size(); i++) {
//            System.out.println(i + " - " + toDoList.get(i));
//        }

        /**
         *  We can print all the elements using an iterator.
         *  Iterator it's an interface that has methods like hasNext()
         *  and next() that permit us to work with collections.
         */
        Iterator<String> iterator = toDoList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element " + iterator.next());
        }

    }

    public void changeTask(int index, String task) {
        toDoList.set(index, task);
    }

    public void removeTask(String task) {
        toDoList.remove(task);
    }

    public int getTaskPriority(String task) {
        return toDoList.indexOf(task);
    }

}

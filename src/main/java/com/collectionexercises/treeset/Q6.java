package com.collectionexercises.treeset;

import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Red");
        treeSet.add("Blue");
        treeSet.add("Green");

        // clone a tree set
        TreeSet clonedTreeSet;
        clonedTreeSet = (TreeSet) treeSet.clone();
        System.out.println("Cloned TreeSet: " + clonedTreeSet);

        // another method to clone a tree set
        TreeSet<String> secondTreeSet = (TreeSet<String>) treeSet.clone();
        System.out.println("The second (cloned) TreeSet: " +  secondTreeSet);
    }
}

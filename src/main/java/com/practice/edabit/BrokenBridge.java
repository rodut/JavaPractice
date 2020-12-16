package com.practice.edabit;

public class BrokenBridge {
    public static void main(String[] args) {
        System.out.println(checkBridge("# #"));
    }

    public static boolean checkBridge(String bridge){
        return !bridge.contains(" ");
    }
}

/**
 * Lambda expressions basically express instances of functional interfaces (interface with single abstract method - functional interface).
 * Lambda expressions implements the only abstract function and therefore implements functional interface.
 */

package com.javalessons.lambdas;

import java.util.Arrays;
import java.util.Comparator;

public class LambdasMain {
    public static void main(String[] args) {

        String[] colours = {"green", "brown", "black", "blue", "pink", "grey"};

        Player player1 = new Player("Alex", 100);
        Player player2 = new Player("Igor", 80);
        Player player3 = new Player("Victor", 80);
        Player player4 = new Player("John", 91);

        Player[] players = {player1, player2, player3, player4};

        /** Sorting the Player array from highest score to lowest */
//        Arrays.sort(players, new Comparator<Player>() {
//            @Override
//            public int compare(Player p1, Player p2) {
//                return p2.score - p1.score;
//            }
//        });

        /** Same code using Lambdas */
        Arrays.sort(players, (p1, p2) -> {
            if ((p2.score - p1.score) != 0) {
                return p2.score;
            } else {
                return p1.name.compareTo(p2.name);
            }
        });

        System.out.println(Arrays.toString(players));


        /** Sorting the colors array by last letter, from A to Z */
        Arrays.sort(colours, (s1, s2) -> s1.charAt(s1.length() - 1) - s2.charAt(s2.length() - 1));
        System.out.println(Arrays.toString(colours));

        Thread thread = new Thread(() -> {
            System.out.println("Bob Star");
        });
    }

    private static class Player {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public String getName() {
            return name;
        }

        public int getScore() {
            return score;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }
    }
}

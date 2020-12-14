/**
 * Interface Collection
 * Class Collections
 */

package com.javalessons.collections.collectionsClass;

import java.util.*;

public class CollectionsRunner {
    private static List<Card> deckOfCards = new ArrayList<>();

    public static void main(String[] args) {

/*
        List<String> colors = new ArrayList<>();

        colors.add("yellow");
        colors.add("blue");
        colors.add("green");
        colors.add("black");
        colors.add("red");

        System.out.println("List before sorting: " + colors);
        System.out.println("**************");
        Collections.sort(colors);
        System.out.println("List after sorting: " + colors);
*/
        /**
         *   Playing cards example
         */

        for (Card.Face face : Card.Face.values()) {
            for (Card.Suit suit : Card.Suit.values()) {
                deckOfCards.add(new Card(suit, face));
            }
        }

/*        System.out.println("Original deck of cards:");
        sortingCards();
*/
        System.out.println("\n");
        System.out.println("Cards after shuffle:");
        Collections.shuffle(deckOfCards);
        sortingCards();

//        Collections.sort(deckOfCards);
//        Collections.sort(deckOfCards, Collections.reverseOrder());
        Collections.sort(deckOfCards, new CardComparator());
        System.out.println("\n");
        System.out.println("Cards after sorting: ");
        sortingCards();

    }

    public static void sortingCards(){
        for (int i = 0; i < deckOfCards.size(); i++) {
            System.out.printf("%-20s %s", deckOfCards.get(i), (i + 1) % 4 == 0 ? "\n" : "   ");
        }
    }

    public static class CardComparator implements Comparator<Card>{

        /**  values --> list of strings */
        List<Card.Face> faces = Arrays.asList(Card.Face.values());

        @Override
        public int compare(Card firstCard, Card secondCard) {
            if (faces.indexOf(firstCard.getFace()) < faces.indexOf(secondCard.getFace())) {
                return 1;
            } else if (faces.indexOf(firstCard.getFace()) > faces.indexOf(secondCard.getFace())) {
                return -1;
            } else if (faces.indexOf(firstCard.getFace()) == faces.indexOf(secondCard.getFace())) {
                return String.valueOf(firstCard.getSuit()).compareTo(String.valueOf(secondCard.getSuit()));
            }
            return 0;
        }
    }

    public static class Card implements Comparable<Card> {

        private enum Suit {SPADES, HEARTS, CLUBS, DIAMONDS}

        private enum Face {ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING}

        private final Suit suit;
        private final Face face;

        public Card(Suit suit, Face face) {
            this.suit = suit;
            this.face = face;
        }

        public Suit getSuit() {
            return suit;
        }

        public Face getFace() {
            return face;
        }

        @Override
        public int compareTo(Card card) {

            /**  An array from our enum Face */
            Face[] values = Face.values();

            /**  values --> list of strings */
            List<Face> faces = Arrays.asList(values);

            if (faces.indexOf(this.face) < faces.indexOf(card.getFace())) {
                return -1;
            } else if (faces.indexOf(this.face) > faces.indexOf(card.getFace())) {
                return 1;
            } else if (faces.indexOf(this.face) == faces.indexOf(card.getFace())) {
                return String.valueOf(suit).compareTo(String.valueOf(card.getSuit()));
            }

            return 0;
        }

        @Override
        public String toString() {
            return face + " of " + suit;
        }

    }

}

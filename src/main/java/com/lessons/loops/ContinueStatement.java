/**
 * This program demonstrates continue to skip remaining statements of iteration.
 * Cind folosim "continue" statement in corpul loop-ului, urmatoarele statements sint skip-uite si loop-ul continue cu urmatoarea iteratie.
 */

package com.lessons.loops;

public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            if(i%2 == 0){
                continue; // Skip next statement if i is even
            }
            System.out.print(i + " ");
        }
    }
}

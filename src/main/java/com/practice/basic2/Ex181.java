/**
 * Write a Java program to find the length of last word of a given string. The string contains upper/lower-case alphabets and empty space characters ' '.
 * Sample Output:
 * Original String: The length of last word
 * Length of the last word of the above string: 4
 */

package com.practice.basic2;


public class Ex181 {

    public static void main(String[] args) {
        String text = "The length of the last word";
        String lastWord = text.substring(text.lastIndexOf(" ") + 1);
        System.out.println("The last word id: " + lastWord);

        /**  Count the numbers of characters in last word */
        int count = 0;
        for (int i = 0; i < lastWord.length(); i++) {
            if(lastWord.charAt(i) != ' ')
                count++;
        }

        System.out.println("Length of the last word of the above string is: " + count);
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String myString = "";
        String myReversedString = "";

        System.out.println("Please type a word");
        myString = myScanner.nextLine();

        for (int i = myString.length() - 1; i >= 0; i--) {
            myReversedString = myReversedString + myString.charAt(i);

        }
        System.out.println("your reversed word is " + myReversedString);

        if (myString.equals(myReversedString)) {
            System.out.println("Your word is a palindrome");
        } else {
            System.out.println("Sorry, your word is not a palindrome");
        }
    }
}

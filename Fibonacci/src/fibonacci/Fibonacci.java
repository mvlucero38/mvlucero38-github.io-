/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class Fibonacci {


        
    
    
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please input a number for your sequence length: ");
        int userInput = myScanner.nextInt();
        int x = 0;
        int y = 1;
        int total = 0;

        for (int i = 0; i < userInput; i++) {
            x = x + y;
            y = x - y;
            total = (x + y) - 1;
            
            if (x % 2 == 0) {

                System.out.println(x + " This number is even");

            } else {
                System.out.println(x + " ");

            }

        }

        System.out.println("*************************************************************");
        System.out.println("********    The total for all the numbers is:   " + total + "   ********");
        System.out.println("*************************************************************");

    }
    
    
        
        
    }



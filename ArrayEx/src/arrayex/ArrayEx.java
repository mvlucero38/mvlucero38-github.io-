/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayex;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Maira
 */
public class ArrayEx {

    /* arrange array, search for number 88, return if exist or not, return position, 
    determine min and max number in array, return average of all numbers in array and total sum.
     */
    public static int[] myArray = {1, 2, 55, 4, 5, 6, 7, 8, 122, 333, 675};
    public static int searchNumber;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What number you would like to check?");
        searchNumber = myScanner.nextInt();

        sortArray(myArray);

        int result = searchInArray(myArray, searchNumber);

        if (result == -1) {
            System.out.println("number " + searchNumber + " is not part of the array");

        } else {

            System.out.println("number " + searchNumber + " is part of the array and is in position " + result);

        }

        System.out.println(" the min number in the array is " + myArray[0]);
        System.out.println(" the max number in the array is " + myArray[myArray.length - 1]);
        System.out.println("The sum of all the array elements is " + arraySum(myArray));
        System.out.println("The average of all the array elements is " + (arraySum(myArray) / myArray.length));

    }

    // Sorting array, not using libraries. Used Bubble Sort
    private static int[] sortArray(int[] myArray) {

        for (int i = 0; i < myArray.length - 1; i++) {
            for (int k = 0; k < myArray.length - i - 1; k++) {
                if (myArray[k] > myArray[k + 1]) {
                    int tempVar = myArray[k];
                    myArray[k] = myArray[k + 1];
                    myArray[k + 1] = tempVar;

                }

            }
        }

        return myArray;
    }

    // Find number. I used Binary Search
    private static int searchInArray(int[] myArray, int searchNumber) {
        int first = 0;
        int last = myArray.length - 1;
        int mid = (first + last) / 2;

        while (first <= last) {
            if (myArray[mid] < searchNumber) {
                first = mid + 1;

            } else if (myArray[mid] == searchNumber) {
                return mid;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }

    private static int arraySum(int[] myArray) {
        int sum = 0;

        for (int i = 0; i <= myArray.length - 1; i++) {
            sum = sum + myArray[i];

        }
        return sum;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.util.ArrayList;
import java.util.Arrays;
 

/**
 *
 * @author Maira
 */
public class Tests {

    public static int A[] = {2,4,8,10,4,33,5,7,11,6,12};
   
    
    /**
     * @param args     */
    /* Given an array A of non-negative integers, return an array consisting of all 
    the even elements of A, followed by all the odd elements of A.

        You may return any answer array that satisfies this condition.
     */
    
    public static void main(String[] args) {
        int[] evenArray = new int[A.length];
        
    
        sortArrayByParity(A, evenArray);
        System.out.println(Arrays.toString(evenArray));

    }

  
        
    public static int [] sortArrayByParity(int[] A, int[] evenArray) {
        
        int k = 0;
       

        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] % 2 == 0) {
                evenArray[k++] = A[i];}

            }

                for (int i = 0; i < A.length - 1; i++) {
                    if (A[i] % 2 != 0) {
                        evenArray[k++] = A[i];
                    }

                }
                return evenArray;
            }

        }
       
    
 
         
            
        
        
        
        
        
        


     
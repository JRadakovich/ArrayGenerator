/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chapter04;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 *  @author Julie Radakovich
 * CIT 130 - Exam 1
 */
public class Exam1_Radakovich {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] largeArray = new int[5];
        int largeCount = 0;
        for (int i = 0; i < largeArray.length; i++)
        {
            System.out.print("Enter a number to store in the array:");
            largeArray[i] = scan.nextInt();
        }
        
        for (int e : largeArray){
            if(e > 100){
                largeCount++;
            }
        }
        
        System.out.println("The array contains: " +Arrays.toString(largeArray));
        System.out.println(largeCount + " of these variables are greater than 100.");
    }
}


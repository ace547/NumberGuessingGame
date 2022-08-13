/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.numberguessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ACE
 */
public class NumberGuessingGame {

   public static void main(String[] args){
        Random rand = new Random();
        Scanner value = new Scanner (System.in);
        int min=0,max=0,enter=0,trying=0;  
          
            System.out.println("heelo welcome on my gama!\n now chose the range number start with:");
            min=value.nextInt();
            System.out.println("end with:");
            max=value.nextInt();
            System.out.println("now we started \n the range is "+ (min) + "-" +max);
            
        int TheTarget = (int)(Math.random( )*(max-min+1)+min);
            System.out.println("choose the number:");
            enter=value.nextInt();
                  
            while (enter!=TheTarget){
                
                System.out.println("wrong!");
                if (enter>TheTarget){
                    System.out.println("the number is less");            
                }
                else
                    System.out.println("the number is bgreater:");                  
            
            enter=value.nextInt(); 
            ++trying;
            }
            System.out.println("you win!");
            System.out.println("you try "+trying+" times");
        }
}

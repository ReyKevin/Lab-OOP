/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labsesi3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class LabSesi3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       int angka;
       Scanner input = new Scanner(System.in);
       Random rand = new Random();
       
       int magic = rand.nextInt(100);
       
       System.out.println("Guess a magic number between 0 and 100");
       do
       {
       System.out.print("Enter your guess : ");
       angka = input.nextInt();
       
       if(angka > magic)
       {
           System.out.println("Your guess is too high");
           System.out.println();
       }
       else if(angka < magic)
       {
           System.out.println("Your guess is too low");
           System.out.println();   
       }
       else
       {
            break;
       }
       
       }while(angka != magic);
       
       System.out.println("Yes, the number is " + magic);
    }
    
}

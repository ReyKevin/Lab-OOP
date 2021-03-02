/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class JavaApplication2 
{

    public static void main(String[] args) 
    {
    int scnd, mnt, scnd2;
     
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter an integer for seconds : ");
    scnd = input.nextInt();
    
    mnt = scnd / 60;
    scnd2 = scnd % 60;
    
    System.out.println(scnd + " seconds is " + mnt + " minutes and " + scnd2 + " seconds");
    }
}

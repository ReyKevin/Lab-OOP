/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Rey
 */
public class JavaApplication6 {
    
    public static void main(String[] args) 
    {
        String kota, kota2;
        int ascii, ascii2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama kota : ");
        kota = input.nextLine();
        ascii = kota.charAt(0);
        
        System.out.println("Masukkan nama kota 2 : ");
        kota2 = input.nextLine();
        ascii2 = kota2.charAt(0);
        
        if(ascii < ascii2)
        {
            System.out.println("Daftar kota : ");
            System.out.println(kota);
            System.out.println(kota2);
        }
        else
        {
            System.out.println("Daftar kota : ");
            System.out.println(kota2);
            System.out.println(kota);
        }
        
    }
    
}

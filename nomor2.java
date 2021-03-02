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
public class nomor2 
{
    public static void main(String[] args) 
    {
    int hari, hari2;
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Hari ini hari senin, ");
    
    System.out.printf("masukkan jumlah hari berikutnya : ");
    hari = input.nextInt();
    
    hari2 = hari % 7;
    
    if (hari2 == 0)
    {
        System.out.println(hari + " hari berikutnya adalah Senin");
    }
    if (hari2 == 1)
    {
        System.out.println(hari + " hari berikutnya adalah Selasa");
    }
    if (hari2 == 2)
    {
        System.out.println(hari + " hari berikutnya adalah Rabu");
    }
    if (hari2 == 3)
    {
        System.out.println(hari + " hari berikutnya adalah Kamis");
    }
    if (hari2 == 4)
    {
        System.out.println(hari + " hari berikutnya adalah Jumat");
    }
    if (hari2 == 5)
    {
        System.out.println(hari + " hari berikutnya adalah Sabtu");
    }
    if (hari2 == 6)
    {
        System.out.println(hari + " hari berikutnya adalah Minggu");
    }
    
    } 
}

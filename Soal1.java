/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

/**
 *
 * @author Rey
 */

public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        tabung tabung1 = new tabung(5, 10);
        tabung tabung2 = new tabung(7.5, 15.5);
        
        System.out.println("Tabung 1");
        System.out.println("Radius = " + tabung1.radius);
        System.out.println("Tinggi = " + tabung1.tinggi);
        System.out.println("Luas alas = " + tabung1.getLuasAlas());
        System.out.println("Volume tabung = " + tabung1.getVolume());
        
        System.out.println("Tabung 2");
        System.out.println("Radius = " + tabung2.radius);
        System.out.println("Tinggi = " + tabung2.tinggi);
        System.out.println("Luas alas = " + tabung2.getLuasAlas());
        System.out.println("Volume tabung = " + tabung2.getVolume());
    }
    
}

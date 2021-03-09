/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboop2;

/**
 *
 * @author Rey
 */
import java.util.Scanner;
import java.util.Random;

public class LabOOP2 
{
    public static void main(String[] args) 
    {
        int angka;
        
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int lotre = rand.nextInt(100);
        
        do
        {
            System.out.println("Guess the number! [00-99] : ");
            angka = input.nextInt();
        }while(angka < 0 && angka > 99);

        if(lotre < 10)
        {
            System.out.println("Today's lottery number is : " + "0" + lotre);
        }    
        else
        {
            System.out.println("Today's lottery number is : " + lotre);
        }   
            
        int angkadigit1 = angka / 10;
        int angkadigit2 = angka % 10;
        int lotredigit1 = lotre / 10;
        int lotredigit2 = lotre % 10;
            
        if(angka == lotre)
        {
            System.out.println("Your choice of number is perfectly matched! Congratulations! You just won $10.000!");
        }
        else if(angkadigit1 == lotredigit2 && angkadigit2 == lotredigit1)
        {
            System.out.println("Your choice of number is matched! You just won $3.000!");
        }
        else if(angkadigit1 == lotredigit1 || angkadigit1 == lotredigit2 || angkadigit2 == lotredigit1 || angkadigit2 == lotredigit2)
        {
            System.out.println("One of your chosen number is matched! You just won $1.000!");
        }
        else
        {
            System.out.println("Better luck next time!");
        }                
    }
}

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
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Soal2 
{
    public static void main(String[] args)
    {
        GregorianCalendar clndr = new GregorianCalendar();
        System.out.print("Hari ini tanggal " + clndr.get(GregorianCalendar.DATE));
        System.out.print(" bulan " + (clndr.get(GregorianCalendar.MONTH) + 1));
        System.out.println(" tahun " + clndr.get(GregorianCalendar.YEAR));
        
        long day = TimeUnit.MILLISECONDS.toDays(clndr.getTimeInMillis());
        final long year = day / 365;
        day %= 365;
        final long month = day / 30;
        day %= 30;
        System.out.println( year + " tahun " + month + " bulan " + day + " hari telah dilewati sejak 1 Januari 1970");
    }
    
}

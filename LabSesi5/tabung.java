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
public class tabung 
{
    public double radius, tinggi;
    
    tabung()
    {
        radius = 1;
        tinggi = 1;
    }
    
    tabung(double r, double t)
    {
        radius = r;
        tinggi = t;
    }
    
    public double getVolume()
    {
        double volume = Math.PI * Math.pow(radius, 2) * tinggi;
        return volume;
    }
    
    public double getLuasAlas()
    {
        double luasalas = Math.PI * Math.pow(radius, 2);
        return luasalas;
    }
    
    public void setRadius(double r)
    {
        radius = r;
    }
    
    public void setTinggi(double t)
    {
        tinggi = t;
    }
}

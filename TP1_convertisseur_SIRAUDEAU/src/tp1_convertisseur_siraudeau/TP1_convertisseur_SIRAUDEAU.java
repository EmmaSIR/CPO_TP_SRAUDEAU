/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_siraudeau;

import java.util.Scanner;

/**
 *
 * @author emmas
 */
public class TP1_convertisseur_SIRAUDEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double temp;
        double tempK;
        double tempC;
        double tempC2;
        double tempF;
        double tempF2;
        double tempK2;
        double choix;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Entrez une valeur : ");
        temp=sc.nextDouble();
        
        System.out.println("Quelle est la conversion que vous souhaitez effectuer ?");
        System.out.println("1: De Celsius vers Kelvin");
        System.out.println("2: De Kelvin vers Celsius");
        System.out.println("3: De Fahrenheit vers Celsius");
        System.out.println("4: De Celsius vers Fahrenheit");
        System.out.println("5: De Kelvin vers Fahrenheit");
        System.out.println("6: De Fahrenheit vers Kelvin");
        choix=sc.nextDouble();
        
        if (choix==1)
        {
            tempK=CelsiusVersKelvin(temp);
            System.out.println("Temperature en Kelvin : " + tempK + "K");
        }
        
        if (choix==2)
        {
            tempC=KelvinVersCelsius(temp);
            System.out.println("Temperature en Celsius : " + tempC + "C");
        }
        
        if (choix==3)
        {
            tempC2=FarenheitVersCelsius(temp);
            System.out.println("Temperature en Celsius : " + tempC2 + "C");
        }
        
        if (choix==4)
        {
            tempF=CelciusVersFareinheit(temp);
            System.out.println("Temperature en Fareinheit : " + tempF + "F");
        }
        
        if (choix==5)
        {
            tempF2=KelvinVersFareinheit(temp);
            System.out.println("Temperature en Fareinheit : " + tempF2 + "F");
        }
        
        if (choix==6)
        {
            tempK2=FareinheitVersKelvin(temp);
            System.out.println("Temperature en Kelvin : " + tempK2 + "K");
        }
    }
    public static double CelsiusVersKelvin (double temp)
    {
        double tempK =temp+273.00;
        return tempK;
    }
    
    public static double KelvinVersCelsius (double temp)
    {
        double tempC =temp-273.00;
        return tempC;
    }
    
    public static double FarenheitVersCelsius (double temp)
    {
        double tempC2 =temp-17.78;
        return tempC2;
    }
    
    public static double CelciusVersFareinheit (double temp)
    {
        double tempF =temp+32.00;
        return tempF;
    }
     
    public static double KelvinVersFareinheit (double temp)
    {
        double tempF2 =temp-459.7;
        return tempF2;
    }
     
    public static double FareinheitVersKelvin (double temp)
    {
        double tempK2 =temp+255.372;
        return tempK2;
    }
}

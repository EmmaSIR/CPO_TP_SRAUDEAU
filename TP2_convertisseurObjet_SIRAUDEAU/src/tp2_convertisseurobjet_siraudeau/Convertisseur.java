/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_siraudeau;

/**
 *
 * @author emmas
 */
public class Convertisseur 
{
    int nbConversions;
    
    public Convertisseur () 
    { 
        nbConversions = 0 ; 
    } 
    
    public float CelciusVersKelvin(float temp)
    {
        nbConversions++;
        return temp+273.00f;
    }
    
    public float KelvinVersCelcius(float temp)
    {
        nbConversions++;
        return temp-273.00f;
    }
    
    public float FareinheitVersCelcius(float temp)
    {
        nbConversions++;
        return (temp - 32) * 5 / 9;
    }
    
    public float CelciusVersFareinheit(float temp)
    {
        nbConversions++;
        return (temp * 9 / 5f) + 32;
    }
    
    public float FareinheitVersKelvin(float temp)
    {
        nbConversions++;
        return (temp - 32)* 5/9f+ 273.15f;
    }
    
    public float KelvinVersFareinheit(float temp)
    {
        nbConversions++;
        return (temp - 273.15f)*9/5+32;
    }
    
    @Override 
    public String toString () 
    { 
        return "nb de conversions : "+ nbConversions; 
    } 
    
}

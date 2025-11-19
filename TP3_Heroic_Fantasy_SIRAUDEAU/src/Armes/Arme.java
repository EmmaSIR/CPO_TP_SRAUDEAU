/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author emmas
 */
public class Arme 
{
    String nom;
    int niveau_attaque;
    
    public Arme (String n, int niv)
    {
        if (niv > 100) 
        {
            niv = 100;
        } 
        else if (niv < 0) 
        {
            niv = 0;
        }
    
        nom=n;
        niveau_attaque=niv;
        
    } 
        
    public int getniveau_attaque ()
    { 
        return niveau_attaque;
    }
    
    public String getNom() 
    {
        return nom;
    }
            
    @Override
    public String toString() {
        return "Nom de l'arme : " + nom + " | Niveau d'attaque : " + niveau_attaque;
    }
}

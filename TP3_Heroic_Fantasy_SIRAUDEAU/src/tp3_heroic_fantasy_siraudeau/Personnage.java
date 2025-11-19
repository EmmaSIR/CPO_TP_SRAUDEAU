/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_siraudeau;

/**
 *
 * @author emmas
 */
public class Personnage 
{

    String nom;
    int niveauVie;

    public Personnage(String nom, int niveauVie) 
    {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }
    
    public int getNiveauVie() 
     {
        return niveauVie;
    }
     
    public String getNom() 
    {
        return nom;
    }

    // Affichage simple
    @Override
    public String toString() 
    {
        return "Nom : " + nom + " | Niveau de vie : " + niveauVie;
    }
}

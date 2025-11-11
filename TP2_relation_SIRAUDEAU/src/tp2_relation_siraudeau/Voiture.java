/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_siraudeau;

/**
 *
 * @author emmas
 */
public class Voiture {
    
    String modele;
    String marque;
    int puissanceCV;
    Personne proprietaire ;
    
    public Voiture(String m, String ma, int p) 
    {
        modele=m;
        marque=ma;
        puissanceCV=p;
        proprietaire = null;
    }
    
    @Override
    public String toString() {
        return "Voiture : " + modele + " (" + marque + ", " + puissanceCV + " CV)";
    }
    
}

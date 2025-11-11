/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_siraudeau;

/**
 *
 * @author emmas
 */
public class Personne {
    
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;
    
    public Personne (String n, String p) 
    { 
        nom=n;
        prenom=p; 
        liste_voitures = new Voiture[3];
        nbVoitures = 0;
    }
    
    @Override 
    public String toString () 
    { 
    return prenom + "" + nom;
    } 
    
    public boolean ajouter_voiture( Voiture voiture_a_ajouter) 
    { 
        if (voiture_a_ajouter.proprietaire != null) 
        {
            return false;
        }
        
        if (nbVoitures >= 3) 
        {  
            return false;
        }
        
        liste_voitures[nbVoitures] = voiture_a_ajouter;

        nbVoitures=nbVoitures+1;

        voiture_a_ajouter.proprietaire = this;

        return true;

    } 
    
}

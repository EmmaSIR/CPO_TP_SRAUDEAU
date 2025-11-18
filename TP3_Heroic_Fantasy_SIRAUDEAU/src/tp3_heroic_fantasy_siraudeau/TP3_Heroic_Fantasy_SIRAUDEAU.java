/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_siraudeau;

import Armes.Epee;
import Armes.Arme;
import Armes.Baton;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author emmas
 */


public class TP3_Heroic_Fantasy_SIRAUDEAU {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);
        
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);
        
        System.out.println(excalibur);
        System.out.println(durandal);
        System.out.println(chene);
        System.out.println(charme);
        
        ArrayList<Arme> listeArmes = new ArrayList<>();

        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);
        
        System.out.println("\n--- Affichage avec ArrayList ---");
        for (Arme a : listeArmes) {
            System.out.println(a);
        }

        Vector<Arme> listeArmesVect = new Vector<>();

        listeArmes.add(excalibur);
        listeArmes.add(durandal);
        listeArmes.add(chene);
        listeArmes.add(charme);

         System.out.println("\n--- Affichage avec Vector (elementAt) ---");
        for (int i = 0; i < listeArmesVect.size(); i++) {
            System.out.println(listeArmesVect.elementAt(i));
        }
    }
    
}

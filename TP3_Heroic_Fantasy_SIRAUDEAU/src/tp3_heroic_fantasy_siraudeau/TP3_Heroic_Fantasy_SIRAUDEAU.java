/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_siraudeau;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;

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
        
        System.out.println("=== Création des armes (10..13) ===");
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

        System.out.println("\n--- Parcours ArrayList ---");
        for (int i = 0; i < listeArmes.size(); i++) {
            System.out.println(listeArmes.get(i));
        }

        System.out.println("\n=== Création des personnages (26..28) ===");
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);

        ArrayList<Personnage> listePersos = new ArrayList<>();
        listePersos.add(gandalf);
        listePersos.add(garcimore);
        listePersos.add(conan);
        listePersos.add(lannister);

        System.out.println("\n--- Affichage personnages ---");
        for (Personnage p : listePersos) {
            System.out.println(p);
        }

        // === Partie gestion armes et challenge (38..42 + 37) ===
        System.out.println("\n=== Tests inventaires / prédilections (38..42) ===");

        // 38 : Créer guerrier g et magicien m et 3 bâtons + 3 épées
        Guerrier g = new Guerrier("Aragorn", 80, true);
        Magicien m = new Magicien("Merlin", 90, true);

        Baton b1 = new Baton("Vieux Bois", 6, 30);
        Baton b2 = new Baton("Runique", 9, 50);
        Baton b3 = new Baton("Feuillu", 5, 10);

        Epee e1 = new Epee("Tranchante", 8, 20);
        Epee e2 = new Epee("Sombre Lame", 10, 40);
        Epee e3 = new Epee("Acier Rouge", 7, 15);

        // 39 : ajouter 1 bâton + 2 épées au guerrier g, et le faire choisir première épée
        g.ajouterArme(b1);
        g.ajouterArme(e1);
        g.ajouterArme(e2);
        g.equiperArme("Tranchante"); // choisit e1

        // 40 : ajouter 2 bâtons + 1 épée au magicien m
        m.ajouterArme(b2);
        m.ajouterArme(b3);
        m.ajouterArme(e3);

        // 41 : afficher nombre d'armes préférées du magicien (bâtons)
        System.out.println("\n" + m.getNom() + " possède " + m.compterArmesDePredilection() + " bâtons (armes de prédilection).");

        // 42 : afficher toutes les caractéristiques des personnages
        System.out.println("\n--- Caractéristiques des personnages ---");
        System.out.println(g);
        System.out.println(m);

        // === Partie statics, destructeurs et EtreVivant tests (43..57) ===
        System.out.println("\n=== Tests compteurs statiques & EtreVivant (43..57) ===");
        System.out.println("Total personnages : " + Personnage.totalPersonnages);
        System.out.println("Total guerriers : " + Personnage.totalGuerriers);
        System.out.println("Total magiciens : " + Personnage.totalMagiciens);

        // 55 : Fatigue le guerrier (seFatiguer)
        System.out.println("\nFatiguons " + g.getNom() + " :");
        g.seFatiguer();

        // 56 : Afficher et vérifier s'il est vivant
        System.out.println("\n" + g.getNom() + " : " + g);
        System.out.println(g.getNom() + " est vivant ? " + g.estVivant());

        // 57 : Faire attaquer le magicien par le guerrier (guerrier attaque magicien)
        System.out.println("\n" + g.getNom() + " attaque " + m.getNom() + " :");
        g.attaquer(m);
        System.out.println("Après attaque :");
        System.out.println(g);
        System.out.println(m);

        // === MORRRRTALL COMBAT (58..66) tests plus détaillés ===
        System.out.println("\n=== Test combat détaillé (58..66) ===");

        // 59-60 : recréer 2 épées et 2 bâtons (nouvel exemple)
        Epee ex = new Epee("Excalibur", 7, 5);
        Epee du = new Epee("Durandal", 4, 7);

        Baton ch = new Baton("Chêne", 4, 5);
        Baton ch2 = new Baton("Charme", 5, 6);

        // 61 : créer magicien non confirmé et guerrier à cheval
        Magicien mag = new Magicien("PetitMage", 70, false); // non confirmé
        Guerrier war = new Guerrier("Cavalier", 85, true);    // à cheval

        // 62 : donner à chacun une épée et un bâton
        mag.ajouterArme(ch);
        mag.ajouterArme(ex);

        war.ajouterArme(du);
        war.ajouterArme(ch2);

        // 63 : choisir une arme pour chaque personnage
        mag.equiperArme("Chêne");    // mag utilise bâton
        war.equiperArme("Durandal"); // guerrier utilise épée

        // 64 : Faire attaquer le magicien (attaque sur war)
        System.out.println("\n" + mag.getNom() + " attaque " + war.getNom() + " :");
        mag.attaquer(war);
        System.out.println("Après attaque :");
        System.out.println(mag);
        System.out.println(war);

        // 65 : Faire attaquer le guerrier (attaque sur mag)
        System.out.println("\n" + war.getNom() + " attaque " + mag.getNom() + " :");
        war.attaquer(mag);
        System.out.println("Après attaque :");
        System.out.println(mag);
        System.out.println(war);

        // 66 : Tester si les personnages sont vivants
        System.out.println("\n" + mag.getNom() + " est vivant ? " + mag.estVivant());
        System.out.println(war.getNom() + " est vivant ? " + war.estVivant());

        // Afficher les compteurs finaux
        System.out.println("\n=== Compteurs finaux ===");
        System.out.println("Total personnages : " + Personnage.totalPersonnages);
        System.out.println("Total guerriers : " + Personnage.totalGuerriers);
        System.out.println("Total magiciens : " + Personnage.totalMagiciens);
    }
}
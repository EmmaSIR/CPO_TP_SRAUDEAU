/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_siraudeau;

/**
 *
 * @author emmas
 */
public class Moussaka {
    int nbCalories;
    
    public Moussaka() {
    nbCalories = 500;
    }
    
    public static void main(String[] args) 
    {
        // Création du tableau de 10 références
        Moussaka[] tableau = new Moussaka[10];

        // Création de 10 objets Moussaka
        for (int i = 0; i < 10; i++) {
            tableau[i] = new Moussaka();
        }

        // Affichage pour vérifier
        for (int i = 0; i < 10; i++) {
            System.out.println("Objet " + i + " : " + tableau[i].nbCalories + " calories");
        }
    }
    
}

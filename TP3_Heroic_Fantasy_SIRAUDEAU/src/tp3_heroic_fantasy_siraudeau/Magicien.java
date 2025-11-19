/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heroic_fantasy_siraudeau;

/**
 *
 * @author emmas
 */

public class Magicien extends Personnage {
    boolean estConfirme;

    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.estConfirme = estConfirme;
    }

    // Setter pour estConfirme
    public void setEstConfirme(boolean estConfirme) {
        this.estConfirme = estConfirme;
    }

    @Override
    public String toString() {
        return super.toString() + " | Confirmé : " + estConfirme;
    }
}
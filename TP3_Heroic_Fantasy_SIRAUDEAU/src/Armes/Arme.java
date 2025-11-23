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
    int niveauAttaque;

    public Arme(String nom, int niveauAttaque) {
        if (niveauAttaque < 0) niveauAttaque = 0;
        if (niveauAttaque > 100) niveauAttaque = 100;

        this.nom = nom;
        this.niveauAttaque = niveauAttaque;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauAttaque() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + " | Niveau attaque : " + niveauAttaque;
    }
}
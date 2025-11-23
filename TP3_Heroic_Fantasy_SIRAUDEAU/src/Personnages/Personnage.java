/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

/**
 *
 * @author emmas
 */
import Armes.Arme;
import java.util.ArrayList;

public abstract class Personnage {

    protected String nom;
    protected int niveauVie;

    // Inventaire
    protected ArrayList<Arme> inventaire = new ArrayList<>();
    protected Arme armeEnMain = null;

    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveauVie() {
        return niveauVie;
    }

    // Ajouter une arme (max 5)
    public void ajouterArme(Arme a) {
        if (inventaire.size() < 5) {
            inventaire.add(a);
            System.out.println(nom + " ajoute : " + a.getNom());
        } else {
            System.out.println(nom + " ne peut pas avoir plus de 5 armes !");
        }
    }

    // Choisir arme par nom
    public void equiperArme(String nomArme) {
        for (Arme a : inventaire) {
            if (a.getNom().equalsIgnoreCase(nomArme)) {
                armeEnMain = a;
                System.out.println(nom + " s'équipe de : " + a.getNom());
                return;
            }
        }
        System.out.println("⚠️ Arme " + nomArme + " introuvable dans l’inventaire de " + nom);
    }

    // Getter de l’arme en main
    public Arme getArmeEnMain() {
        return armeEnMain;
    }

    @Override
    public String toString() {
        return "Nom : " + nom
                + " | Vie : " + niveauVie
                + " | Arme en main : " + (armeEnMain == null ? "Aucune" : armeEnMain.toString());
    }
}
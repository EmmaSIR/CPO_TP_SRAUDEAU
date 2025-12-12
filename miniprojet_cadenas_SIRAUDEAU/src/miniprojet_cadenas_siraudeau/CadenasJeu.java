package miniprojet_cadenas_siraudeau;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;

/**
 *
 * @author emmas
 */
public class CadenasJeu {
    private int[] codeSecret;
    private int tentative;
    private final int MAX_TENTATIVES = 5;

    private int nbBienPlaces;
    private int nbTropHauts;
    private int nbTropBas;

    public CadenasJeu() {
        codeSecret = new int[4];
        reset();
    }

    private void genererCode() {
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            codeSecret[i] = r.nextInt(10);
        }
    }

    public void reset() {
        tentative = 0;
        genererCode();
        nbBienPlaces = 0;
        nbTropHauts = 0;
        nbTropBas = 0;
    }

    public void tester(int[] prop) {
        tentative++;

        nbBienPlaces = 0;
        nbTropHauts = 0;
        nbTropBas = 0;

        for (int i = 0; i < 4; i++) {
            if (prop[i] == codeSecret[i]) {
                nbBienPlaces++;
            } else if (prop[i] > codeSecret[i]) {
                nbTropHauts++;
            } else {
                nbTropBas++;
            }
        }
    }

    public int getNbBienPlaces() { return nbBienPlaces; }
    public int getNbTropHauts() { return nbTropHauts; }
    public int getNbTropBas() { return nbTropBas; }
    public int getTentative() { return tentative; }
    public int getMaxTentatives() { return MAX_TENTATIVES; }

    public boolean estTermine() {
        return tentative >= MAX_TENTATIVES || estGagne();
    }

    public boolean estGagne() {
        return nbBienPlaces == 4;
    } 

    public int[] getCodeSecret() {
        return codeSecret.clone();
    }
}
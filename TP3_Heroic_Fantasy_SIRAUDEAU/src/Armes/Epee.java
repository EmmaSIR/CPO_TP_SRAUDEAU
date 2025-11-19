/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author emmas
 */
public class Epee extends Arme 
{
    int finesse;   

    public Epee(String n, int niv, int fin) {
        super(n, niv);   

        if (fin > 100) {
            fin = 100;
        } else if (fin < 0) {
            fin = 0;
        }
        finesse = fin;
    }

    @Override
    public String toString() {
        return super.toString() + " | Finesse : " + finesse;
    }
}


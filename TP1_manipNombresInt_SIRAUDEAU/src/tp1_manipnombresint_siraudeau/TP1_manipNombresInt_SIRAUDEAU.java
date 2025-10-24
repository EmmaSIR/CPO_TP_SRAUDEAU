/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint_siraudeau;

import java.util.Scanner;

/**
 *
 * @author emmas
 */
public class TP1_manipNombresInt_SIRAUDEAU 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
    // TODO code application logic here
        int nombre1;
        int nombre2;
        int somme;
        int diff; 
        int produit;
        int division;
        double reste;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Entrez le premier entier : ");
        nombre1 = sc.nextInt();
        System.out.print("Entrez le deuxieme entier : ");
        nombre2 = sc.nextInt();
        somme=0;
        diff=0;
        {  
            somme=somme+nombre1+nombre2; 
        }  
        // affichage du resultat  
        System.out.println("la somme de "+ nombre1 + " et " + nombre2+ " est :"+somme); 
        {
           diff=diff+nombre1-nombre2;
        }
        System.out.println("la difference de "+ nombre1 + " et " + nombre2+ " est :"+diff);
        {
            produit = nombre1*nombre2;
        }
        System.out.println("le produit de "+ nombre1 +" et "+ nombre2+ " est : " +produit);
        {
            division = nombre1 / nombre2;
        {
        }
        reste = (nombre1*1.0)/nombre2 - division;
        }
        System.out.println("le quotient entier de "+ nombre1 +" et "+ nombre2+ " est : " +division +" et le reste de la division euclidienne est " +reste);
 
    }
    
}

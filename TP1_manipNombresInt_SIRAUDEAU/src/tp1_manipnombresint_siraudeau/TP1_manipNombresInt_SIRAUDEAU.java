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
    }
    
}

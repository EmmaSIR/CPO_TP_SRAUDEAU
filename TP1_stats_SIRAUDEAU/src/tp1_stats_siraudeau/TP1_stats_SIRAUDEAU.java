/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats_siraudeau;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author emmas
 */
public class TP1_stats_SIRAUDEAU {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int[] faces = new int[6];
        
        System.out.println("Combien de fois voulez vous lancer le de");
        int m = sc.nextInt();
        
        for (int i = 0; i<m; i++)
        {
            int tirage = rand.nextInt(6);
            faces[tirage]++;
        }
        
        System.out.println("\nRésultats :");
        for (int i=0; i<6; i++)
        {
            System.out.println("Face" + (i + 1) + ":" + faces[i] +"fois");
        }   
        
        System.out.println("\nRésultats en pourcentage :");
        for (int i =0; i<6; i++)
        {
            double pourcentage = (faces[i]*100.0)/m;
            System.out.println("Face" + (i + 1) + ":" + pourcentage +"%");
        }
        
    }
    
}

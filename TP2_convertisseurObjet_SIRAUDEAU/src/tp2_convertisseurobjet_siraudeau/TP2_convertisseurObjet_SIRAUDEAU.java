/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_siraudeau;

import java.util.Scanner;

/**
 *
 * @author emmas
 */
public class TP2_convertisseurObjet_SIRAUDEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        Convertisseur nb1 = new Convertisseur();
        Convertisseur nb2 = new Convertisseur();
        double temp;
        int choix = 0;
        double resultat = 0;
        String unite = "";
        
        while (choix != 7) 
        {
            System.out.println("Quelle est la conversion que vous souhaitez effectuer ?");
            System.out.println("1: De Celsius vers Kelvin");
            System.out.println("2: De Kelvin vers Celsius");
            System.out.println("3: De Fahrenheit vers Celsius");
            System.out.println("4: De Celsius vers Fahrenheit");
            System.out.println("5: De Kelvin vers Fahrenheit");
            System.out.println("6: De Fahrenheit vers Kelvin");
            System.out.println("7 : Quitter");
            choix=sc.nextInt();
            
            
            if (choix == 7) {
                System.out.println("Au revoir !");
                break; // on sort de la boucle
            }

            System.out.println("Entrez une valeur : ");
            temp = sc.nextDouble();
            
        if (choix==1)
        {
            resultat= nb1.CelciusVersKelvin((float)temp);
            unite = "K";
        }
        
        else if (choix==2)
        {
            resultat= nb1.KelvinVersCelcius((float)temp);
            unite = "C";
        }
        
        else if (choix==3)
        {
            resultat= nb1.FareinheitVersCelcius((float)temp);
            unite = "C";
        }
        
        else if (choix==4)
        {
            resultat= nb1.CelciusVersFareinheit((float)temp);
            unite = "F";
        }
        
        else if (choix==5)
        {
            resultat= nb1.FareinheitVersKelvin((float)temp);
            unite = "K";
        }
        
        else if (choix==6)
        {
            resultat= nb1.KelvinVersFareinheit((float)temp);
            unite = "F";
        }
        
        System.out.println("Resultat : " + resultat + " " + unite);
        System.out.println(nb1);
        
        }
        
        nb2.CelciusVersKelvin(0);
        nb2.KelvinVersFareinheit(273.15f);
        System.out.println("Deuxieme convertisseur : " + nb2);
        
     
    }
    
}

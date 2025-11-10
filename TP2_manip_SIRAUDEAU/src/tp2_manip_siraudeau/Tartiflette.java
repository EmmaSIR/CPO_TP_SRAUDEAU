/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_manip_siraudeau;

/**
 *
 * @author emmas
 */
public class Tartiflette {
    int nbCalories;
        
    public Tartiflette(int calories) {
    nbCalories = calories;
    }
    
    public static void main(String[] args) 
    {
    Tartiflette assiette1 = new Tartiflette(500) ; 
    Tartiflette assiette2 = new Tartiflette(600) ;
    Tartiflette assiette3 = assiette2 ; 
    
    Tartiflette temp = assiette1;
    assiette1 = assiette2;
    assiette2 = temp;
    
    System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories) ; 
    System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories) ; 
    
    }
}

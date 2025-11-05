/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_siraudeau;

/**
 *
 * @author emmas
 */
public class TP2_Bieres_SIRAUDEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des trolls",7.0 ,"Dubuisson") ; 
        uneBiere.lireEtiquette();
        System.out.println(uneBiere);
        
        BouteilleBiere autreBiere = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ; 
        autreBiere.lireEtiquette();
        System.out.println(autreBiere);

        BouteilleBiere deuxiemeBiere = new BouteilleBiere("Leffe2", 3.1,"Montpeller") ; 
        deuxiemeBiere.lireEtiquette();
        System.out.println(deuxiemeBiere);
        
        BouteilleBiere troisiemeBiere = new BouteilleBiere("Leffe3", 7.8,"Bar a Biere") ; 
        troisiemeBiere.lireEtiquette();
        System.out.println(troisiemeBiere);
        
        autreBiere.Décapsuler();
        deuxiemeBiere.Décapsuler();
    }   
}

        
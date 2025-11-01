/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber_siraudeau;

/**
 *
 * @author emmas
 */
public class TP1_guessMyNumber_SIRAUDEAU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int valeur;
        int comp=0;
        Random generateurAleat = new Random();
        int n = generateurAleat.nextInt(100);
        
        Scanner sc = new Scanner(System.in);
        int score=0;
        int choix;
        System.out.println("Quelle niveau de difficulté voulez vous choisir ? ");
        System.out.println("1: Mode Facile");
        System.out.println("2: Mode difficile");
        choix = sc.nextInt();
        while(score!=1)
        {
            System.out.println("Entre un nombre entre 1 et 100 : ");
            valeur=sc.nextInt();
            
            if (choix==1)
            {
                if(valeur<n)
                {
                    System.out.println("C'est trop petite..");
                    compt=compt+1;
                }
                
                else if (n-valeur>30)
                {
                    System.out.println("C'est vraiment trop petit..");
                    compt=compt+1;
                }
                
                else if (valeur-n>30)
                {
                    System.out.println("C'est vraiment trop grand..");
                    compt=compt+1;
                }
                
                else if (valeur>n)
                {
                    System.out.println("C'est trop grand..");
                    compt=compt+1;
                }
                
                else if (valeur==n)
                {
                    System.out.println("C'est la bonne valeur!!");
                    compt=compt+1;
                    score=1;
                    System.out.println("Vous avez trouvé la bonne valeur en "+compt+ "tentatives !");
                }
                   
            }
            if (choix ==2);
            {
                if (valeur<n);
                {
                    System.out.println("C'est trop petite..");
                    compt=compt+1;
                }
                
                if (valeur>n)
                {
                    System.out.println("C'est trop grand..");
                    compt=compt+1;
                }
                
                if (valeur==n)
                {
                    System.out.println("C'est la bonne valeur!!");
                    compt=compt+1;
                    score=1;
                    System.out.println("Vous avez trouvé la bonne valeur en "+compt+ "tentatives !");
                }
            }
            
            if (choix==2)
            {
                if(comp<10)
                {
                    System.out.println("Vous avez trouvé la bonne valeur en moins de 10 tentatives !");
                }
                
                if(comp>10)
                {
                    System.out.println("Vous n'avez pas trouvé la bonne valeur en moins de 10 tentatives");
                }
            }
        }
               
        // TODO code application logic here
    }
    
}

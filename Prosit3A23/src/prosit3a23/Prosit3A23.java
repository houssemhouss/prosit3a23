package prosit3a23;

import java.util.Scanner;


public class Prosit3A23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Produit p1 = new Produit();
        Produit p2 = new Produit(1021, "lait", "delice");
        Produit p3 = new Produit(2510, "Yaourt", "vitalait");
        Produit p4 = new Produit(3250, "tomate", "sicam", 1.2f);

        p2.prix = 0.7f;
//        
//        
//        
////        p1.afficher();
////        
////        System.out.println("*************");
////        
////        p2.afficher();
////        System.out.println("*************");
////      
////        p3.afficher();
////          System.out.println("*************");
////      
////        p4.afficher();
//          System.out.println("*************");
//        System.out.println( p1.toString());
//    
//    
        Magasin aziza = new Magasin(1, "ESPRIT ");

        aziza.ajouterProduit(p4);
        aziza.ajouterProduit(p3);
        aziza.ajouterProduit(p2);
        aziza.ajouterProduit(new Produit(2, "tomate", "tomate"));

        System.out.println(aziza.toString());
        
        Magasin carrefour = new Magasin(1, "Centre-ville");
        Magasin monoprix = new Magasin(2, "Menzah6");
        
         Caissier caissierC1 = new Caissier(5, 123456, "Ariana", "Mahamed", 36);
        Caissier caissierC2 = new Caissier(2, 894679, "Tunis", "Ali", 40);
        Vendeur vendeurC1 = new Vendeur(10, 849895, "Charguia", "Nihel", 50);
        Responsable responsableC1 = new Responsable(500, 6889566, "Raoued", "taheni", 52);

        Caissier caissierM1 = new Caissier(9, 48912, "Tunis", "Kais", 42);
        Vendeur vendeurM1 = new Vendeur(15, 9485632, "Bizerte", "Abdou", 15);
        Responsable responsableM1 = new Responsable(1500, 9821421, "Ghazela", "Mouhaned", 170);
        //System.out.println("SALAIRE :"+responsableM1.getSalaireEmploye());
        monoprix.ajouterEmploye(caissierC1);
        monoprix.ajouterEmploye(caissierC2);
        monoprix.ajouterEmploye(vendeurC1);
        monoprix.ajouterEmploye(responsableC1);

        carrefour.ajouterEmploye(caissierM1);
        carrefour.ajouterEmploye(vendeurM1);
        carrefour.ajouterEmploye(responsableM1);
                System.out.println("-------------");

         System.out.println(monoprix);

        System.out.println("-------------");
        System.out.println(carrefour);

    }

}

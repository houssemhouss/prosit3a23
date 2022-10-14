/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prosit3a23;


public class Magasin {
    private int id ;
    private String adresse ;
    private int capacite; 
    private Produit[] produits;
    int nbrEmploye;
    Employe[] employes = new Employe[20];

public  Magasin(){
      this.produits= new Produit[50];
   
}    
public Magasin (int id ,String adresse){
    this.id=id;
    this.adresse= adresse ;
    this.capacite=0;
     this.produits= new Produit[50];
}
public void ajouterProduit (Produit p){
    if (this.capacite<50){
    
    //tab[i]=2;    
    produits[this.capacite]=p;
    this.capacite++;
    }else 
    {
        System.out.println("Tableau plient .....");
    }
}

public void ajouterEmploye(Employe employe) {
        this.employes[nbrEmploye] = employe;
        this.nbrEmploye++;
    }


public String toString (){
       String s = "";
        s += "adresse : " + this.adresse + " \n";
        s += "capacite : " + this.capacite + " \n";

        String prods = "";
        for (int i = 0; i < this.capacite; i++) {
            prods += this.produits[i];
        }

        String empl = "";
        for (int i = 0; i < this.nbrEmploye; i++) {
            empl += this.employes[i];
        }

        return s + prods + "\n" + empl+"\n";
}
}

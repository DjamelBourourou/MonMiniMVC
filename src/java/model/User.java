/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author pc
 */
public class User {
   
        
    
    private String nom;
    private String prenom ;

    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

     
       
   }
    public String getNom(){
    return nom;
}
  
   public String getPrenom(){
    return prenom;   
   }
 
}

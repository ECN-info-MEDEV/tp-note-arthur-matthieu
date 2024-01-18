/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.test;

/**
 *
 * @author mattb
 */
public class Joueur {
    
    private String nom;
    private Grille plateau;

    /**
     *
     * @param nom
     * @param plateau
     */
    public Joueur(String nom, Grille plateau) {
        this.nom = nom;
        this.plateau = plateau;
    }

    /**
     *
     * @return
     */
    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     *
     * @return
     */
    public Grille getPlateau() {
        return plateau;
    }

    /**
     *
     * @param plateau
     */
    public void setPlateau(Grille plateau) {
        this.plateau = plateau;
    }

    public boolean aPerdu(){
        
        boolean perdu = true;
        
        for (int i =0; i < this.plateau.getTaille() ; i++){
            
            for (int j = 0 ; j < this.plateau.getTaille() ; j++){
                
                if(this.plateau.getGrille()[i][j] == 'B'){
                    
                    perdu = false;
                    
                }
                   
            }
            
        }
        
        return perdu;
        
    }
    
    public void pose(Bateau b){
        
        if (b.GetEstVertical() == false){
        
            for (int i = b.getPosition()[0]; i < b.getTaille() ; i++){
            
                this.plateau.placeBateau(i,b.getPosition()[1]);
            
            }
            
        }
        
        else{
            
            for (int i = b.getPosition()[1]; i < b.getTaille() ; i++){
            
                this.plateau.placeBateau(b.getPosition()[1], i);
            
            }
        }
    }

    @Override
    public String toString() {
        return  nom;
    }
    
    
}

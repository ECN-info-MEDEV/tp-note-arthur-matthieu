/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.test;


/**
 *
 * @author mattb
 */
public class Grille {
    
    private int taille;
    private char[][] grille;

    /**
     *
     * @param taille
     */
    public Grille(int taille) {
        this.taille = taille;
        this.grille = new char[taille][taille];
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                this.grille[i][j] = '.' ; 
                
            }
            
        }
        
    }

    /**
     *
     * @return
     */
    public int getTaille() {
        return taille;
    }

    /**
     *
     * @param taille
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

    /**
     *
     * @return
     */
    public char[][] getGrille() {
        return grille;
    }

    /**
     *
     * @param grille
     */
    public void setGrille(char[][] grille) {
        this.grille = grille;
    }
    
    
    private void placeBateau(int x , int y){
        this.grille[x][y]='B';
    }
    
    private void touche(int x, int y){
        
        if (this.grille[x][y] == 'B'){
            
            this.grille[x][y] = 'O';
            
        } 
        
        else {
            
            this.grille[x][y] = 'X';
            
        }
    }
    
    private void affiche (){
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                System.out.print(this.grille[i][j]+' '); 
                
            }
            
            System.out.println();
        }
    }
    
    private void afficheAdversaire (){
        
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                if(this.grille[i][j] == 'B'){
                    
                    System.out.print('.'+' ');
                    
                }
                
                else{
                    
                    System.out.print(this.grille[i][j]+' ');
                    
                }
            }
            
            System.out.println();
        }
    }
}

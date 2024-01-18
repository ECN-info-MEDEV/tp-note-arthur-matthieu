/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.test;


/**
 * La classe Grille représente une grille dans la Bataille navale
 * @author mattb
 * @author arthur
 */
public class Grille {
    
    private int taille;
    private char[][] grille;

    /**
     * Constructeur pour construire une grille avec une taille (on suppose que la longueur et la largeur sont les mêmes
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
    
    
    public void placeBateau(int x , int y){
        this.grille[x][y]='B';
    }
    
    public boolean touche(int x, int y){
        
        boolean touche;
        
        if (this.grille[x][y] == 'B'){
            
            this.grille[x][y] = 'O';
            touche = true;
        } 
        
        else {
            
            this.grille[x][y] = 'X';
            touche = false;
        }
        
        return touche;
    }
    
    public void affiche (){
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                System.out.print(this.grille[i][j] +""+ ' '); 

            }
            
            System.out.println();
        }
    }
    
    public void afficheAdversaire (){
        
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                if(this.grille[i][j] == 'B'){
                    
                    System.out.print('.'+""+' ');
                    
                }
                
                else{
                    
                    System.out.print(this.grille[i][j]+""+' ');
                    
                }
            }
            
            System.out.println();
        }
    }
}

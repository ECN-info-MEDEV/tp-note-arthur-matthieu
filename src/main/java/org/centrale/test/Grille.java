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
     * Obtient la taille de la grille
     *
     * @return La taille de la grille.
     */
    public int getTaille() {
        return taille;
    }

     /**
     * Modifie la valeur da taille de la grille
     * @param taille taille souhaitée 
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }

            /**
     * Obtient la grille
     *
     * @return La grille.
     */
    public char[][] getGrille() {
        return grille;
    }

     /**
     * Modifie la grille
     * @param grille grille souhaitée
     */
    public void setGrille(char[][] grille) {
        this.grille = grille;
    }
    
    /**
     * Place un icone Bateau sur la grille pour une seule coordonnée
     * @param x abscisse 
     * @param y ordonnée
     */
    public void placeBateau(int x , int y){
        this.grille[x][y]='B';
    }
    
    /**
     * Met à jour la grille en fonction du coup (x,y) joué
     * @param x abscisse
     * @param y ordonnée
     * @return  
     */
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
    
    /**
     * Affiche la grille avec tous les icones (même les bateaux)
     */
    public void affiche (){
        for (int i =0; i < taille ; i++){
            
            for (int j = 0 ; j < taille ; j++){
                
                System.out.print(this.grille[i][j] +""+ ' '); 

            }
            
            System.out.println();
        }
    }
    
    /**
     * Affiche la grille de l'adversaire (on ne voit pas ses bateaux)
     */
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

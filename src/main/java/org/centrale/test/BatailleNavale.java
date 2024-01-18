/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.test;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class BatailleNavale {

    public Joueur joueur1;
    public Joueur joueur2;
    
    public Grille grille1;
    public Grille grille2;
    
    public Grille bateau;

    
    
    public static void main(String[] args) {
        
        int tailleGrille = 5;
        Grille grille1 = new Grille (tailleGrille);
        Grille grille2 = new Grille (tailleGrille);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nom du joueur 1 ?");
        String nom = scanner.nextLine();
        Joueur joueur1 = new Joueur(nom,grille1);
        
        System.out.println("Nom du joueur 2 ?");
        nom = scanner.nextLine();
        Joueur joueur2 = new Joueur(nom,grille2);
        
        int nbBateau3 = 1; //inutilisé pour l'instant
        int nbBateau4 = 1; //inutilisé pour l'instant
        int nbBateau5 = 1; //inutilisé pour l'instant
        
        
        
    }
    
    public void tourDeJeu(){
        
    }
    
    public void creeBateau(Joueur j, Bateau b){
        System.out.println(j+" place un bateau de taille 5.");
        System.out.println("Pos en x?");
        int x = scanner.nextInt()- 1;
        System.out.println("Pos en Y?");
        int y = scanner.nextInt()- 1;
        int pos[] = null;
        pos[0] = x;
        pos[1] = y;
        System.out.println("Vertical (0) ou horizontal(1) ?");
        boolean vert;
        if(scanner.nextInt()==0){
            vert = true;
        }
        else{
            vert = false;
        }
        Bateau bateau5 = new Bateau(5,pos,vert);
    }
}

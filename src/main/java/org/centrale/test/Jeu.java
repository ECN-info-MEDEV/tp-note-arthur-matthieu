/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.test;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class Jeu {

    /**
     *  Joueur 1
     */
    public Joueur joueur1;

    /**
     *  Joueur 2
     */
    public Joueur joueur2;
    
    /**
     *  Plateau du joueur 1
     */
    public Grille grille1;

    /**
     *  Plateau du joueur 2
     */
    public Grille grille2;
    
    /**
     *  Bateau pour placer tous les bateaux
     */
    public Bateau bateau;

    /**
     *
     * @return
     */
    public Joueur getJoueur1() {
        return joueur1;
    }

    /**
     *
     * @param joueur1
     */
    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    /**
     *
     * @return
     */
    public Joueur getJoueur2() {
        return joueur2;
    }

    /**
     *
     * @param joueur2
     */
    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    /**
     *
     * @return
     */
    public Grille getGrille1() {
        return grille1;
    }

    /**
     *
     * @param grille1
     */
    public void setGrille1(Grille grille1) {
        this.grille1 = grille1;
    }

    /**
     *
     * @return
     */
    public Grille getGrille2() {
        return grille2;
    }

    /**
     *
     * @param grille2
     */
    public void setGrille2(Grille grille2) {
        this.grille2 = grille2;
    }

    /**
     *
     * @return
     */
    public Bateau getBateau() {
        return bateau;
    }

    /**
     *
     * @param bateau
     */
    public void setBateau(Bateau bateau) {
        this.bateau = bateau;
    }
    
    /**
     *  Constructeur qui initialise le jeu
     */
    public void jeu() {
        
        int tailleGrille = 5;
        
        Grille grille1 = new Grille (tailleGrille);
        Grille grille2 = new Grille (tailleGrille);
        
        this.setGrille1(grille1);
        this.setGrille2(grille2);
        
        Scanner scanner = new Scanner(System.in);
        
            //On récupère le nom des deux joueurs
        System.out.println("Nom du joueur 1 ?");
        String nom = scanner.nextLine();
        Joueur joueur1 = new Joueur(nom,grille1);
        this.setJoueur1(joueur1);
        
        System.out.println("Nom du joueur 2 ?");
        nom = scanner.nextLine();
        Joueur joueur2 = new Joueur(nom,grille2);
        this.setJoueur2(joueur2);
        
        int nbBateau3 = 1; //inutilisé pour l'instant
        int nbBateau4 = 1; //inutilisé pour l'instant
        int nbBateau5 = 1; //inutilisé pour l'instant
        
        int tailleBateau = 5;
        int pos[] = new int [2];
        Bateau bateau = new Bateau(5, pos, false);
        this.setBateau(bateau);
        
            //On place les bateaux du joueur 1
        creeBateau(joueur1,bateau);
        this.joueur1.pose(bateau);
        
        tailleBateau = 4;
        this.bateau.setTaille(tailleBateau);
        creeBateau(joueur1,bateau);
        this.joueur1.pose(bateau);
        
        tailleBateau = 3;
        this.bateau.setTaille(tailleBateau);
        creeBateau(joueur1,bateau);
        this.joueur1.pose(bateau);
        
            //On place les bateaux du joueur 2
        tailleBateau = 5;
        this.bateau.setTaille(tailleBateau);
        creeBateau(joueur2,bateau);
        this.joueur2.pose(bateau);
        
        tailleBateau = 4;
        this.bateau.setTaille(tailleBateau);
        creeBateau(joueur2,bateau);
        this.joueur2.pose(bateau);
        
        tailleBateau = 3;
        this.bateau.setTaille(tailleBateau);
        creeBateau(joueur2,bateau);
        this.joueur2.pose(bateau);
        
    }
    
    /**
     *  Un tour de jeu (j1 puis j2)
     */
    public void tourDeJeu(){
        Scanner scanner = new Scanner(System.in);
        
            //Joueur 1
        System.out.println("Tour de " + joueur1);
        System.out.println();
        System.out.println("Votre plateau :");
        this.grille1.affiche();
        System.out.println("Plateau de l'adversaire");
        this.grille2.afficheAdversaire();
        System.out.println();
        
        System.out.println("Ou souhaitez-vous tirer ?");
        System.out.println("Position en x du tir");
        int x = scanner.nextInt()-1;
        System.out.println("Position en y du tir");
        int y = scanner.nextInt()-1;
        
        boolean touche = this.grille2.touche(x,y);
        if (touche == true){
            System.out.println("Touché !");
        }
        else {
            System.out.println("Raté !");
        }
        
        System.out.println("Plateau de l'adversaire");
        this.grille2.afficheAdversaire();
        System.out.println();
        
            //Joueur 2
        System.out.println("Tour de " + joueur2);
        System.out.println();
        System.out.println("Votre plateau :");
        this.grille2.affiche();
        System.out.println("Plateau de l'adversaire");
        this.grille1.afficheAdversaire();
        System.out.println();
        
        System.out.println("Ou souhaitez-vous tirer ?");
        System.out.println("Position en x du tir");
        x = scanner.nextInt()-1;
        System.out.println("Position en y du tir");
        y = scanner.nextInt()-1;
        
        touche = this.grille1.touche(x,y);
        if (touche == true){
            System.out.println("Touché !");
        }
        else {
            System.out.println("Raté !");
        }
        
        System.out.println("Plateau de l'adversaire");
        this.grille1.afficheAdversaire();
        System.out.println();
    }
    
    /**
     *  Place un bateau sur la grille
     * @param j joueur qui place le bateau
     * @param b modele de bateau utilisé précédement (doit juste être initialisé)
     */
    public void creeBateau(Joueur j, Bateau b){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(j+" place un bateau de taille "+b.getTaille()+".");
        
        System.out.println("Pos en x?");
        int x = scanner.nextInt()- 1;
        System.out.println("Pos en Y?");
        int y = scanner.nextInt()- 1;
        int pos[] = new int[2];
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
        
        b.setEstVertical(vert);
        b.setPosition(pos);
    }
}


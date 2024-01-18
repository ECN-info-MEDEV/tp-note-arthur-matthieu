/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package org.centrale.test;


/**
 *
 * @author arthu
 */
public class BatailleNavale {

    public static void main(String[] args) {
        
        Jeu jeu = new Jeu();
        jeu.jeu();
        
        do{
            jeu.tourDeJeu();   
        } while (jeu.joueur1.aPerdu() != true && jeu.joueur2.aPerdu() != true);
        
        if (jeu.joueur1.aPerdu() == true){
            System.out.println(jeu.joueur1+" a perdu !");
        }
        if (jeu.joueur2.aPerdu() == true){
            System.out.println(jeu.joueur2 + " a perdu !");
        }
    }
    
}

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

    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.centrale.test;

/**
 * La classe Bateau représente un bateau dans la Bataille navale
 * @author mattb
 * @author arthur
 */
public class Bateau {
    private int taille;          // taille du bateau
    private int[] position;      // Position du bateau [x, y]
    private boolean estVertical;  // Orientation du bateau

     /**
     * Constructeur pour créer un bateau avec une taille, une position et une orientation.
     *
     * @param taille La taille du bateau.
     * @param position La position initiale du bateau [x, y].
     * @param estVertical True si le bateau est orienté verticalement, false s'il est orienté horizontalement.
     */
    public Bateau(int taille, int[] position, boolean estVertical) {
        this.taille = taille; 
        this.position = position;
        this.estVertical = estVertical;
    }

            /**
     * Obtient la taille du bateau
     *
     * @return La taillen du bateau sous la forme d'un entier.
     */
    public int getTaille() {
        return taille;
    }
    
        /**
     * Obtient la position du bateau.
     *
     * @return La position du bateau sous la forme d'un tableau [x, y].
     */
    public int[] getPosition() {
        return position;
    }

     /**
     * Vérifie si le bateau est orienté verticalement.
     *
     * @return True si le bateau est orienté verticalement, false sinon.
     */
    public boolean GetEstVertical() {
        return estVertical;
    }

     /**
     * Modifie la valeur du booléen estVertical
     * @param estVertical Vertical ?
     */
    public void setEstVertical(boolean estVertical) {
        this.estVertical = estVertical;
    }
     /**
     * Modifie la valeur de la taille du bateau
     * @param taille : taille u bateau souhaitée
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }
     /**
     * Modifie la valeur da position du bateau
     * @param position position souhaitée
     */
    public void setPosition(int[] position) {
        this.position = position;
    }
    
    
    
}

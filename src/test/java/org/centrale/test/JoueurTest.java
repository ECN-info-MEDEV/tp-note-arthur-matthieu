/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arthu
 */
public class JoueurTest {
    
    public JoueurTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getNom method, of class Joueur.
     */
    @Test
    public void testGetNom() {
        Grille g = new Grille(5);
        Joueur j = new Joueur ("nom",g);
        assertNotNull(j.getNom());
    }

    /**
     * Test of setNom method, of class Joueur.
     */
    @Test
    public void testSetNom() {
        Grille g = new Grille(5);
        Joueur j = new Joueur ("nom",g);
        j.setNom("nom2");
        assertEquals("nom2",j.getNom());
    }

    /**
     * Test of getPlateau method, of class Joueur.
     */
    @Test
    public void testGetPlateau() {
        Grille g = new Grille(5);
        Joueur j = new Joueur ("nom",g);
        assertNotNull(j.getPlateau());
    }

    /**
     * Test of setPlateau method, of class Joueur.
     */
    @Test
    public void testSetPlateau() {
        Grille g = new Grille(5);
        Joueur j = new Joueur ("nom",g);
        Grille g2 = new Grille(7);
        j.setPlateau(g2);
        assertEquals(g2,j.getPlateau());
    }
    

    /**
     * Test of aPerdu method, of class Joueur.
     */
    @Test
    public void testAPerdu() {
        Grille g = new Grille(5);
        Joueur j = new Joueur ("nom",g);
        assertTrue(j.aPerdu());
        Bateau b = new Bateau (2,new int[]{1, 1},true);
        Bateau b2 = new Bateau (2,new int[]{2, 2},false);
        j.pose(b);
        j.pose(b2);
        assertFalse(j.aPerdu());
    }
    
}

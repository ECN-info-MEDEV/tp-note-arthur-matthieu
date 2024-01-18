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
public class GrilleTest {
    
    public GrilleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getTaille method, of class Grille.
     */
    @Test
    public void testGetTaille() {
        Grille g = new Grille(5);
        assertEquals(5, g.getTaille());
    }

    /**
     * Test of setTaille method, of class Grille.
     */
    @Test
    public void testSetTaille() {
        Grille g = new Grille(5);
        g.setTaille(7);
        assertEquals(7, g.getTaille());
    }
    
    /**
     * Test of getGrille method, of class Grille.
     */
    @Test
    public void testGetGrille() {
                
                Grille g = new Grille(5);

                // Testez le getter initial
                assertNotNull(g.getGrille());
    }

    /**
     * Test of setGrille method, of class Grille.
     */
    @Test
    public void testSetGrille() {
            Grille g = new Grille (5); 
                
                char[][] newGrid = new char[5][5];
                newGrid[2][2] = 'B';
        
                
                g.setGrille(newGrid);
        
                
                assertSame(newGrid, g.getGrille());
    }
    /**
     * Test of PlaceBateau method, of class Grille.
     */
    @Test
    public void testPlaceBateau(){
        Grille g = new Grille (5);
        char[][] newGrid = new char[5][5];
                newGrid[2][2] = 'B';
        g.placeBateau(2,2);
        assertSame(newGrid, g.getGrille());
    }
    
    @Test
    public void testTouche(){
       Grille g = new Grille (5);
       boolean res = g.touche(1,1);
       assertFalse(res);
       
    }
}

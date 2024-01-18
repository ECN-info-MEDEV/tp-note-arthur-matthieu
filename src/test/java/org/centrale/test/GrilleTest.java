/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author arthu
 */
public class GrilleTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

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
        g.placeBateau(2,2);
        assertTrue('B' == g.getGrille()[2][2]);
    }
    
    @Test
    public void testTouche(){
       Grille g = new Grille (5);
       boolean res = g.touche(1,1);
       g.placeBateau(1,2);
       assertTrue(g.touche(1,2));
       assertFalse(res);
       
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package org.centrale.test;
import org.junit.Test;
import static org.junit.Assert.*;

public class BateauTest {

    @Test
    public void testGetTaille() {
        Bateau ship = new Bateau(5, new int[]{1, 1}, true);
        assertEquals(3, ship.getTaille());
    }

    @Test
    public void testGetPosition() {
        Bateau ship = new Bateau(5, new int[]{1, 1}, true);
        assertArrayEquals(new int[]{1, 1}, ship.getPosition());
    }

    @Test
    public void testIsVertical() {
        Bateau verticalShip = new Bateau(3, new int[]{1, 1}, true);
        assertTrue(verticalShip.GetEstVertical());

        Bateau horizontalShip = new Bateau(3, new int[]{1, 1}, false);
        assertFalse(horizontalShip.GetEstVertical());
    }
}

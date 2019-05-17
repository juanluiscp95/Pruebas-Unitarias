/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juanl
 */
public class VendedoresTest {

    public VendedoresTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of anyadir_Vendedor method, of class Vendedores.
     */
    @Test
    public void testAnyadir_Vendedor() {
        System.out.println("anyadir_Vendedor");
        Vendedor vende = null;
        Vendedores instance = new Vendedores();
        instance.cargar_datos("Alicante");
        Vendedor vend = new Vendedor(1, "Agapito Lafuente", "Lafuente", "Alicante", "Alicante", "avda. Valencia 3205");
        boolean expResult = false;
        boolean result = instance.anyadir_Vendedor(vend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    public boolean equals(Vendedor v1, Vendedor v2) {
        if (v1.getNumvend() == v2.getNumvend()) {
            return true;
        }
        return false;
    }

    /**
     * Test of buscar_Vendedor method, of class Vendedores.
     */
    @Test
    public void testBuscar_Vendedor_int() {
        System.out.println("buscar_Vendedor");
        int numvend = 1;
        Vendedores instance = new Vendedores();
        instance.cargar_datos("Alicante");
        Vendedor expResult = new Vendedor(1, "Agapito Lafuente", "Lafuente", "Alicante", "Alicante", "avda. Valencia 3205");
        Vendedor result = instance.buscar_Vendedor(numvend);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}

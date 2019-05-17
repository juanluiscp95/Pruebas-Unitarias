/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

/**
 *
 * @author juanl
 */
import java.util.ArrayList;
import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author juanluis
 */
@RunWith(Parameterized.class)
public class Parametrizadas_Buscar {

    public Vendedores todosVendedores;
    static Vendedores VendedoresAlicante;
    String provincia;

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{"Alicante", VendedoresAlicante}});
    }

    public int numvend;

    public Parametrizadas_Buscar(String provincia, ArrayList<Vendedor> Vendedores) {
        this.provincia = provincia;
    }

    @Test
    public void Buscar_Vendedor() {
        Vendedores esperado = todosVendedores.buscar_Vendedor(provincia);
        Assert.assertEquals(VendedoresAlicante, esperado);
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        Vendedor v1 = new Vendedor(1, "Agapito Lafuente", "Lafuente", "Alicante", "Alicante", "avda. Valencia 3205");
        Vendedor v2 = new Vendedor(2, "Luciano Blazquez", "Blazquez", "Alicante", "Alicane", "general lacy, 15 2");
        Vendedor v3 = new Vendedor(3, "Godofredo Martin", "Martin", "Alicante", "Alicante", "avda. valencia 3372");
        Vendedor v4 = new Vendedor(4, "Juanito Reina", "Reina", "Asturias", "Gijon", "s. francisco de asis");
        Vendedor v5 = new Vendedor(5, "Manolo Piedra", "Piedra", "Valencia", "San Vicente", "aviacion 92,31");
        Vendedor v6 = new Vendedor(6, "Chema Pamundi", "Pamundi", "Madrid", "Rivas Vaciamadrid", "avda. de jose hierro");
        todosVendedores = new Vendedores(); 
        todosVendedores.anyadir_Vendedor(v1);
        todosVendedores.anyadir_Vendedor(v2);
        todosVendedores.anyadir_Vendedor(v3);
        todosVendedores.anyadir_Vendedor(v4);
        todosVendedores.anyadir_Vendedor(v5);
        todosVendedores.anyadir_Vendedor(v6);
        VendedoresAlicante = new Vendedores();
        VendedoresAlicante.anyadir_Vendedor(v1);
        VendedoresAlicante.anyadir_Vendedor(v2);
        VendedoresAlicante.anyadir_Vendedor(v3);       
    }

    @After
    public void tearDown() {
    }
}

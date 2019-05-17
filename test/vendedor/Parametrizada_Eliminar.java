/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author juanl
 */
@RunWith(Parameterized.class)
public class Parametrizada_Eliminar {

    protected ArrayList vendedores = new ArrayList();
    public Vendedores v = new Vendedores();

    @Parameterized.Parameters
    public static Iterable data() {
        return Arrays.asList(new Object[][]{{1, true}, {2, true}, {3, true}, {4, true}, {5, true}, {6, true}, {7, false}});
    }

    public void setUp() {
        Vendedor v1 = new Vendedor(1, "Agapito Lafuente", "Lafuente", "Alicante", "Alicante", "avda. Valencia 3205");
        Vendedor v2 = new Vendedor(2, "Luciano Blazquez", "Blazquez", "Alicante", "Alicane", "general lacy, 15 2");
        Vendedor v3 = new Vendedor(3, "Godofredo Martin", "Martin", "Alicante", "Alicante", "avda. valencia 3372");
        Vendedor v4 = new Vendedor(4, "Juanito Reina", "Reina", "Asturias", "Gijon", "s. francisco de asis");
        Vendedor v5 = new Vendedor(5, "Manolo Piedra", "Piedra", "Valencia", "San Vicente", "aviacion 92,31");
        Vendedor v6 = new Vendedor(6, "Chema Pamundi", "Pamundi", "Madrid", "Rivas Vaciamadrid", "avda. de jose hierro");
        vendedores.add(v1);
        vendedores.add(v2);
        vendedores.add(v3);
        vendedores.add(v4);
        vendedores.add(v5);
        vendedores.add(v6);
    }

    private int pasado;
    private boolean esperado;

    public Parametrizada_Eliminar(int pasado, boolean esperado) {
        this.pasado = pasado;
        this.esperado = esperado;
    }

    @Test
    public void test_Elimina() {

        boolean result = v.eliminar_Vendedor(pasado);
        Assert.assertEquals(result, esperado);
    }
}

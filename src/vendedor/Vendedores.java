/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

import java.util.ArrayList;

/**
 *
 * @author juanl
 */
public class Vendedores {

    protected ArrayList vendedores = new ArrayList();

    public Vendedores() {

    }

    public boolean anyadir_Vendedor(Vendedor vend) {
        Vendedor opcion;
        for (int x = 0; x < vendedores.size(); x++) {
            opcion = (Vendedor) vendedores.get(x);
            if (vend.getNumvend() == opcion.getNumvend()) {
                return false;
            }
        }
        vendedores.add(vend);
        return true;
    }

    public boolean eliminar_Vendedor(int numvend) {
        Vendedor opcion;
        for (int x = 0; x < vendedores.size(); x++) {
            opcion = (Vendedor) vendedores.get(x);
            if (opcion.getNumvend() == numvend) {
                vendedores.remove(x);
                return true;
            }
        }
        return false;
    }

    public Vendedor buscar_Vendedor(int numvend) {
        Vendedor opcion;
        for (int x = 0; x < vendedores.size(); x++) {
            opcion = (Vendedor) vendedores.get(x);
            if (opcion.getNumvend() == numvend) {
                return opcion;
            }
        }
        return null;
    }

    public Vendedores buscar_Vendedor(String provincia) {
        Vendedores vendedores2 = new Vendedores();

        Vendedor opcion;
        for (int x = 0; x < vendedores.size(); x++) {
            opcion = (Vendedor) vendedores.get(x);
            if (opcion.getProvincia().equals(provincia)) {
                vendedores2.anyadir_Vendedor(opcion);
            }
        }
        return vendedores2;
    }

    public void cargar_datos(String provincia) {

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
}

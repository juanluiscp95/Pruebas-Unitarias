/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendedor;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author juanl
 */
public class DB_Tabla_Vendedores {

    protected String conexion;
    protected ArrayList vendedores = new ArrayList();

    public DB_Tabla_Vendedores(String conexion) {
        this.conexion = conexion;
    }

    public boolean anyadir_Vendedor(Vendedor vend) {
        boolean boton = true;
        return boton;
    }

    public boolean modificar_Vendedor(int numvend, Array datosModificar) {
        boolean boton = true;

        return boton;
    }

    public boolean borrar_Vendedor(int numvend) {
        boolean boton = true;
        return boton;
    }

    public ArrayList buscar_Vendedor(String provincia) {

        return vendedores;
    }

    public void Desconectar() {

    }
}

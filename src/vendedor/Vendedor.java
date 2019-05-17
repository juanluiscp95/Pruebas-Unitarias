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
public class Vendedor {

    private int numvend;
    private String nomvend, nombrecomer, provincia, localidad, direccion;

    public Vendedor(int numvend, String nomvend, String nombrecomer, String provincia, String localidad, String direccion) {
        this.numvend = numvend;
        this.nomvend = nomvend;
        this.nombrecomer = nombrecomer;
        this.provincia = provincia;
        this.localidad = localidad;
        this.direccion = direccion;
    }

    public int getNumvend() {
        return numvend;
    }

    public void setNumvend(int numvend) {
        this.numvend = numvend;
    }

    public String getNomvend() {
        return nomvend;
    }

    public void setNomvend(String nomvend) {
        this.nomvend = nomvend;
    }

    public String getNombrecomer() {
        return nombrecomer;
    }

    public void setNombrecomer(String nombrecomer) {
        this.nombrecomer = nombrecomer;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.numvend;
        return hash;
    }

    /**
     * Metodo equals sobreescrito para que compare nombre y numero de vendedor
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vendedor other = (Vendedor) obj;
        if (this.numvend != other.numvend || !this.nomvend.equals(other.nomvend)) {
            return false;
        }
        return true;
    }
}

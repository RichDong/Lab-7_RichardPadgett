
package lab.pkg7_richardpadgett;

import java.util.ArrayList;


public class Cajeros {
    public String nombre;
    public int id;
    public ArrayList <Orden> ordenes = new ArrayList();
    public Lista listaatributo = new Lista();

    public Cajeros() {
    }

    public Cajeros(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public Lista getListaatributo() {
        return listaatributo;
    }

    public void setListaatributo(Lista listaatributo) {
        this.listaatributo = listaatributo;
    }

    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Orden> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Orden> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return  nombre;
    }
    
    
}


package lab.pkg7_richardpadgett;

import java.util.ArrayList;


public class Cajeros {
    String nombre;
    int id;
    ArrayList <Orden> ordenes = new ArrayList();

    public Cajeros() {
    }

    public Cajeros(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
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


package lab.pkg7_richardpadgett;

import java.util.ArrayList;


public class Cajeros {
    String nombre;
    int id;
    ArrayList <Productos> ordenes = new ArrayList();

    public Cajeros() {
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

    public ArrayList<Productos> getOrdenes() {
        return ordenes;
    }

    public void setOrdenes(ArrayList<Productos> ordenes) {
        this.ordenes = ordenes;
    }

    @Override
    public String toString() {
        return "Cajeros{" + "nombre=" + nombre + ", id=" + id + ", ordenes=" + ordenes + '}';
    }
    
}

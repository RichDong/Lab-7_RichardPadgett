
package lab.pkg7_richardpadgett;


public class Productos {
    public String nombre;
    public int precio;
    public int tiempot;

    public Productos() {
    }

    public Productos(String nombre, int precio, int tiempot) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempot = tiempot;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getTiempot() {
        return tiempot;
    }

    public void setTiempot(int tiempot) {
        this.tiempot = tiempot;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}

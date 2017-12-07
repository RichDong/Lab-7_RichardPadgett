package lab.pkg7_richardpadgett;

public class Clientes {

    public String nombre;
    public int edad;
    public Orden ord;

    public Clientes() {
    }

    public Clientes(String nombre, int edad, Orden ord) {
        this.nombre = nombre;
        this.edad = edad;
        this.ord = ord;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Orden getOrd() {
        return ord;
    }

    public void setOrd(Orden ord) {
        this.ord = ord;
    }

    @Override
    public String toString() {
        return "Clientes{" + "nombre=" + nombre + ", edad=" + edad + ", ord=" + ord + '}';
    }

}

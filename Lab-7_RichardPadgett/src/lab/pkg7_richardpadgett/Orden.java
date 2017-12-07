
package lab.pkg7_richardpadgett;

import java.util.ArrayList;


public class Orden extends Thread {
   public  Cajeros cajeros;
   public  Clientes clientes;
   public  ArrayList<Productos> listaproductos = new ArrayList();

    public Orden() {
    }

    public Orden(Cajeros c, Clientes cl) {
        this.cajeros = c;
        this.clientes = cl;
    }

    public Cajeros getCajeros() {
        return cajeros;
    }

    public void setCajeros(Cajeros cajeros) {
        this.cajeros = cajeros;
    }

    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Productos> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Productos> listaproductos) {
        this.listaproductos = listaproductos;
    }

    @Override
    public String toString() {
        return "Orden{" + "cajeros=" + cajeros + ", clientes=" + clientes + ", listaproductos=" + listaproductos + '}';
    }

    
    
}


package lab.pkg7_richardpadgett;

import java.util.ArrayList;


public class Orden {
   public  Cajeros c;
   public  Clientes cl;
   public  ArrayList<Productos> listaproductos = new ArrayList();

    public Orden() {
    }

    public Orden(Cajeros c, Clientes cl) {
        this.c = c;
        this.cl = cl;
    }

    public Cajeros getC() {
        return c;
    }

    public void setC(Cajeros c) {
        this.c = c;
    }

    public Clientes getCl() {
        return cl;
    }

    public void setCl(Clientes cl) {
        this.cl = cl;
    }

    public ArrayList<Productos> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(ArrayList<Productos> listaproductos) {
        this.listaproductos = listaproductos;
    }

    @Override
    public String toString() {
        return "Orden{" + "c=" + c + ", cl=" + cl + ", listaproductos=" + listaproductos + '}';
    }
    
}

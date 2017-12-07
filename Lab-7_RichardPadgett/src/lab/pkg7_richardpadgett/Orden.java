package lab.pkg7_richardpadgett;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Orden extends Thread {

    public Cajeros cajeros;
    public Clientes clientes;
    public ArrayList<Productos> listaproductos = new ArrayList();
    boolean avanzar;
    public JTable tabla;
    public Orden orden2 = new Orden();

    public Orden() {
    }

    public Orden(Cajeros c, Clientes cl) {
        this.cajeros = c;
        this.clientes = cl;

    }

    public Orden getOrden2() {
        return orden2;
    }

    public void setOrden2(Orden orden2) {
        this.orden2 = orden2;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
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

    public void run(Orden orden2,JTable tabla) throws InterruptedException {

        while (true) {
            if (avanzar) {
                for (int i = 0; i < orden2.getListaproductos().size(); i++) {

                    Object[] newrow = {
                        orden2.getListaproductos().get(i).getNombre(),
                        orden2.getClientes().getNombre(),
                        orden2.getListaproductos().get(i).getTiempot()};
                    int tiempo = orden2.getListaproductos().get(i).getTiempot();
                    Thread.sleep(tiempo);
                    DefaultTableModel modelo = (DefaultTableModel)tabla.getModel();
                }

            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7_richardpadgett;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author richa
 */
public class Supermercado extends javax.swing.JFrame {

    /**
     * Creates new form Supermercado
     */
    public Supermercado() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this cod9e. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_nombrecajero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_id = new javax.swing.JTextField();
        jb_crearCajero = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_nombreproducto = new javax.swing.JTextField();
        tf_precio = new javax.swing.JTextField();
        tf_tiempo = new javax.swing.JTextField();
        jb_crearproducto = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        tf_nombrecliente = new javax.swing.JTextField();
        jb_orden = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cb_Productos = new javax.swing.JComboBox<>();
        jb_agregaralaorden = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        cb_cajeros = new javax.swing.JComboBox<>();
        jb_compra = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        tf_edad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setText("Nombre");

        jLabel5.setText("Id");

        jb_crearCajero.setText("Crear Cajero");
        jb_crearCajero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearCajeroMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_nombrecajero, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(jb_crearCajero)))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombrecajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addComponent(jb_crearCajero)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Creacion de Cajeros", jPanel1);

        jLabel1.setText("Nombre");

        jLabel2.setText("Precio");

        jLabel3.setText("Tiempo de Procesamiento(Segundos)");

        jb_crearproducto.setText("Crear Poducto");
        jb_crearproducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_crearproductoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_crearproducto)
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tf_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jb_crearproducto)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Creacion de Productos", jPanel2);

        jLabel9.setText("Nombre Cliente");

        jb_orden.setText("Ordenar");
        jb_orden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_ordenMouseClicked(evt);
            }
        });
        jb_orden.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_ordenActionPerformed(evt);
            }
        });

        jLabel10.setText("Produtos");

        jb_agregaralaorden.setText("Agregar a Orden");
        jb_agregaralaorden.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_agregaralaordenMouseClicked(evt);
            }
        });

        jLabel11.setText("Cajero");

        jb_compra.setText("Realizar Compra");
        jb_compra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jb_compraMouseClicked(evt);
            }
        });

        jLabel12.setText("Edad");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(cb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jb_agregaralaorden)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(cb_cajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_nombrecliente)
                                    .addComponent(tf_edad, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addGap(45, 45, 45)
                                .addComponent(jb_orden))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jb_compra)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_nombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_orden))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tf_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_Productos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_agregaralaorden)
                    .addComponent(jLabel11)
                    .addComponent(cb_cajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(jb_compra)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ventas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearCajeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearCajeroMouseClicked
        listacajeros.add(new Cajeros(tf_nombrecajero.getText(), Integer.parseInt(tf_id.getText())));
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) cb_cajeros.getModel();
        modelo.addElement(new Cajeros(tf_nombrecajero.getText(), Integer.parseInt(tf_id.getText())));
        cb_cajeros.setModel(modelo);
        JOptionPane.showMessageDialog(this, "Cajero Creado Exitosamente");
        Lista lista = new Lista();
        lista.getJl_nombrecajero().setText(tf_nombrecajero.getText());
        tf_nombrecajero.setText("");
        tf_id.setText("");

        lista.pack();
        lista.setLocationRelativeTo(this);
        lista.setVisible(true);
        lista.setName(tf_nombrecajero.getText());
       

        listas.add(lista);


    }//GEN-LAST:event_jb_crearCajeroMouseClicked

    private void jb_crearproductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_crearproductoMouseClicked
        productostotal.add(new Productos(tf_nombreproducto.getText(), Integer.parseInt(tf_precio.getText()), Integer.parseInt(tf_tiempo.getText())));
        DefaultComboBoxModel modelo2 = (DefaultComboBoxModel) cb_Productos.getModel();
        modelo2.addElement(new Productos(tf_nombreproducto.getText(), Integer.parseInt(tf_precio.getText()), Integer.parseInt(tf_tiempo.getText())));
        cb_Productos.setModel(modelo2);
        JOptionPane.showMessageDialog(this, "Producto Creado Exitosamente");
        tf_nombreproducto.setText("");
        tf_precio.setText("");

    }//GEN-LAST:event_jb_crearproductoMouseClicked

    private void jb_ordenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_ordenActionPerformed


    }//GEN-LAST:event_jb_ordenActionPerformed

    private void jb_compraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_compraMouseClicked
        for (int i = 0; i < listas.size(); i++) {
            if (listas.get(i).getName().equals(((Cajeros)cb_cajeros.getSelectedItem()).getNombre()) ) {
                listas.get(i).jl_nombrecliente.setText(c.getNombre());
                
            }
        }
        JOptionPane.showMessageDialog(this, "Compra realizada");
        //c.getOrd().setCajeros((Cajeros) cb_cajeros.getSelectedItem());


    }//GEN-LAST:event_jb_compraMouseClicked

    private void jb_ordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_ordenMouseClicked
        c = new Clientes(tf_nombrecliente.getText(), Integer.parseInt(tf_edad.getText()), new Orden());

        JOptionPane.showMessageDialog(this, "Cliente Creado Exitosamente");

    }//GEN-LAST:event_jb_ordenMouseClicked

    private void jb_agregaralaordenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jb_agregaralaordenMouseClicked
        c.getOrd().getListaproductos().add((Productos) cb_Productos.getSelectedItem());
        JOptionPane.showMessageDialog(this, "Objeto Agregado Exitosamente");
        listaorden.add(new Orden((Cajeros) cb_cajeros.getSelectedItem(),c));
        
        

    }//GEN-LAST:event_jb_agregaralaordenMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supermercado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supermercado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_Productos;
    private javax.swing.JComboBox<String> cb_cajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jb_agregaralaorden;
    private javax.swing.JButton jb_compra;
    private javax.swing.JButton jb_crearCajero;
    private javax.swing.JButton jb_crearproducto;
    private javax.swing.JButton jb_orden;
    private javax.swing.JTextField tf_edad;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_nombrecajero;
    private javax.swing.JTextField tf_nombrecliente;
    private javax.swing.JTextField tf_nombreproducto;
    private javax.swing.JTextField tf_precio;
    private javax.swing.JTextField tf_tiempo;
    // End of variables declaration//GEN-END:variables
    public ArrayList<Cajeros> listacajeros = new ArrayList();
    public ArrayList<Productos> productostotal = new ArrayList();
    public Clientes c;
    public int cont = 0;
    public ArrayList<Lista> listas = new ArrayList();
    public ArrayList<JLabel> labels = new ArrayList();
    public Orden ordengolbal = new Orden();
    public ArrayList <Orden> listaorden = new ArrayList();

}

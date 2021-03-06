package Ventanas.Forms;

import Funcionalidades.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentanaPedidos extends javax.swing.JFrame {

    String[] titulos2 = {"No.", "Pizza", "Descripción", "Sucursal"};
    DefaultTableModel mod2 = new DefaultTableModel(null, titulos2);
    ArrayList<pizza> items = new ArrayList<pizza>();
    int x = 0;
    public VentanaPedidos() {
        initComponents();
    }
    public void entrada(){
        if (jComboBox1.getSelectedItem().equals("GUATEMALA")) {
            items = Funciones.sucurGuate;
        } else {
            if (jComboBox1.getSelectedItem().equals("EL PROGRESO")) {
                items = Funciones.sucurElpro;
            } else {
                if (jComboBox1.getSelectedItem().equals("JALAPA")) {
                    items = Funciones.sucurJala;
                }
            }
        }
        if (pizzaselectedcobox.getItemCount() == 0) {
            rellenar(items);
        } else {
            pizzaselectedcobox.removeAllItems();
            rellenar(items);
        }
        descriocionarea.setText("");
        preciolabel.setText("");
        pizzaselectedcoboxItemStateChanged(1);
    }
    public void rellenar(ArrayList<pizza> L) {
        int tamaño = L.size();
        String[] t = new String[tamaño];
        for (int x = 0; x < tamaño; x++) {
            t[x] = L.get(x).getNom();
        }
        DefaultComboBoxModel mo = new DefaultComboBoxModel(t);
        pizzaselectedcobox.setModel(mo);
    }

    public void enviar(pedido x) {
        if (x.getSucur().equals("") || x.getDescr().equals("") || x.getPizza().equals("")) {
            JOptionPane.showMessageDialog(null, "Por Favor Asegurarse de llenar todos los datos requeridos ;)");
        } else {
            Funciones.newPedido(x, listapedidos, mod2);
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        pizzaselectedcobox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriocionarea = new javax.swing.JTextArea();
        preciolabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        listapedidos = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("ORDENES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("SUCURSAL:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GUATEMALA", "EL PROGRESO", "JALAPA" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("PIZZA:");

        pizzaselectedcobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pizzaselectedcoboxItemStateChanged(1);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("DESCRIPCIÓN:");

        descriocionarea.setColumns(20);
        descriocionarea.setRows(5);
        jScrollPane1.setViewportView(descriocionarea);

        preciolabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("ORDENAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("PEDIDOS:");

        listapedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(listapedidos);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(preciolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                        .addGap(54, 54, 54))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pizzaselectedcobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jScrollPane3))))))
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(pizzaselectedcobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(preciolabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        VentanaPrincipal.ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == ItemEvent.DESELECTED) {
            if (jComboBox1.getSelectedItem().equals("GUATEMALA")) {
                items = Funciones.sucurGuate;
            } else {
                if (jComboBox1.getSelectedItem().equals("EL PROGRESO")) {
                    items = Funciones.sucurElpro;
                } else {
                    if (jComboBox1.getSelectedItem().equals("JALAPA")) {
                        items = Funciones.sucurJala;
                    }
                }
            }
            if (pizzaselectedcobox.getItemCount() == 0) {
                rellenar(items);
            } else {
                pizzaselectedcobox.removeAllItems();
                rellenar(items);
            }
        }
        descriocionarea.setText("");
        preciolabel.setText("");
        pizzaselectedcoboxItemStateChanged(1);
    }//GEN-LAST:event_jComboBox1ItemStateChanged
    public void pizzaselectedcoboxItemStateChanged(int w){
        ArrayList<pizza> pizzas = new ArrayList<pizza>();
        if(w==1){
            if(jComboBox1.getSelectedItem().equals("GUATEMALA")){
                pizzas = Funciones.sucurGuate;
            }else{
                if(jComboBox1.getSelectedItem().equals("EL PROGRESO")){
                    pizzas = Funciones.sucurElpro;
                }else{
                    if(jComboBox1.getSelectedItem().equals("JALAPA")){
                        pizzas = Funciones.sucurJala;
                    }
                }
            }
            for(int x=0;x<pizzas.size();x++){
                if(pizzaselectedcobox.getSelectedItem().equals(pizzas.get(x).getNom())){
                    descriocionarea.setText(pizzas.get(x).getDesc());
                    preciolabel.setText(pizzas.get(x).getPre());
                }
            }
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        x++;
        pedido pedidoo = new pedido(x);
        pedidoo.setPizza(pizzaselectedcobox.getSelectedItem().toString());
        pedidoo.setDescr(descriocionarea.getText());
        pedidoo.setSucur(jComboBox1.getSelectedItem().toString());
        if (listapedidos.getRowCount() == 0) {
            String[] j = {"", "", ""};
            mod2.addRow(j);
            enviar(pedidoo);
        } else {
            enviar(pedidoo);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void pizzaselectedcoboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pizzaselectedcoboxItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_pizzaselectedcoboxItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descriocionarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    protected javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    public javax.swing.JTable listapedidos;
    public javax.swing.JComboBox<String> pizzaselectedcobox;
    private javax.swing.JLabel preciolabel;
    // End of variables declaration//GEN-END:variables
}
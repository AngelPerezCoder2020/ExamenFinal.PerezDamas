package Ventanas.Forms;
import Funcionalidades.*;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VentadaAdministracion extends javax.swing.JFrame {
        String[] titulos1 = {"NOMBRE", "DESCRIPCIÓN", "PRECIO"};
        DefaultTableModel mod = new DefaultTableModel(null, titulos1);
    
        public void enviar(pizza picsa){
            if(picsa.getNom().equals("")||picsa.getPre().equals("")||picsa.getDesc().equals("")){
                JOptionPane.showMessageDialog(null, "Por Favor Asegurarse de llenar todos los datos requeridos ;)");
            }else{
                Funciones.crear(picsa,listadopizzas,mod);                  
            }
        }
    public VentadaAdministracion() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sucursalbox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombrepizzatxt = new javax.swing.JTextField();
        preciopizzatxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descripcionpizzatxt = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listadopizzas = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Adminstación");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("ADMINISTRACIÓN \"DORMIDOS PIZZA\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("SUCURSAL:");

        sucursalbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GUATEMALA", "EL PROGRESO", "JALAPA" }));
        sucursalbox.setToolTipText("");
        sucursalbox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                sucursalboxItemStateChanged(evt);
            }
        });
        sucursalbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sucursalboxMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sucursalboxMouseReleased(evt);
            }
        });
        sucursalbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sucursalboxActionPerformed(evt);
            }
        });
        sucursalbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sucursalboxKeyPressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("DESCRIPCIÓN:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("PIZZAS:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("PRECIO:");

        preciopizzatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                preciopizzatxtActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("NOMBRE:");

        descripcionpizzatxt.setColumns(20);
        descripcionpizzatxt.setRows(5);
        jScrollPane1.setViewportView(descripcionpizzatxt);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("CREAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        listadopizzas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        listadopizzas.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(listadopizzas);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("ATRÁS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("Pizzas Disponibles:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(sucursalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nombrepizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(preciopizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jButton1))
                            .addGap(18, 18, 18)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 648, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(sucursalbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(nombrepizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(preciopizzatxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preciopizzatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_preciopizzatxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_preciopizzatxtActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nombrepizzatxt.setText("");
        preciopizzatxt.setText("");
        descripcionpizzatxt.setText("");
        this.setVisible(false);
        VentanaPrincipal.ventanaprincipal.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        pizza picsa = new pizza();
        picsa.setNom(nombrepizzatxt.getText());
        picsa.setPre(preciopizzatxt.getText());
        picsa.setDesc(descripcionpizzatxt.getText());
        picsa.setSucur(sucursalbox.getSelectedItem().toString());
        if(listadopizzas.getRowCount()==0){
            String[] j = {"","",""};
            mod.addRow(j);
            enviar(picsa);
        }else{
            enviar(picsa);
        }
        nombrepizzatxt.setText("");
        preciopizzatxt.setText("");
        descripcionpizzatxt.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sucursalboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sucursalboxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            ArrayList<pizza> lista = null;
            if(sucursalbox.getSelectedItem().equals("GUATEMALA")){
                lista = Funciones.sucurGuate;
            }else{
                if(sucursalbox.getSelectedItem().equals("EL PROGRESO")){
                    lista = Funciones.sucurElpro;
                }else{
                    if(sucursalbox.getSelectedItem().equals("JALAPA")){
                        lista = Funciones.sucurJala;
                    }
                }
            }
            if(listadopizzas.getRowCount()==0){
                String[] j = {"","",""};
                mod.addRow(j);
            }
            Funciones.mostrar(listadopizzas,mod,lista);
        }
    }//GEN-LAST:event_sucursalboxItemStateChanged

    private void sucursalboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sucursalboxActionPerformed

    }//GEN-LAST:event_sucursalboxActionPerformed

    private void sucursalboxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sucursalboxKeyPressed

    }//GEN-LAST:event_sucursalboxKeyPressed

    private void sucursalboxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalboxMouseReleased

    }//GEN-LAST:event_sucursalboxMouseReleased

    private void sucursalboxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sucursalboxMouseExited

    }//GEN-LAST:event_sucursalboxMouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea descripcionpizzatxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable listadopizzas;
    private javax.swing.JTextField nombrepizzatxt;
    private javax.swing.JTextField preciopizzatxt;
    private javax.swing.JComboBox<String> sucursalbox;
    // End of variables declaration//GEN-END:variables
}

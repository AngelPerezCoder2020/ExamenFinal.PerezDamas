package Ventanas.Forms;

public class VentanaPrincipal extends javax.swing.JFrame {
    VentadaAdministracion ventanaadministacion = new VentadaAdministracion();
    VentanaPedidos ventanapedidos = new VentanaPedidos();
    public static VentanaPrincipal ventanaprincipal = new VentanaPrincipal();
    
    public VentanaPrincipal() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ordenbutton = new javax.swing.JButton();
        adminbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("DORMIDOS PIZZA");

        ordenbutton.setText("ORDENES");
        ordenbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ordenbuttonActionPerformed(evt);
            }
        });

        adminbutton.setText("ADMINISTRACIÓN");
        adminbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ordenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(120, 120, 120))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(61, 61, 61)
                    .addComponent(adminbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(343, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(ordenbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(158, Short.MAX_VALUE)
                    .addComponent(adminbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(67, 67, 67)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ordenbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ordenbuttonActionPerformed
        this.setVisible(false);
        ventanapedidos.setVisible(true);
    }//GEN-LAST:event_ordenbuttonActionPerformed

    private void adminbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminbuttonActionPerformed
        this.setVisible(false);
        ventanaadministacion.setVisible(true);
    }//GEN-LAST:event_adminbuttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ventanaprincipal.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton ordenbutton;
    // End of variables declaration//GEN-END:variables
}
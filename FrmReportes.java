/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miproyecto.appticorentcar.capaGrafica;

import javax.swing.JOptionPane;
import miproyecto.appticorentcar.capalogica.Agencia;
import miproyecto.appticorentcar.capalogica.Alquiler;
import miproyecto.appticorentcar.capalogica.Auto;

/**
 *
 * @author Isaac Serrano, cedula 208330122
 */
public class FrmReportes extends javax.swing.JFrame {

    private Agencia agencia;

    /**
     * Creates new form FrmReportes
     */
    public FrmReportes(Agencia agencia) {
        this.agencia = agencia;
        setContentPane(new PanelConFondo("/imagenes/reportes.png"));
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnMostrarAutos = new javax.swing.JButton();
        btnMostrarAlquileres = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaReporte = new javax.swing.JTextArea();
        btnSalir = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Reportes de Tico Rent Car");

        btnMostrarAutos.setBackground(new java.awt.Color(51, 153, 255));
        btnMostrarAutos.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMostrarAutos.setText("Mostrar Todos Los Autos");
        btnMostrarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAutosActionPerformed(evt);
            }
        });

        btnMostrarAlquileres.setBackground(new java.awt.Color(0, 153, 255));
        btnMostrarAlquileres.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnMostrarAlquileres.setText("Historial De Alquileres");
        btnMostrarAlquileres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarAlquileresActionPerformed(evt);
            }
        });

        txtAreaReporte.setEditable(false);
        txtAreaReporte.setBackground(new java.awt.Color(255, 255, 255));
        txtAreaReporte.setColumns(20);
        txtAreaReporte.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        txtAreaReporte.setRows(5);
        jScrollPane1.setViewportView(txtAreaReporte);

        btnSalir.setBackground(new java.awt.Color(255, 51, 51));
        btnSalir.setText("Finalizar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnVolver.setBackground(new java.awt.Color(0, 102, 255));
        btnVolver.setText("Volver al Menu Anterior");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(btnMostrarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(btnMostrarAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 56, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarAutos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarAlquileres, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMostrarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAutosActionPerformed

        Auto[] autos = agencia.getAutos();
        StringBuilder sb = new StringBuilder();

        sb.append("Listado de Autos:\n\n");

        for (Auto auto : autos) {
            sb.append(auto.toString()).append("\n\n");
        }

        txtAreaReporte.setText(sb.toString());

    }//GEN-LAST:event_btnMostrarAutosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMostrarAlquileresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarAlquileresActionPerformed

        String placa = JOptionPane.showInputDialog(this, "Ingrese la placa del auto:");
        if (placa == null || placa.trim().isEmpty()) {
            return;
        }
        int indice = agencia.buscarAutoPorPlaca(placa);

        if (indice == -1) {
            JOptionPane.showMessageDialog(this, "Auto No encontrado");
            return;
        }

        Alquiler[][] alquileres = agencia.getAlquileres();
        StringBuilder sb = new StringBuilder();

        sb.append("Historial de Alquileres del Auto").append(placa).append(":\n\n");

        for (int j = 0; j < alquileres[indice].length; j++) {
            Alquiler alquiler = alquileres[indice][j];
            if (alquiler != null) {
                sb.append(alquiler.toString()).append("\n\n");

            } else {
                sb.append("Sin Alquiler #").append(j + 1).append("\n\n");
            }
        }
        txtAreaReporte.setText(sb.toString());
    }//GEN-LAST:event_btnMostrarAlquileresActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FrmVentanaMenuPrincipal menu = new FrmVentanaMenuPrincipal(agencia);
        menu.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmReportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmReportes(agencia).setVisible(true);
//                
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMostrarAlquileres;
    private javax.swing.JButton btnMostrarAutos;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaReporte;
    // End of variables declaration//GEN-END:variables
}

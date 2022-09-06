/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import dao.DPersona;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelos.Sexo;

/**
 *
 * @author labc205
 */
public class FrmPersona extends javax.swing.JFrame {

    DPersona dP = new DPersona();

    /**
     * Creates new form FrmPersona
     */
    public FrmPersona() {
        initComponents();
        jBtnLimpiar.setToolTipText("Limpiar");
        jBtnAgregar.setToolTipText("Agregar");
        jCmbSexo.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLblId = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jLblApellido = new javax.swing.JLabel();
        jLblEmail = new javax.swing.JLabel();
        jLblSexo = new javax.swing.JLabel();
        jTfId = new javax.swing.JTextField();
        jTfNombre = new javax.swing.JTextField();
        jTfApellido = new javax.swing.JTextField();
        jTfEmail = new javax.swing.JTextField();
        jCmbSexo = new javax.swing.JComboBox<>();
        jToolBar1 = new javax.swing.JToolBar();
        jBtnLimpiar = new javax.swing.JButton();
        jBtnAgregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jBtnPrimero = new javax.swing.JButton();
        jBtnAnterior = new javax.swing.JButton();
        jBtnSiguiente = new javax.swing.JButton();
        jBtnUltimo = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTblRegistros = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listado de Personas");

        jLblId.setText("ID");

        jLblNombre.setText("NOMBRES");

        jLblApellido.setText("APELLIDOS");

        jLblEmail.setText("EMAIL");

        jLblSexo.setText("SEXO");

        jCmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hombre", "Mujer" }));
        jCmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbSexoActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        jBtnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/img/Nuevo.png"))); // NOI18N
        jBtnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnLimpiar.setFocusable(false);
        jBtnLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnLimpiarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnLimpiar);

        jBtnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/complementos/img/Guardar.png"))); // NOI18N
        jBtnAgregar.setToolTipText("");
        jBtnAgregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtnAgregar.setFocusable(false);
        jBtnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAgregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnAgregar);

        jButton1.setText("jButton1");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton2.setText("jButton2");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton2);
        jToolBar1.add(jSeparator1);

        jBtnPrimero.setText("|<");
        jBtnPrimero.setFocusable(false);
        jBtnPrimero.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnPrimero.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPrimeroActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnPrimero);

        jBtnAnterior.setText("<<");
        jBtnAnterior.setFocusable(false);
        jBtnAnterior.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnAnterior.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnAnterior);

        jBtnSiguiente.setText(">>");
        jBtnSiguiente.setFocusable(false);
        jBtnSiguiente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnSiguiente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jBtnSiguiente);

        jBtnUltimo.setText(">|");
        jBtnUltimo.setFocusable(false);
        jBtnUltimo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBtnUltimo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBtnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnUltimoActionPerformed(evt);
            }
        });
        jToolBar1.add(jBtnUltimo);

        jTblRegistros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTblRegistros);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLblId)
                            .addComponent(jLblNombre)
                            .addComponent(jLblApellido)
                            .addComponent(jLblEmail)
                            .addComponent(jLblSexo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 253, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblId)
                    .addComponent(jTfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblNombre)
                    .addComponent(jTfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblApellido)
                    .addComponent(jTfApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblEmail)
                    .addComponent(jTfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLblSexo)
                    .addComponent(jCmbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCmbSexoActionPerformed

    private void jBtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnLimpiarActionPerformed
        // TODO add your handling code here:
        llenarTabla();
        limpiar();
    }//GEN-LAST:event_jBtnLimpiarActionPerformed

    private void jBtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarActionPerformed
        // TODO add your handling code here:
        if (jTfId.getText().length() == 0) {
            JOptionPane.showMessageDialog(this, "Necesita agregar el ID", "Guardar", JOptionPane.ERROR_MESSAGE);
            return;
        }
        int id = Integer.parseInt(jTfId.getText());
        String nom = jTfNombre.getText();
        String ape = jTfApellido.getText();
        String email = jTfEmail.getText();
        Sexo s;
        if (jCmbSexo.getSelectedIndex() == 0) {
            s = Sexo.HOMBRE;
        } else {
            s = Sexo.MUJER;
        }

        int b = dP.agregarPersona(id, nom, ape, email, s);
        if (b == 1) {

            llenarTabla();
            JOptionPane.showMessageDialog(this, "Registro Agregado", "Guardar", JOptionPane.INFORMATION_MESSAGE);
            limpiar();

        } else {

            JOptionPane.showMessageDialog(this, "Error al guardar", "Guardar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtnAgregarActionPerformed

    private void jBtnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnUltimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnUltimoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jBtnPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPrimeroActionPerformed
        // TODO add your handling code here:
        if (!dP.getListPersona().isEmpty()) {
            try {
                int id = dP.getListPersona().get(0).getId();
                String nombre = dP.getListPersona().get(0).getNombre();
                String apellido = dP.getListPersona().get(0).getApellido();
                String email = dP.getListPersona().get(0).getEmail();
                Sexo sexo = dP.getListPersona().get(0).getSexo();

                jTfId.setText("" + id);
                jTfNombre.setText(nombre);
                jTfApellido.setText(apellido);
                jTfEmail.setText(email);
                if (sexo == Sexo.HOMBRE) {
                    jCmbSexo.setSelectedIndex(0);
                } else {
                    jCmbSexo.setSelectedIndex(1);
                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);

            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No hay registros","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnPrimeroActionPerformed

    private void limpiar() {

        jTfId.setText("");
        jTfNombre.setText("");
        jTfApellido.setText("");
        jTfEmail.setText("");
        jCmbSexo.setSelectedIndex(-1);

        jTfId.requestFocus();
    }

    private void llenarTabla() {
        DefaultTableModel tbl = new DefaultTableModel();
        tbl = dP.getListPers();
        jTblRegistros.setModel(tbl);

    }

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
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPersona().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnAgregar;
    private javax.swing.JButton jBtnAnterior;
    private javax.swing.JButton jBtnLimpiar;
    private javax.swing.JButton jBtnPrimero;
    private javax.swing.JButton jBtnSiguiente;
    private javax.swing.JButton jBtnUltimo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCmbSexo;
    private javax.swing.JLabel jLblApellido;
    private javax.swing.JLabel jLblEmail;
    private javax.swing.JLabel jLblId;
    private javax.swing.JLabel jLblNombre;
    private javax.swing.JLabel jLblSexo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTblRegistros;
    private javax.swing.JTextField jTfApellido;
    private javax.swing.JTextField jTfEmail;
    private javax.swing.JTextField jTfId;
    private javax.swing.JTextField jTfNombre;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import business.VitalSignHistory;
import business.VitalSigns;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author 123
 */
public class MainJFrame extends javax.swing.JFrame {

    double defaultMax = 140;
    double defaultMin = 70;

    /**
     * Creates new form MainJFrame
     */
    private VitalSignHistory vsh;

    public MainJFrame() {
        initComponents();
        vsh = new VitalSignHistory();
        maxBloodPressureTextField.setText(defaultMax+"");
        minBloodPressureTextField.setText(defaultMin+"");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPanel = new javax.swing.JSplitPane();
        displayJPanel = new javax.swing.JPanel();
        controlJpanel = new javax.swing.JPanel();
        createBtn = new javax.swing.JButton();
        minBloodPressureTextField = new javax.swing.JTextField();
        maxBloodPressureTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewAbnormalButton = new javax.swing.JButton();
        viewBtn1 = new javax.swing.JButton();
        viewBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        splitPanel.setPreferredSize(new java.awt.Dimension(1000, 800));

        displayJPanel.setPreferredSize(new java.awt.Dimension(850, 800));

        javax.swing.GroupLayout displayJPanelLayout = new javax.swing.GroupLayout(displayJPanel);
        displayJPanel.setLayout(displayJPanelLayout);
        displayJPanelLayout.setHorizontalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );
        displayJPanelLayout.setVerticalGroup(
            displayJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );

        splitPanel.setRightComponent(displayJPanel);

        controlJpanel.setPreferredSize(new java.awt.Dimension(150, 800));

        createBtn.setLabel("Create Vital Sign");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        minBloodPressureTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minBloodPressureTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("MAX_BP:");

        jLabel2.setText("MIN_BP:");

        viewAbnormalButton.setText("Abnormal");
        viewAbnormalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAbnormalButtonActionPerformed(evt);
            }
        });

        viewBtn1.setMaximumSize(new java.awt.Dimension(70, 29));
        viewBtn1.setMinimumSize(new java.awt.Dimension(70, 29));
        viewBtn1.setPreferredSize(new java.awt.Dimension(70, 29));
        viewBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtn1ActionPerformed(evt);
            }
        });

        viewBtn.setText("View Vital Sign");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlJpanelLayout = new javax.swing.GroupLayout(controlJpanel);
        controlJpanel.setLayout(controlJpanelLayout);
        controlJpanelLayout.setHorizontalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minBloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maxBloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlJpanelLayout.createSequentialGroup()
                        .addComponent(viewAbnormalButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(viewBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, controlJpanelLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(viewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(130, 130, 130)))
        );
        controlJpanelLayout.setVerticalGroup(
            controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlJpanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(createBtn)
                .addGap(18, 18, 18)
                .addComponent(viewBtn)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(maxBloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minBloodPressureTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewAbnormalButton)
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(controlJpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(controlJpanelLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(viewBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(383, Short.MAX_VALUE)))
        );

        splitPanel.setLeftComponent(controlJpanel);

        getContentPane().add(splitPanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        CreateVitalJPanel createPanel = new CreateVitalJPanel(vsh);
        splitPanel.setRightComponent(createPanel);
    }//GEN-LAST:event_createBtnActionPerformed

    private void minBloodPressureTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minBloodPressureTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_minBloodPressureTextFieldActionPerformed

    private void viewBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_viewBtn1ActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        ViewVitalJPanel viewPanel = new ViewVitalJPanel(vsh);
        splitPanel.setRightComponent(viewPanel);
    }//GEN-LAST:event_viewBtnActionPerformed

    private void viewAbnormalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAbnormalButtonActionPerformed
        // TODO add your handling code here:
        defaultMax = Double.parseDouble(maxBloodPressureTextField.getText());
        defaultMin = Double.parseDouble(minBloodPressureTextField.getText());
        ViewAbnormalJPanel abnormalJPanel = new ViewAbnormalJPanel(defaultMax, defaultMin, vsh);
        splitPanel.setRightComponent(abnormalJPanel);
        
    }//GEN-LAST:event_viewAbnormalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel controlJpanel;
    private javax.swing.JButton createBtn;
    private javax.swing.JPanel displayJPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField maxBloodPressureTextField;
    private javax.swing.JTextField minBloodPressureTextField;
    private javax.swing.JSplitPane splitPanel;
    private javax.swing.JButton viewAbnormalButton;
    private javax.swing.JButton viewBtn;
    private javax.swing.JButton viewBtn1;
    // End of variables declaration//GEN-END:variables
}

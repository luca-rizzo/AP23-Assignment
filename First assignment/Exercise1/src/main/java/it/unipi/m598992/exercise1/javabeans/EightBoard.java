/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package it.unipi.m598992.exercise1.javabeans;

import it.unipi.m598992.exercise1.events.FlipEvent;
import it.unipi.m598992.exercise1.events.FlipStatusEvent;
import it.unipi.m598992.exercise1.events.RestartEvent;
import it.unipi.m598992.exercise1.listeners.FlipListener;
import it.unipi.m598992.exercise1.listeners.RestartListener;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author rizze
 */
public class EightBoard extends javax.swing.JFrame implements FlipListener {

    private final List<RestartListener> restartListeners = new ArrayList<>();
    private final List<EightTile> tileList;

    /**
     * Creates new form EightBoard
     */
    public EightBoard() {
        initComponents();
        tileList = Arrays.asList(eightTile1, eightTile2, eightTile3, eightTile4, eightTile5,
                        eightTile6, eightTile7, eightTile8, eightTile9);
        tileList.stream().forEach(tile -> tile.addVetoableChangeListener("label", eightController));
        tileList.stream().forEach(tile -> tile.addPropertyChangeListener("label", eightController));
        tileList.stream().forEach(this::registerOtherTileToLabelChange);
        eightController.addFlipListener(this);
        registerRestartListener();
        notifyAllRestartListener();
    }

    private void registerOtherTileToLabelChange(EightTile tile) {
        tileList.stream().filter(innerTile -> innerTile != tile)
                .forEach(innerTile -> tile.addPropertyChangeListener("label", innerTile));
    }

    private void registerRestartListener() {
        addRestartListener(eightController);
        tileList.forEach(this::addRestartListener);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        eightTile1 = new it.unipi.m598992.exercise1.javabeans.EightTile(1);
        eightTile2 = new it.unipi.m598992.exercise1.javabeans.EightTile(2);
        eightTile3 = new it.unipi.m598992.exercise1.javabeans.EightTile(3);
        eightTile4 = new it.unipi.m598992.exercise1.javabeans.EightTile(4);
        eightTile5 = new it.unipi.m598992.exercise1.javabeans.EightTile(5);
        eightTile6 = new it.unipi.m598992.exercise1.javabeans.EightTile(6);
        eightTile7 = new it.unipi.m598992.exercise1.javabeans.EightTile(7);
        eightTile8 = new it.unipi.m598992.exercise1.javabeans.EightTile(8);
        eightTile9 = new it.unipi.m598992.exercise1.javabeans.EightTile(9);
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        eightController = new it.unipi.m598992.exercise1.javabeans.EightController();
        javax.swing.JButton restartButton = new javax.swing.JButton();
        flipButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 6, true));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 6));
        jPanel1.setLayout(new java.awt.GridLayout(3, 3, 2, 2));

        eightTile1.setBorder(null);
        eightTile1.setText("eightTile1");
        eightTile1.setBorderPainted(false);
        eightTile1.setContentAreaFilled(false);
        eightTile1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile1.setOpaque(true);
        jPanel1.add(eightTile1);

        eightTile2.setBorder(null);
        eightTile2.setText("eightTile2");
        eightTile2.setContentAreaFilled(false);
        eightTile2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile2.setOpaque(true);
        jPanel1.add(eightTile2);

        eightTile3.setBorder(null);
        eightTile3.setText("eightTile3");
        eightTile3.setContentAreaFilled(false);
        eightTile3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile3.setOpaque(true);
        jPanel1.add(eightTile3);

        eightTile4.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        eightTile4.setText("eightTile4");
        eightTile4.setContentAreaFilled(false);
        eightTile4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile4.setOpaque(true);
        jPanel1.add(eightTile4);

        eightTile5.setBorder(null);
        eightTile5.setText("eightTile5");
        eightTile5.setContentAreaFilled(false);
        eightTile5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile5.setOpaque(true);
        jPanel1.add(eightTile5);

        eightTile6.setBorder(null);
        eightTile6.setText("eightTile6");
        eightTile6.setContentAreaFilled(false);
        eightTile6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile6.setOpaque(true);
        jPanel1.add(eightTile6);

        eightTile7.setBorder(null);
        eightTile7.setText("eightTile7");
        eightTile7.setContentAreaFilled(false);
        eightTile7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile7.setOpaque(true);
        jPanel1.add(eightTile7);

        eightTile8.setBorder(null);
        eightTile8.setText("eightTile8");
        eightTile8.setAutoscrolls(true);
        eightTile8.setContentAreaFilled(false);
        eightTile8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile8.setOpaque(true);
        jPanel1.add(eightTile8);

        eightTile9.setBorder(null);
        eightTile9.setText("eightTile9");
        eightTile9.setContentAreaFilled(false);
        eightTile9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        eightTile9.setOpaque(true);
        jPanel1.add(eightTile9);

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));
        jPanel2.setLayout(new java.awt.GridLayout(1, 3, 2, 2));

        eightController.setBackground(new java.awt.Color(255, 255, 255));
        eightController.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eightController.setText("START");
        eightController.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        eightController.setOpaque(true);
        jPanel2.add(eightController);

        restartButton.setBackground(new java.awt.Color(255, 153, 0));
        restartButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        restartButton.setText("RESTART");
        restartButton.setBorder(null);
        restartButton.setContentAreaFilled(false);
        restartButton.setOpaque(true);
        restartButton.addActionListener(this::restartButtonActionPerformed);
        jPanel2.add(restartButton);

        flipButton.setBackground(new java.awt.Color(0, 153, 255));
        flipButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        flipButton.setText("FLIP");
        flipButton.setBorder(null);
        flipButton.setContentAreaFilled(false);
        flipButton.setOpaque(true);
        flipButton.addActionListener(eightController);
        jPanel2.add(flipButton);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, Short.MAX_VALUE))
                .addGap(10, 10, 10))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartButtonActionPerformed
        notifyAllRestartListener();
    }//GEN-LAST:event_restartButtonActionPerformed

    public synchronized void addRestartListener(RestartListener l) {
        restartListeners.add(l);
    }

    public synchronized void removeRestartListener(RestartListener l) {
        restartListeners.remove(l);
    }

    private void notifyAllRestartListener() {
        RestartEvent restartEvent = new RestartEvent();
        restartListeners.forEach(l -> l.onRestart(restartEvent));
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
            java.util.logging.Logger.getLogger(EightBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EightBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EightBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EightBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new EightBoard().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private it.unipi.m598992.exercise1.javabeans.EightController eightController;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile1;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile2;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile3;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile4;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile5;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile6;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile7;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile8;
    private it.unipi.m598992.exercise1.javabeans.EightTile eightTile9;
    private javax.swing.JButton flipButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onFlipUpdate(FlipStatusEvent flipStatusEvent) {
        flipButton.setEnabled(flipStatusEvent.flipEnabled());
    }

    @Override
    public void onFlip(FlipEvent flipEvent) {
        RestartEvent restartEvent = new RestartEvent(flipEvent.flippedPermutation());
        restartListeners.forEach(l -> l.onRestart(restartEvent));
    }
}

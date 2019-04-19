/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anas
 */
public class Zeigen extends javax.swing.JPanel {

    static PreparedStatement ps;
    static ResultSet st;
   static   DefaultTableModel model;
   static  int rowCount;

    /**
     * Creates new form Zeigen
     */
    public Zeigen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tzeigen = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(24, 40, 108));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        tzeigen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "التاريخ", "سعر البيع", "سعر الشراء", "الكمية", "اسم المادة"
            }
        ));
        tzeigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tzeigenKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tzeigen);

        jButton1.setText("اخفاء");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(302, 302, 302))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         Mobil.cl.show(Mobil.cardPanel, "Sell");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       Mobil.cl.show(Mobil.cardPanel, "Sell");
    }//GEN-LAST:event_formMouseClicked

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           Mobil.cl.show(Mobil.cardPanel, "Sell");
       }
    }//GEN-LAST:event_jButton1KeyPressed

    private void tzeigenKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tzeigenKeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
           Mobil.cl.show(Mobil.cardPanel, "Sell");
       }
    }//GEN-LAST:event_tzeigenKeyPressed
public static void anzeigen() {
       model = (DefaultTableModel) tzeigen.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            String query = "SELECT w.Name,k.kaufpreise,k.datum,k.quan,k.vkpreise FROM ware w, kaufware k WHERE w.ID=k.wareId AND w.Name LIKE ?";
        
            ps = Utils.getConnection().prepareStatement(query);
            ps.setString(1, Mobil.ware3);
            st = ps.executeQuery();
            while (st.next()) {       
                    model.addRow(new Object[]{st.getString("datum"),st.getString("vkpreise"), st.getString("kaufpreise"), st.getString("quan"), st.getString("Name")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tzeigen;
    // End of variables declaration//GEN-END:variables
}

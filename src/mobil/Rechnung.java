/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import static mobil.show.model;
import static mobil.show.rowCount;

/**
 *
 * @author Anas
 */
public class Rechnung extends javax.swing.JPanel {

    public static ResultSet rs = null;
    public static PreparedStatement ps;

    /**
     * Creates new form Rechnung
     */
    public Rechnung() {
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

        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Zurück = new javax.swing.JButton();
        datumBox = new javax.swing.JComboBox<>();
        rechnungId = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        info1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(24, 40, 108));

        jButton1.setText("حذف");

        jLabel5.setForeground(new java.awt.Color(255, 153, 153));
        jLabel5.setText("الفاتورة");

        Zurück.setText("العودة");
        Zurück.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZurückActionPerformed(evt);
            }
        });

        datumBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "خلال هذا اليوم", "خلال هذا الاسبوع" }));
        datumBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datumBoxActionPerformed(evt);
            }
        });

        rechnungId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechnungIdActionPerformed(evt);
            }
        });

        info1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "السعر الاجمالي", "السعر", "الكمية", "المادة"
            }
        ));
        jScrollPane2.setViewportView(info1);
        if (info1.getColumnModel().getColumnCount() > 0) {
            info1.getColumnModel().getColumn(1).setHeaderValue("السعر");
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(datumBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 285, Short.MAX_VALUE)
                .addComponent(rechnungId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(Zurück)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(81, 81, 81))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(datumBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rechnungId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Zurück))
                .addGap(34, 34, 34))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(131, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(118, 118, 118)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void datumBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datumBoxActionPerformed
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String currentTime = sdf.format(dt);
         String query = "";
         
        //rechnungId.removeAllItems();
        switch (datumBox.getSelectedIndex()) {
            case 0:
                query="SELECT abrechnung.ID FROM abrechnung WHERE abrechnung.datum=?";
                // String query = "SELECT kunde.Name FROM kunde,abrechnung WHERE kunde.ID=abrechnung.Kundeid AND abrechnung.datum=?";
                break;
            case 1:
                query ="SELECT abrechnung.ID FROM abrechnung WHERE DATEDIFF(?,abrechnung.datum)<8";
                break;
        }
        try {
                    ps = Utils.getConnection().prepareStatement(query);
                    ps.setString(1, currentTime);
                    rs = ps.executeQuery();
                    while (rs.next()) {
                        String name = rs.getString("abrechnung.ID");
                        rechnungId.addItem(name);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_datumBoxActionPerformed

    private void rechnungIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechnungIdActionPerformed
  model = (DefaultTableModel) info1.getModel();
        try {
            String query = "SELECT abrechnung.ID, ware.ID AS Warenid, rechnungxware.Menge,ware.vkPreise,abrechnung.gesamt FROM abrechnung,rechnungxware,ware "
                    + "WHERE abrechnung.ID=? AND rechnungxware.abID = abrechnung.ID AND rechnungxware.wareID = ware.ID";
            ps = Utils.getConnection().prepareStatement(query);
            ps.setString(1,(String)rechnungId.getSelectedItem());
          //  rs = ps.executeQuery();
            //while (rs.next()) {
             //   model.addRow(new Object[]{rs.getString("ware.ID"),rs.getString("rechnungxware.Menge"), rs.getString("ware.vkPreise")});
           // }
        } catch (SQLException ex) {
            Logger.getLogger(Rechnung.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_rechnungIdActionPerformed

    private void ZurückActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZurückActionPerformed
        Mobil.cl.show(Mobil.cardPanel, "Liste");
    }//GEN-LAST:event_ZurückActionPerformed
    public static void rechnungListe() {
        rechnungId.removeAllItems();
        try {
            String query = "SELECT ID FROM abrechnung ";
            ps = Utils.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                String name = rs.getString("ID");
                rechnungId.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Zurück;
    private javax.swing.JComboBox<String> datumBox;
    private javax.swing.JTable info1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JComboBox<String> rechnungId;
    // End of variables declaration//GEN-END:variables
}

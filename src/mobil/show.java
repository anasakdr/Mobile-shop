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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anas
 */
public class show extends javax.swing.JPanel {
   static PreparedStatement ps;
    static ResultSet st;
    static DefaultTableModel model;
        static    int rowCount;
    /**
     * Creates new form show
     */
    public show() {
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

        jLabel1 = new javax.swing.JLabel();
        suchName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        wareTabele = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(24, 40, 108));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المعتمد: اظهار البضاعة", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 204, 204))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText(" المادة");

        suchName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                suchNameKeyTyped(evt);
            }
        });

        wareTabele.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "التاريخ", "سعر البيع", "سعر الشراء", "الكمية", "اسم المادة"
            }
        ));
        jScrollPane1.setViewportView(wareTabele);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("رجوع");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("التعديل");

        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("البحث");

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 51, 51));
        jButton4.setText("الحذف");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 153));
        jLabel9.setText("X");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(99, 99, 99)
                .addComponent(jButton4)
                .addGap(105, 105, 105)
                .addComponent(jButton2)
                .addGap(140, 140, 140))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(suchName, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(51, 51, 51)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton4)
                            .addComponent(jButton3))
                        .addGap(38, 38, 38))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(suchName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 90, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       Mobil.cl.show(Mobil.cardPanel, "Liste"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked
        public static void showWare(){
              model = (DefaultTableModel) wareTabele.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        String ss="SELECT w.Name,k.kaufpreise,k.datum,k.quan,k.vkpreise FROM ware w, kaufware k WHERE w.ID=k.wareId  ";
        try {
            ps=Utils.getConnection().prepareStatement(ss);
            st=ps.executeQuery();
            while(st.next()){
                 model.addRow(new Object[]{st.getString("datum"),st.getString("vkpreise"), st.getString("kaufpreise"), st.getString("quan"), st.getString("Name")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        int index =wareTabele.getSelectedRow();
        model=(DefaultTableModel) wareTabele.getModel();
        int v1=Integer.parseInt(model.getValueAt(index, 0).toString());
        int v2=Integer.parseInt(model.getValueAt(index, 1).toString());
        int v3=Integer.parseInt(model.getValueAt(index, 2).toString());
        int v4=Integer.parseInt(model.getValueAt(index, 3).toString());
            
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int selectedRow =wareTabele.getSelectedRow();
     model=(DefaultTableModel) wareTabele.getModel();
     String sss=model.getValueAt(selectedRow,3).toString();
        int ii = JOptionPane.showConfirmDialog(null, "Sind Sie sicher?", "Sicherheit Frage", JOptionPane.OK_CANCEL_OPTION);
        if (ii == JOptionPane.OK_OPTION) {
           
                try {
                    ps = Utils.getConnection().prepareStatement("DELETE FROM ware WHERE Name=?");
                    
                    
                    ps.setString(1, sss);
                    ps.executeUpdate();
                    showWare();
                    JOptionPane.showMessageDialog(null, "لقد تم حذف المنتج");
                 //   Show_Product_In_JTable();                                   
                } catch (SQLException ex) {
                    Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
                    //Zeig mir Massege
                    JOptionPane.showMessageDialog(null, "لم يتم حذف المنتج");
                
                 } 
            }else if (ii == JOptionPane.CANCEL_OPTION) {
                JOptionPane.showMessageDialog(null, "alles klar", "Sicherheit Frage", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void suchNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_suchNameKeyTyped
         model = (DefaultTableModel) wareTabele.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        try {
            String query = "SELECT w.Name,k.kaufpreise,k.datum,k.quan,k.vkpreise FROM ware w, kaufware k WHERE w.ID=k.wareId AND w.Name LIKE ?";
        
            ps = Utils.getConnection().prepareStatement(query);
            ps.setString(1, suchName.getText()+ "%");
            st = ps.executeQuery();
            while (st.next()) {       
                    model.addRow(new Object[]{st.getString("datum"),st.getString("vkpreise"), st.getString("kaufpreise"), st.getString("quan"), st.getString("Name")});
            }
        } catch (SQLException ex) {
            Logger.getLogger(show.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_suchNameKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField suchName;
    public static javax.swing.JTable wareTabele;
    // End of variables declaration//GEN-END:variables
}

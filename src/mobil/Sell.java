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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anas
 */
public class Sell extends javax.swing.JPanel {
     public static ResultSet rs=null;
     public static PreparedStatement ps;
     DefaultTableModel model;
      int rowCount;
    /**
     * Creates new form Sell
     */
    public Sell() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vkTabele = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        wareBox = new javax.swing.JComboBox<>();
        löschen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        insterWare = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quanFeld = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        kundenBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(24, 40, 108));
        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "المعتمد: المبيعات", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24), new java.awt.Color(255, 204, 204))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("الزبون");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("الفاتورة");

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setText("اجمالي الفاتورة :");

        vkTabele.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "السعر", "الكمية", "المادة"
            }
        ));
        vkTabele.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vkTabeleMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vkTabele);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 51, 51));
        jButton3.setText("رجوع");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("التاريخ");

        sum.setForeground(new java.awt.Color(255, 255, 102));
        sum.setText("0");
        sum.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                sumAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        jLabel7.setForeground(new java.awt.Color(204, 255, 255));
        jLabel7.setText("يوجد لدينا");

        wareBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                wareBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        löschen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        löschen.setForeground(new java.awt.Color(255, 51, 51));
        löschen.setText("حذف");
        löschen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                löschenActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 51, 51));
        jButton2.setText("انشاء فاتورة");

        insterWare.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        insterWare.setForeground(new java.awt.Color(255, 51, 51));
        insterWare.setText("اضافة");
        insterWare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insterWareActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("0.0");

        quanFeld.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quanFeldKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 102));
        jLabel8.setText("المادة");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 102));
        jLabel10.setText("الكمية");

        kundenBox.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                kundenBoxPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 678, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(wareBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(quanFeld, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insterWare)
                    .addComponent(jLabel7))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kundenBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(63, 63, 63)
                        .addComponent(jLabel9))
                    .addComponent(jLabel3))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(118, 118, 118)
                        .addComponent(löschen)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(kundenBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(wareBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insterWare)
                    .addComponent(quanFeld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(löschen)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Mobil.cl.show(Mobil.cardPanel, "Liste"); 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void vkTabeleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vkTabeleMouseClicked
    
        
    }//GEN-LAST:event_vkTabeleMouseClicked

    private void sumAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_sumAncestorAdded
      try {
            String ss = "SELECT quantitaet FROM ware WHERE Name=? ";
            ps = Utils.getConnection().prepareStatement(ss);
            ps.setInt(1, wareBox.getSelectedIndex());
            rs=ps.executeQuery(); 
            while(rs.next()){
               
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_sumAncestorAdded
//اظهارالعدد الباقي
    private void wareBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_wareBoxPopupMenuWillBecomeInvisible
       
        String tmp=(String)wareBox.getSelectedItem();
        try {
            String ss = "SELECT quantitaet FROM ware WHERE Name=? ";
            ps = Utils.getConnection().prepareStatement(ss);
            ps.setString(1, tmp);
            rs=ps.executeQuery(); 
            while(rs.next()){
               String add=rs.getString("quantitaet");
                sum.setText(add);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_wareBoxPopupMenuWillBecomeInvisible

    private void insterWareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insterWareActionPerformed
    String price;
    if(!Utils.isEmpty(quanFeld.getText())){
      int s=Integer.parseInt(sum.getText());
      int quan=Integer.parseInt(quanFeld.getText());
      int sum1=s-quan;
      sum.setText(String.valueOf(sum1));
      
        model = (DefaultTableModel) vkTabele.getModel();
        rowCount = model.getRowCount();
        //Löcht alle zeile von unsere Tabelle
       // for (int i = rowCount - 1; i >= 0; i--) {
        //    model.removeRow(i);
     //   }
      String query="SELECT `Verkaufprise` FROM `ware` WHERE Name=?";
    try {
        ps=Utils.getConnection().prepareStatement(query);
        ps.setString(1, wareBox.getSelectedItem().toString());
        rs=ps.executeQuery();
        
        while(rs.next()){
            //price=rs.getString("Verkaufprise");
             model.addRow(new Object[]{(rs.getString(1)),quanFeld.getText(),wareBox.getSelectedItem()});
             quanFeld.setText("");
        }
    } catch (SQLException ex) {
        Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
    }

      }else{
    JOptionPane.showMessageDialog(null,"الرجاء ادخال الكمية");
    
}
    }//GEN-LAST:event_insterWareActionPerformed

    private void quanFeldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quanFeldKeyTyped
         char c=evt.getKeyChar();
       if(!(Character.isDigit(c)|| (c==KeyEvent.VK_BACK_SPACE)||c==KeyEvent.VK_DELETE )){getToolkit().beep();evt.consume();}
    }//GEN-LAST:event_quanFeldKeyTyped

    private void löschenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_löschenActionPerformed
        model = (DefaultTableModel) vkTabele.getModel();
        int selectedRow=vkTabele.getSelectedRow();
        model.removeRow(selectedRow);
    }//GEN-LAST:event_löschenActionPerformed

    private void kundenBoxPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_kundenBoxPopupMenuWillBecomeInvisible
       
    }//GEN-LAST:event_kundenBoxPopupMenuWillBecomeInvisible
public static void liste(){
           wareBox.removeAllItems();
       try {
            String ss = "SELECT Name FROM ware ";
            ps = Utils.getConnection().prepareStatement(ss);
            rs=ps.executeQuery(); 
            while(rs.next()){
                String name=rs.getString("Name");
                wareBox.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
}
public static void liste1(){
           kundenBox.removeAllItems();
       try {
            String ss = "SELECT Name FROM kunde ";
            ps = Utils.getConnection().prepareStatement(ss);
            rs=ps.executeQuery(); 
            while(rs.next()){
                String name=rs.getString("Name");
                kundenBox.addItem(name);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Sell.class.getName()).log(Level.SEVERE, null, ex);
        }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton insterWare;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    private static javax.swing.JComboBox<String> kundenBox;
    private javax.swing.JButton löschen;
    private javax.swing.JTextField quanFeld;
    private javax.swing.JLabel sum;
    private javax.swing.JTable vkTabele;
    private static javax.swing.JComboBox<String> wareBox;
    // End of variables declaration//GEN-END:variables
}

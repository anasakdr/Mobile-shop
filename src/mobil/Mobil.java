
package mobil;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;


public class Mobil {

    public static CardLayout cl;
    public static JPanel cardPanel;
    public static Connection conn;

    public Mobil() {
        cl = new CardLayout();
        cardPanel = new JPanel(cl);
        cardPanel.add(new Login(), "Login");
        cardPanel.add(new Register(), "Register");
        cardPanel.add(new Product(), "Product");
        cardPanel.add(new Sell(), "Sell");
        cardPanel.add(new Liste(), "Liste");
        cardPanel.add(new Kunden(), "Kunden");
        cardPanel.add(new ShowKunde(), "ShowKunde");
        cardPanel.add(new show(), "show");
        cardPanel.add(new Rechnung(), "Rechnung");
        cardPanel.add(new Betzahlt(), "Betzahlt");
        cardPanel.add(new Rebaratur(), "Rebaratur");
        cardPanel.add(new Geld(), "Geld");
        JFrame frame = new JFrame("CardLayout-Demo");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(cardPanel.getWidth(), cardPanel.getHeight());
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Mobil();
            }
        });
    }
    
}

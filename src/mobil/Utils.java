package mobil;

import java.io.File;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import static mobil.Mobil.conn;

public class Utils {

    public static Connection getConnection() {

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/mobile?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
        } catch (SQLException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    }

    public static boolean isEmpty(String... strings) {
        for (String s : strings) {
            if (s.isEmpty()) {
                return true;
            }
        }
        return false;
    }
    public static String sha256(String input) throws NoSuchAlgorithmException{
        MessageDigest mDigest=MessageDigest.getInstance("SHA-256");
        byte[]result=mDigest.digest(input.getBytes());
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<result.length;i++){
            sb.append(Integer.toString((result[i]&0xff)+0x100,16).substring(1));
        }return sb.toString();
    }}
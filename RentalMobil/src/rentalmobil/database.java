package rentalmobil;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    
    public static Connection connectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            // Membuat koneksi ke database
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/rentcar", "root", "");
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}

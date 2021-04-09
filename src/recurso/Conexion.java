package recurso;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
    private String driver, url, ip, bd, usr, pass;
    private Connection conexion;
    
    public Conexion(String ip, String bd, String usr, String pass) {
        
        driver = "oracle.jdbc.driver.OracleDriver";
        this.bd = bd;
        this.usr = usr;
        this.pass = pass;
        url = "jdbc:oracle:thin:@" + ip + ":1521:" + bd;
        try {
            
            Class.forName(driver).newInstance();
            conexion = DriverManager.getConnection(url, usr, pass);
        }
        catch (Exception exc) {
            
            JOptionPane.showMessageDialog(null, "Error de conexion con la base de datos");
        }
        
    }
    
    public Connection getConexion() {
        
        return conexion;
    }
    
    public Connection CerrarConexion() throws SQLException {
        conexion.close();
        conexion = null;
        return conexion;
    }
    
}

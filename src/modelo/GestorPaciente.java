package modelo;

import java.util.LinkedList;
import java.sql.*;
import javax.swing.JOptionPane;


public class GestorPaciente {
    
    private static Connection conn;
    
    public GestorPaciente() {
        
        recurso.Conexion conexion = new recurso.Conexion("localhost", "XE", "citas", "citas");
        conn = conexion.getConexion();
    }
    
    public void registrarPaciente(Paciente paciente) {
        
        try {
            
            PreparedStatement pst = conn.prepareStatement("insert into PACIENTES values (?,?,?,?,?)");
            pst.setString(1, paciente.getIdentificacion());
            pst.setString(2, paciente.getNombres());
            pst.setString(3, paciente.getApellidos());
            pst.setString(4, paciente.getFechaNacimiento());
            pst.setString(5, paciente.getSexo());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente registrado");
            
        }
        catch(SQLException exc) {
            
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }
    }
    
    public LinkedList<Paciente> getPacientesBy(int parametro, String valor) {
        
        LinkedList<Paciente> resultado = new LinkedList<Paciente>();
        String sql = "";
        
        switch(parametro) {
            
            case 1:
                sql = "select * from PACIENTES where pacIdentificacion = '"+valor+"'";
                break;
            case 2:
                sql = "select * from PACIENTES where pacNombres = '"+valor+"'";
                break;
            case 3:
                sql = "select * from PACIENTES where pacApellidos = '"+valor+"'";
                break;
            case 4:
                sql = "select * from PACIENTES where pacSexo = '"+valor+"'";
                break;
        }
        
        try {
            
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                
                resultado.add(new Paciente(rs.getString("pacIdentificacion"), 
                        rs.getString("pacNombres"), 
                        rs.getString("getApellidos"),
                        rs.getString("pacFechaNacimiento"), 
                        rs.getString("pacSexo")));
            }
            
            st.close();
            rs.close();
        }
        catch(SQLException exc) {
            
            JOptionPane.showMessageDialog(null, exc.getMessage());
        }
        
        finally {
            
            return resultado;
        }
    
    } 
    
}

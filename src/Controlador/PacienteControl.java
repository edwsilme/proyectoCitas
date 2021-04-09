package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;


public class PacienteControl implements ActionListener {
    
    Vista.RegPacienteInternalFrame pacienteVista;
    modelo.Paciente pacienteModelo;
    modelo.GestorPaciente gestorPacienteModelo;
    
    public PacienteControl(Vista.RegPacienteInternalFrame pacienteVista) {
        
        this.pacienteVista = pacienteVista;
        gestorPacienteModelo = new modelo.GestorPaciente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource().equals (pacienteVista.RegistrarBtn)) {
            
            String identificacion = pacienteVista.IdentificacionTxt.getText();
            String nombres = pacienteVista.NombresTxt.getText();
            String apellidos = pacienteVista.ApellidosTxt.getText();
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimiento = formato.format(pacienteVista.FechaNacimientoDtc.getDate());
            String sexo = null;
            
            if(pacienteVista.MasculinoOpt.isSelected())
                
                sexo = "m";
            
            else
                
                sexo = "f";
            
            pacienteModelo = new modelo.Paciente(identificacion, nombres, apellidos, fechaNacimiento, sexo);
            gestorPacienteModelo.registrarPaciente(pacienteModelo);
            
        }
        
        if(e.getSource().equals(pacienteVista.NuevoBtn)) {
            
            pacienteVista.IdentificacionTxt.setText(null);
            pacienteVista.NombresTxt.setText(null);
            pacienteVista.ApellidosTxt.setText(null);
            pacienteVista.FechaNacimientoDtc.setDate(null);
            pacienteVista.MasculinoOpt.setSelected(false);
            pacienteVista.FemeninoOpt.setSelected(false);
            pacienteVista.IdentificacionTxt.requestFocus();
            
        }
    }
    
}

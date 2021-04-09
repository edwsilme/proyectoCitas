package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class GestorPacienteControl implements ActionListener {
    
    modelo.GestorPaciente pacientesModelo;
    Vista.ConsPacienteInternalFrame consultarPacienteVista;
    
    public GestorPacienteControl(Vista.ConsPacienteInternalFrame consultarPacienteVista) {
        
        this.consultarPacienteVista = consultarPacienteVista;
        pacientesModelo = new modelo.GestorPaciente();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        String valor = consultarPacienteVista.ValorTxt.getText();
        int parametro = 0;
        
        consultarPacienteVista.getTableModel().setRowCount(0);
        consultarPacienteVista.getTableModel().fireTableDataChanged();
        
        if(consultarPacienteVista.IdentificacionOpt.isSelected())
            parametro = 1;
        if(consultarPacienteVista.NombresOpt.isSelected())
            parametro = 2;
        if(consultarPacienteVista.ApellidosOpt.isSelected())
            parametro = 3;
        if(consultarPacienteVista.SexoOpt.isSelected())
            parametro = 4;
        
        LinkedList<modelo.Paciente> pacientes = pacientesModelo.getPacientesBy(parametro, valor);
        String registro[] = new String[5];
        
        for(modelo.Paciente p:pacientes) {
            
            registro[0] = p.getIdentificacion();
            registro[1] = p.getNombres();
            registro[2] = p.getApellidos();
            registro[3] = p.getFechaNacimiento();
            registro[4] = p.getSexo();
            
            consultarPacienteVista.getTableModel().addRow(registro);
            consultarPacienteVista.getTableModel().fireTableDataChanged();
        }
        
    }
    
}

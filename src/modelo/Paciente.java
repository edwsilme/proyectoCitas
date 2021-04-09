package modelo;

public class Paciente {
    
    private String identificacion;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String sexo;
    
    public Paciente(String id, String nom, String ape, String fechaNac, String sex) {
        
        identificacion = id;
        nombres = nom;
        apellidos = ape;
        fechaNacimiento = fechaNac;
        sexo = sex;
    }
   
    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

     public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

     public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
}

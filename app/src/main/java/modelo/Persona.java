package modelo;

/**
 * Created by USRGAM on 20/04/2018.
 */


public class Persona {
    private String nombre, apellido, correo,cedula;



    public Persona(String nombre, String apellido, String correo, String cedula){
        this.apellido=apellido;
        this.correo=correo;
        this.nombre=nombre;
        this.cedula=cedula;


    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author WILLIAM
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    protected InformacionPersonal informacion;

    public Persona(String nombre, String apellido, int edad, InformacionPersonal informacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.informacion = informacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public InformacionPersonal getInformacion() {
        return informacion;
    }

    public void setInformacion(InformacionPersonal informacion) {
        this.informacion = informacion;
    }
    
    
}

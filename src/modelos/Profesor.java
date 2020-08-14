package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    private String codigo;
    private InformacionAdicionalProfesor info;
    private ArrayList<Paralelo> paralelos;

    public Profesor(String codigo, String nombre, String apellido, int edad, InformacionPersonal informacion) {
        super(nombre, apellido, edad, informacion);
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public void anadirParalelos(Paralelo p){
        paralelos.add(p);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public void setInfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }

    public ArrayList<Paralelo> getParalelos() {
        return paralelos;
    }

    public void addParalelo(Paralelo p){
        paralelos.add(p);
    }
    
    public void removeParalelo(Paralelo p){
        paralelos.remove(p);
    }
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.getInfo().getAñosdeTrabajo()*600 + prof.getInfo().getBonoFijo();
        return sueldo;
    }  
}

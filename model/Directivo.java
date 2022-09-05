package model;

import java.util.ArrayList;

public class Directivo extends Persona{
    private String categoria;
    private ArrayList<Empleado> subordinados;


    public Directivo(String nombre, int edad, String categoria) {
        super(nombre, edad);
        this.categoria = categoria;
        this.subordinados = new ArrayList<Empleado>();
    }

    @Override
    public String mostrar() {
        return "Hola, soy el directivo: "+this.getNombre()+"\n" +
                "Mi categoria es: "+this.categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public ArrayList<Empleado> getSubordinados() {
        return subordinados;
    }

    public void setSubordinados(ArrayList<Empleado> subordinados) {
        this.subordinados = subordinados;
    }
}

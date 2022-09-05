package model;

public class Empleado extends Persona{

    private int sueldoBruto;

    public Empleado(String nombre, int edad, int sueldoBruto) {
        super(nombre, edad);
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String mostrar() {
        return "Hola, soy el empleado: "+this.getNombre()+"\n" +
                "Mi sueldo bruto es: "+this.sueldoBruto;
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }
}

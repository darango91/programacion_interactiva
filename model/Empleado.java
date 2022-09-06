package model;

public class Empleado extends Persona implements IPersonaDeportista{

    private String deportes;
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

    public String esDeportista() {
        if (this.deportes != null) {
            return "Si es deportista";
        } else {
            return "No es deportista";
        }
    }

    public int getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(int sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public boolean practicaDeporte() {
        return this.deportes != null;
    }

    @Override
    public String deporteQuePractica(String deporte) {
        return this.deportes += deporte + this.SEPARADOR;
    }
}

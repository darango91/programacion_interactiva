package modelo;

public abstract class Vehiculo {
    private String color;
    private double peso;

    public Vehiculo(String color, double peso) {
        this.color = color;
        this.peso = peso;
    }

    public abstract void circular();

    public void agregarPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Soy de color: "+this.color;
    }
}

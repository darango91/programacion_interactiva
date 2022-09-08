package modelo;

public class CuatroRuedas extends Vehiculo{

    private int numPuertas;

    public CuatroRuedas(String color, double peso, int numPuertas) {
        super(color, peso);
        this.numPuertas = numPuertas;
    }

    public void repintar(String color) {
        this.setColor(color);
    }

    @Override
    public void circular() {
        System.out.println("Soy un vehiculo de 4 ruedas y circulo con ellas");
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }
}

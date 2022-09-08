package modelo;

public class Automovil extends CuatroRuedas implements IDeportivo{

    private int traccion;

    public Automovil(String color, double peso, int numPuertas, int traccion) {
        super(color, peso, numPuertas);
        this.traccion = traccion;
    }

    @Override
    public double miVelocidadEs() {
        return TOPSPEED;
    }
}

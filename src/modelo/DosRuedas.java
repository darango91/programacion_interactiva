package modelo;

public class DosRuedas extends Vehiculo implements IDeportivo{

    private int cilindraje;

    public DosRuedas(String color, double peso, int cilindarje) {
        super(color, peso);
        this.cilindraje = cilindarje;
    }

    @Override
    public void circular() {

    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    @Override
    public double miVelocidadEs() {
        return TOPSPEED;
    }
}

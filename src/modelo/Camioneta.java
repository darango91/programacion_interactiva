package modelo;

public class Camioneta extends CuatroRuedas{
    private boolean pickup;

    public Camioneta(String color, double peso, int numPuertas, boolean pickup) {
        super(color, peso, numPuertas);
        this.pickup = pickup;
    }

    public void remolcar() {
        if(pickup){
            System.out.println("Si puedo remolcar");
        } else {
            System.out.println("No puedo remolcar");
        }
    }
}

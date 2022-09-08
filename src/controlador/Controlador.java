package controlador;

import modelo.Automovil;
import modelo.Camioneta;
import modelo.DosRuedas;
import java.util.Arrays;

public class Controlador {
    public static Automovil[] automovilesArray = new Automovil[10];
    public static Camioneta[] camionetasArray = new Camioneta[10];
    public static DosRuedas[] motosArray = new DosRuedas[10];

    public static void main(String[] args) {
        crearAutoEnArray("Verde", 2000, 4,2);
        crearCamionetaEnArray("Azul", 4000,4, true);
        crearMotoEnArray("Rojo", 210, 411);

        System.out.println(Arrays.toString(automovilesArray));
        System.out.println(Arrays.toString(camionetasArray));
        System.out.println(Arrays.toString(motosArray));
    }

    public static void crearAutoEnArray(String color, double peso, int numPuertas, int  traccion) {
        Automovil auto = new Automovil(color, peso, numPuertas, traccion);
        agregarObjetoArray(auto, automovilesArray);
    }

    public static void crearCamionetaEnArray(String color, double peso, int numPuertas, boolean pickup) {
        Camioneta camioneta = new Camioneta(color, peso, numPuertas, pickup);
        agregarObjetoArray(camioneta, camionetasArray);
    }

    public static void crearMotoEnArray(String color, double peso, int cilindraje) {
        DosRuedas moto = new DosRuedas(color, peso, cilindraje);
        agregarObjetoArray(moto, motosArray);
    }

    public static void agregarObjetoArray(Object obj, Object[] objects){
        for (int i = 0; i < objects.length; i++) {
            if(objects[i] == null) {
                objects[i] = obj;
                break;
            }
        }
    }
}

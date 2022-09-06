package control;

import model.Cliente;
import model.Empresa;

import java.util.ArrayList;

public class Main {

    // Al tener nuestra lista de clientes en una clase externa y almacenarlos tanto aqui como en la clase
    // Empresa, estamos garantizando que si por algun motivo nuestra empresa se borra, nuestros clientes no se iran,
    // caso contrario sucede con los empleados
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) {
        Empresa carvajal = new Empresa("Carvajal");
        Cliente cliente1 = new Cliente("Clientesito", 22, "3111112233");
        boolean agregado = agregarCliente(cliente1, carvajal);
    }


    public static boolean agregarCliente(Cliente cliente, Empresa empresa){
        return clientes.add(cliente) && empresa.agregarCliente(cliente);
    }

    public static void convertirDia(int dia){
        switch (dia) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Ese dia no existe");
                break;
        }
    }

    public static void imprimirListaWhile(String[] listaNombres){
        int i = 0;

        while (i <= listaNombres.length){
            System.out.println(listaNombres[i]);
            i++;
        }
    }

    public static void imprimirListaDoWhile(String[] listaNombres){
        int i = 0;

        do {
            System.out.println(listaNombres[i]);
            i++;
        } while (i <= listaNombres.length);
    }

    public static void imprimirListaFor(String[] listaNombres){
        for (int i = 0; i <= listaNombres.length; i++) {
            System.out.println(listaNombres[i]);
        }
    }

    public static void imprimirLista(String[] listaNombres){
        for (String nombre : listaNombres) {
            System.out.println(nombre);
        }
    }
}

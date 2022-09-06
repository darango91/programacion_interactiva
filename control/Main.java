package control;

import model.Cliente;
import model.Empleado;
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

        boolean[] estado = new boolean[5];
        char[] sexo = new char[2];
        String[] nombre = new String[2];
        Cliente[] clientes = new Cliente[10];

        int[] edad = {45, 23, 11, 9};  //Array de 4 elementos

        System.out.println(edad[1]); // Imprime 23
        System.out.println(edad.length); // Imprime 4


        Empleado empleado1 = new Empleado(
                "Pepito Perez",
                31,
                5000);
        empleado1.deporteQuePractica("Tenis");

        boolean agregado = agregarCliente(cliente1, carvajal);

        contarNumero(6);
        contarNumeroBreak(6);

        convertCadenaANumero("34");
        convertCadenaANumero("Abc");
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

    public static void contarNumeroBreak(int limite){
        for(int i = 0; i <= limite; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
    }

    public static void contarNumeroContinue(int limite){
        for(int i = 0; i <= limite; i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
    }

    public static int contarNumero(int limite){
        int cont = 0;
        while(true) {
            if(cont == limite) {
                return cont;
            }
            cont++;
        }
    }

    public static String esPar(int numero){
        if(numero % 2 == 0){
            return "Es par";
        }
        // Bloque de codigo que se ejecuta si
        // no se cumple la condicion especificada
        // en el bloque anterior
        return "No es par";
    }

    public static void convertCadenaANumero(String cadena){
        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("La cadena si es un numero");
        } catch (NumberFormatException  e) {
            System.out.println("Excepcion capturada, " +
                    "la cadena no es un numero: "+ cadena);
        }
    }

    public void cadenaVaciaONula(String cadena) throws Exception {
        if(cadena.length() == 0) {
            throw new Exception("Esta cadena es vacia");
        } else {
            System.out.println("No es una cadena vacia");
        }
    }
}

package src.control;

import jdk.internal.util.xml.impl.Input;
import src.model.Cliente;
import src.model.Empleado;
import src.model.Empresa;
import src.model.MalNombreException;

import java.util.Scanner;
import java.util.ArrayList;

import java.util.InputMismatchException;

public class Main {

    // Al tener nuestra lista de clientes en una clase externa y almacenarlos tanto aqui como en la clase
    // Empresa, estamos garantizando que si por algun motivo nuestra empresa se borra, nuestros clientes no se iran,
    // caso contrario sucede con los empleados
    public static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static void main(String[] args) {
        try {
            leerNombre("CARAJO ernesto");
        } catch (MalNombreException ex) {
            ex.printStackTrace();
        }

    }

    public static void leerNombre(String nombre) throws MalNombreException {
        if (esMalNombre(nombre)){
            throw new MalNombreException("Ese nombre no se permite");
        } else {
            System.out.println("Su nombre es: "+ nombre);
        }
    }

    public static boolean esMalNombre(String nombre){
        return nombre.contains("CARAJO");
    }

    public static void leerEntrada(){
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        System.out.println("You entered string " + s);

        int a = 0;
        boolean b = false;

        boolean exception = false;

        do {
          try {
              a = in.nextInt();;
              b = in.nextBoolean();
          } catch (InputMismatchException ex) {
              System.out.println("Has ingresado un dato erroneo, por favor verifica tu entrada"+ex);
              exception = true;
          }
        } while (exception);

        System.out.println("You entered integer " + a); // InputMismatchException
        System.out.println("You entered boolean " + b); // InputMismatchException
    }

    public static void recursiveMethod(int i){
        while(i!=0){
            i=i+1;
            recursiveMethod(i);
        }
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

import models.Human;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("These are Java's basic data types:");

        String java_data_types =
            "   int myNum = 5;               // Integer (whole number)\n" +
            "   float myFloatNum = 5.99f;    // Floating point number\n" +
            "   char myLetter = 'D';         // Character\n" +
            "   boolean myBool = true;       // Boolean\n" +
            "   String myText = \"Hello\";     // String";


        System.out.println(java_data_types);

        primitiveDAtaTypes();
        arreglosYArrayLists();
        operadores();

    }

    public static void primitiveDAtaTypes(){
        byte myByte = 127;           // Byte rango: (-128 -> 127)
        short myShort = -32768;      // Short rango: (-32768 -> 32767)
        int myNum = 5;               // Integer (Enteros -2147483648 to 2147483647)
        double myDouble = 256.32;    // Double (decimales precision de 15 a 16 decimales)
        float myFloatNum = 5.99f;    // Float (decimal de punto flotante precision de 6 a 7 decimales)
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
    }


    public static void arreglosYArrayLists() {
        String myText = "Hello";     // String
        int[] numArray = {1, 2, 3, 4}; // Arreglos o vectores

        ArrayList<String> listaNombres = new ArrayList<>();
        listaNombres.add("Gato");
        listaNombres.add("Perro");
        listaNombres.add("Ave");

        for (String listaNombre : listaNombres) {
            System.out.println(listaNombre);
        }

        for(int i=0; i<listaNombres.size(); i++){
            System.out.println(listaNombres.get(i));
        }

        Human miHumano = new Human(1111111, "Popeye", (short) 35);
        System.out.println(miHumano);
    }

    public static void operadores() {
        // Asignacion
        int numero = 3;
        String cadena = "Hola Mundo";
        double decimal = 4.5;
        boolean verdad = true;

        // Aritmeticos
        int suma = 3 + 7;               // 7
        int resta = 5 - 200;            // -195
        int multiplicacion = 5 * 3;     // 15
        int division = 8 / 3;           // 2
        int residuo = 4 % 2;            // 0

        // Unarios
        // +    Suma
        // +    Resta
        // ++   Incremento
        // --   Decremento
        // !    Complemento logico - negacion

        int valor = 2;
        System.out.println(-valor); // Imprimirá por pantalla un -2

        // Operadores de igualdad y relacion
        // ==	igual a
        // !=	no igual a
        // >	mayor que
        // >=	mayor o igual que
        // <	menor que
        // <=	menor o igual que

        boolean igualdad = 3 == 3;          // true
        boolean desigual = 4 != 5;          // true
        boolean mayorQue = 6 > 4;           // false
        boolean mayorIgualQue = 97 >= 97;   // true
        boolean menorQue = 77 < 43;         // false
        boolean menorIgualQue = 25 <= 43;   // true

        // Operadores condicionales

        // &&	Operador condicional AND
        // ||	Operador condicional OR
        // ?:	Operador Ternario
        // instanceof	Operador instanceof

        int variable1 = 5;
        int variable2 = 3;

        boolean operadorAND = (variable1 == 5) && (variable2 ==3);
        boolean operadorOR = (variable1 == 5) || (variable2 ==3);

        int mayor  = (variable1 > variable2) ? variable1 : variable2;

        if (variable1 > variable2) {
            mayor = variable1;
        } else {
            mayor = variable2;
        }
    }
}

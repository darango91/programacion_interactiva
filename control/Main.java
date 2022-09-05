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
        agregarCliente(cliente1, carvajal);

    }

    public static boolean agregarCliente(Cliente cliente, Empresa empresa){
        return clientes.add(cliente) && empresa.agregarCliente(cliente);
    }
}

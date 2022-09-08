package model;

import java.util.ArrayList;

public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    private ArrayList<Cliente> clientes;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<Empleado>();;
        this.clientes = new ArrayList<Cliente>();

        // En la composicion, la clase que contiene a la otra, se encarga de crear la primera o
        // primeras instancias que se requieran de la misma
        Empleado empleadoPrimario = new Empleado("Empleado Principal", 0, 0);
        this.empleados.add(empleadoPrimario);
    }

    public boolean agregarCliente(Cliente cliente) {
        // La agregacion hace referencia a que la clase contenedora, no necesita instancia alguna de las
        // agregadas para existir y se ofrece un metodo para realizar este proceso despues de crear o construir la
        // principal.
        // Adicionalmente, los clientes pueden existir en otra lista o array y no quiere decir que al eliminar la
        // empresa, se van los clientes.
        return this.clientes.add(cliente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}

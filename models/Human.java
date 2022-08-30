package models;

import java.util.ArrayList;

public class Human extends SerVivo{
    private int id;
    private String name;
    private short age;
    private ArrayList<AnimalTerrestre> mascotas;

    public Human(){
        super();
    }

    public Human(int id, String name, short age) {
        super("Terrestre", 2);
        this.name = name;
        this.id = id;
        this.age = age;
        this.mascotas = new ArrayList<AnimalTerrestre>();
    }

    public boolean agregarMascota(AnimalTerrestre mascota){
        // Logica adicional de validacion del tipo de animal
        // no todos pueden ser mascotas
        return this.mascotas.add(mascota);
    }

    public String toString(){
        return "Hi, my name is "+ this.name + " and I'm " + this.age + " years old";
    }
}

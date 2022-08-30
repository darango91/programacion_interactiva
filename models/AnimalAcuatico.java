package models;

public class AnimalAcuatico extends SerVivo{

    public AnimalAcuatico(String especie, String raza, String nombre, int edad, int cantPiesCamina) {
        super("Terrestre", cantPiesCamina);
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String moverse(){
        return "Yo me muevo nadando";
    }
}

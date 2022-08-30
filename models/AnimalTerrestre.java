package models;

public class AnimalTerrestre extends SerVivo {

    public AnimalTerrestre(String especie, String raza, String nombre, int edad, int cantPiesCamina) {
        super("Terrestre", cantPiesCamina);
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String moverse(){
        if (this.getPiesCamina() == 0){
            return "Yo me arrassssstro";
        }
        return "Yo me muevo caminando";
    }

    public String toString() {
        return "Este es el " + especie + " llamado: " + nombre + " es de tipo: " + this.getTipo();
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

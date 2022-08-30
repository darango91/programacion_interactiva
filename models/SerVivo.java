package models;

public class SerVivo {
    private String tipo; //Terrestre, Acuatico, Volador
    private int piesCamina; //Cantidad de pies en que camina, 2, 4 o mas
    protected String especie;
    protected String raza;
    protected String nombre;
    protected int edad;

    public SerVivo() {
    }

    public SerVivo(String tipo, int piesCamina) {
        this.tipo = tipo;
        this.piesCamina = piesCamina;
    }

    public SerVivo(String tipo, int piesCamina, String especie, String raza, String nombre, int edad) {
        this.tipo = tipo;
        this.piesCamina = piesCamina;
        this.especie = especie;
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getTipo() {
        return tipo;
    }

    public String moverse(){
        return "";
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiesCamina() {
        return piesCamina;
    }

    public void setPiesCamina(int piesCamina) {
        this.piesCamina = piesCamina;
    }
}

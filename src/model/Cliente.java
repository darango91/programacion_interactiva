package src.model;

public class Cliente extends Persona{

    private String telefonoDeContacto;

    public Cliente(String nombre, int edad, String telefonoDeContacto) {
        super(nombre, edad);
        this.telefonoDeContacto = telefonoDeContacto;
    }

    @Override
    public String mostrar() {
        return "Hola, soy el cliente: "+this.getNombre()+"\n" +
                "Mi telefono es: "+this.telefonoDeContacto;
    }

    public String getTelefonoDeContacto() {
        return telefonoDeContacto;
    }

    public void setTelefonoDeContacto(String telefonoDeContacto) {
        this.telefonoDeContacto = telefonoDeContacto;
    }
}

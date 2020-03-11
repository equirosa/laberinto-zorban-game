package bl.productosConcretos;

import bl.productosAbstractos.Poder;

public class Personaje implements Poder {

    private String nombre = "";

    //Constructores

    public Personaje() {
    }

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    //gets y sets

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // toString

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    //Métodos de la interface

    @Override
    public String usarPoder(){
        return "";
    }
}

package bl.Personajes.productosConcretos;

import bl.Personajes.productosAbstractos.Elemental;
import bl.Personajes.productosAbstractos.Poder;

public class Personaje extends Elemental implements Poder {

    private String nombre = "";

    //Constructores

    public Personaje() {
    }

    public Personaje(String nombre, Elemento elemento) {
        this.nombre = nombre;
        this.elemento = elemento;
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

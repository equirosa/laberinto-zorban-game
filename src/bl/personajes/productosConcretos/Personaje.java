package bl.personajes.productosConcretos;

import bl.personajes.productosAbstractos.Elemental;
import bl.personajes.productosAbstractos.Poder;

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

    //Métodos de la interface

    @Override
    public String usarPoder(){
        return "";
    }
}

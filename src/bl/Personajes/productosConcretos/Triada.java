package bl.Personajes.productosConcretos;

import java.util.Arrays;

public class Triada {

    private Personaje[] personajes;
    private String casilla;
    private boolean atrapado = false;

    //Constructores

    public Triada() {
    }

    public Triada(Personaje[] personajes) {
        this.personajes = personajes;
    }

    //getters y setters

    public Personaje[] getPersonajes() {
        return personajes;
    }

    public void setPersonajes(Personaje[] personajes) {
        this.personajes = personajes;
    }

    public String getCasilla() {
        return casilla;
    }

    public void setCasilla(String casilla) {
        this.casilla = casilla;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    //toString

    @Override
    public String toString() {
        return "Triada{" +
                "personajes=" + Arrays.toString(personajes) +
                ", casilla='" + casilla + '\'' +
                ", atrapado=" + atrapado +
                '}';
    }
}

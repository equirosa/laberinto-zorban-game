package bl.productosAbstractos;

import bl.Elemento;

public abstract class Elemental {
    private int vida = 0;
    private Elemento elemento;
    private int ataque;

    //Constructores

    public Elemental() {
    }

    public Elemental(int vida, Elemento elemento, int ataque) {
        this.vida = vida;
        this.elemento = elemento;
        this.ataque = ataque;
    }

    //getters y setters

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        this.elemento = elemento;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    //toString

    @Override
    public String toString() {
        return "Elemental{" +
                "vida=" + vida +
                ", elemento=" + elemento +
                ", ataque=" + ataque +
                '}';
    }
}

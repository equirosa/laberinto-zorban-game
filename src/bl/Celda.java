package bl;

/* Esta es la clase base para las celdas del juego
* NOTA: Puede ser mejor pasar esta clase a ser una clase abstracta*/
public class Celda {
    // Esto representa el número de la celda representada en el tablero del juego
    protected int numero;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Celda(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

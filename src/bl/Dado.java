package bl;

public class Dado {
    // Atributos
    private String tipo;
    private int valores[];

    public Dado(String tipo, int[] valores) {
        this.tipo = tipo;
        this.valores = valores;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int[] getValores() {
        return valores;
    }

    public void setValores(int[] valores) {
        this.valores = valores;
    }
}

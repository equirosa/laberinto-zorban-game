package bl.dado.productoConcreto;

import java.util.Arrays;

public class Dado {
    // Atributos
    private String tipo;
    private int valores[];
    private static Dado dadoMovimiento;
    private static Dado dadoAtaque;

    private Dado(String tipo, int[] valores) {
        this.tipo = tipo;
        this.valores = valores;
    }

    //Getters y setters

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

    public static Dado getDadoMovimiento() {
        if(dadoMovimiento == null){
            int[] valores = {1, 2, 3, 4, 5, 6};
            return dadoMovimiento = new Dado("Movimiento", valores);
        }else{
            return dadoMovimiento;
        }
    }

    public static void setDadoMovimiento(Dado dadoMovimiento) {
        Dado.dadoMovimiento = dadoMovimiento;
    }

    public static Dado getDadoAtaque() {
        if(dadoAtaque == null){
            int[] valores = {1, 2, 3, 4, 5, 6};
            return dadoAtaque = new Dado("Ataque", valores);
        }else{
            return dadoAtaque;
        }
    }

    public static void setDadoAtaque(Dado dadoAtaque) {
        Dado.dadoAtaque = dadoAtaque;
    }

    //toString

    @Override
    public String toString() {
        return "Dado{" +
                "tipo='" + tipo + '\'' +
                ", valores=" + Arrays.toString(valores) +
                '}';
    }
}

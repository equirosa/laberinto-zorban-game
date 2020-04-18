package bl.dado.metodo_Fabrica.producto_Concreto;

import bl.dado.decorador.componente.Dado;
import bl.dado.metodo_Fabrica.producto_Abstracto.IDado;

public class DadoMovimiento extends Dado implements IDado {
  private static DadoMovimiento dadoMovimiento;

  private int[] valores;
  private String tipo;

  private DadoMovimiento(String pTipo, int[] pValores){
    this.tipo = pTipo;
    this.valores = pValores;
  }

  /**
   * ******************** Seccion para hacer SET *****************************
   */
  public void setValores(int[] valores) {
    this.valores = valores;
  }

  public static void setDadoMovimiento(
      DadoMovimiento dadoMovimiento) {
    DadoMovimiento.dadoMovimiento = dadoMovimiento;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  /**
   * ******************** Seccion para hacer GET *****************************
   */



  public String getTipo() {
    return tipo;
  }

  public static DadoMovimiento getDadoMovimiento() {
    if(dadoMovimiento == null){
      int[] valores = {1,2,3,4,5,6};
      dadoMovimiento = new DadoMovimiento("Movimiento", valores);
    }
    return dadoMovimiento;
  }

  public int[] getValores() {
    return valores;
  }

  /**
   * ******** Seccion para implementar funciones de la interface **************
   */
  //Ejecuta la accion de lanzar dado (Del 1 al 6)
  @Override
  public int lanzarDado() {
    return (int) (Math.random() * 6) + 1;
  }

  //Muestra la acción que el jugador que lanzó el dado tiene que realizar
  @Override
  public String getAccion() {
    return "Tiene que moverse " + lanzarDado() + " espacios";
  }
}

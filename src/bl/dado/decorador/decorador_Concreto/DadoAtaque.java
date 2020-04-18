package bl.dado.decorador.decorador_Concreto;

import bl.dado.decorador.componente.Dado;
import bl.dado.decorador.decorador.ObjetoDecorado;
import bl.dado.metodo_Fabrica.producto_Abstracto.IDado;

public class DadoAtaque extends ObjetoDecorado implements IDado {

  private String accion;

  public DadoAtaque (Dado pDado){this.cDado = pDado;}

  @Override
  public String getAccion() {
    int caraDado = lanzarDado();

    switch (caraDado){
      case 1:
        accion = "Atacaste a un personaje de la triada";
        break;

      case 2:
        accion = "Atacaste a dos personajes de la triada";
        break;

      case 3:
        accion = "Atacaste a tres personajes de la triada";
        break;

      case 4:
        accion = "Atacaste a un personaje de la triada y activaste tu poder especial";
        break;

      case 5:
        accion = "Atacaste a dos personajes de la triada y se activó tu poder especial";
        break;

      case 6:
        accion = "Atacaste a todos los personajes de la triada y se han activado dos poderes especiales";
        break;
    }
    return accion;
  }

  @Override
  public int lanzarDado() {
    return (int) (Math.random() * 6) + 1;
  }
}

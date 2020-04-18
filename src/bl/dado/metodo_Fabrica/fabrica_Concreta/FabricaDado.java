package bl.dado.metodo_Fabrica.fabrica_Concreta;

import bl.dado.metodo_Fabrica.fabrica_Abstracta.IFabricaDado;
import bl.dado.metodo_Fabrica.producto_Abstracto.IDado;
import bl.dado.metodo_Fabrica.producto_Concreto.DadoMovimiento;

public class FabricaDado implements IFabricaDado {


  @Override
  public IDado crearDado() {
        return DadoMovimiento.getDadoMovimiento();
  }
}

package bl.dado.creadorConcreto;

import bl.dado.creador.IFabricaDado;
import bl.dado.productoConcreto.Dado;

public class FabricaDado implements IFabricaDado {
    //Métodos de la interface
    @Override
    public Dado crearDadoMovimiento(){
        return Dado.getDadoMovimiento();
    }

    @Override
    public Dado crearDadoAtaque(){
        return Dado.getDadoAtaque();
    }
}

package bl.dado.creador;
import bl.dado.productoConcreto.Dado;

public interface IFabricaDado {
    /**
     * Este método va a crear una instancia del dado de movimiento.
     * @return objDado.
     */
    public Dado crearDadoMovimiento();

    /**
     * Este método va a crear una instancia del dado de ataque.
     * @return objDado.
     */
    public Dado crearDadoAtaque();
}

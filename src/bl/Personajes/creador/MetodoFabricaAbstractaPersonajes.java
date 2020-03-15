package bl.Personajes.creador;
import bl.Personajes.productosAbstractos.Elemental;
import bl.Personajes.productosConcretos.*;

public interface MetodoFabricaAbstractaPersonajes {
    /**
     * Crea una triada y la returna
     * @param elementos
     * @return objTriada
     */
    public Triada crearTriada(String[] elementos);

    /**
     * Crea un personaje
     * @param elemento
     * @return objELemental
     */
    public Elemental crearPersonaje(String elemento);
}

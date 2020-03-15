package bl.Personajes.creador;
import bl.Personajes.productosAbstractos.Elemental;
import bl.Personajes.productosConcretos.*;

public interface MetodoFabricaAbstractaPersonajes {
    /**
     * Crea una triada y la returna
     * @param elemento1
     * @param elemento2
     * @param elemento3
     * @return objTriada
     */
    public Triada crearTriada(String elemento1, String elemento2, String elemento3);

    /**
     * Crea un personaje
     * @param elemento
     * @return objELemental
     */
    public Elemental crearPersonaje(String elemento);
}

package bl.personajes.creador;

import bl.personajes.productosAbstractos.Elemental;
import bl.personajes.productosConcretos.Triada;

public interface IFabricaPersonaje {
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

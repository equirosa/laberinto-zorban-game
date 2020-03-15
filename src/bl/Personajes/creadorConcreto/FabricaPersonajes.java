package bl.Personajes.creadorConcreto;

import bl.Personajes.creador.MetodoFabricaAbstractaPersonajes;
import bl.Personajes.productosAbstractos.Elemental;
import bl.Personajes.productosConcretos.*;

public class FabricaPersonajes implements MetodoFabricaAbstractaPersonajes {
    public Triada crearTriada(String elemento1, String elemento2, String elemento3){

        return null;
    }

    public Elemental crearPersonaje(String elemento){
        Elemento objElemento = new Elemento(elemento);

        Personaje objPersonaje = new Personaje(elemento, objElemento);
        return null;
    }
}

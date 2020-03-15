package bl.Personajes.creadorConcreto;

import bl.Personajes.creador.MetodoFabricaAbstractaPersonajes;
import bl.Personajes.productosAbstractos.Elemental;
import bl.Personajes.productosConcretos.*;

public class FabricaPersonajes implements MetodoFabricaAbstractaPersonajes {
    public Triada crearTriada(String[] elementos){
        Triada objTriada = new Triada();
        Personaje[] lstPersonajes = new Personaje[3];
        for(int i = 0; i < elementos.length; i++){
            lstPersonajes[i] = crearPersonaje(elementos[i]);
        }
        return null;
    }

    public Personaje crearPersonaje(String elemento){
        Elemento objElemento = new Elemento(elemento);
        Personaje objPersonaje = new Personaje(elemento, objElemento);
        return objPersonaje;
    }
}

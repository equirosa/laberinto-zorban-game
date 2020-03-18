package bl.personajes.creadorConcreto;

import bl.personajes.creador.IFabricaPersonaje;
import bl.personajes.productosConcretos.*;

public class FabricaPersonajes implements IFabricaPersonaje {
    public Triada crearTriada(String[] elementos){
        Triada objTriada = new Triada();
        Personaje[] lstPersonajes = new Personaje[3];
        for(int i = 0; i < elementos.length; i++){
            lstPersonajes[i] = crearPersonaje(elementos[i]);
        }
        objTriada.setPersonajes(lstPersonajes);
        return objTriada;
    }

    public Personaje crearPersonaje(String elemento){
        Elemento objElemento = new Elemento(elemento);
        Personaje objPersonaje = new Personaje(elemento, objElemento);
        return objPersonaje;
    }
}

import java.io.BufferedReader;
import java.io.InputStreamReader;
import bl.Personajes.creadorConcreto.FabricaPersonajes;
import bl.Personajes.productosConcretos.Personaje;
import bl.Personajes.productosConcretos.Triada;

public class Sandbox {
    public static void main(String[] args) throws Exception{
        FabricaPersonajes fp = new FabricaPersonajes();
        String[] elementos = {"Fuego", "Agua", "Hielo"};
        Triada t = fp.crearTriada(elementos);
        System.out.println(t.toString());
        Personaje[] lstPersonajes = t.getPersonajes();
        for(int i = 0; i < lstPersonajes.length; i++){
            System.out.println(lstPersonajes[i].toString());
        }
    }
}

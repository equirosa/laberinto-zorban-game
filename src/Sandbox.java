import bl.dado.creadorConcreto.FabricaDado;
import bl.dado.productoConcreto.Dado;
import bl.personajes.creadorConcreto.FabricaPersonajes;
import bl.personajes.productosConcretos.Personaje;
import bl.personajes.productosConcretos.Triada;

public class Sandbox {
    public static void main(String[] args) throws Exception{
        //probarTriada();
        probarDadoMovimiento();
    }

    public static void probarTriada(){
        FabricaPersonajes fp = new FabricaPersonajes();
        String[] elementos = {"Fuego", "Agua", "Hielo"};
        Triada t = fp.crearTriada(elementos);
        System.out.println(t.toString());
        Personaje[] lstPersonajes = t.getPersonajes();
        for(int i = 0; i < lstPersonajes.length; i++){
            System.out.println(lstPersonajes[i].toString());
        }
    }

    public static void probarDadoMovimiento(){
        FabricaDado fabrica = new FabricaDado();
        Dado objDadoMovimiento = fabrica.crearDadoMovimiento();
        System.out.println(objDadoMovimiento.toString());
    }
}

package ui;

import bl.dado.decorador.componente.Dado;
import bl.dado.decorador.decorador_Concreto.DadoAtaque;
import bl.dado.metodo_Fabrica.producto_Concreto.DadoMovimiento;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

  private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private static PrintStream out = System.out;
  private static String gameName;

  public static void main(String[] args) {
//    String opcion = null;
//    do {
//      try {
//        generarJuego();
//        out.println("Desea jugar de nuevo?[Y/n]");
//        opcion = in.readLine();
//      } catch (IOException e) {
//        out.println("No se pudo leer.");
//        e.printStackTrace();
//      }
//    }while(opcion.toLowerCase().charAt(0) == 'y');

    dado();
  }
//
//  private static void generarJuego(){
//    out.println("Ingrese el nombre del nuevo juego:\n>>>");
//    try {
//      gameName = in.readLine();
//      Tablero.getTablero(gameName);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
//  }


  private static void dado() {
    /**
     * El dado está constituido por Fábrica abstracta, Singleton y Decorador
     * Solo se crea una instancia del dado movimiento y a su vez, este lo crea
     * una fábrica.
     *
     * El dado de ataque es un decorador, ya que utiliza cierta funcionalidad del
     * dado de movimiento y lo único que cambia son sus acciones, asi que,
     * dado ataque se monta sobre el de movimiento.
     */
    Dado dado = DadoMovimiento.getDadoMovimiento(); //Fábrica

    System.out.println(dado.getAccion());

    dado = DadoMovimiento.getDadoMovimiento(); //Singleton

    System.out.println(dado.getAccion());

    dado = new DadoAtaque(dado); //Decorador

    System.out.println(dado.getAccion());
  }
}

package ui;

import bl.Tablero;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

  private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
  private static PrintStream out = System.out;
  private static String gameName;

  public static void main(String[] args) {
    String opcion = null;
    do {
      try {
        generarJuego();
        out.println("Desea jugar de nuevo?[Y/n]");
        opcion = in.readLine();
      } catch (IOException e) {
        out.println("No se pudo leer.");
        e.printStackTrace();
      }
    }while(opcion.toLowerCase().charAt(0) == 'y');
  }

  private static void generarJuego(){
    out.println("Ingrese el nombre del nuevo juego:\n>>>");
    try {
      gameName = in.readLine();
      Tablero.getTablero(gameName);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}

package ui;

import bl.Tablero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {
    private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    private static PrintStream out = System.out;

    public static void main(String[] args){
        String opcion = null;
        do {
            out.println("Seleccione el nombre del nuevo juego.");
            try {
                String newGame = in.readLine();
                Tablero t1 = Tablero.getTablero(newGame);
                out.println("El nombre del tablero es: " + t1.getGameName() +
                        "\nDesea hacerlo de nuevo?[Y/n]");
                opcion = in.readLine();
            } catch (IOException e) {
                out.println("No se pudo leer.");
                e.printStackTrace();
            }
        }while(opcion.toLowerCase().charAt(0) == 'y');
    }
}

package bl;

public class Tablero {
    private String gameName;
    private static Tablero unicoTablero=null;

    public static Tablero getTablero(String gameName) {
        if (unicoTablero == null) {
            unicoTablero = new Tablero(gameName);
        }
        return unicoTablero;
    }

    private Tablero(String pGameName) {
        setGameName(pGameName);
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String pGameName) {
        this.gameName = pGameName;
    }
}

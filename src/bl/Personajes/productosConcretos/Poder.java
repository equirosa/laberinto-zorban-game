package bl.Personajes.productosConcretos;

public class Poder {
    private String nombre = "";
    private String efecto = "";

    //Constructores

    public Poder() {
    }

    public Poder(String nombre, String efecto) {
        this.nombre = nombre;
        this.efecto = efecto;
    }

    public Poder(String nombre) {
        this.nombre = nombre;
        String efecto = obtenerEfecto(nombre);
        if(!efecto.isEmpty()){
            this.efecto = efecto;
        }
    }

    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEfecto() {
        return efecto;
    }

    public void setEfecto(String efecto) {
        this.efecto = efecto;
    }

    //toString

    @Override
    public String toString() {
        return "Poder{" +
                "nombre='" + nombre + '\'' +
                ", efecto='" + efecto + '\'' +
                '}';
    }

    //Metodos propios

    /**
     * Retorna el efecto dependiendo del poder.
     * @param elemento
     * @return efecto (si no se encuentra el poder, retorna un mensaje indicando que no lo encontró
     */
    private String obtenerEfecto(String elemento){
        String efecto = "";
        switch (elemento){
            case "Fuego":
                efecto = "Le otorga cinco puntos extra a un personaje de la triada por dos turnos.";
                break;
            case "Agua":
                efecto = "Habilita el dado de ataque para un tiro extra.";
                break;
            case "Planta":
                efecto = "Por dos turnos no deja que un jugador saque más de tres en su dado de movimientos.";
                break;
            case "Electrico":
                efecto = "Causa una parálisis que puede evitar que un jugador tire el dado de movimiento," +
                        " este efecto dura tres turnos.";
                break;
            case "Roca":
                efecto = "Crea un stone en una casilla donde se encuentra un contricante, este stone (60 de vida)"
                        + " se crea con las desventaja de la triada de dicho jugador.";
                break;
            case "Hielo":
                efecto = "Congela a un jugador por un turno.";
                break;
        }
        return efecto;
    }
}

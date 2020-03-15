package bl.Personajes.productosConcretos;

public class Elemento {

    private String nombre, descripcion;
    private Poder poder;

    //Constructores

    public Elemento() {
    }

    public Elemento(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Elemento(String nombre) {
        this.nombre = nombre;
        String descripcion = obtenerDescripcion(nombre);
        if(!descripcion.isEmpty()){
            this.descripcion = descripcion;
        }
        this.poder = new Poder(nombre);
    }

    //Getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //toString

    @Override
    public String toString() {
        return "Elemento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", poder=" + poder +
                '}';
    }

    //Metodos propios

    /**
     * Retorna la descripción del elemento.
     * @param nombre
     * @return descripcion
     */
    private String obtenerDescripcion(String nombre){
        String descripcion = "";
        switch (nombre){
            case "Fuego":
                descripcion = "Le otorga cinco puntos extra a un personaje de la triada por dos turnos.";
                break;
            case "Agua":
                descripcion = "Habilita el dado de ataque para un tiro extra.";
                break;
            case "Planta":
                descripcion = "Por dos turnos no deja que un jugador saque más de tres en su dado de movimientos.";
                break;
            case "Electrico":
                descripcion = "Causa una parálisis que puede evitar que un jugador tire el dado de movimiento," +
                        " este efecto dura tres turnos.";
                break;
            case "Roca":
                descripcion = "Crea un stone en una casilla donde se encuentra un contricante, este stone (60 de vida)"
                        + " se crea con las desventaja de la triada de dicho jugador.";
                break;
            case "Hielo":
                descripcion = "Congela a un jugador por un turno.";
                break;
        }
        return descripcion;
    }
}

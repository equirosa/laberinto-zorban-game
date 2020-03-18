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
                descripcion = "El usuario de este elemento es tipo fuego";
                break;
            case "Agua":
                descripcion = "El usuario de este elemento es tipo agua";
                break;
            case "Planta":
                descripcion = "El usuario de este elemento es tipo planta";
                break;
            case "Electrico":
                descripcion = "El usuario de este elemento es tipo eléctrico";
                break;
            case "Roca":
                descripcion = "El usuario de este elemento es tipo roca";
                break;
            case "Hielo":
                descripcion = "El usuario de este elemento es tipo hielo";
                break;
        }
        return descripcion;
    }
}

package bl;
import bl.productosConcretos.Poder;

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
}

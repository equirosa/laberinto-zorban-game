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
                efecto = "El usuario de este elemento es tipo fuego";
                break;
            case "Agua":
                efecto = "El usuario de este elemento es tipo agua";
                break;
            case "Planta":
                efecto = "El usuario de este elemento es tipo planta";
                break;
            case "Electrico":
                efecto = "El usuario de este elemento es tipo eléctrico";
                break;
            case "Roca":
                efecto = "El usuario de este elemento es tipo roca";
                break;
            case "Hielo":
                efecto = "El usuario de este elemento es tipo hielo";
                break;
        }
        return efecto;
    }
}

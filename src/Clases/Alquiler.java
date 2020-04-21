package Clases;

public class Alquiler {
    private String fechaDeRetiro;
    private String fechaDeDevolucion;
    private Peliculas pelicula;

    public Alquiler() {
    }

    public Alquiler(String fechaDeDevolucion, String fechaDeRetiro, Peliculas pelicula) {
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.fechaDeRetiro = fechaDeRetiro;
        this.pelicula = pelicula;
    }

    public void setFechaDeDevolucion(String fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public void setFechaDeRetiro(String fechaDeRetiro) {
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public String getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public String getFechaDeRetiro() {
        return fechaDeRetiro;
    }
}

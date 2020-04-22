package Clases;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaDeRetiro;
    private LocalDate fechaDeDevolucion;
    private Peliculas pelicula;
    private  Cliente cliente;
    public Alquiler() {
    }

    public Alquiler(LocalDate fechaDeDevolucion, LocalDate fechaDeRetiro, Peliculas pelicula,Cliente cliente) {
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.fechaDeRetiro = fechaDeRetiro;
        this.pelicula = pelicula;
    }



    public void setFechaDeDevolucion(LocalDate fechaDeDevolucion) {
        this.fechaDeDevolucion = fechaDeDevolucion;
    }

    public void setFechaDeRetiro(LocalDate fechaDeRetiro) {
        this.fechaDeRetiro = fechaDeRetiro;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    public Peliculas getPelicula() {
        return pelicula;
    }

    public LocalDate getFechaDeDevolucion() {
        return fechaDeDevolucion;
    }

    public LocalDate getFechaDeRetiro() {
        return fechaDeRetiro;
    }
}

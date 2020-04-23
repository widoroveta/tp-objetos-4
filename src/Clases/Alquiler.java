package Clases;

import java.time.LocalDate;

public class Alquiler {
    private LocalDate fechaDeRetiro;
    private LocalDate fechaDeDevolucion;
    private Peliculas pelicula;
    private  Cliente cliente;
    private String devolucion;
    private static int idA;
    private int id;
    public Alquiler() {
    }

    public Alquiler( LocalDate fechaDeRetiro,LocalDate fechaDeDevolucion, Peliculas pelicula,Cliente cliente) {
        this.fechaDeDevolucion = fechaDeDevolucion;
        this.fechaDeRetiro = fechaDeRetiro;
        this.pelicula = pelicula;
       if (fechaDeDevolucion.compareTo(LocalDate.now())>0)
        this.devolucion = "No devuelta";
       else
           this.devolucion="devuelta";
        this.id=idA;
        idA++;
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

    @Override
    public String toString() {
        return "Alquiler{" +
                "fechaDeRetiro=" + fechaDeRetiro +
                ", fechaDeDevolucion=" + fechaDeDevolucion +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", devolucion='" + devolucion + '\'' +
                ", id=" + id +
                '}';
    }
}

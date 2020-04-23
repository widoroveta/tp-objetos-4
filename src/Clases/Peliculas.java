package Clases;

import java.time.LocalDate;
import java.util.List;

public class Peliculas {
    private String titulo;
    private LocalDate fechaDeEstreno;
    private String genero;
    private int duracion;
    private String paisOrigen;
    private String descripcion;
    private String ca;
    private  int cantidad;
    public Peliculas() {

    }

    public Peliculas(String titulo,int cantidad, LocalDate fechaDeEstreno,String genero, int duracion, String paisOrigen, String descripcion, String ca) {
        this.ca = ca;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero=genero;
        this.fechaDeEstreno = fechaDeEstreno;
        this.paisOrigen = paisOrigen;
        this.titulo = titulo;
        this.cantidad=cantidad;

    }

    public LocalDate getFechaDeEstreno() {
        return fechaDeEstreno;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {

        return duracion;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public String getCa() {
        return ca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setFechaDeEstreno(LocalDate fechaDeEstreno) {
        this.fechaDeEstreno = fechaDeEstreno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGenero() {
        return genero;
    }
    public static boolean Alquilar (Peliculas p) {
        boolean v=false;
        if (p.cantidad>0)
        {
        v=true;
        }

        return v;
    }
    public void setCantidad(int cantidad)
    {
        this.cantidad=cantidad;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    @Override
    public String toString() {
        return "Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeEstreno='" + fechaDeEstreno + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ca='" + ca + '\'' +
                '}';
    }
}

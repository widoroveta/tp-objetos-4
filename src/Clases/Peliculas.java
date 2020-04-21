package Clases;

import java.util.List;

public class Peliculas {
    private String titulo;
    private String fechaDeEstreno;
    private String genero;
    private int duracion;
    private String paisOrigen;
    private String descripcion;
    private String ca;
    private  int cantidad;
    public Peliculas() {

    }

    public Peliculas(String titulo, String fechaDeEstreno,String genero, int duracion, String paisOrigen, String descripcion, String ca) {
        this.ca = ca;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.genero=genero;
        this.fechaDeEstreno = fechaDeEstreno;
        this.paisOrigen = paisOrigen;
        this.titulo = titulo;


    }

    public String getFechaDeEstreno() {
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

    public void setFechaDeEstreno(String fechaDeEstreno) {
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
    public boolean Alquilar (String titulo)
    {
        boolean v = false;
        if (this.titulo.equalsIgnoreCase(titulo))
        {
            if (this.cantidad>0)
            {
                v=true;
            }
      /*      else {
                v=false;
            }*/
        }
       /* else {
            v=false;*/

        return v;
    }
    public void setCantidad(List<Peliculas> peliculasList,String titulo) {
      int i=0;
        for (Peliculas p:peliculasList) {
            if (p.titulo.equalsIgnoreCase(titulo))
            {
              ++i;
            }

        }
        this.cantidad=i;

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

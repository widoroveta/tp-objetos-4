package Clases;

public class Peliculas {
    private String titulo;
    private String fechaDeEstreno;
    private int duracion;
    private String paisOrigen;
    private String descripcion;
    private String ca;

    public Peliculas() {

    }

    public Peliculas(String titulo, String fechaDeEstreno, int duracion, String paisOrigen, String descripcion, String ca) {
        this.ca = ca;
        this.descripcion = descripcion;
        this.duracion = duracion;
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

    @Override
    public String toString() {
        return "\n Peliculas{" +
                "titulo='" + titulo + '\'' +
                ", fechaDeEstreno='" + fechaDeEstreno + '\'' +
                ", duracion=" + duracion +
                ", paisOrigen='" + paisOrigen + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", ca='" + ca + '\'' +
                '}';
    }
}

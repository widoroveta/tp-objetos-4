package Clases;

import java.util.List;

public class VideoStore {

    private List<Peliculas> peliculas;
    private List<Cliente> clientes;
    private List<Alquiler> alquilers;
    public VideoStore(){ }

    public void setPeliculas(List<Peliculas> peliculas) {
        this.peliculas = peliculas;
    }

    public void setAlquilers(List<Alquiler> alquilers) {
        this.alquilers = alquilers;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Peliculas> getPeliculas() {
        return peliculas;
    }

    public List<Alquiler> getAlquilers() {
        return alquilers;
    }
}

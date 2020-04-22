package Clases;

import java.util.List;

public class Cliente {
    private String nombre;
    private String direccion;
    private int telefono;
    private List<Alquiler> alquilerList;
    public Cliente(){

    }
    public Cliente(String nombre,String direccion,int telefono){
            this.nombre=nombre;
            this.direccion=direccion;
            this.telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }
}

import Clases.Cliente;
import Clases.Peliculas;
import Clases.Alquiler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Peliculas> peliculas = new ArrayList<>();
        Peliculas p1 =new Peliculas("Piratas del caribe y la maldicion del perla negra", LocalDate.of(2003,7,17).toString(),"Accion",143,"US","El capitán Barbossa le roba el barco al pirata Jack Sparrow y secuestra a Elizabeth, amiga de Will Turner. Barbossa y su tripulación son víctimas de un conjuro que los condena a vivir eternamente y a transformarse cada noche en esqueletos vivientes.","PG");
        Peliculas p2=new Peliculas("Shrek",LocalDate.of(2001,7,19).toString(),"Aventura",95,"US","Un ogro llamado Shrek vive en su pantano, pero su preciada soledad se ve súbitamente interrumpida por la invasión de los ruidosos personajes de los cuentos de hadas. Todos fueron expulsados de sus reinos por el malvado Lord Farquaad. Decidido a salvar su hogar, Shrek hace un trato con Farquaad y se prepara para rescatar a la princesa Fiona, quien será la esposa de Farquaad.","G");
        Peliculas p3 = new Peliculas ("White Chicks",LocalDate.of(2004,07,23).toString(),"Comedia",115,"US","Dos torpes agentes del FBI se hacen pasar por dos chicas de la alta sociedad para investigar una serie de secuestros. No obstante, mientras preparan su plan, descubren que irrumpir en la clase privilegiada es mucho más duro de lo que creían.","PG-13");

        peliculas.add(p1);
        peliculas.add(p1);
        peliculas.add(p1);
        peliculas.add(p1);
        peliculas.add(p1);
        peliculas.add(p2);
        peliculas.add(p2);
        peliculas.add(p2);
        peliculas.add(p2);
        peliculas.add(p2);
        peliculas.add(p3);
        peliculas.add(p3);
        peliculas.add(p3);
        peliculas.add(p3);
        peliculas.add(p3);
        peliculas.add(p3);



        for (Peliculas p:peliculas)
            System.out.println(p.getTitulo() + p.getId());
    }
}

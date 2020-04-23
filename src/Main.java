import Clases.Cliente;
import Clases.Peliculas;
import Clases.Alquiler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Clases.Peliculas.Alquilar;

public class Main {
public  static Scanner scan;
    public static void main(String[] args) {



        List<Peliculas> peliculas = new ArrayList<>();
        peliculas.add(new Peliculas("Piratas del caribe y la maldicion del perla negra", 1, LocalDate.of(2003, 7, 17), "Accion", 143, "US", "El capitán Barbossa le roba el barco al pirata Jack Sparrow y secuestra a Elizabeth, amiga de Will Turner. Barbossa y su tripulación son víctimas de un conjuro que los condena a vivir eternamente y a transformarse cada noche en esqueletos vivientes.", "PG"));
        peliculas.add( new Peliculas("Shrek", 0, LocalDate.of(2001, 7, 19), "Aventura", 95, "US", "Un ogro llamado Shrek vive en su pantano, pero su preciada soledad se ve súbitamente interrumpida por la invasión de los ruidosos personajes de los cuentos de hadas. Todos fueron expulsados de sus reinos por el malvado Lord Farquaad. Decidido a salvar su hogar, Shrek hace un trato con Farquaad y se prepara para rescatar a la princesa Fiona, quien será la esposa de Farquaad.", "G"));
        peliculas.add( new Peliculas("White Chicks", 5, LocalDate.of(2004, 07, 23), "Comedia", 115, "US", "Dos torpes agentes del FBI se hacen pasar por dos chicas de la alta sociedad para investigar una serie de secuestros. No obstante, mientras preparan su plan, descubren que irrumpir en la clase privilegiada es mucho más duro de lo que creían.", "PG-13"));
        peliculas.add(new Peliculas("Parasitos",30,LocalDate.of(2019,5,30),"Drama",132,"KR","Tanto Gi Taek como su familia están sin trabajo. Cuando su hijo mayor, Gi Woo, empieza a impartir clases particulares en la adinerada casa de los Park, las dos familias, que tienen mucho en común pese a pertenecer a dos mundos totalmente distintos, entablan una relación de resultados imprevisibles.","R"));
        peliculas.add(new Peliculas("El hoyo",25,LocalDate.of(2020,02,21),"Horror",94,"ES","En el futuro, los prisioneros se alojan en celdas verticales, observando cómo los presos de las celdas superiores son alimentados mientras los de abajo mueren de hambre. Una jungla de supervivencia donde solo hay tres tipos de personas: los que están arriba, los que están abajo y los que deciden saltar, incapaces de soportar esa agonía por más tiempo.","UNRATED"));

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(     new Cliente("Carlos","Catamarca 1888",4758855));
        clientes.add(  new Cliente("Ricardo","Republica del libano 1500",4858425));
        clientes.add(     new Cliente("Lionel","Alsina 2445",1556854452));
        clientes.add(     new Cliente("Maria","12 de octubre 6800 ",1532212254));
        List<Alquiler> alquilers =new ArrayList<>();
        alquilers.add(new Alquiler(LocalDate.of(2020,3,20),LocalDate.of(2020,4,20), peliculas.get(2), clientes.get(0)));
        alquilers.add(new Alquiler(LocalDate.of(2020,2,1),LocalDate.of(2020,3,1), peliculas.get(0), clientes.get(0)));
        alquilers.add(new Alquiler(LocalDate.of(2020,4,21),LocalDate.of(2020,5,21), peliculas.get(3), clientes.get(1)));
        System.out.println(alquilers.toString());


        }
    }


import Clases.Cliente;
import Clases.Peliculas;
import Clases.Alquiler;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List <Peliculas> peliculas = new ArrayList<>();
        Peliculas p1 =new Peliculas("Piratas del caribe", LocalDate.of(2003,10,21).toString(),90,"US","alta peli","G");
        peliculas.add(p1);

    }
}

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static java.util.Arrays.asList;

public class Tarea4 {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(new Producto("Television", 20),
                new Producto("Monitor", 40), new Producto("Teclado", 40));


        double resultado = productos.stream().map(p -> p.getPrecio())
                .reduce((Double::sum)).orElse(0.0);

        System.out.println(resultado);
    }
}

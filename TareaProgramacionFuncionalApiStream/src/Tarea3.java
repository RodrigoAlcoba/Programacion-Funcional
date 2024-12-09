import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tarea3 {
    public static void main(String[] args) {



        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "phyton", "groovy"},
                {"java" ,"javascript", "kotlin"}, {"javascript"}, {}};

        List<String> resultado = Arrays.stream(lenguajes)
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());

        System.out.println(resultado);

    }
}

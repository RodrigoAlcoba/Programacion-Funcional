import java.util.Arrays;
import java.util.function.Function;

public class Tarea2 {

    public static void main(String[] args) {

        Integer[] enteros = {1, 2, 3,4,5,6,7,8,9,10};


        Function<Integer[],Integer> getMayor = arr -> Arrays.stream(arr).reduce(0, (a,b) -> a > b ? a : b);

        int resultado = getMayor.apply(enteros);
        System.out.println(resultado);


    }
}

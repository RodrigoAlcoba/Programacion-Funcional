import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        int[] del1al100 = new int[100];
        for (int i = 0; i < del1al100.length; i++) {
            del1al100[i] = i+1;
        }


        double resultado = Arrays.stream(del1al100)
                .filter(n -> n % 10 != 0)
                .mapToDouble(n -> n / 2.0)
                .reduce(0, Double::sum);

        System.out.println(resultado);

    }
}
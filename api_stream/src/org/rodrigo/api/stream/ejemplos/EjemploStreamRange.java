package org.rodrigo.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) throws Exception {


        IntStream numeros = IntStream.range(5, 20).peek(System.out::println);
       //int resultado = numeros.sum();
        //int resultado = numeros.reduce(0,  Integer::sum/*(a, b) -> a +b*/);
        IntSummaryStatistics stats = numeros.summaryStatistics();
        System.out.println("maximo: " + stats.getMax());
        System.out.println("minimo: " + stats.getMin());
        System.out.println("suma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("total: " + stats.getCount());






    }
}

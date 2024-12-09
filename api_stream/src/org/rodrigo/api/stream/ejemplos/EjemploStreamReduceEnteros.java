package org.rodrigo.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {
    public static void main(String[] args) throws Exception {


        Stream<Integer> numeros = Stream.of(5, 10, 15, 20);
       int resultado = numeros.reduce(0,  Integer::sum/*(a, b) -> a +b*/);
        System.out.println(resultado);






    }
}

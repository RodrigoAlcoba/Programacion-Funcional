package org.rodrigo.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) throws Exception {


        Stream<String> nombres = Stream
                .of("Paco Gutierrez", "Paco Gutierrez", "Paco Gutierrez", "Pepe Castro", "Pepe Garcia")
                .distinct();
       String resultado = nombres.reduce("resultado concatenacion ", (a, b) -> a +", " + b);
        System.out.println(resultado);






    }
}

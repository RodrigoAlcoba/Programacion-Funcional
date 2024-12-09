package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) throws Exception {


        Stream<String> nombres = Stream
                .of("Paco Gutierrez", "Paco Gutierrez", "Paco Gutierrez", "Pepe Castro", "Pepe Garcia")
                .distinct();
        nombres.forEach(System.out::println);




    }
}

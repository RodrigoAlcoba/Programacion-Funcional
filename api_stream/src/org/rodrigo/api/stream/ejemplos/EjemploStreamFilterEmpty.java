package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) throws Exception {


       long count = Stream
                .of("Pato Guzman", "Paco Gutierrez", "Pepa Alcoba", "", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println(count);


    }
}

package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {


        long count = Stream
                .of("Pato Guzman", "Paco Gutierrez", "Pepa Alcoba", "Pepe Castro", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .count();


        System.out.println(count);

    }
}

package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {


        boolean existe = Stream
                .of("Pato Guzman", "Paco Gutierrez", "Pepa Alcoba", "Pepe Castro", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(4))
                .anyMatch(u -> u.getId().equals(1));


        System.out.println(existe);

    }
}

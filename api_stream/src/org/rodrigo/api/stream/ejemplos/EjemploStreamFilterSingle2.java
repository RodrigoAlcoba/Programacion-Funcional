package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {


        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gutierrez", "Pepa Alcoba", "Pepe Castro", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getId().equals(4))
                .findFirst().orElseGet( () -> new Usuario("Rodriguito", "alcoba"));
        


        System.out.println(usuario);

    }
}

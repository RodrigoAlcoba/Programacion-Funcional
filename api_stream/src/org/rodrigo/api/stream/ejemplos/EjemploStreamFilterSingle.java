package org.rodrigo.api.stream.ejemplos;

import org.rodrigo.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) throws Exception {


        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gutierrez", "Pepa Alcoba", "Pepe Castro", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);


        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.orElse(new Usuario("Usuario", "Alternativo")));
        //System.out.println(usuario.orElseGet( () -> new Usuario("Usuario", "Alternativo")));
        if (usuario.isPresent()){
            System.out.println(usuario.get());
        }else {
            throw new Exception("Usuario no encontrado");
        }


    }
}

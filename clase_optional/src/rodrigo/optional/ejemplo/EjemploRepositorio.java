package rodrigo.optional.ejemplo;

import rodrigo.optional.ejemplo.models.Computador;
import rodrigo.optional.ejemplo.repositorio.ComputadorRepositorio;
import rodrigo.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Optional pc = repositorio.filtrar("asus rog");

        repositorio.filtrar("asus rog").ifPresentOrElse(System.out::println, ()->
                System.out.println("no se encontro valor con es nombre"));

        pc.ifPresent(System.out::println);

    }
}

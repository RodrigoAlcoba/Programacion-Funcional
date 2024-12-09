package rodrigo.optional.ejemplo;

import rodrigo.optional.ejemplo.models.Computador;
import rodrigo.optional.ejemplo.repositorio.ComputadorRepositorio;
import rodrigo.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus rog").orElse(
                new Computador("hp Omen", "LA0001"));
        System.out.println(pc);

        pc = repositorio.filtrar("macbook ").orElseGet( ()-> new Computador("hp Omen", "LA0001"));


        System.out.println(pc);


    }
}

package rodrigo.optional.ejemplo;

import rodrigo.optional.ejemplo.models.Computador;
import rodrigo.optional.ejemplo.repositorio.ComputadorRepositorio;
import rodrigo.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) throws Exception {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus rog").orElseThrow(IllegalStateException::new);

        System.out.println(pc);

        String archivo = "documento.pdf";
        
        String extension = Optional.ofNullable(archivo).
                filter(a -> a.contains("."))
                .map(a -> a.substring(archivo.lastIndexOf(".")+1)).
                orElseThrow();

        System.out.println(extension);



    }
}

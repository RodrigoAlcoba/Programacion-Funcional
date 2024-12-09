package rodrigo.optional.ejemplo;

import rodrigo.optional.ejemplo.models.Computador;
import rodrigo.optional.ejemplo.models.Fabricante;
import rodrigo.optional.ejemplo.models.Procesador;
import rodrigo.optional.ejemplo.repositorio.ComputadorRepositorio;
import rodrigo.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus rog")
                .map(Computador::getProcesador)
                .map(Procesador::getFabricante)
                .map(Fabricante::getNombre)
                        .orElseGet(() -> "desconocido");

        System.out.println(f);



    }
}

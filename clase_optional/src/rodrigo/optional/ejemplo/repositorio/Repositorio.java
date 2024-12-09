package rodrigo.optional.ejemplo.repositorio;

import rodrigo.optional.ejemplo.models.Computador;

import java.util.Optional;

public interface Repositorio <T>{

    Optional<Computador> filtrar(String nombre);
}

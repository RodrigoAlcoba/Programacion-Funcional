package rodrigo.optional.ejemplo;

import java.util.Optional;

public class EjemploOptional {

    public static void main(String[] args) {

        String nombre = "Andrés";

        Optional<String> opt = Optional.of(nombre);
        System.out.println(opt);
        System.out.println(opt.isPresent());

        if (opt.isPresent()) {
            System.out.println("El nombre es: " + opt.get());
        }
        System.out.println(opt.isEmpty());

        opt.ifPresent(valor -> System.out.println("El nombre es: " + valor));

        nombre = null;

        opt = Optional.ofNullable(nombre);
        System.out.println("opt = "+ opt);
        System.out.println(opt.isPresent());
        System.out.println(opt.isEmpty());

        opt.ifPresentOrElse(valor -> System.out.println("El nombre es: " + valor),
                () -> System.out.println("No tiene valor"));

    }
}

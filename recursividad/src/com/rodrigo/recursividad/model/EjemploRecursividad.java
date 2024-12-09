package com.rodrigo.recursividad.model;

import java.util.stream.Stream;

public class EjemploRecursividad {
    public static void main(String[] args) {
        Componente pc = new Componente("Gabinete Pc Atx");
        Componente poder = new Componente("Fuente poder 700w");
        Componente placaMadre = new Componente("MainBorad Asus sockets AMD");
        Componente cpu = new Componente("Cpu AMD Ryzen 5 2800");
        Componente ventilador = new Componente("Ventilador Cpu");
        Componente disipador = new Componente("Disipador");
        Componente tv = new Componente("Nvidia RTX 3080 8gb");
        Componente gpu = new Componente("Nvidia GPU RTX");
        Componente gpuRam = new Componente("4GB Ram");
        Componente gpuRam2 = new Componente("4GB Ram");
        Componente gpuVentiladores = new Componente("Ventiladores");
        Componente ram = new Componente("Memoria Ram 32GB");
        Componente ssd = new Componente("Disipador");

        cpu.addComponente(disipador)
                .addComponente(ventilador);

        tv.addComponente(gpu)
                .addComponente(gpuRam2)
                .addComponente(gpuRam2)
                .addComponente(gpuVentiladores);

        placaMadre.addComponente(cpu)
                .addComponente(tv)
                .addComponente(ram)
                .addComponente(ssd);

        pc.addComponente(placaMadre)
                .addComponente(poder)
                .addComponente(new Componente("Teclado"))
                .addComponente(new Componente("Mouse"));

        metodoRecursivoJava8(pc, 0).forEach(c -> System.out.println("\t".repeat(c.getNivel())+ c.getNombre()));

    }

    public static void metodoRecursivo(Componente c, int nivel){
        System.out.println("\t".repeat(nivel) + c.getNombre());

        if (c.hasComponentes()){
            for (Componente hijo : c.getComponentes()){
                metodoRecursivo(hijo, nivel+1);
            }
        }
    }

    public static Stream<Componente> metodoRecursivoJava8(Componente c, int nivel){
        c.setNivel(nivel);

        return Stream.concat(Stream.of(c),
        c.getComponentes()
                .stream()
                .flatMap(h -> metodoRecursivoJava8( h, nivel +1)));
    }
}

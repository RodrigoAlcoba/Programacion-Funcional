package com.rodrigo.recursividad.model;

import java.util.ArrayList;
import java.util.List;

public class Componente {
    private String nombre;
    private List<Componente> componentes;
    private int nivel;

    public Componente(String nombre) {
        componentes = new ArrayList<>();
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public List<Componente> getComponentes() {
        return componentes;
    }
    public void setComponentes(List<Componente> componentes) {
        this.componentes = componentes;
    }

    public Componente addComponente(Componente componente) {
        this.componentes.add(componente);
        return this;
    }

    public boolean hasComponentes(){
        return !this.componentes.isEmpty();
    }
}

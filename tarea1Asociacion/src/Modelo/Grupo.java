/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.*;

/**
 *
 * @author japak
 */
public class Grupo 
{
    private long id;
    private String nombre;
    private List<Aula> aulas;
    private List<Asignatura> asignaturas;
    
    public Grupo()
    {
        
    }
    public Grupo(long id, String nombre, List<Aula> aulas, List<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.aulas = aulas;
        this.asignaturas = asignaturas;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(List<Aula> aulas) {
        this.aulas = aulas;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(List<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", aulas=" + aulas + ", asignaturas=" + asignaturas + '}';
    }

    
    
}

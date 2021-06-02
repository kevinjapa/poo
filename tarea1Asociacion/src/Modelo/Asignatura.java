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
public class Asignatura 
{
    private long id;
    private String nombre;
    private List<Grupo> grupos;
    public Asignatura()
    {
        
    }
    
    public Asignatura(long id, String nombre, List<Grupo> grupos) {
        this.id = id;
        this.nombre = nombre;
        this.grupos = grupos;
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

    public List<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(List<Grupo> grupos) {
        this.grupos = grupos;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", nombre=" + nombre + ", grupos=" + grupos + '}';
    }
    
    
}

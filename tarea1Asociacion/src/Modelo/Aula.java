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
public class Aula 
{
    private long id;
    private String descripcion;
    private List<Grupo> grupo;
    public Aula()
    {
    
    }
    public Aula(long id, String descripcion, List<Grupo> grupo) {
        this.id = id;
        this.descripcion = descripcion;
        this.grupo = grupo;
    }

    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Grupo> getGrupo() {
        return grupo;
    }

    public void setGrupo(List<Grupo> grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "{" + "id=" + id + ", descripcion=" + descripcion + ", grupo=" + grupo + '}';
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author japak
 */
public class Proyecto 
{
    private int codigo;
    private String nombre;
    private Jefe jefe;
    private List<Plano> plano;
    //private Plano plano;
    public Proyecto()
    {
        
    }

    public Proyecto(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Proyecto(int codigo, String nombre, Jefe jefe, List<Plano> plano) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.jefe = jefe;
        this.plano = plano;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public List<Plano> getPlano() {
        return plano;
    }

    public void setPlano(List<Plano> plano) {
        this.plano = plano;
    }
/*
    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    
    */
    @Override
    public String toString() {
        return "{" + "codigo=" + codigo + ", nombre=" + nombre + ", jefe=" + jefe + ", plano=" + plano + '}';
    }
    
    
    
}

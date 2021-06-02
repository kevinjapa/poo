/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japak
 */
public class Empresa 
{
    private long id;
    private String nombre;
    private List<Cliente> listadoCliente;
    private List<Empleado> listadoEmpleado;

    public Empresa(long id, String nombre, List<Cliente> listadoCliente, List<Empleado> listadoEmpleado) {
        this.id = id;
        this.nombre = nombre;
        this.listadoCliente = listadoCliente;
        this.listadoEmpleado = listadoEmpleado;
    }

    public Empresa(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        listadoCliente =new ArrayList();
        listadoEmpleado =new ArrayList();
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

    public List<Cliente> getListadoCliente() {
        return listadoCliente;
    }

    public void setListadoCliente(List<Cliente> listadoCliente) {
        this.listadoCliente = listadoCliente;
    }

    public List<Empleado> getListadoEmpleado() {
        return listadoEmpleado;
    }

    public void setListadoEmpleado(List<Empleado> listadoEmpleado) {
        this.listadoEmpleado = listadoEmpleado;
    }

    @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", nombre=" + nombre + '}';
    }
    
    
}
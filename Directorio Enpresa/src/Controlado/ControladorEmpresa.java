/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlado;

import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Empresa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japak
 */
public class ControladorEmpresa {
    private List<Empresa> listaEmpresa;
    private Empresa seleccionado;
    
    public ControladorEmpresa()
    {
        listaEmpresa=new ArrayList();
        seleccionado=null;
    }
    public long generarId()
    {
        //operadores ternarios: es realizar un if/else en una sola linea
        return (listaEmpresa.size()>0)? listaEmpresa.get(listaEmpresa.size()-1).getId()+1:1;
    }
    public boolean crear(String nombre)
    {
        return listaEmpresa.add(new Empresa(generarId(),nombre));
    }
    public Empresa buscar(String nombre)
    {
        for(Empresa empresa: listaEmpresa)
        {
            if(empresa.getNombre().equals(nombre))
            {
                return empresa;
            }
        }
        return null;
    }
    public boolean actualizar(String nombreActual,String nombre)
    {
        Empresa empresa =this.buscar(nombreActual);
        if(empresa !=null)
        {
            int posicion = listaEmpresa.indexOf(empresa);
            empresa.setNombre(nombre);
            listaEmpresa.set(posicion, empresa);
            return true;
        }
        return false;
    }
    public boolean agregarEmpleado(Empleado empleado)
    {
        return getSeleccionado().getListadoEmpleado().add(empleado);
    }
    public boolean agregarCliente(Cliente cliente)
    {
        return getSeleccionado().getListadoCliente().add(cliente);
    }
    public boolean eliminar(String nombre)
    {
        Empresa empresa=this.buscar(nombre);
        if(empresa!=null)
                return listaEmpresa.remove(empresa);
        return false;   
    }

    public List<Empresa> getListaEmpresa() {
        return listaEmpresa;
    }

    public void setListaEmpresa(List<Empresa> listaEmpresa) {
        this.listaEmpresa = listaEmpresa;
    }

    public Empresa getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Empresa seleccionado) {
        this.seleccionado = seleccionado;
    }
    public void listar()
    {
        System.out.println(listaEmpresa);
    }
}

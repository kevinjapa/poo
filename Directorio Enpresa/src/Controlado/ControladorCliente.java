/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlado;

import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japak
 */
public class ControladorCliente 
{
    private List<Cliente> listaCliente;
    private Cliente seleccionado;
    
    public ControladorCliente()
    {
        listaCliente=new ArrayList();
        seleccionado=null;
    }
    
    public long generarId()
    {
        if(listaCliente.size()>0)
        {
            return listaCliente.get(listaCliente.size()-1).getId()-1;
        }
        else
        {
            return 1;
        }
    }
    public boolean crear(String nombre, String apellido, String cedula, String direccion,String telefono)
    {
        Cliente c=new Cliente(generarId(), nombre,apellido, cedula,direccion,telefono); 
                return listaCliente.add(c);
    }
    public Cliente buscar(String cedula)
    {
        for(Cliente cliente: listaCliente)
        {
            if(cliente.getCedula().equals(cedula))
            {
                return cliente;
            }
        }
        return null;
    }
    public boolean actualizar(String nombre,String nombreNuevo, String apellido, String cedula, String direccion,String telefono)
    {
        Cliente cliente =this.buscar(cedula);
        if(cliente !=null)
        {
            int posicion = listaCliente.indexOf(cliente);
            
            cliente.setNombre(nombreNuevo);
            cliente.setApellido(apellido);
            cliente.setDireccion(direccion);
            cliente.setTelefono(telefono);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
     public boolean eliminar(String cedula)
    {
        Cliente cliente=this.buscar(cedula);
        if(cliente!=null)
                return listaCliente.remove(cliente);
        return false;   
    }

    public List<Cliente> getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(List<Cliente> listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
     public void listar()
     {
         System.out.println(listaCliente);
     }
}

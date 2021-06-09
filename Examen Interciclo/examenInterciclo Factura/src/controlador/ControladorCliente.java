/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Cliente;

/**
 *
 * @author japak
 */
public class ControladorCliente 
{
    List<Cliente> listaCliente   = new ArrayList();
    Cliente seleccionado;
    
    public ControladorCliente()
    {
        
        
    }
    
     public int generarId()
    {
        return (listaCliente.size()>0)? listaCliente.get(listaCliente.size()-1).getId()+1:1;
    }
    public void crear(String nombre,String cedula, String fiabilidadPago)
    {
        
        Cliente cliente=new Cliente(generarId(),nombre,cedula,fiabilidadPago);
        listaCliente.add(cliente);
        
    }
    public Cliente buscar(String cedula)
    {
        for(Cliente cliente: listaCliente)
        {
            if(cliente.getCedula().equals(cedula))
            {
                seleccionado= cliente;
                return cliente;
            }
           
        }
         return null;
    }
    public boolean actualizar(String nombre,String cedula, String fiabilidadPago)
    {
        Cliente cliente=buscar(cedula);
        if(cliente!=null)
        {
            int posicion=listaCliente.indexOf(cliente);
            cliente.setNombre(nombre);
            cliente.setFiabilidadPago(fiabilidadPago);
            listaCliente.set(posicion, cliente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula)
    {
        Cliente cliente=buscar(cedula);
        return listaCliente.remove(cliente);
    }
    public void listar()
            
    {
        for(int i =0;i<listaCliente.size();i++)
            
        {
            
            System.out.println("Cliente "+(i+1)+":"+listaCliente.get(i));   
        }
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
    
}

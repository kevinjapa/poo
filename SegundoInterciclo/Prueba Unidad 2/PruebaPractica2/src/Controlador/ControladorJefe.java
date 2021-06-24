/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Jefe;
import modelo.Proyecto;
import vista.VistaProyecto;

/**
 *
 * @author japak
 */
public class ControladorJefe 
{
    List<Jefe> listaJefe=new ArrayList();;
    Jefe seleccionado;
    //VistaProyecto vistaProyecto=new VistaProyecto();
    
    public int generarId()
    {
        return (listaJefe.size()>0)? listaJefe.get(listaJefe.size()-1).getCodigo()+1:1;
    }
    public Jefe crear(String nombre, String direccion, int telefono)
    {
        ControladorProyecto controladorProyecto=new ControladorProyecto();
        Jefe jefe=new Jefe(generarId(),nombre,direccion,telefono);
        listaJefe.add(jefe);
        return jefe;
    }
    public Jefe buscar(String nombre)
    {
        for(Jefe jefe: listaJefe)
        {
            if(jefe.getNombre().equals(nombre))
            {
                seleccionado= jefe;
                return jefe;
            }
           
        }
         return null;
    }
    public Jefe actualizar(String nombre, String direccion, int telefono)
    {
        Jefe jefe=buscar(nombre);
        if(jefe!=null)
        {
            int posicion=listaJefe.indexOf(jefe);
            jefe.setDireccion(direccion);
            jefe.setTelefono(telefono);
            listaJefe.set(posicion, jefe);
            return jefe;
        }
        return null;
    }
    public boolean eliminar(String nombre)
    {
        Jefe jefe=buscar(nombre);
        return listaJefe.remove(nombre);
    }
    public void listar()
            
    {
        for(int i =0;i<listaJefe.size();i++)
            
        {
            
            System.out.println("Jefe "+(i+1)+":"+listaJefe.get(i));   
        }
    }

    public List<Jefe> getListaJefe() {
        return listaJefe;
    }

    public void setListaJefe(List<Jefe> listaJefe) {
        this.listaJefe = listaJefe;
    }

    public Jefe getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Jefe seleccionado) {
        this.seleccionado = seleccionado;
    }

    
    
    
    
    
    
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Dni;

/**
 *
 * @author japak
 */
public class ControladorDni 
{
    private List<Dni> listaDni;
    private Dni seleccionado;
    
    public ControladorDni()
    {
        listaDni = new ArrayList();
    }
    public long generarId()
    {
        return (listaDni.size()>0)? listaDni.get(listaDni.size()-1).getId()+1:1;
    }
    public boolean crear(String numero,int codigoVeriificacion)
    {
        return listaDni.add(new Dni(generarId(),numero,codigoVeriificacion));
    }
    public Dni buscar(String numero)
    {
        for(Dni dni: listaDni)
        {
            if(dni.getNumero().equals(numero))
            {
                seleccionado= dni;
                return dni;
            }
           
        }
         return null;
    }
    public boolean actualizar(String numero,int codigoVeriificacion)
    {
        Dni dni=buscar(numero);
        if(dni!=null)
        {
            int posicion=listaDni.indexOf(dni);
            dni.setCodigoVeriificacion(codigoVeriificacion);
            listaDni.set(posicion, dni);
            return true;
        }
        return false;
    }
    public boolean eliminar(String numero)
    {
        Dni dni=buscar(numero);
        return listaDni.remove(dni);
    }

    public List<Dni> getListaDni() {
        return listaDni;
    }
    public void listar()
    {
        System.out.println("lista"+listaDni);
    }
    public void setListaDni(List<Dni> listaDni) {
        this.listaDni = listaDni;
    }

    public Dni getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Dni seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}

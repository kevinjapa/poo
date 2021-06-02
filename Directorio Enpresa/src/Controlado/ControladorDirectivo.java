/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlado;

import Modelo.Directivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author japak
 */
public class ControladorDirectivo {
    private List<Directivo> listaDirectivo;
    private Directivo seleccionado;
    
    public ControladorDirectivo()
    {
        listaDirectivo =new ArrayList();
        seleccionado=null;
    }
    public long generarId()
    {
        if(listaDirectivo.size()>0)
        {
            return listaDirectivo.get(listaDirectivo.size()-1).getId()-1;
        }
        else
        {
            return 1;
        }
    }
    public boolean crear (String nombre, String apellido, String cedula, String direccion, String categoria, double sueldoBruto)
    {
            Directivo directivo=new Directivo(categoria,sueldoBruto,generarId(), nombre,apellido, cedula,direccion); 
                return listaDirectivo.add(directivo);
    }
    public Directivo buscar(String cedula)
    {
        for(Directivo directivo: listaDirectivo)
        {
            if(directivo.getCedula().equals(cedula))
            {
                return directivo;
            }
        }
        return null;
    }
    public boolean actualizar(String nombre, String apellido, String cedula, String direccion,String categoria, double sueldoBruto)
    {
        Directivo directivo =this.buscar(cedula);
        if(directivo !=null)
        {
            int posicion = listaDirectivo.indexOf(directivo);
            
            directivo.setNombre(nombre);
            directivo.setApellido(apellido);
            directivo.setCedula(cedula);
            directivo.setDireccion(direccion);
            directivo.setSueldoBruto(sueldoBruto);
            directivo.setCategoria(categoria);
            listaDirectivo.set(posicion,directivo);
            return true;
        }
        return false;
    }
    public boolean eliminar(String cedula)
    {
        Directivo directivo=this.buscar(cedula);
        if(directivo!=null)
                return listaDirectivo.remove(directivo);
        return false;   
    }

    public List<Directivo> getListaDirectivo() {
        return listaDirectivo;
    }

    public void setListaDirectivo(List<Directivo> listaDirectivo) {
        this.listaDirectivo = listaDirectivo;
    }

    public Directivo getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Directivo seleccionado) {
        this.seleccionado = seleccionado;
    }
    public void listar()
    {
        System.out.println(listaDirectivo);
    }
}

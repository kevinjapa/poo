/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import modelo.Palabra;

/**
 *
 * @author japak
 */
public class ControladorPalabra 
{
    List<Palabra> listaPalabra =new ArrayList();
    private Palabra seleccionado;
    
    public ControladorPalabra()
    {
       seleccionado=null;
    }
    public int generarId()
    {
        if(listaPalabra.size()>0)
        {
            return listaPalabra.get(listaPalabra.size()-1).getId()-1;
        }
        else
        {
            return 1;
        }
    }
    public void crear(String palabra)
    {
        Palabra p=new Palabra(generarId(), palabra); 
        listaPalabra.add(p);           
    }
    public Palabra buscar(String palabraO)
    {
        for(Palabra cliente: listaPalabra)
        {
            if(cliente.getPalabra1().equals(palabraO))
            {
                return cliente;
            }
        }
        return null;
    }
    public boolean actualizar(String palabraO,String palabraI)
    {
        Palabra palabra =this.buscar(palabraO);
        if(palabra !=null)
        {
            int posicion = listaPalabra.indexOf(palabra);
            palabra.setPalabraI(palabraI);
            listaPalabra.set(posicion, palabra);
            return true;
        }
        return false;
    }
    
     public boolean eliminar(String palabraO)
    {
        Palabra palabra=this.buscar(palabraO);
        if(palabra!=null)
                return listaPalabra.remove(palabra);
        return false;   
    }
     
     public String obtenerPalabra()
    {
        
        Random r = new Random();
        int valorDado = r.nextInt(8)+1;
        String val=listaPalabra.get(valorDado)+"";
        System.out.println(val);
        return val;
        
    }
     public boolean comparacion(String palabraOriginal,String palabraIngresada)
     {
         if(palabraIngresada.equals(palabraOriginal))
         {
             System.out.println("repuesta correcta");
             return true;
         }
         else
         {
             return false;
         }
             
     }
    public List<Palabra> getListaPalabra() {
        return listaPalabra;
    }

    public void setListaPalabra(List<Palabra> listaPalabra) {
        this.listaPalabra = listaPalabra;
    }

    public Palabra getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Palabra seleccionado) {
        this.seleccionado = seleccionado;
    }

    @Override
    public String toString() {
        return "ControladorPalabra{" + "listaPalabra=" + listaPalabra+ '}';
    }
     
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Figura;
import modelo.Linea;

/**
 *
 * @author japak
 */
public class ControladorLinea 
{
    List<Linea> listaLinea=new ArrayList();
    Linea seleccionado;
    
    
    public ControladorLinea()
    {
        
    }
    
    public int generarId()
    {
        return (listaLinea.size()>0)? listaLinea.get(listaLinea.size()-1).getIdentificador()+1:1;
    }
    public Linea crear(Double puntoOrigen, Double puntoFin, Double longitud)
    {
        
        Linea linea=new Linea(generarId(),puntoOrigen,puntoFin,longitud);
        listaLinea.add(linea);
        return linea;
    }
    public Linea buscar(int identificador)
    {
        for(Linea linea: listaLinea)
        {
            if(linea.getIdentificador()==identificador)
            {
                seleccionado=linea;
                return linea;
            }
           
        }
         return null;
    }
    public boolean actualizar(int identificador,Double puntoOrigen, Double puntoFin, Double longitud)
    {
        Linea linea=buscar(identificador);
        if(linea!=null)
        {
            int posicion=listaLinea.indexOf(linea);
            
            listaLinea.set(posicion, linea);
            return true;
        }
        return false;
    }
    /*public boolean eliminar(int identificador)
    {
        Linea linea=buscar(identificador);
        return listaLinea.remove((boolean)identificador);
    }*/
    public void listar()
            
    {
        for(int i =0;i<listaLinea.size();i++)
            
        {
            
            System.out.println("Linea "+(i+1)+":"+listaLinea.get(i));   
        }
    }

    
}

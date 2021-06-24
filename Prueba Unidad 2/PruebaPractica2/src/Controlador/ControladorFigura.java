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
public class ControladorFigura 
{
    List<Figura> listaFigura=new ArrayList();
    Figura seleccionado;
    ArrayList lineas;
    public ControladorFigura()
    {
     lineas=new ArrayList();   
    }
    public int generarId()
    {
        return (listaFigura.size()>0)? listaFigura.get(listaFigura.size()-1).getIdentificador()+1:1;
    }
    public Figura crear(String nombre, String color, Double area, Double perimetro, int numeroLineaPoligono, int lineasConforman,Linea linea)
    {
        lineas.add(linea);
        Figura figura=new Figura(generarId(),nombre,color,area,perimetro,numeroLineaPoligono,lineasConforman,lineas);
        listaFigura.add(figura);
        return figura;
    }
    public Figura buscar(String nombre)
    {
        for(Figura figura: listaFigura)
        {
            if(figura.getNombre().equals(nombre))
            {
                seleccionado= figura;
                return figura;
            }
           
        }
         return null;
    }
    public boolean actualizar(String nombre, String color, Double area, Double perimetro, int numeroLineaPoligono, int lineasConforman)
    {
        Figura figura=buscar(nombre);
        if(figura!=null)
        {
            int posicion=listaFigura.indexOf(figura);
            figura.setArea(area);
            figura.setColor(color);
            figura.setNumeroLineaPoligono(numeroLineaPoligono);
            figura.setLineasConforman(lineasConforman);
            figura.setPerimetro(perimetro);
            listaFigura.set(posicion, figura);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre)
    {
        Figura figura=buscar(nombre);
        return listaFigura.remove(nombre);
    }
    public void listar()
            
    {
        for(int i =0;i<listaFigura.size();i++)
            
        {
            
            System.out.println("Figura "+(i+1)+":"+listaFigura.get(i));   
        }
    }
        
    public void agreagarLinea(String nombre, Linea linea)
    {
        Figura figura=buscar(nombre);
        if(figura!=null)
        {
            lineas.add(linea);
            System.out.println("Se a agregardo.");
        }
        
    }

    public List<Figura> getListaFigura() {
        return listaFigura;
    }

    public void setListaFigura(List<Figura> listaFigura) {
        this.listaFigura = listaFigura;
    }

    public Figura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Figura seleccionado) {
        this.seleccionado = seleccionado;
    }

    public ArrayList getLineas() {
        return lineas;
    }

    public void setLineas(ArrayList lineas) {
        this.lineas = lineas;
    }
    
    
}

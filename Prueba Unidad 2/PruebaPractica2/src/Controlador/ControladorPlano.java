/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import modelo.Figura;
import modelo.Plano;

/**
 *
 * @author japak
 */
public class ControladorPlano 
{
    List<Plano> listaPlano=new ArrayList();
    Plano seleccionado;
    ArrayList listaArquitectos;
    Scanner teclado=new Scanner(System.in);
    ArrayList figuras;
    public ControladorPlano()
    {
        listaArquitectos=new ArrayList();
        figuras=new ArrayList();
    }
    
    
    public int generarId()
    {
        return (listaPlano.size()>0)? listaPlano.get(listaPlano.size()-1).getIdentificador()+1:1;
    }
    public Plano crear(Date fechaEntrega,int op,int numeroFigurasPlanoGeneral)
    {
        
        for(int i=0; i<op;i++)
        {
            System.out.print("Ingrese el arquitecto "+(i+1)+":");
            String arq=teclado.nextLine();
            listaArquitectos.add(arq);
        }
        Plano plano=new Plano(generarId(),fechaEntrega,listaArquitectos,numeroFigurasPlanoGeneral);
        listaPlano.add(plano);
        return plano;
    }
    public Plano crear(Date fechaEntrega,int op,int numeroFigurasPlanoGeneral,Figura figura)
    {
        figuras.add(figura);
        for(int i=0; i<op;i++)
        {
            System.out.print("Ingrese el arquitecto "+(i+1)+":");
            String arq=teclado.nextLine();
            listaArquitectos.add(arq);
        }
        Plano plano=new Plano(generarId(),fechaEntrega,listaArquitectos,numeroFigurasPlanoGeneral,figuras);
        listaPlano.add(plano);
        return plano;
    }
    public Plano buscar(String nombre)
    {
        for(Plano plano: listaPlano)
        {
            if(plano.getProyecto().getNombre().equals(nombre))
            {
                seleccionado=plano;
                return plano;
            }
           
        }
         return null;
    }
    public Plano actualizar(String nombre,Date fechaEntrega, int numeroFigurasPlanoGeneral)
    {
        Plano plano=buscar(nombre);
        if(plano!=null)
        {
            int posicion=listaPlano.indexOf(plano);
            plano.setFechaEntrega(fechaEntrega);
            plano.setNumeroFigurasPlanoGeneral(numeroFigurasPlanoGeneral);
            listaPlano.set(posicion, plano);
            return plano;
        }
        return null;
    }
    public boolean eliminar(String nombre)
    {
        Plano plano=buscar(nombre);
        return listaPlano.remove(nombre);
    }
    public void listar()
            
    {
        for(int i =0;i<listaPlano.size();i++)
            
        {
            
            System.out.println("Plano "+(i+1)+":"+listaPlano.get(i));   
        }
    }

    public void agregarPlanos(String nombreProyecto,Figura figura)
    {
        Plano plano=buscar(nombreProyecto);
        if(plano!=null)
        {
            figuras.add(figura);
            System.out.println("Se a agregado..");
        }
    }
}

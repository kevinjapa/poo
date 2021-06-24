/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorProyecto;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Proyecto;

/**
 *
 * @author japak
 */
public class VistaProyecto 
{

    ControladorProyecto controladorProyecto=new ControladorProyecto();
    Scanner teclado=new Scanner(System.in);
    VistaJefe vistaJefe=new VistaJefe();
    VistaPlano vistaPlano=new VistaPlano();
    public void menuJefe()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Proyecto -- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar \n6.Agregar Plano");
            System.out.print("Ingrese una opcion:");
            op=teclado.nextInt();
            if(op==1)
            {
                crear();
                
            }
            else if(op==2)
            {
                buscar();
            }
            else if(op==3)
            {
                //actualizar();
            }
            else if(op==4)
            {
                eliminar();
            }
            else if(op==5)
            {
                controladorProyecto.listar();
            }
            else if(op==6)
            {
                agregarPlano();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
       
    }
    public Proyecto crear()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        return controladorProyecto.crear(nombre,vistaJefe.crear(),vistaPlano.crear());
        
    
    }
    public Proyecto actualizar()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        return controladorProyecto.actualizar(nombre,vistaJefe.actualizar(),vistaPlano.actualizar());
    }
    public void buscar()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        controladorProyecto.buscar(nombre);
    }
    public void eliminar()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        controladorProyecto.eliminar(nombre);
    }
    public void agregarPlano()
    {
        System.out.print("Ingrese el nombre del proyecto");
        String nombre=teclado.next();   
        controladorProyecto.agregarPlanos(nombre,vistaPlano.crear());
    }
}


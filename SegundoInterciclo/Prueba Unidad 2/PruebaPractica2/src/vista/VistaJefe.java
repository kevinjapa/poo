/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorJefe;
import Controlador.ControladorProyecto;
import java.util.Scanner;
import modelo.Jefe;
import modelo.Proyecto;

/**
 *
 * @author japak
 */
public class VistaJefe 
{
    ControladorJefe controladorJefe=new ControladorJefe();
    Scanner teclado=new Scanner(System.in);
    //Proyecto proyecto=new Proyecto();
    //VistaProyecto vistaProyecto=new VistaProyecto();
    public void menuJefe()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Jefe -- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar");
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
                actualizar();
            }
            else if(op==4)
            {
                eliminar();
            }
            else if(op==5)
            {
                controladorJefe.listar();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
        
    }
    public Jefe crear()
    {
        
        System.out.print("Ingrese el nombre del jefe:");
        
        String nombre=teclado.next();
        System.out.print("Ingrese la direccion:");
        teclado.nextLine();
        String direccion=teclado.nextLine();
        System.out.print("Ingrese el telefono:");
        int telefono=teclado.nextInt();
       
        return controladorJefe.crear(nombre, direccion, telefono);
       
    }
    public void buscar()
    {
        System.out.print("Ingrese el nombre del jefe:");
        //teclado.next();
        String nombre=teclado.next();
        controladorJefe.buscar(nombre);
    }
    public Jefe actualizar()
    {
        System.out.print("Ingrese el nombre del jefe:");
        //teclado.next();  
        String nombre=teclado.next();
        System.out.print("Ingrese la direccion:");
        String direccion=teclado.next();
        System.out.print("Ingrese el telefono:");
        int telefono=teclado.nextInt();
        return controladorJefe.actualizar(nombre, direccion, telefono);  
    }
    public void eliminar()
    {
        System.out.print("Ingrese el nombre del jefe:");
        //teclado.next();
        String nombre=teclado.next();
        controladorJefe.eliminar(nombre);
    }
}

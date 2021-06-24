    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorPlano;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Plano;

/**
 *
 * @author japak
 */
public class VistaPlano 
{
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
    ControladorPlano controladorPlano=new ControladorPlano();
    Scanner teclado=new Scanner(System.in);
    VistaFigura vistaFigura=new VistaFigura();
    public void menuJefe()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Plano -- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar \n6.Agregar Figuras");
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
                controladorPlano.listar();
            }
            
        }
        
    }
    public Plano crear()
    {
        try {
            System.out.print("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fechaEntrega=teclado.next();
            
            System.out.print("ingrese el numero de figuras del plano general:");
            int num=teclado.nextInt();
            System.out.print("cuantos arquitectos desea ingresar: ");
            int op=teclado.nextInt();
            return controladorPlano.crear(formatoFecha.parse(fechaEntrega), op, num);
        } catch (ParseException ex) {
            Logger.getLogger(VistaPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
        
    }
    public void buscar()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        controladorPlano.buscar(nombre);
    }
    public Plano actualizar()
    {
        try {
            System.out.print("Ingrese el nombre");
            //teclado.next();
            String nombre= teclado.next();
            System.out.print("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fechaEntrega=teclado.next();
            System.out.print("ingrese el numero de figuras del plano general:");
            int num=teclado.nextInt();
            return controladorPlano.actualizar(nombre,formatoFecha.parse(fechaEntrega),num);
        } catch (ParseException ex) {
            Logger.getLogger(VistaPlano.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
    public void eliminar()
    {
        System.out.print("Ingrese el nombre del proyecto:");
        //teclado.next();
        String nombre=teclado.next();
        controladorPlano.eliminar(nombre);
    }
    public void agregarFigura()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.next();
        controladorPlano.agregarPlanos(nombre,vistaFigura.crear());
    }
}

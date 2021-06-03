/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFecha;
import java.util.Scanner;
import modelo.Fecha;

/**
 *
 * @author japak
 */
public class VistaFecha {
    Scanner teclado=new Scanner(System.in);
    ControladorFecha controladorFecha=new ControladorFecha();
    
    public void menuFecha()
            
    {
        int op=1;
        while(op>0)
        {
            System.out.println("1. crear");
            System.out.println("2. buscar");
            System.out.println("3. actualizar");
            System.out.println("4. eliminar");
            System.out.println("5. listar");
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
                controladorFecha.listar();
            }
        }
    }
    public void crear()
    {
        System.out.print("ingrese el dia:");
        int dia=teclado.nextInt();
        System.out.print("ingrese el mes:");
        int mes=teclado.nextInt();
        System.out.print("ingrese el snio:");
        int anio=teclado.nextInt();
        controladorFecha.crear(dia, mes, anio);
    }
    public Fecha  buscar()
    {
        System.out.print("ingrese el dia:");
        int dia=teclado.nextInt();
        System.out.print("ingrese el mes:");
        int mes=teclado.nextInt();
        controladorFecha.buscar(dia, mes);
        return controladorFecha.buscar(dia, mes);
    }
    public void actualizar()
    {
        System.out.print("ingrese el dia:");
        int dia=teclado.nextInt();
        System.out.print("ingrese el mes:");
        int mes=teclado.nextInt();
        System.out.print("ingrese el anio:");
        int anio=teclado.nextInt();
        controladorFecha.actualizar(dia, mes, anio);
        
    }
    public void eliminar()
    {
        System.out.print("ingrese el dia:");
        int dia=teclado.nextInt();
        System.out.print("ingrese el mes:");
        int mes=teclado.nextInt();
        controladorFecha.eliminar(dia, mes);
    }
}

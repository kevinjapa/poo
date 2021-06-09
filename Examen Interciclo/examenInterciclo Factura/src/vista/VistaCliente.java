/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import java.util.Scanner;
import modelo.Cliente;

/**
 *
 * @author japak
 */
public class VistaCliente 
{
    //VistaFactura vistaFactura=new VistaFactura();
    private ControladorCliente controladorCliente;
    Scanner teclado=new Scanner(System.in);
    public VistaCliente()
    {
        controladorCliente=new  ControladorCliente();
    }
    public void menuCliente()
    {
        int op=1;
        while(op>0)
        {
             System.out.println("------------------------------------------------------");
            System.out.println("--Menu Cliente-- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar \n5.Crear Factura");
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
                controladorCliente.listar();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
        
    }
    public void crear()
    {
        
        
        System.out.print("Ingrese el nombre:");
        teclado.nextLine();
        String nombre=teclado.nextLine();
        System.out.print("Ingrese la cedula:");
        String cedula=teclado.nextLine();
        System.out.print("Ingrese la fiabilidad de pago:");
        String fiabilidadPago=teclado.nextLine();
        controladorCliente.crear(nombre, cedula, fiabilidadPago);
        
    }
    public void buscar()
    {
        System.out.print("Ingrese la cedula:");
        teclado.nextLine();
        String cedula=teclado.nextLine();
        controladorCliente.buscar(cedula);
    }
    public void actualizar()
    {
        System.out.print("ingrese la cedula");
        String cedula=teclado.next();
        if(controladorCliente.buscar(cedula)==null)
        {
            System.out.print("Ingrese el numero existente");
        }
        else
        {
            System.out.print("Ingrese el nombre:");
            String nombre=teclado.next();
            System.out.print("Ingrese la fiabilidad de Pago:");
            String pago=teclado.next();
            controladorCliente.actualizar(nombre, cedula, pago);
        }
        
    }
    public void eliminar()
    {
        System.out.print("Ingrese la cedula:");
        String cedula=teclado.next();
        controladorCliente.eliminar(cedula);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlado.ControladorCliente;
import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaCliente {
    private ControladorCliente controladorCliente;
    Scanner teclado=new Scanner(System.in);
    public VistaCliente()
    
    {
        
        controladorCliente=new ControladorCliente();
    }
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("1.crear\n2.Actualizar\n3.Buscar\n4.Eliminar\n5.listar");
            op=teclado.nextInt();
            if(op==1)
            {
                crear();
            }
            else if(op==2)
            {
                actualizar();
            }
            else if(op==3)
            {
                buscar();
            }
            else if(op==4)
            {
                eliminar();
            }
            else if(op==5)
            {
                controladorCliente.listar();
            }
        }
    }
    public void crear()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el apellido");
        String apellido=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el cedula");
        String cedula=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el direccion");
        String direccion=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el telefono");
        String telefono=teclado.nextLine();
        teclado.nextLine();
        System.out.println("resultado"+controladorCliente.crear(nombre, apellido, cedula, direccion, telefono));
    }
    public Cliente buscar()
    {
        System.out.print("ingrese la cedula:");
        String cedula=teclado.nextLine();
        Cliente empresa=controladorCliente.buscar(cedula);
        controladorCliente.setSeleccionado(empresa);
        return empresa;
    }
    public void actualizar()
    {
        Cliente cliente=buscar();
        if(cliente!= null )
        {
            System.out.println("ingrese el nombre Actual:");
            String nombreActual=teclado.nextLine();
            teclado.nextLine();
            System.out.print("ingrese el nombre:");
            String nombre=teclado.nextLine();
            teclado.nextLine();
            System.out.print("ingrese el apellido:");
            String apellido=teclado.nextLine();
            teclado.nextLine();
            System.out.println("ingrese el direccion");
            String direccion=teclado.nextLine();
            teclado.nextLine();
            System.out.println("ingrese el telefono");
            String telefono=teclado.nextLine();
            teclado.nextLine();
            System.out.println("resultado"+controladorCliente.actualizar(nombreActual, nombre, cliente.getCedula(), nombre, direccion, telefono));  
        }
        
    }
    public void eliminar()
    {
        Cliente cliente=buscar();
        if(cliente!=null)
        {
            System.out.print("ingrese la cedula:");
            String cedula=teclado.nextLine();
            controladorCliente.eliminar(cedula);
        }
    }
}


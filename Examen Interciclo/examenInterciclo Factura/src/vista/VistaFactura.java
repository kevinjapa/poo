/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import controlador.ControladorFactura;
import controlador.ControladorProducto;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import modelo.Cliente;
import modelo.Factura;
import modelo.Producto;

/**
 *
 * @author japak
 */
public class VistaFactura {
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
    private ControladorFactura controladorFactura;
    Scanner teclado=new Scanner(System.in);
    private ControladorCliente controladorCliente;
    private ControladorProducto controladorProducto;
    VistaCliente vistaCliente=new  VistaCliente();
    List<Producto> listaProducto=new ArrayList();
    public VistaFactura()
    {
        controladorFactura=new ControladorFactura();
        controladorCliente=new ControladorCliente();
        controladorProducto= new ControladorProducto();
    }
    public void menuFactura()
    {
        int op=1;
        while(op>0)
        {
             System.out.println("------------------------------------------------------");
            System.out.println("--Menu Factura-- \n0.Salir \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar");
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
                controladorFactura.listar();
            }
        }
    }
    public void crear()
    {
        try {
            
            System.out.print("Ingrese la cedula:");
            teclado.next();
            String cedula=teclado.nextLine();
            System.out.print("Ingrese nombre del producto:");
            String nombre=teclado.nextLine();
            Cliente cliente=controladorCliente.buscar(cedula);
            System.out.print("Ingrese el total:");
            double total=teclado.nextDouble();
            System.out.print("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fecha=teclado.next();
            controladorFactura.crear(total,formatoFecha.parse(fecha));
            if(cliente!=null)
            {
                Producto producto=controladorProducto.buscar(nombre);
                if(producto!=null)
                {
                    listaProducto.add(producto);  
                    controladorFactura.actualizar(cedula,total, formatoFecha.parse(fecha), listaProducto, cliente);
                    
                }
                else
                {
                    System.out.println("El producto ingresado no existe");
                    
                } 
            }
            else
            {
                
                System.out.println("El cliente Ingresado no existe");
                System.out.println("--Crear Cliente--");
                vistaCliente.menuCliente();
                
            }

        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void buscar()
    {
        System.out.print("Ingrese la cedula:");
        String cedula=teclado.nextLine();
        controladorFactura.buscar(cedula);
    }
    public void actualizar()
    {
         try {
            teclado.nextLine();
            System.out.print("Ingrese la cedula:");
            String cedula=teclado.nextLine();
            System.out.print("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fecha=teclado.next();
            System.out.println("Ingrese un total:");
            double total=teclado.nextDouble(); 
            controladorFactura.actualizar(cedula,total,formatoFecha.parse(fecha));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void eliminar()
    {
        System.out.print("Ingrese la cedula:");
        String cedula=teclado.nextLine();
        controladorFactura.eliminar(cedula);
    }
}

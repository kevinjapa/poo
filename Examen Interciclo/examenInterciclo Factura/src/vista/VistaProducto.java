/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorProducto;
import java.util.Scanner;
import modelo.Producto;

/**
 *
 * @author japak
 */
public class VistaProducto 
{
    //VistaFactura vistaFactura=new VistaFactura();
    ControladorProducto controladorProducto=new ControladorProducto();
    Scanner teclado=new Scanner(System.in);
    public void menuProducto()
    {
        int op=1;
        while(op>0)
        {
             System.out.println("------------------------------------------------------");
            System.out.println("--Menu Cliente-- \n0.Salir \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar \n5.CrearFactura");
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
                controladorProducto.listar();
            }
            else if(op==6)
            {
                //vistaFactura.menuFactura();
            }
        }
        
    }
    public void crear()
    {
        //Producto producto=crear();
        /*System.out.print("Ingrese el nombre:");
        
        String nombre=teclado.next();*/
        System.out.print("Ingrese la descripcion:");
        teclado.next();
        String descripcion=teclado.nextLine();
        System.out.print("Ingrese el precio Unitario:");
        double precioUnitario=teclado.nextDouble();
        System.out.print("Ingrese el Stock:");
        int stock=teclado.nextInt();
        System.out.print("Ingrese el iva:");
        int iva=teclado.nextInt();
        System.out.println("El producto tiene iva:si/no");
        teclado.nextLine();
        String opcion=teclado.nextLine();
        controladorProducto.crear(descripcion, precioUnitario,stock,iva,opcion);
        //return producto;
    }
    public void buscar()
    {
        System.out.print("Ingrese el nombre:");
        teclado.nextLine();
        String nombre=teclado.nextLine();
        controladorProducto.buscar(nombre);
    }
    public void actualizar()
    {
        System.out.print("Ingrese la Descripcon:");
            String descripcion=teclado.next();
        if(controladorProducto.buscar(descripcion)==null)
        {
            System.out.print("Ingrese un Cliente existente");
        }
        else
        {
            System.out.print("Ingrese el iva:");
            int iva=teclado.nextInt();
            System.out.println("Ingrese el Precio Unitario:");
            double precioUnitario = teclado.nextDouble();
            System.out.println("Ingrese el Stock:");
            int stock=teclado.nextInt();
            controladorProducto.actualizar(descripcion,precioUnitario,stock, iva);
        }
        
    }
    public void eliminar()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.next();
        controladorProducto.eliminar(nombre);
    }
    
}

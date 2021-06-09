/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorCliente;
import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaGeneral 
{
    VistaProducto vistaProducto=new VistaProducto();
    VistaFactura vistaFactura=new VistaFactura();
    VistaCliente vistaCliente=new VistaCliente();
    Scanner teclado=new Scanner(System.in);
    
    public void menuPrincipal()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("--Menu General-- \n0.Salir \n1.Cliente \n2.Factura \n3.Producto");
            System.out.print("Ingrese una opcion:");
            op=teclado.nextInt();
            if(op==1)
            {
                vistaCliente.menuCliente();
            }
            else if(op==2)
            {
                vistaFactura.menuFactura();
            }
            else if(op==3)
            {
                vistaProducto.menuProducto();
            }
            
        }
    }
    
}

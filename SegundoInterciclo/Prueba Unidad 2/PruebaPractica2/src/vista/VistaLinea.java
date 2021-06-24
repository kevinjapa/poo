/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorLinea;
import java.util.Scanner;
import modelo.Linea;

/**
 *
 * @author japak
 */
public class VistaLinea 
{
    ControladorLinea controladorLinea=new ControladorLinea();
    Scanner teclado=new Scanner(System.in);
    
    public void menuLinea()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Linea -- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar");
            System.out.print("Ingrese una opcion:");
            op=teclado.nextInt();
            if(op==1)
            {
                crear();
                
            }
            else if(op==2)
            {
                //buscar();
            }
            else if(op==3)
            {
                //actualizar();
            }
            else if(op==4)
            {
                //eliminar();
            }
            else if(op==5)
            {
                controladorLinea.listar();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
    }
    public Linea crear()
    {
        System.out.print("ingrese el punto de Origen:");
        double puntoOrigen=teclado.nextDouble();
        System.out.print("ingrese el punto Fin:");
        double puntoFin=teclado.nextDouble();
        System.out.print("ingrese la Longitud:");
        double longitud=teclado.nextDouble();
        return controladorLinea.crear(puntoOrigen, puntoFin, longitud);
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaGeneral 
{
    VistaFigura vistaFigura=new VistaFigura();
    VistaLinea vistaLinea=new VistaLinea(); 
    VistaJefe vistaJefe=new VistaJefe();
    VistaPlano vistaPlano=new VistaPlano();
    VistaProyecto vistaProyecto=new VistaProyecto();
    Scanner teclado=new Scanner(System.in);
    public void menuGenereal()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Menu General -- \n0.Salir  \n1.Figura \n2.Jefe \n3.Linea \n4.Plano \n5.Proyecto");
            System.out.print("Ingrese una opcion:");
            op=teclado.nextInt();
            if(op==1)
            {
                vistaFigura.menuFigura();
                
            }
            else if(op==2)
            {
                vistaJefe.menuJefe();
            }
            else if(op==3)
            {
                vistaLinea.menuLinea();
            }
            else if(op==4)
            {
                vistaPlano.menuJefe();
            }
            else if(op==5)
            {
                vistaProyecto.menuJefe();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
        
    }
    
}

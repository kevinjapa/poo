/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorDni;
import controlador.ControladorFecha;
import controlador.ControladorPersona;
import java.util.Scanner;
import modelo.Persona;

/**
 *
 * @author japak
 */
public class VistaPersona {
    ControladorFecha controladorFecha=new ControladorFecha();
    ControladorDni controladorDni=new ControladorDni();
    ControladorPersona controladorPersona=new ControladorPersona();
    Scanner teclado=new Scanner (System.in);
    public void menuPersona()
            
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
                controladorPersona.listar();
            }
        }
    }
    public void crear ()
    {
        System.out.println("ingrese el nombre completo");
        teclado.nextLine();
        String nombreCompleto=teclado.nextLine();
        System.out.println("res:"+controladorPersona.crear(nombreCompleto,controladorFecha.getSeleccionado(), controladorDni.getSeleccionado()));
    }
    public Persona buscar()
    {
         System.out.println("ingrese el nombre completo");
        teclado.nextLine();
        String nombreCompleto=teclado.nextLine();
        controladorPersona.buscar(nombreCompleto);
        return controladorPersona.buscar(nombreCompleto);
    }
    public void actualizar()
    {
        System.out.println("ingrese el nombre completo");
        teclado.nextLine();
        String nombreCompleto=teclado.nextLine();
        
       System.out.println("res:"+controladorPersona.actualizar(nombreCompleto,controladorFecha.getSeleccionado(), controladorDni.getSeleccionado()));
    }
    public void eliminar()
    {
        System.out.println("ingrese el nombre completo");
        teclado.nextLine();
        String nombreCompleto=teclado.nextLine();
        controladorPersona.eliminar(nombreCompleto);
    }
}

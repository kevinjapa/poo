/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;
import modelo.Dni;
import modelo.Fecha;
import modelo.Persona;

/**
 *
 * @author japak
 */
public class VistaGeneral {
    Scanner teclado=new Scanner(System.in);
    VistaPersona vp=new VistaPersona();
    VistaRegistro vr=new VistaRegistro();
    VistaFecha vf=new VistaFecha();
    VistaDni vdni=new VistaDni();
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("Gestion de registro");
            System.out.println("1. fecha");
            System.out.println("2. dni");
            System.out.println("3. persona");
            System.out.println("4.registro");
            op=teclado.nextInt();
            if(op==1)
            {
                vf.menuFecha();
            }
            else if(op ==2)
            {
               vdni.menuDni();
            }
            else if(op ==3)
            {
                persona();
            }
            else if(op ==4)
            {
               registro();
            }
        }
    }
    public void persona()
    {
        Fecha fecha=vf.buscar();
        Dni dni=vdni.buscar();  
        if(fecha!=null && dni!=null)
        {
            vp.menuPersona();
        }
    }
    public void registro()
    {
        Persona persona =vp.buscar();
        if(persona !=null)
        {
            vr.menuRegistro();
        }
    }
    
   
}

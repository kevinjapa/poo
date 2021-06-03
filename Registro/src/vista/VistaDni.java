/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorDni;
import java.util.Scanner;
import modelo.Dni;

/**
 *
 * @author japak
 */
public class VistaDni
{
    Scanner teclado=new Scanner(System.in);
    ControladorDni controladorDni=new ControladorDni();
     public void menuDni()
            
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
                controladorDni.listar();
            }
        }
    }
    public void crear()
    {
        System.out.print("ingrese el numero:");
        String numero=teclado.nextLine();
        System.out.println("ingrese el codigo de verificacion:");
        int codigoVerificacion=teclado.nextInt();
        controladorDni.crear(numero, codigoVerificacion);
        
    }
    public Dni buscar()
    {
        System.out.print("ingrese el numero:");
        String numero=teclado.nextLine();
        controladorDni.buscar(numero);
        return controladorDni.buscar(numero);
    }
    public void actualizar()
    {
        System.out.print("ingrese el numero:");
        String numero=teclado.nextLine();
        System.out.print("ingrese el codigo de verificacion:");
        int codigoVerficacion=teclado.nextInt();
        controladorDni.actualizar(numero, codigoVerficacion);
    }
    public void eliminar()
    {
        System.out.print("ingrese el numero:");
        String numero=teclado.nextLine();
        controladorDni.eliminar(numero);
    }
}

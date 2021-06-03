/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorFecha;
import controlador.ControladorPersona;
import controlador.ControladorRegistro;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author japak
 */
public class VistaRegistro {
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
    Scanner teclado=new Scanner(System.in);
    ControladorFecha controladorFecha=new ControladorFecha();
    ControladorPersona controladorPersona=new ControladorPersona();
    ControladorRegistro controladorRegistro=new ControladorRegistro();
    public void menuRegistro()
            
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
                controladorRegistro.listar();
            }
        }
    }
    public void crear()
    {
        try {
            System.out.print("ingrese el codigo:");
            String codigo=teclado.nextLine();
            System.out.println("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fecha=teclado.next();
            System.out.println("res:"+controladorRegistro.crear(fecha,formatoFecha.parse(fecha),controladorPersona.getSeleccionado()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void buscar()
    {
        System.out.println("ingrese el codigo;");
        String codigo=teclado.next();
        controladorPersona.buscar(codigo);
    }
    public void actualizar()
    {
        try {
            System.out.print("ingrese el codigo:");
            String codigo=teclado.nextLine();
            System.out.println("ingrese la fecha(\"dd/mm/yyyy\"):");
            String fecha=teclado.next();
            System.out.println("res:"+controladorRegistro.crear(fecha,formatoFecha.parse(fecha),controladorPersona.getSeleccionado()));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void eliminar()
    {
        System.out.println("ingrese el codigo:");
        String codigo=teclado.next();
        controladorPersona.eliminar(codigo);    
    }
}

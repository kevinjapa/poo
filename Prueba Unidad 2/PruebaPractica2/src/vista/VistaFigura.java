/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.ControladorFigura;
import Controlador.ControladorPlano;
import java.util.Scanner;
import modelo.Figura;

/**
 *
 * @author japak
 */
public class VistaFigura 
{
    ControladorFigura controladorFigura=new ControladorFigura();
    Scanner teclado=new Scanner(System.in);
    ControladorPlano controladorPlano=new ControladorPlano();
    VistaLinea vistaLinea=new VistaLinea();
    public void menuFigura()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("------------------------------------------------------");
            System.out.println("-- Figura -- \n0.Salir  \n1.Crear \n2.buscar \n3.Actualizar \n4.eliminar \n5.listar \n6.Agregar Linea ");
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
                controladorFigura.listar();
            }
            else if(op==6)
                    {
                       // vistaFactura.menuFactura();
                    }
        }
        
    }
    public Figura crear()
    {
        System.out.print("ingrese un Nombre de la Figura:");
        //teclado.next();
        String nombre=teclado.next();
        System.out.print("Ingrese el color:");
        String color=teclado.next();
        System.out.print("Ingrese el Area:");
        double area=teclado.nextDouble();
        System.out.print("Ingrese el Perimetro:");
        double perimetro=teclado.nextDouble();
        System.out.print("Ingrese el numero de lineas del poligono:");
        int numL=teclado.nextInt();
        System.out.print("Ingrese las lineas que conforman:");
        int lineasC=teclado.nextInt();
        return controladorFigura.crear(nombre, color, area, perimetro, numL, lineasC,vistaLinea.crear());
    }
    public void buscar()
    {
        System.out.print("Ingrese el numbre de la figura:");
        //teclado.next();
        String nombre=teclado.next();
        controladorFigura.buscar(nombre);
    }
    public void actualizar()
    {
        System.out.print(" Ingrese el nombre:");
        //teclado.next();
        String nombre=teclado.next();
        System.out.print("Ingrese el color:");
        String color=teclado.next();
        System.out.print("Ingrese el Area:");
        double area=teclado.nextDouble();
        System.out.print("Ingrese el Perimetro:");
        double perimetro=teclado.nextDouble();
        System.out.print("Ingrese el numero de lineas del poligono:");
        int numL=teclado.nextInt();
        System.out.print("Ingrese las lineas que conforman:");
        int lineasC=teclado.nextInt();
        controladorFigura.actualizar(nombre, color, area, perimetro, numL, lineasC);
    }
    public void eliminar()
    {
        System.out.print("Ingrese le numbre:");
        //teclado.next();
        String nombre=teclado.next();
        controladorFigura.eliminar(nombre);
    }
    public void agregarLinea()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.next();
        controladorFigura.agreagarLinea(nombre, vistaLinea.crear());
    }
    
}

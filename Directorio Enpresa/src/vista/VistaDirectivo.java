/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlado.ControladorDirectivo;
import Modelo.Directivo;
import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaDirectivo {
    private ControladorDirectivo controladorDirectivo;
    Scanner teclado=new Scanner(System.in);
    public VistaDirectivo()
    
    {
        
        controladorDirectivo=new ControladorDirectivo();
    }
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("1.crear\n2.Actualizar\n3.Buscar\n4.Eliminar\n5.listar");
            op=teclado.nextInt();
            if(op==1)
            {
                crear();
            }
            else if(op==2)
            {
                actualizar();
            }
            else if(op==3)
            {
                buscar();
            }
            else if(op==4)
            {
                eliminar();
            }
            else if(op==5)
            {
                controladorDirectivo.listar();
            }
        }
    }
    public void crear()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el apellido");
        String apellido=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el cedula");
        String cedula=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el direccion");
        String direccion=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el categoria");
        String categoria=teclado.nextLine();
        System.out.println("ingrese el sueldo bruto:");
        double sueldoBruto=teclado.nextDouble();
        System.out.println("resultado"+controladorDirectivo.crear(nombre, apellido, cedula, direccion, categoria, sueldoBruto));
    }
    public Directivo buscar()
    {
        System.out.print("ingrese la cedula:");
        String cedula=teclado.nextLine();
        Directivo directivo=controladorDirectivo.buscar(cedula);
        controladorDirectivo.setSeleccionado(directivo);
        return directivo;
    }
    public void actualizar()
    {
        Directivo directivo=buscar();
        System.out.print("ingrese el nombre:");
        String nombre=teclado.nextLine();
        teclado.nextLine();
        System.out.print("ingrese el apellido:");
        String apellido=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese la cedula:");
        String cedula=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el direccion");
        String direccion=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese la categoria:");
        String categoria=teclado.nextLine();
        teclado.nextLine();
        System.out.println("ingrese el sueldo bruto");
        double suledoBruto=teclado.nextDouble();
        teclado.nextLine();
        System.out.println("resultado"+controladorDirectivo.actualizar(nombre, apellido, cedula, direccion, categoria, suledoBruto));
    }
    public void eliminar()
    {
        Directivo directivo=buscar();
        if(directivo !=null)
        {       
            System.out.print("ingrese la cedula:");
            String cedula=teclado.nextLine();
            controladorDirectivo.eliminar(cedula);
        }
        
    }
}

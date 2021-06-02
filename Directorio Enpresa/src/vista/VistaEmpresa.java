/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlado.ControladorCliente;
import Controlado.ControladorEmpleado;
import Controlado.ControladorEmpresa;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Empresa;
import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaEmpresa {
    private ControladorEmpresa controladorEmpresa;
    private ControladorCliente controladorCliente;
    private ControladorEmpleado controladorEmpleado;
    private VistaCliente vistaCliente;
    private VistaEmpleado vistaEmpleado;
    private Scanner teclado;
        public VistaEmpresa(VistaCliente vistaCliente,VistaEmpleado vistaEmpleado)
    
    {
        this.controladorCliente = controladorCliente;
        this.controladorEmpleado = controladorEmpleado;
        this.vistaCliente = vistaCliente;
        this.vistaEmpleado = vistaEmpleado;
        teclado = new Scanner (System.in);
        controladorEmpresa=new ControladorEmpresa();
    }
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("1.crear\n2.Actualizar\n3.Buscar\n4.Eliminar\n5.listar");
            System.out.println("6 Gestionar Cliente\n7 Gestionar Empleado");
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
                controladorEmpresa.listar();
            }
            else if(op==6)
            {
                
            }
            else if(op==7)
            {
                
            }
        }
    }
    public void crear()
    {
        System.out.print("Ingrese el nombre:");
        String nombre=teclado.nextLine();
        teclado.nextLine();
        System.out.println("resultado"+controladorEmpresa.crear(nombre));
    }
    public Empresa buscar()
    {
        System.out.print("ingrese el nombre:");
        String nombre=teclado.nextLine();
        Empresa empresa=controladorEmpresa.buscar(nombre);
        controladorEmpresa.setSeleccionado(empresa);
        return empresa;
    }
    public void actualizar()
    {
        Empresa empresa=buscar();
        System.out.print("ingrese el nombre:");
        String nombrea=teclado.nextLine();
        System.out.print("ingrese el nuevo nombre:");
        String nombre=teclado.nextLine();
        controladorEmpresa.actualizar(nombrea, nombre);
    }
    public void eliminar()
    {
        System.out.print("ingrese el nombre:");
        String nombre=teclado.nextLine();
        controladorEmpresa.eliminar(nombre);
    }
    public void cliente()
    {
        Empresa empresa=buscar();
        Cliente cliente=vistaCliente.buscar();
        System.out.println("resoltado"+ controladorEmpresa.agregarCliente(cliente));
        
    }
    public void empleado()
    {
        Empresa empresa=buscar();
        Empleado empleado=vistaEmpleado.buscar();
        System.out.println("resoltado"+ controladorEmpresa.agregarEmpleado(empleado));
        
    }
}

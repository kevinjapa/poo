/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlado.*;
import java.util.Scanner;

/**
 *
 * @author japak
 */
public class VistaGeneral {
    
    VistaCliente vistaCliente = new VistaCliente();
    VistaEmpleado vistaEmpleado = new VistaEmpleado();
    VistaDirectivo vistaDirectivo=new VistaDirectivo();
    VistaEmpresa vistaEmpresa=new VistaEmpresa(vistaCliente, vistaEmpleado);
    private Scanner teclado;
    private ControladorCliente controladorCliente;
    private ControladorEmpleado controladorEmpleado;
    private ControladorEmpresa controladorEmpresa;
    private ControladorDirectivo controladorDirectivo;
    
    public VistaGeneral()
    {
        teclado= new Scanner(System.in);
        controladorCliente=new ControladorCliente();
        controladorEmpleado=new ControladorEmpleado();
        controladorEmpresa=new ControladorEmpresa();
        controladorDirectivo=new ControladorDirectivo();
    }
    public void menu()
    {
        int op=1;
        while(op>0)
        {
            System.out.println("1.Empresa\n2.Clientes\n2.Empleado\n3.Directivo");
            op=teclado.nextInt();
            if(op==1)
                vistaEmpresa.menu();
            if(op==2)
                vistaCliente.menu();
            if(op==3)
                vistaEmpleado.menu();
            if(op==4)
                vistaDirectivo.menu();
        }
    }
}

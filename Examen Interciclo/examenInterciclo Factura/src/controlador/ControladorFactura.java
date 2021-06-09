/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Cliente;
import modelo.Factura;
import modelo.Producto;


/**
 * * @author japak
 */
public class ControladorFactura {
    DateFormat formatoFecha=new SimpleDateFormat("dd/mm/yyyy");
    private List<Factura> listaFactura;
    private Factura seleccionado;
    public ControladorFactura()    
    {
        listaFactura = new ArrayList();
        
    }
        public int generarId()
        {
            return (listaFactura.size()>0)? listaFactura.get(listaFactura.size()-1).getId()+1:1;
        }
        public boolean crear(double total, Date fechaFactura)
        {
            Factura factura=new Factura(generarId(),total,fechaFactura);
            return listaFactura.add(factura);
            
        }
        public boolean crear(double total, Date fechaFactura,List<Producto> listaProducto,Cliente cliente)
        {
            Factura factura=new Factura(generarId(),total,fechaFactura,cliente,listaProducto);
            return listaFactura.add(factura);
            
        }
        public Factura buscar(String cedula)
        {
        for(Factura factura: listaFactura)
        {
            if(factura.getCliente().getCedula().equals(cedula))
            {
                seleccionado= factura;
                return factura;
            }
           
        }
         return null;
    }
    public boolean actualizar(String cedula,double total, Date fechaFactura,List<Producto> listaProducto,Cliente cliente)
    {
        Factura factura=buscar(cedula);
        if(factura!=null)
        {
            int posicion=listaFactura.indexOf(factura);
            factura.setFechaFactura(fechaFactura);
            factura.setTotal(total);
            factura.setCliente(cliente);
            factura.setListaProducto(listaProducto);
            listaFactura.set(posicion, factura);
            return true;
        }
        return false;
    }
    public boolean actualizar(String cedula,double total,Date fechaFactura)
    {
        Factura factura=buscar(cedula);
        if(factura!=null)
        {
            int posicion=listaFactura.indexOf(factura);
            factura.setFechaFactura(fechaFactura);
            factura.setTotal(total);
            listaFactura.set(posicion, factura);
            return true;
        }
        return false;
    }
    public void eliminar(String cedula)
    {
        Factura factura=buscar(cedula);
        listaFactura.remove(factura);
    }
    public void listar()
            
    {
        for(int i =0;i<listaFactura.size();i++)
            
        {
            
            System.out.println("factura "+(i+1)+":"+listaFactura.get(i));   
        }
    }

    public List<Factura> getListaFactura() {
        return listaFactura;
    }

    public void setListaFactura(List<Factura> listaFactura) {
        this.listaFactura = listaFactura;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}

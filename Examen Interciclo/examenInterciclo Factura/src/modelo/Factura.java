/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author japak
 */
public class Factura 
{
    private int id;
    private double total;
    private  Date fechaFactura ;
    private Cliente cliente;
    private List<Producto> listaProducto;
    public Factura(int id, double total, Date fechaFactura)
    {
        this.id=id;
       this.total=total;
        this.fechaFactura=fechaFactura;
    }

    public Factura(int id, double total, Date fechaFactura, Cliente cliente, List<Producto> listaProducto) {
        this.id = id;
        this.total = total;
        this.fechaFactura = fechaFactura;
        this.cliente = cliente;
        this.listaProducto = listaProducto;
    }

    public void borrado()
    {
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Producto> getListaProducto() {
        return listaProducto;
    }

    public void setListaProducto(List<Producto> listaProducto) {
        this.listaProducto = listaProducto;
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", total=" + total + ", fechaFactura=" + fechaFactura + ", cliente=" + cliente + ", listaProducto=" + listaProducto + '}';
    }

    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author japak
 */
public class Producto 
{
    private int id;
    private String descripcion;
    private double precioUnitario;
    private int stock;
    private double iva;
    
    //private String nombre;
    public Producto(int id, String descripcion, double precioUnitario, int stock, double iva)
    {
        this.id=id;
        this.descripcion=descripcion;
        this.precioUnitario=precioUnitario;
        this.stock=stock;
        this.iva=iva;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    /*public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */
    @Override
    public String toString() {
        return "Producto{"+"id=" + id + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", stock=" + stock + ", iva=" + iva + '}';
    }
    
    
}

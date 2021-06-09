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
public class Cliente 
{
    private int id;
    private String nombre;
    private String cedula;
    private String fiabilidadPago;
    private Factura factura;
    public Cliente(int id,String nombre, String cedula,String fiabilidadPago)
    {
        this.id=id;
        this.nombre=nombre;
        this.cedula=cedula;
        this.fiabilidadPago=fiabilidadPago;
    }

    public Cliente(int id, String nombre, String cedula, String fiabilidadPago, Factura factura) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabilidadPago = fiabilidadPago;
        this.factura = factura;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFiabilidadPago() {
        return fiabilidadPago;
    }

    public void setFiabilidadPago(String fiabilidadPago) {
        this.fiabilidadPago = fiabilidadPago;
    }

    @Override
    public String toString() {
        return "" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fiabilidadPago=" + fiabilidadPago + '}';
    }
    
}

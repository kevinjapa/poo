/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;

/**
 *
 * @author japak
 */
public class Persona 
{
    private long id;
    private String nombreCompleto;
    private List<Registro> registro;
    private Fecha fecha;
    private Dni dni;
    
    public Persona(long id, String nombreCompleto)
    {
        this.id=id;
        this.nombreCompleto=nombreCompleto;
    }

    public Persona(long id, String nombreCompleto, List<Registro> registro) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.registro = registro;
    }
    public Persona(long id,String nombreCompleto,Fecha fecha, Dni dni)
    {
        nombreCompleto=nombreCompleto;
        fecha=fecha;
        dni=dni;
        id=id;
    }
    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public Dni getDni() {
        return dni;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<Registro> getRegistro() {
        return registro;
    }

    public void setRegistro(List<Registro> registro) {
        this.registro = registro;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombreCompleto=" + nombreCompleto+'}';
    }
    
}

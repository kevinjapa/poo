/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author japak
 */
public class Cliente extends Persona
{
    private String telefono;
    
    public Cliente(String telefono,long id, String nombre, String apellido, String cedula, String direccion)
    {
        super(id, nombre, apellido, cedula, direccion);//datos al contructor de perona
        this.telefono = telefono;
    }

    public Cliente(long id, String nombre, String apellido, String cedula, String direccion,String telefono) {
        super(id, nombre, apellido, cedula, direccion);//datos al contructor de perona
        this.telefono = telefono;
    }
    

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "telefono=" + telefono + super.toString()+'}';
    }
    
}

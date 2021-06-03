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
public class Dni 
{
    private long id;
    private String numero;
    private int codigoVeriificacion;
    
    public Dni(long id,String numero,int codigoVeriificacion)
    {
        this.id=id;
        this.numero=numero;
        this.codigoVeriificacion=codigoVeriificacion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getCodigoVeriificacion() {
        return codigoVeriificacion;
    }

    public void setCodigoVeriificacion(int codigoVeriificacion) {
        this.codigoVeriificacion = codigoVeriificacion;
    }

    @Override
    public String toString() {
        return "Dni{" + "id=" + id + ", numero=" + numero + ", codigoVeriificacion=" + codigoVeriificacion + '}';
    }
    
}

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
public class Empleado extends Persona//herenci atraves de extends
{
    private double sueldoBruto;
    
    public Empleado(long id, String nombre, String apellido, String cedula, String direccion) {
        super(id, nombre, apellido, cedula, direccion);// enviar datos utilizamos super
        this.sueldoBruto = sueldoBruto;
    }

    public Empleado(double sueldoBruto, long id, String nombre, String apellido, String cedula, String direccion) {
        super(id, nombre, apellido, cedula, direccion);// enviar datos utilizamos super
        this.sueldoBruto = sueldoBruto;//asignamos valor a los atrivutos de empledo
    }

    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "sueldoBruto=" + sueldoBruto +super.toString()+ '}';
    }
    
}

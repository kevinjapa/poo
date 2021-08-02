/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author japak
 */
public class Jugador 
{
    private int id;
    private String nombre;
    private int numeroIntentos;
    private int numeroAciertos;

    public Jugador(int id, String nombre, int numeroIntentos, int numeroAciertos) {
        this.id = id;
        this.nombre = nombre;
        this.numeroIntentos = numeroIntentos;
        this.numeroAciertos = numeroAciertos;
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

    public int getNumeroIntentos() {
        return numeroIntentos;
    }

    public void setNumeroIntentos(int numeroIntentos) {
        this.numeroIntentos = numeroIntentos;
    }

    public int getNumeroAciertos() {
        return numeroAciertos;
    }

    public void setNumeroAciertos(int numeroAciertos) {
        this.numeroAciertos = numeroAciertos;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id=" + id + ", nombre=" + nombre + ", numeroIntentos=" + numeroIntentos + ", numeroAciertos=" + numeroAciertos + '}';
    }
    
    
}

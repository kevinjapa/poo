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
public class Linea 
{
    private int identificador;
    private Double puntoOrigen;
    private Double puntoFin;
    private Double longitud;
    private Figura figura;

    public Linea(int identificador, Double puntoOrigen, Double puntoFin, Double longitud) {
        this.identificador = identificador;
        this.puntoOrigen = puntoOrigen;
        this.puntoFin = puntoFin;
        this.longitud = longitud;
    }

    public Linea(int identificador, Double puntoOrigen, Double puntoFin, Double longitud, Figura figura) {
        this.identificador = identificador;
        this.puntoOrigen = puntoOrigen;
        this.puntoFin = puntoFin;
        this.longitud = longitud;
        this.figura = figura;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Double getPuntoOrigen() {
        return puntoOrigen;
    }

    public void setPuntoOrigen(Double puntoOrigen) {
        this.puntoOrigen = puntoOrigen;
    }

    public Double getPuntoFin() {
        return puntoFin;
    }

    public void setPuntoFin(Double puntoFin) {
        this.puntoFin = puntoFin;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    @Override
    public String toString() {
        return "{" + "identificador=" + identificador + ", puntoOrigen=" + puntoOrigen + ", puntoFin=" + puntoFin + ", longitud=" + longitud + ", figura=" + figura + '}';
    }
    
    
    
}

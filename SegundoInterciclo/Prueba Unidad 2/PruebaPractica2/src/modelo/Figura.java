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
public class Figura 
{
    private int identificador;
    private String nombre;
    private String color;
    private Double area;
    private Double perimetro;
    private int numeroLineaPoligono;
    private int lineasConforman;
    private Plano plano;
    private List<Linea> lineas;

    public Figura(int identificador, String nombre, String color, Double area, Double perimetro, int numeroLineaPoligono, int lineasConforman) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.numeroLineaPoligono = numeroLineaPoligono;
        this.lineasConforman = lineasConforman;
    }

    public Figura(int identificador, String nombre, String color, Double area, Double perimetro, int numeroLineaPoligono, int lineasConforman, List<Linea> lineas) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.color = color;
        this.area = area;
        this.perimetro = perimetro;
        this.numeroLineaPoligono = numeroLineaPoligono;
        this.lineasConforman = lineasConforman;
        this.plano = plano;
        this.lineas = lineas;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }

    public int getNumeroLineaPoligono() {
        return numeroLineaPoligono;
    }

    public void setNumeroLineaPoligono(int numeroLineaPoligono) {
        this.numeroLineaPoligono = numeroLineaPoligono;
    }

    public int getLineasConforman() {
        return lineasConforman;
    }

    public void setLineasConforman(int lineasConforman) {
        this.lineasConforman = lineasConforman;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(List<Linea> lineas) {
        this.lineas = lineas;
    }

    @Override
    public String toString() {
        return "{" + "identificador=" + identificador + ", nombre=" + nombre + ", color=" + color + ", area=" + area + ", perimetro=" + perimetro + ", numeroLineaPoligono=" + numeroLineaPoligono + ", lineasConforman=" + lineasConforman + ", plano=" + plano + ", lineas=" + lineas + '}';
    }
    
    
    
}

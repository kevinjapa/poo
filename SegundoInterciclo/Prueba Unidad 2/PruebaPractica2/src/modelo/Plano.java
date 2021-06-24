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
public class Plano 
{
    private int identificador;
    private Date fechaEntrega;
    private List arquitectos;
    private int numeroFigurasPlanoGeneral;
    
    private Proyecto proyecto;
    private List<Figura> figuras;
    public Plano()
    {
        
    }
    public Plano(int identificador, Date fechaEntrega, List arquitectos, int numeroFigurasPlanoGeneral) {
        this.identificador = identificador;
        this.fechaEntrega = fechaEntrega;
        this.arquitectos = arquitectos;
        this.numeroFigurasPlanoGeneral = numeroFigurasPlanoGeneral;
    }

    public Plano(int identificador, Date fechaEntrega, List arquitectos, int numeroFigurasPlanoGeneral, List<Figura> figuras) {
        this.identificador = identificador;
        this.fechaEntrega = fechaEntrega;
        this.arquitectos = arquitectos;
        this.numeroFigurasPlanoGeneral = numeroFigurasPlanoGeneral;
        this.proyecto = proyecto;
        this.figuras = figuras;
    }
    

   
  

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public List getArquitectos() {
        return arquitectos;
    }

    public void setArquitectos(List arquitectos) {
        this.arquitectos = arquitectos;
    }

    

    public int getNumeroFigurasPlanoGeneral() {
        return numeroFigurasPlanoGeneral;
    }

    public void setNumeroFigurasPlanoGeneral(int numeroFigurasPlanoGeneral) {
        this.numeroFigurasPlanoGeneral = numeroFigurasPlanoGeneral;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public List<Figura> getFiguras() {
        return figuras;
    }

    public void setFiguras(List<Figura> figuras) {
        this.figuras = figuras;
    }

    @Override
    public String toString() {
        return "{" + "identificador=" + identificador + ", fechaEntrega=" + fechaEntrega + ", arquitectos=" + arquitectos + ", numeroFigurasPlanoGeneral=" + numeroFigurasPlanoGeneral + ", proyecto=" + proyecto +'}';
    }
    
    
    
    
}

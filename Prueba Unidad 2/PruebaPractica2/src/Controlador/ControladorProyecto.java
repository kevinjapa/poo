/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Figura;
import modelo.Jefe;
import modelo.Plano;
import modelo.Proyecto;

/**
 *
 * @author japak
 */
public class ControladorProyecto 
{
    private Plano plano;
    List<Proyecto> listaProyecto;
    Proyecto seleccionado;
    ArrayList<Plano> planos;
    private int op=1;
    private double area;
    private double b;
    private double h;
    private double perimetro;
    public ControladorProyecto()
    {
        planos=new ArrayList();
        plano=new Plano();
        listaProyecto=new ArrayList();
    }
    
    public int generarId()
    {
        return (listaProyecto.size()>0)? listaProyecto.get(listaProyecto.size()-1).getCodigo()+1:1;
    }
    public Proyecto crear(String nombre,Jefe jefe,Plano plano)
    {
        planos.add(plano);
        Proyecto proyecto=new Proyecto(generarId(),nombre,jefe,planos);
        listaProyecto.add(proyecto);
        return proyecto;
        
    }
    public Proyecto buscar(String nombreProyecto)
    {
        for(Proyecto proyecto: listaProyecto)
        {
            if(proyecto.getNombre().equals(nombreProyecto))
            {
                seleccionado= proyecto;
                return proyecto;
            }
            
           
        }
         return null;
    }
    public Proyecto actualizar(String nombreProyecto,Jefe jefe, Plano plano)
    {
        Proyecto proyecto=buscar(nombreProyecto);
        if(proyecto!=null)
        {
            int posicion=listaProyecto.indexOf(proyecto);
            proyecto.setNombre(nombreProyecto);
            planos.set(posicion, plano);
            proyecto.setJefe(jefe);
            proyecto.setPlano(planos);
            listaProyecto.set(posicion, proyecto);
            return proyecto;
        }
        return null;
       
    }
    public boolean eliminar(String nombreProyecto)
    {
        Proyecto proyecto=buscar(nombreProyecto);
        return listaProyecto.remove(nombreProyecto);
    }
    public void listar()
            
    {
        for(int i =0;i<listaProyecto.size();i++)
            
        {
            
            System.out.println("Proyecto "+(i+1)+":"+listaProyecto.get(i));   
        }
    }
    public void agregarPlanos(String nombreProyecto,Plano plano)
    {
        
        Proyecto proyecto=buscar(nombreProyecto);
        if(proyecto!=null)
        {
            planos.add(plano);
            System.out.println("Se a agregado..");
        }
        
    }
    public double areaGeneral()
    {
        
        if(op==1)
        {
            ///triangulo
            area=(b*h)/2;
            System.out.println("area:"+area);
            return area;
        }
        else if(op==2)
        {
            //area del cuadrado
            area=b*b;
            System.out.println("area del cuadrado:"+area);
            return area;
        }
        else if(op==3)
        {
            // rectangulo y romboide
            area=b*h;
            System.out.println("area del rectangulo/romboide:"+area);
            return area;
        }
        else if(op==5)
        {
            area=b*b;
            System.out.println("area del cuadrado:"+area);
            return area;
        }
        return 0;
    }
    public double areaPoligono()
    {
        
        int op=0;
        perimetro =3*plano.getFiguras().get(op).getLineas().get(op).getLongitud();
        System.out.println("El perimettro es:"+perimetro);
        return perimetro;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public List<Proyecto> getListaProyecto() {
        return listaProyecto;
    }

    public void setListaProyecto(List<Proyecto> listaProyecto) {
        this.listaProyecto = listaProyecto;
    }

    public Proyecto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Proyecto seleccionado) {
        this.seleccionado = seleccionado;
    }

    public ArrayList<Plano> getPlanos() {
        return planos;
    }

    public void setPlanos(ArrayList<Plano> planos) {
        this.planos = planos;
    }

    public int getOp() {
        return op;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    
    
}

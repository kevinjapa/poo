/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Producto;

/**
 *
 * @author japak
 */
public class ControladorProducto 
{
   private List<Producto> listaProducto;
   private Producto seleccionado;
   double decimal,totalIva;
   
   public ControladorProducto()
   {
       listaProducto = new ArrayList();
       
   }
    public int generarId()
        {
            return (listaProducto.size()>0)? listaProducto.get(listaProducto.size()-1).getId()+1:1;
        }
        public void crear(String descripcion, double precioUnitario, int stock, int iva,String opcion)
        {
            
            if(opcion.equals("si"))
            {
                decimal=iva/100;
                totalIva=precioUnitario*decimal;
                System.out.println("Valor Iva:"+totalIva);
            }
            else if(opcion.equals("no"))
            {
                totalIva=iva; 
                System.out.print("No se calculo el Iva:");
            }
                
            else System.out.print("La opcion ingresada es erronea");
            
            Producto producto=new Producto(generarId(),descripcion, precioUnitario,stock,totalIva);
            listaProducto.add(producto);
            
        }
        public Producto buscar(String descripcion)
        {
        for(Producto producto: listaProducto)
        {
            if(producto.getDescripcion().equals(descripcion))
            {
                seleccionado= producto;
                return producto;
            }
           
        }
         return null;
    }
    public boolean actualizar(String descripcion, double precioUnitario, int stock, int iva)
    {
        Producto producto=buscar(descripcion);
        if(producto!=null)
        {
            int posicion=listaProducto.indexOf(descripcion);
            //producto.setDescripcion(descripcion);
            producto.setIva(iva);
            producto.setPrecioUnitario(precioUnitario);
            producto.setStock(stock);
            
            listaProducto.set(posicion, producto);
            return true;
        }
        return false;
    }
    public void eliminar(String nombre)
    {
        Producto producto=buscar(nombre);
        listaProducto.remove(producto);
    }
    public void listar()
            
    {
        for(int i =0;i<listaProducto.size();i++)
            
        {
            
            System.out.println("factura "+(i+1)+":"+listaProducto.get(i));   
        }
    }


}

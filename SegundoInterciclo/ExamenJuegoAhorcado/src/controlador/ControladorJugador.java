/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Jugador;

/**
 *
 * @author japak
 */
public class ControladorJugador 
{
    List<Jugador> listaJugador;
    private Jugador seleccionado;
    public ControladorJugador()
    {
        listaJugador=new ArrayList();
        seleccionado=null;
    }
    public int generarId()
    {
        if(listaJugador.size()>0)
        {
            return listaJugador.get(listaJugador.size()-1).getId()-1;
        }
        else
        {
            return 1;
        }
    }
    public void crear (String nombre, int numeroIntentos, int numeroAciertos)
    {
        Jugador j=new Jugador(generarId(),nombre,numeroIntentos,numeroAciertos);
        listaJugador.add(j);
    }
    public Jugador buscar(String nombre)
    {
        for(Jugador jugador: listaJugador)
        {
            if(jugador.getNombre().equals(nombre))
            {
                return jugador;
            }
        }
        return null;
    }
    public boolean actualizar(String nombre,int numeroIntentos, int numeroAciertos)
    {
        Jugador jugador =this.buscar(nombre);
        if(jugador !=null)
        {
            int posicion = listaJugador.indexOf(jugador);
            
            
            jugador.setNumeroAciertos(numeroAciertos);
            jugador.setNumeroIntentos(numeroIntentos);
            listaJugador.set(posicion, jugador);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre)
    {
        Jugador jugador=this.buscar(nombre);
        if(jugador!=null)
                return listaJugador.remove(jugador);
        return false;  
    }

    public List<Jugador> getListaJugador() {
        return listaJugador;
    }

    public void setListaJugador(List<Jugador> listaJugador) {
        this.listaJugador = listaJugador;
    }

    public Jugador getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Jugador seleccionado) {
        this.seleccionado = seleccionado;
    }
    public void listar()

    {
        System.out.println(listaJugador);
    }
}

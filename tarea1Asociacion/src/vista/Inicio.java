/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Modelo.*;

/**
 *
 * @author japak
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Aula a=new Aula();
        Asignatura as=new Asignatura();
        Grupo g=new Grupo();
        System.out.println("Grupo: "+g+" \nAula:"+a+" \nAsignatura:"+as);
    }
    
}

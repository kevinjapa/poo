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
public class Palabra 
{
    private int id;
    private String palabra1; 
    private String palabraI;
    
    public Palabra(String palabra1, String palabraI )
    {
        this.id = id;
        this.palabra1 = palabra1;
        this.palabraI=palabraI;
    }

    public Palabra(int id, String palabra1) {
        this.id = id;
        this.palabra1 = palabra1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public String getPalabraI() {
        return palabraI;
    }

    public void setPalabraI(String palabraI) {
        this.palabraI = palabraI;
    }

    @Override
    public String toString() {
        return palabra1;
    }
    
    
}

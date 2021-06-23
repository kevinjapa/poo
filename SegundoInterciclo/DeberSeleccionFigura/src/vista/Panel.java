/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import modelo.Figura;

/**
 *
 * @author japak
 */
public class Panel extends JPanel
{
    private Figura figura;
    private int tipoFigura;
    public Panel()
    {
        setBounds(100,100,500,500);
        figura=new Figura(0,0,200,200);
        tipoFigura=0;
    }
    @Override
    public void paint(Graphics lienzo)
    {
        lienzo.clearRect(0, 0, 600, 600);
        
        lienzo.setColor(Color.red);
        lienzo.drawString("Pain", 50, 50);
        if(tipoFigura==1)
        {
            lienzo.drawLine(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
        }
        else if(tipoFigura==2)
        {
            lienzo.drawRect(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
        }
        else if(tipoFigura==3)
        {
            lienzo.drawOval(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto());
        }
        else if(tipoFigura==4)
        {
            lienzo.drawRoundRect(figura.getX(), figura.getY(), figura.getAncho(), figura.getAlto(),20,20);
        }
    }

    public Figura getFigura() {
        return figura;
    }

    public void setFigura(Figura figura) {
        this.figura = figura;
    }

    public int getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(int tipoFigura) {
        this.tipoFigura = tipoFigura;
    }
    
}

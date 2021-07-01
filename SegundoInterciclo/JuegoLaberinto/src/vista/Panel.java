/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author japak
 */
public class Panel extends JPanel implements  MouseListener, MouseMotionListener
{
    public Panel()
    {
        setBounds(100,100,500,500);
        
    }
    @Override
    public void paint(Graphics lienzo)
    {
        lienzo.setColor(Color.black);
        lienzo.drawString("Juego del Laberinto",50,50);
        lienzo.setColor(Color.black);
        lienzo.setColor(Color.black);
        lienzo.drawString("Inicio",50,125);
        lienzo.drawLine(100, 100, 300, 100); 
        //lienzo.drawLine(150, 100, 150, 120); 
        lienzo.drawLine(150, 120, 270, 120);
        lienzo.drawLine(180, 120, 180, 175);
        lienzo.drawLine(180, 150, 230, 150);
        lienzo.drawLine(150, 140, 150, 200);
        lienzo.drawLine(110, 140, 150, 140);///////////////////
        lienzo.drawLine(100, 200, 300, 200);
        lienzo.drawLine(250, 140, 250, 200);
        lienzo.drawLine(250, 170, 290,170 );
        lienzo.drawLine(270, 100, 270, 150);//120 cambar en el if
        lienzo.drawString("FIN",340,140);
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent me) 
    {
        if(me.getY()==100 && (me.getX()<=300 && me.getX()>=100)){ //1
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getX()==150 && me.getY()>=100 && me.getY()<=120){//2
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getY()==120 && me.getX()>=150 && me.getX()<=270){//3
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getX()==180 && me.getY()>=120 && me.getY()<=175){//4
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getX()==150 && me.getY()>=140 && me.getY()<=200){//5
            JOptionPane.showMessageDialog(this, "Perdiste");
        }/*else if(me.getY()==140 && me.getX()>=110 && me.getX()<=150){//6
            JOptionPane.showMessageDialog(this, "Perdiste");
        }*/else if(me.getY()==200 && me.getX()>=100 && me.getX()<=300){//7
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getX()==250 && me.getY()>=140 && me.getY()<=200){//8
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getY()==170 && me.getX()>=250 && me.getX()<=290){//9
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getX()==270 && me.getY()>=100 && me.getY()<=150){//10
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if(me.getY()==150 && me.getX()>=180 && me.getX()<=230){//11
            JOptionPane.showMessageDialog(this, "Perdiste");
        }else if (me.getX()==300){
            JOptionPane.showMessageDialog(this, "Ganaste");
        }
        this.repaint();
    }
        
}

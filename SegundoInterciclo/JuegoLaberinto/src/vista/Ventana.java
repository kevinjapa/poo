/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author japak
 */
public class Ventana extends JFrame
{
    private JPanel panelLinea;
    private Panel panel;
    
    public Ventana()
    {
        setTitle("JUEGO LABERINTO");
        setBounds(50,50,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentes();
        
    }
    public void initComponentes()
    {
        panelLinea=new JPanel();
        panel=new Panel();
        add(panel);
        panel.repaint();
        addMouseMotionListener(panel);
        
    }
    
}

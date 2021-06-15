/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author japak
 */
public class VistaInico extends JFrame
{
    JPanel panelPrincipal;
    JButton boton;
    JTextField cuadroTexto=new JTextField("");
    JLabel etiqueta=new JLabel("Etiqueta");
    JTextArea cuadroTextoGrande=new JTextArea("");
    JComboBox cajaCombo=new JComboBox();
    String azar;
    public VistaInico()
    {
        super();
        
        setTitle("Mi primer GUI");
        setBounds(100,100,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //initComponentesBorderLayout();
        initComponentesGridLayout();
        setContentPane(panelPrincipal);
        
    }
    public void initComponentesGridLayout()
    {
        generarValor();
        panelPrincipal=new  JPanel();
        GridLayout tablaPlantilla=new GridLayout(4,3);
        panelPrincipal.setLayout(tablaPlantilla);
        int contador=0;
        for(int i=0;i<tablaPlantilla.getRows();i++)
        {
            for(int j=0; j<tablaPlantilla.getColumns();j++)
            {
                String texto =""+contador;
                if(contador==11)
                {
                    texto="Reiniciar";
                }
                boton=new JButton(texto);
                panelPrincipal.add(boton);
                //leee lo del botnm
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        JButton btn=(JButton)ae.getSource();
                        if(btn.getText().equals("Reiniciar"))
                        {
                            generarValor();
                            JOptionPane.showMessageDialog(panelPrincipal,"REINICIADO");
                        }
                        else if(btn.getText().equals(azar))
                        {
                            JOptionPane.showMessageDialog(panelPrincipal,"Has ganado !!:"+btn.getText());
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(panelPrincipal,"Estas Cerca:"+btn.getText());
                        }
                        
                    }
                });
                contador++;
            }
        }
    }
    public void generarValor()
    {
        Random rnd=new Random();
        azar=""+rnd.nextInt(10);
    }
    public void initComponentesBorderLayout()
    {
        panelPrincipal=new  JPanel();
        boton=new JButton();
        panelPrincipal.setBounds(0, 0, 500, 500);
        panelPrincipal.setBackground(Color.yellow);
        panelPrincipal.setLayout(new BorderLayout());
        boton.setText("Mi primer boton");
        boton.setBackground(Color.blue);
        boton.setBounds(10, 10, 25, 25);
        panelPrincipal.add(boton,BorderLayout.CENTER);
        panelPrincipal.add(cuadroTexto,BorderLayout.NORTH);
        panelPrincipal.add(cuadroTextoGrande,BorderLayout.SOUTH);
        panelPrincipal.add(etiqueta,BorderLayout.WEST);
        cajaCombo.addItem("seleccion 1");
        cajaCombo.addItem("Seleccion 2");
        cajaCombo.addItem("Seleccion 3");
        panelPrincipal.add(cajaCombo,BorderLayout.EAST);
    }
    
}

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
import java.util.ArrayList;
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
public class VistaCalculadora extends JFrame
{
    ArrayList lista=new ArrayList();
    JPanel panelPrincipal;
    JPanel panel;
    JButton boton;
    JTextField cuadroTexto=new JTextField("");
    int a,b;
    String op;
    int operacion;
    public VistaCalculadora()
    {
        super();
        setTitle("Calculadora");
        setBounds(100,100,500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentes();
        initCalculadora();
        setContentPane(panelPrincipal);
        setContentPane(panel);
    }
    public JPanel initCalculadora()
    {
        
        panelPrincipal=new  JPanel();
        GridLayout tablaPlantilla=new GridLayout(4,5);
        panelPrincipal.setLayout(tablaPlantilla);
        int contador=1;
        for(int i=0;i<tablaPlantilla.getRows();i++)
        {
            for(int j=0; j<tablaPlantilla.getColumns();j++)
            {
                String texto =""+contador;
                if(contador==4)
                {
                    texto="-";
                }
                else if(contador==5)
                {
                    texto="C";
                }
                else if(contador==9)
                {
                    texto="+";
                }
                else if(contador==10)
                {
                    texto="";
                }
                else if(contador==14)
                {
                    texto="*";
                }
                else if(contador==15)
                {
                    texto="";
                }
                else if(contador==17)
                {
                    texto="";
                }
                else if(contador==19)
                {
                    texto="/";
                }
                else if(contador==20)
                {
                    texto="=";
                }
                boton=new JButton(texto);
                panelPrincipal.add(boton);
                //leee lo del botnm
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        
                        JButton btn=(JButton)ae.getSource();
                        //v1=0;
                        if(btn.getText().equals("C"))
                        {
                           JOptionPane.showMessageDialog(panelPrincipal,"REINICIADO");
                        }
                        else if(btn.getText().equals("=")&&op.equals("+"))
                        {
                            for(int i=0; i<lista.size();i++)
                            {
                                for(int j=i+1;j<lista.size();i++)
                                {
                                    a=Integer.parseInt((String)lista.get(i));
                                    b=Integer.parseInt((String)lista.get(j));
                                    operacion=a+b;
                                    //lista.add(operacion);
                                    System.out.println("la suma es:"+operacion);
                                    j++;
                                }
                                
                            }
                            
                        }
                        else if(btn.getText().equals("+"))
                        {
                            op=btn.getText();
                            
                            //JOptionPane.showMessageDialog(panelPrincipal,"Has ganado !!:"+btn.getText());
                        }
                        else if(btn.getText().equals("-"))
                        {
                            op=btn.getText();
                        }
                        else if(btn.getText().equals("*"))
                        {
                            op=btn.getText();
                        }
                        else if(btn.getText().equals("/"))
                        {
                            op=btn.getText();
                        }
                        else if(btn.getText().equals("+"))
                        {
                            op=btn.getText();
                        }
                        else 
                        {
                            lista.add(btn.getText());
                            System.out.println("arreglo"+lista);
                        }
                        
                    }
                });
                contador++;
            }
        }
        return panelPrincipal;
    }
    public void initComponentes()
    {
        panel=new  JPanel();
        //panel.setBounds(0, 0, 10, 10);
        panel.setLayout(new BorderLayout());
        panel.add(cuadroTexto,BorderLayout.NORTH);
        panel.add(initCalculadora(),BorderLayout.CENTER);
    
    }
}

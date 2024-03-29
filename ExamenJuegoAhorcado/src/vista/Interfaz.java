/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Archivos.listaPalabra;
import controlador.ControladorJugador;
import controlador.ControladorPalabra;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Figura;
import modelo.Jugador;
import modelo.Palabra;

/**
 *
 * @author japak
 */
public class Interfaz extends javax.swing.JFrame {
    private DefaultTableModel tblModelEmpresa;
    private Panel panel;
    private Figura figura;
    int numeroIntentos=4;
    String palabra,numIntentos,numAciertos;
    int numeroAciertos=0;
    ControladorJugador controladorJugador;
    ControladorPalabra c =new ControladorPalabra();
    private int posicion;
    public Interfaz() {
        initComponents();
        agregarArchivo();
        controladorJugador=new ControladorJugador();
        tblModelEmpresa = (DefaultTableModel) tblLista.getModel();
        lblNombreI.setText("Nombre: Kevin Japa.");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        btnEnviar = new javax.swing.JButton();
        txtIngresePalabra = new javax.swing.JTextField();
        lblIngresePalabra = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        lblGenerarPalabra = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblIntentos3 = new javax.swing.JLabel();
        btnJugar = new javax.swing.JButton();
        lblAciertos = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        txtJugador = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblLista = new javax.swing.JTable();
        lblPalabra = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        lblNumeroIntentos2 = new javax.swing.JLabel();
        lblNumeroIntentos = new javax.swing.JLabel();
        lblNumeroAciertos = new javax.swing.JLabel();
        btnReiniciar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblNombreI = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Juego Ahorcado");
        setPreferredSize(new java.awt.Dimension(900, 682));

        btnEnviar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnEnviar.setForeground(new java.awt.Color(102, 102, 102));
        btnEnviar.setText("Probar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        txtIngresePalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIngresePalabraActionPerformed(evt);
            }
        });

        lblIngresePalabra.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lblIngresePalabra.setForeground(new java.awt.Color(102, 102, 102));
        lblIngresePalabra.setText("Ingrese la Palabra:");

        lblTitulo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(102, 102, 255));
        lblTitulo.setText("Juego Ahorcado");

        lblGenerarPalabra.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        lblGenerarPalabra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblIntentos3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblIntentos3.setForeground(new java.awt.Color(102, 102, 102));
        lblIntentos3.setText("Intentos");

        btnJugar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        lblAciertos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblAciertos.setForeground(new java.awt.Color(102, 102, 102));
        lblAciertos.setText("Numero de aciertos:");

        lblJugador.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblJugador.setText("Jugador:");

        txtJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJugadorActionPerformed(evt);
            }
        });

        tblLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lista Palabras "
            }
        ));
        jScrollPane2.setViewportView(tblLista);

        lblPalabra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblPalabra.setForeground(new java.awt.Color(102, 102, 102));
        lblPalabra.setText("Palabra:");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblNumeroIntentos2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        lblNumeroIntentos2.setForeground(new java.awt.Color(102, 102, 102));
        lblNumeroIntentos2.setText("Numero de intentos:");

        btnReiniciar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        btnReiniciar.setForeground(new java.awt.Color(102, 102, 102));
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblNombreI.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("Ahorcado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(lblNumeroIntentos2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblNumeroIntentos)
                                                    .addGap(167, 167, 167))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addGap(164, 164, 164)
                                                    .addComponent(lblAciertos)))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lblNumeroAciertos)
                                            .addGap(10, 10, 10))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                            .addComponent(lblJugador)
                                                            .addGap(124, 124, 124))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addGap(61, 61, 61)
                                                            .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                    .addComponent(btnJugar))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblIntentos3)
                                                        .addGap(120, 120, 120)
                                                        .addComponent(btnReiniciar)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(btnEnviar))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblIngresePalabra)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(txtIngresePalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(49, 49, 49)
                                                    .addComponent(lblPalabra)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(lblGenerarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGap(14, 14, 14)))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel1)))
                        .addGap(1179, 1179, 1179))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNombreI)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(lblTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJugador)
                            .addComponent(txtJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnJugar))
                        .addGap(15, 15, 15)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGenerarPalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPalabra))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAciertos)
                            .addComponent(lblNumeroIntentos2)
                            .addComponent(lblNumeroIntentos)
                            .addComponent(lblNumeroAciertos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIngresePalabra)
                            .addComponent(txtIngresePalabra, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblIntentos3)
                            .addComponent(btnEnviar)
                            .addComponent(btnReiniciar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(lblNombreI)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
       valoresEnviar();
    }//GEN-LAST:event_btnEnviarActionPerformed
    public void cargarDatos(){
            tblModelEmpresa.setRowCount(0);
            for(int i=0; i<=posicion; i++)
            {
                String datos[] = {txtIngresePalabra.getText()};
                tblModelEmpresa.addRow(datos);
               
            }
            
    }

    public boolean verificacion(String numero){
    try{
        Integer.parseInt(numero);
        return true;
    }catch(NumberFormatException e){
        return false;
    }
    }
    private void txtIngresePalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIngresePalabraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIngresePalabraActionPerformed

    private void txtJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtJugadorActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed

        controladorJugador.crear(txtJugador.getText(), numeroIntentos,numeroAciertos );
        //txtJugador.setText(null);
        numIntentos= String.valueOf(numeroIntentos);
        numAciertos= String.valueOf(numeroAciertos);
        lblNumeroIntentos.setText(numIntentos);
        lblNumeroAciertos.setText(numAciertos);
        controladorJugador.listar();
        palabra=c.obtenerPalabra();
        String palabra2=palabra.substring(0,1);
        lblGenerarPalabra.setText(palabra2);
        String val=palabra.substring(0,1);
        jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\0.png"));
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\0.png"));
        numeroIntentos=5;
        numeroAciertos=0;
        numAciertos= String.valueOf(numeroAciertos);
        palabra=c.obtenerPalabra();
        String palabra2=palabra.substring(0,1);
        lblGenerarPalabra.setText(palabra2);
        txtIngresePalabra.setText("");
        valoresEnviar();
    }//GEN-LAST:event_btnReiniciarActionPerformed
    public void valoresEnviar()
    {
         if(numeroIntentos>0)
        {
            if(verificacion(txtIngresePalabra.getText())!=true)
            {
                controladorJugador.actualizar(txtJugador.getText(), numeroIntentos, numeroAciertos);
                controladorJugador.listar();
                this.cargarDatos();
                if(c.comparacion(palabra, txtIngresePalabra.getText())!=true)
                {
                    numeroIntentos--;
                    numIntentos= String.valueOf(numeroIntentos);
                    lblNumeroIntentos.setText(numIntentos);
                    lblNumeroAciertos.setText(numAciertos);
                    System.out.println(txtIngresePalabra.getText());
                    txtIngresePalabra.setText("");
                    posicion++;
                    switch(numeroIntentos)
                    {
                        case 3:
                            jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\1.png"));
                            break;
                        case 2:
                            jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\2.png"));
                            break;
                        case 1:
                            jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\3.png"));
                            break;
                        case 0:
                            jLabel2.setIcon(new ImageIcon("C:\\Users\\japak\\Documents\\NetBeansProjects\\ExamenJuegoAhorcado\\build\\classes\\Archivos\\4.jpg")); 
                            lblGenerarPalabra.setText(palabra);
                            JOptionPane.showMessageDialog(null, "Perdio "+txtJugador.getText());
                    break;
                    }
                     
                }
                else
                {
                    numeroAciertos++;
                    numAciertos= String.valueOf(numeroAciertos);
                    lblGenerarPalabra.setText(palabra);
                    lblNumeroAciertos.setText(numAciertos);
                    JOptionPane.showMessageDialog(null, "GANADO "+txtJugador.getText());
                    palabra=c.obtenerPalabra();
                    String palabra2=palabra.substring(0,1);
                    lblGenerarPalabra.setText(palabra2);
                    txtIngresePalabra.setText("");
                    //valoresEnviar(); 
                }
                
                
            }
            else    
            {
                JOptionPane.showMessageDialog(null, "No ingrese valores numericos "+txtJugador.getText());
            }
            
        }
    }
    public void agregarArchivo()
    {
        c.crear("casa");
        c.crear("perro");
        c.crear("libro");
        c.crear("barco");
        c.crear("avion");
        c.crear("auto");
        c.crear("pepel");
        c.crear("moto");
        c.crear("librero");
        c.crear("baño");
        System.out.println(c);
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAciertos;
    private javax.swing.JLabel lblGenerarPalabra;
    private javax.swing.JLabel lblIngresePalabra;
    private javax.swing.JLabel lblIntentos3;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblNombreI;
    private javax.swing.JLabel lblNumeroAciertos;
    private javax.swing.JLabel lblNumeroIntentos;
    private javax.swing.JLabel lblNumeroIntentos2;
    private javax.swing.JLabel lblPalabra;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblLista;
    private javax.swing.JTextField txtIngresePalabra;
    private javax.swing.JTextField txtJugador;
    // End of variables declaration//GEN-END:variables
}

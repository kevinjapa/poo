/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;


import javax.swing.JOptionPane;

public class Juego extends javax.swing.JFrame {

    int turn=2;
    
    int usarboton[]={0,0,0,0,0,0,0,0,0};
    
    int jugador1gano[]={0,0,0,0,0,0,0,0,0};
    int jugador2gano[]={0,0,0,0,0,0,0,0,0};
    
    int jugador1gano(){
        if(jugador1gano[0]==1 && jugador1gano[1]==1 && jugador1gano[2]==1){
            return 1;
        }
         if(jugador1gano[3]==1 && jugador1gano[4]==1 && jugador1gano[5]==1){
            return 1;
        }
          if(jugador1gano[6]==1 && jugador1gano[7]==1 && jugador1gano[8]==1){
            return 1;
        }
           if(jugador1gano[0]==1 && jugador1gano[3]==1 && jugador1gano[6]==1){
            return 1;
        }
           if(jugador1gano[1]==1 && jugador1gano[4]==1 && jugador1gano[7]==1){
            return 1;
        }
            if(jugador1gano[2]==1 && jugador1gano[5]==1 && jugador1gano[8]==1){
            return 1;
        }
             if(jugador1gano[2]==1 && jugador1gano[4]==1 && jugador1gano[6]==1){
            return 1;
        }
              if(jugador1gano[0]==1 && jugador1gano[4]==1 && jugador1gano[8]==1){
            return 1;
        }
            
                return 0;
    }
     int jugador2gano(){
        if(jugador2gano[0]==1 && jugador2gano[1]==1 && jugador2gano[2]==1){
            return 1;
        }
         if(jugador2gano[3]==1 && jugador2gano[4]==1 && jugador2gano[5]==1){
            return 1;
        }
          if(jugador2gano[6]==1 && jugador2gano[7]==1 && jugador2gano[8]==1){
            return 1;
        }
           if(jugador2gano[0]==1 && jugador2gano[3]==1 && jugador2gano[6]==1){
            return 1;
        }
           if(jugador2gano[1]==1 && jugador2gano[4]==1 && jugador2gano[7]==1){
            return 1;
        }
            if(jugador2gano[2]==1 && jugador2gano[5]==1 && jugador2gano[8]==1){
            return 1;
        }
             if(jugador2gano[2]==1 && jugador2gano[4]==1 && jugador2gano[6]==1){
            return 1;
        }
              if(jugador2gano[0]==1 && jugador2gano[4]==1 && jugador2gano[8]==1){
            return 1;
        }
            
                return 0;
    }
    
    public Juego() {
         initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton1 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        resetear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Boton1.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });

        Boton3.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });

        Boton2.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });

        Boton4.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });

        Boton5.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });

        Boton7.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });

        Boton6.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });

        Boton8.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });

        Boton9.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });

        resetear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        resetear.setText("Intente otra vez");
        resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(121, 121, 121))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
       if(usarboton[0]==0){
            if(turn%2==0){
            turn++;
            Boton1.setText("X");
            usarboton[0]=1;
            jugador1gano[0]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 1. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 2. felicitaciones*****");
            }
        }else{
            turn++;
            Boton1.setText("O");
            usarboton[0]=1;
            jugador2gano[0]=1;
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 2. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 2. felicitaciones*****");
            }
            
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
       
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        
         if(usarboton[1]==0){
            if(turn%2==0){
            turn++;
            Boton2.setText("X");
            usarboton[1]=1;
            jugador1gano[1]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 2. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****ha ganado el jugador 2. felicitaciones*****");
            }
            
        }else{
            turn++;
            Boton2.setText("O");
            usarboton[1]=1;
            jugador2gano[1]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        
          if(usarboton[2]==0){
            if(turn%2==0){
            turn++;
            Boton3.setText("X");
            usarboton[2]=1;
            jugador1gano[2]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton3.setText("O");
            usarboton[2]=1;
            jugador2gano[2]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
        
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
       
          if(usarboton[3]==0){
            if(turn%2==0){
            turn++;
            Boton4.setText("X");
            usarboton[3]=1;
            jugador1gano[3]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton4.setText("O");
            usarboton[3]=1;
            jugador2gano[3]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton4ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        
         if(usarboton[4]==0){
            if(turn%2==0){
            turn++;
            Boton5.setText("X");
            usarboton[4]=1;
            jugador1gano[4]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton5.setText("O");
            usarboton[4]=1;
            jugador2gano[4]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
          if(usarboton[5]==0){
            if(turn%2==0){
            turn++;
            Boton6.setText("X");
            usarboton[5]=1;
            jugador1gano[5]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton6.setText("O");
            usarboton[5]=1;
            jugador2gano[5]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton6ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        
        if(usarboton[6]==0){
            if(turn%2==0){
            turn++;
            Boton7.setText("X");
            usarboton[6]=1;
            jugador1gano[6]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton7.setText("O");
            usarboton[6]=1;
            jugador2gano[6]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        
          if(usarboton[7]==0){
            if(turn%2==0){
            turn++;
            Boton8.setText("X");
            usarboton[7]=1;
            jugador1gano[7]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton8.setText("O");
            usarboton[7]=1;
            jugador2gano[7]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton8ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        
          if(usarboton[8]==0){
            if(turn%2==0){
            turn++;
            Boton9.setText("X");
            usarboton[8]=1;
            jugador1gano[8]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }else{
            turn++;
            Boton9.setText("O");
            usarboton[8]=1;
            jugador2gano[8]=1;
            
            int resultado1=jugador1gano();
            int resultado2=jugador2gano();
            
            if(resultado1==1){
                JOptionPane.showMessageDialog(rootPane, "*****tu has ganado. felicitaciones*****");
            }else if(resultado2==1){
                JOptionPane.showMessageDialog(rootPane, "*****JAJAJAJAJAJAJAJA.....mala suerte. ha ganado la maquina*****");
            }
        }
       }else{
           JOptionPane.showMessageDialog(rootPane, "este boton ya esta usado");
       }
    }//GEN-LAST:event_Boton9ActionPerformed

    private void resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetearActionPerformed
        
        Boton1.setText("");
        Boton2.setText("");
        Boton3.setText("");
        Boton4.setText("");
        Boton5.setText("");
        Boton6.setText("");
        Boton7.setText("");
        Boton8.setText("");
        Boton9.setText("");
       
        turn=2;
        for(int i=0;i<9;i++){
            usarboton[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador1gano[i]=0;
        }
        for(int i=0;i<9;i++){
            jugador2gano[i]=0;
        }
        
    }//GEN-LAST:event_resetearActionPerformed

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
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Juego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Juego().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton resetear;
    // End of variables declaration//GEN-END:variables
}

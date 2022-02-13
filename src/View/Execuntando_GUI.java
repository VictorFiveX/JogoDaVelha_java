
package View;

import javax.swing.JOptionPane;

public class Execuntando_GUI extends javax.swing.JFrame {

    boolean jogador1Ativo = true;
    boolean jogador2Ativo = false;
    int VitoriasJogador1 = 0;
    int VitoriasJogador2 = 0;
    int Empate = 0;

    public Execuntando_GUI() {
        initComponents();
    }

     public void jogadorAtivo(){
        
    if(jogador1Ativo == true){
        
        jogador1Ativo = false;
        jogador2Ativo = true;
    }else{
        jogador1Ativo = true;
        jogador2Ativo = false;
       
        }
        JogadorVencedor("X");
        JogadorVencedor("O");
    }
        //-----------------verificaçao linha---------
        public void JogadorVencedor(String Jogador){
        if(B1.getText().equals(Jogador) &&
        B2.getText().equals(Jogador) &&
        B3.getText().equals(Jogador)){

        if(B1.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("Jogador 2");
        }

        if(B4.getText().equals(Jogador) &&
        B5.getText().equals(Jogador) &&
        B6.getText().equals(Jogador)){

        if(B4.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }

        if(B7.getText().equals(Jogador) &&
        B8.getText().equals(Jogador) &&
        B9.getText().equals(Jogador)){

        if(B7.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }
        //--------------------coluna------------
        if(B1.getText().equals(Jogador) &&
        B4.getText().equals(Jogador) &&
        B7.getText().equals(Jogador)){

        if(B1.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }

        if(B2.getText().equals(Jogador) &&
        B5.getText().equals(Jogador) &&
        B8.getText().equals(Jogador)){

        if(B2.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }


        if(B3.getText().equals(Jogador) &&
        B6.getText().equals(Jogador) &&
        B9.getText().equals(Jogador)){

        if(B3.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }
        //-------------diagonal----------//
        if(B1.getText().equals(Jogador) &&
        B5.getText().equals(Jogador) &&
        B9.getText().equals(Jogador)){

        if(B1.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }
        if(B3.getText().equals(Jogador) &&
        B5.getText().equals(Jogador) &&
        B7.getText().equals(Jogador)){

        if(B3.getText().equals("X"))
        Vencedor("Jogador 1");
        else
        Vencedor("jogador 2");
        }
        //------------------- empate----------------//
        if(!B1.getText().equals("") &&
        !B2.getText().equals("") &&
        !B3.getText().equals("") &&
        !B4.getText().equals("") &&
        !B5.getText().equals("") &&
        !B6.getText().equals("") &&
        !B7.getText().equals("") &&
        !B8.getText().equals("") &&
        !B9.getText().equals("") )
        {
        Vencedor("empate");
        }

        }
       
          
   
    public void Vencedor(String JogadorVencedor){
    if(JogadorVencedor.equals("Jogador 1")){
    JOptionPane.showMessageDialog(Execuntando_GUI.this,"Parabéns Jogador 1! \n Voce venceu o jogo");
    VitoriasJogador1++;
    NumeroDeVitorias1.setText("Numero de vitorias: " + VitoriasJogador1);
     
   LimparCampos();
    }
    
    if(JogadorVencedor.equals("Jogador 2")){
    JOptionPane.showMessageDialog(Execuntando_GUI.this,"Parabéns Jogador 2! \n Voce venceu o jogo");
   
    VitoriasJogador2++;
    NumeroDeVitorias2.setText("Numero de vitorias: " + VitoriasJogador2);
    
    LimparCampos();
    }
    if(JogadorVencedor.equals("empate")){
    JOptionPane.showMessageDialog(Execuntando_GUI.this,"Deu Velha !!! \n jogue novamente");
    Empate++;
    Empates.setText("Empates " + Empate);
   
    LimparCampos();
    }
    }

    public void LimparCampos(){

    B1.setText("");
    B2.setText("");
    B3.setText("");
    B4.setText("");
    B5.setText("");
    B6.setText("");
    B7.setText("");
    B8.setText("");
    B9.setText("");
     
    jogador1Ativo = true;
    jogador2Ativo = false;

    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        B7 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        NovoJogo = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        NumeroDeVitorias1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Empates = new javax.swing.JLabel();
        NumeroDeVitorias2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelImage1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/papelwallpaper2.jpg"))); // NOI18N
        panelImage1.setLayout(null);

        B7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B7.setContentAreaFilled(false);
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        panelImage1.add(B7);
        B7.setBounds(40, 190, 60, 40);

        B1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B1.setContentAreaFilled(false);
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        panelImage1.add(B1);
        B1.setBounds(40, 50, 60, 40);

        B2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B2.setContentAreaFilled(false);
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        panelImage1.add(B2);
        B2.setBounds(130, 50, 60, 40);

        B3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B3.setContentAreaFilled(false);
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        panelImage1.add(B3);
        B3.setBounds(220, 50, 60, 40);

        B9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B9.setContentAreaFilled(false);
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        panelImage1.add(B9);
        B9.setBounds(220, 190, 60, 40);

        B5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B5.setContentAreaFilled(false);
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        panelImage1.add(B5);
        B5.setBounds(130, 120, 60, 40);

        B6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B6.setContentAreaFilled(false);
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        panelImage1.add(B6);
        B6.setBounds(220, 120, 60, 40);

        B4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B4.setContentAreaFilled(false);
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        panelImage1.add(B4);
        B4.setBounds(40, 120, 60, 40);

        B8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        B8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        B8.setContentAreaFilled(false);
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        panelImage1.add(B8);
        B8.setBounds(130, 190, 60, 40);

        NovoJogo.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        NovoJogo.setText("Novo jogo");
        NovoJogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        NovoJogo.setContentAreaFilled(false);
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        panelImage1.add(NovoJogo);
        NovoJogo.setBounds(287, 300, 110, 30);

        BtnSair.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        BtnSair.setText("Sair do jogo");
        BtnSair.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnSair.setContentAreaFilled(false);
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });
        panelImage1.add(BtnSair);
        BtnSair.setBounds(427, 300, 110, 30);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setText("Informações do jogo");
        panelImage1.add(jLabel1);
        jLabel1.setBounds(330, 30, 190, 20);

        NumeroDeVitorias1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NumeroDeVitorias1.setText("Vitorias: 0");
        panelImage1.add(NumeroDeVitorias1);
        NumeroDeVitorias1.setBounds(330, 110, 160, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel3.setText("Simbolo: X");
        panelImage1.add(jLabel3);
        jLabel3.setBounds(420, 70, 80, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setText("Jogador 2");
        panelImage1.add(jLabel5);
        jLabel5.setBounds(330, 150, 110, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setText("Simbolo: 0");
        panelImage1.add(jLabel6);
        jLabel6.setBounds(420, 150, 80, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel4.setText("Jogador 1");
        panelImage1.add(jLabel4);
        jLabel4.setBounds(330, 70, 110, 30);

        Empates.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        Empates.setText("Empates: 0");
        panelImage1.add(Empates);
        Empates.setBounds(330, 240, 110, 30);

        NumeroDeVitorias2.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        NumeroDeVitorias2.setText("Vitorias: 0");
        panelImage1.add(NumeroDeVitorias2);
        NumeroDeVitorias2.setBounds(330, 190, 160, 30);

        getContentPane().add(panelImage1);
        panelImage1.setBounds(0, 0, 550, 350);

        setSize(new java.awt.Dimension(550, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
         if(jogador1Ativo == true){
        if(B7.getText().equals("")){
        B7.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B7.getText().equals("")){
        B7.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
         if(jogador1Ativo == true){
        if(B3.getText().equals("")){
        B3.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B3.getText().equals("")){
        B3.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
         if(jogador1Ativo == true){
        if(B9.getText().equals("")){
        B9.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B9.getText().equals("")){
        B9.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if(jogador1Ativo == true){
        if(B5.getText().equals("")){
        B5.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B5.getText().equals("")){
        B5.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if(jogador1Ativo == true){
        if(B6.getText().equals("")){
        B6.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B6.getText().equals("")){
        B6.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
         if(jogador1Ativo == true){
        if(B4.getText().equals("")){
        B4.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B4.getText().equals("")){
        B4.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
         if(jogador1Ativo == true){
        if(B8.getText().equals("")){
        B8.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B8.getText().equals("")){
        B8.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
      if(jogador1Ativo == true){
        if(B1.getText().equals("")){
        B1.setText("X");
        jogadorAtivo();
        }
    } else{
        if(B1.getText().equals("")){
        B1.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if(jogador1Ativo == true){
        if(B2.getText().equals("")){
        B2.setText("X");
        jogadorAtivo();
        }
        } else{
        if(B2.getText().equals("")){
        B2.setText("O");
        jogadorAtivo();
        
           }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        new Jogo_GUI().setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnSairActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
    Empates.setText("Vitorias: ");
    NumeroDeVitorias2.setText("Vitorias: ");
    NumeroDeVitorias1.setText("Vitorias: ");
    VitoriasJogador1 = 0;
    VitoriasJogador2 = 0;
        LimparCampos();
        
    }//GEN-LAST:event_NovoJogoActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Execuntando_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Execuntando_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Execuntando_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Execuntando_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Execuntando_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    public javax.swing.JButton B9;
    private javax.swing.JButton BtnSair;
    private javax.swing.JLabel Empates;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeVitorias1;
    private javax.swing.JLabel NumeroDeVitorias2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables

    
}

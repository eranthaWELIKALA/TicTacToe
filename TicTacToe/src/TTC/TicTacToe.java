/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TTC;

import java.awt.Button;
import java.awt.Color;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import sun.audio.*;

/**
 *
 * @author Welikala EY
 */
public class TicTacToe extends javax.swing.JFrame {

    /**
     * Creates new form TicTacToe
     */
    
    private String Tic = "X";
    
    private int turns = 0;
    private int round = 1;
    private int xCount = 0;
    private int oCount = 0;
    
    public TicTacToe() {
        initComponents();
        setSize(360,600);
        setLocationRelativeTo(null);
        JOptionPane.showMessageDialog(this,"Player X's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        
//        AudioPlayer AP = AudioPlayer.player;
//        AudioStream AS;
//        AudioData AD;
//        ContinuousAudioDataStream loop = null;
//        
//        try{
//            AS = new AudioStream(new FileInputStream("Loop.wav"));
//            AD = AS.getData();
//            loop = new ContinuousAudioDataStream(AD);
//        }
//        catch(IOException e){
//            
//        }
//        AP.start(loop);

        InputStream music;
        try{
            music = new FileInputStream(new File("Loop.wav"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e){
            
        }
        
    }
    
    private void changeTic(){
        if(Tic.equalsIgnoreCase("X")){
            Tic = "O";
        }
        else{
            Tic = "X";
        }
    }
    private void colourTic(JButton btn){
        JButton bn = btn;
        bn.setEnabled(false);
        if(Tic.equalsIgnoreCase("X")){
            bn.setForeground(Color.GREEN);
        }
        else{
            bn.setForeground(Color.BLUE);;
        }
    }
    
    private void buttonReset(){
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        if(round%2==1){
            Tic = "X";
        }
        else{
            Tic = "O";
        }
        
    }
    
    private void isWon(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1.equals(Tic) && b2.equals(Tic) && b3.equals(Tic) || b4.equals(Tic) && b5.equals(Tic) && b6.equals(Tic) || b7.equals(Tic) && b8.equals(Tic) && b9.equals(Tic)){
            InputStream music;
        try{
            music = new FileInputStream(new File("Tada.wav"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e){
            
        }
            JOptionPane.showMessageDialog(this,"Player "+Tic+" wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            if(Tic.equals("X")){
                xCount++;
            }
            else{
                oCount++;
            }
            playerOneCount.setText(String.valueOf(xCount));
            playerTwoCount.setText(String.valueOf(oCount));
            if(round%2==1){
                JOptionPane.showMessageDialog(this,"Player O's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Player X's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            
            buttonReset();
            round++;turns = 0;
            
            
        }
        else if(b1.equals(Tic) && b4.equals(Tic) && b7.equals(Tic) || b2.equals(Tic) && b5.equals(Tic) && b8.equals(Tic) || b3.equals(Tic) && b6.equals(Tic) && b9.equals(Tic)){
            InputStream music;
        try{
            music = new FileInputStream(new File("Tada.wav"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e){
            
        }
            JOptionPane.showMessageDialog(this,"Player "+Tic+" wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            if(Tic.equals("X")){
                xCount++;
            }
            else{
                oCount++;
            }
            playerOneCount.setText(String.valueOf(xCount));
            playerTwoCount.setText(String.valueOf(oCount));
            if(round%2==1){
                JOptionPane.showMessageDialog(this,"Player O's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Player X's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            
            buttonReset();
            round++;turns = 0;
            
        }
        else if(b1.equals(Tic) && b5.equals(Tic) && b9.equals(Tic) || b3.equals(Tic) && b5.equals(Tic) && b7.equals(Tic)){
            InputStream music;
        try{
            music = new FileInputStream(new File("Tada.wav"));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);
        }
        catch(IOException e){
            
        }
            JOptionPane.showMessageDialog(this,"Player "+Tic+" wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            if(Tic.equals("X")){
                xCount++;
            }
            else{
                oCount++;
            }
            playerOneCount.setText(String.valueOf(xCount));
            playerTwoCount.setText(String.valueOf(oCount));
            if(round%2==1){
                
                JOptionPane.showMessageDialog(this,"Player O's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Player X's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            
            buttonReset();
            round++;turns = 0;
            
        }
        else if(turns==9){
            JOptionPane.showMessageDialog(this,"Match is Drawn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            if(round%2==1){
                
                JOptionPane.showMessageDialog(this,"Player O's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(this,"Player X's Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            }
            buttonReset();
            round++;turns = 0;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GamePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        playerOne = new javax.swing.JLabel();
        playerOneCount = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        playerTwo = new javax.swing.JLabel();
        playerTwoCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe by EYW");
        setPreferredSize(new java.awt.Dimension(360, 600));
        getContentPane().setLayout(new java.awt.BorderLayout());

        GamePanel.setBackground(new java.awt.Color(0, 153, 153));
        GamePanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(51, 51, 51)));
        GamePanel.setToolTipText("");
        GamePanel.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        GamePanel.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new java.awt.GridLayout(4, 3, 2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton6, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton7, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel9.add(jButton8, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 96)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton9, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.GridLayout(2, 1, 2, 2));

        playerOne.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerOne.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerOne.setText("Player X");
        jPanel11.add(playerOne);

        playerOneCount.setBackground(new java.awt.Color(51, 255, 153));
        playerOneCount.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playerOneCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel11.add(playerOneCount);

        jPanel1.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));
        jPanel12.setLayout(new java.awt.GridLayout(2, 1, 3, 3));

        jButton10.setBackground(new java.awt.Color(204, 204, 204));
        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 51, 51));
        jButton10.setText("RESET");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton10);

        jButton11.setBackground(new java.awt.Color(102, 255, 102));
        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 255));
        jButton11.setText("Start");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton11);

        jPanel1.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.GridLayout(2, 1, 2, 2));

        playerTwo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        playerTwo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerTwo.setText("Player O");
        jPanel13.add(playerTwo);

        playerTwoCount.setBackground(new java.awt.Color(51, 255, 204));
        playerTwoCount.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        playerTwoCount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel13.add(playerTwoCount);

        jPanel1.add(jPanel13);

        GamePanel.add(jPanel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(GamePanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton1.setText(Tic);
        colourTic(jButton1);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        buttonReset();
        turns = 0;
        JOptionPane.showMessageDialog(this,"Player "+Tic+"'s Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton2.setText(Tic);
        colourTic(jButton2);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton3.setText(Tic);
        colourTic(jButton3);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton4.setText(Tic);
        colourTic(jButton4);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton5.setText(Tic);
        colourTic(jButton5);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton6.setText(Tic);
        colourTic(jButton6);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton7.setText(Tic);
        colourTic(jButton7);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton8.setText(Tic);
        colourTic(jButton8);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        turns++;
        jButton9.setText(Tic);
        colourTic(jButton9);isWon();
        changeTic();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        Tic = "X";
        buttonReset();
        changeTic();
        xCount = 0;
        oCount = 0;
        turns = 0;
        round = 0;
        playerOneCount.setText("");
        playerTwoCount.setText("");
        JOptionPane.showMessageDialog(this,"Player "+Tic+"'s Turn","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton11ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GamePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel playerOne;
    private javax.swing.JLabel playerOneCount;
    private javax.swing.JLabel playerTwo;
    private javax.swing.JLabel playerTwoCount;
    // End of variables declaration//GEN-END:variables
}

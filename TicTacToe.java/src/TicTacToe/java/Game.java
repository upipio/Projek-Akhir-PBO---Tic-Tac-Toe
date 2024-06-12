/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe.java;

import java.awt.Color;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author
 */

public class Game extends JFrame{
    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    private JFrame frame;
    /**
     * Membuat public game
     */
    public Game(){
        initComponents();
    }
    
    /**
     * 
     * @param username untuk mengambil input username X
     * @param username2 untuk mengambil input username O
     */
    public Game(String username, String username2){
        initComponents();
        jLabel1.setText(username); // Set label1 dengan username
        jLabel2.setText(username2);
    }
    
    private void choose_a_Player(){
        if(startGame.equalsIgnoreCase("X")){
            startGame ="O";
        }else{
            startGame ="X";
        }
    }
    
    private void gameScore(){
        jlblPlayerX.setText(String.valueOf(xCount));
        jlblPlayerO.setText(String.valueOf(oCount));
    }
    
    //private void enableFalse()
    //{
    //            jbtnTic1.setEnabled(false);
    //            jbtnTic2.setEnabled(false);
    //            jbtnTic3.setEnabled(false);
    //            jbtnTic4.setEnabled(false);
    //            jbtnTic5.setEnabled(false);
    //            jbtnTic6.setEnabled(false);
    //            jbtnTic7.setEnabled(false);
    //            jbtnTic8.setEnabled(false);
    //            jbtnTic9.setEnabled(false);
    //            
    //            
    //}
    
    private void winningGame(){
        String b1 = jButton1.getText();
        String b2 = jButton2.getText();
        String b3 = jButton3.getText();
        
        String b4 = jButton4.getText();
        String b5 = jButton5.getText();
        String b6 = jButton6.getText();
        
        String b7 = jButton7.getText();
        String b8 = jButton8.getText();
        String b9 = jButton9.getText();
        
        if(b1==("X") & b2 == ("X") & b3 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            jButton1.setBackground(Color.YELLOW);
            jButton2.setBackground(Color.YELLOW);
            jButton3.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
        }
        
        if(b4==("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton4.setBackground(Color.CYAN);
            jButton5.setBackground(Color.CYAN);
            jButton6.setBackground(Color.CYAN);
        }
        
        if(b7==("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton7.setBackground(Color.CYAN);
            jButton8.setBackground(Color.CYAN);
            jButton9.setBackground(Color.CYAN);
        }
        
        if(b1==("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.MAGENTA);
            jButton4.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
        }
        
        if(b2==("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton2.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton8.setBackground(Color.PINK);
        }
        
        if(b3==("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.MAGENTA);
            jButton6.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
         }
        
        if(b1==("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton1.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
        }
        
        if(b3==("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            jButton3.setBackground(Color.cyan);
            jButton5.setBackground(Color.cyan);
            jButton7.setBackground(Color.cyan);
        }
        
        if(b1==("O") && b2 == ("O") && b3 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.PINK);
            jButton2.setBackground(Color.PINK);
            jButton3.setBackground(Color.PINK);
        }
        
        if(b4==("O") && b5 == ("O") && b6 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton4.setBackground(Color.YELLOW);
            jButton5.setBackground(Color.YELLOW);
            jButton6.setBackground(Color.YELLOW);
       }
        
        if(b7==("O") && b8 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton7.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            jButton9.setBackground(Color.MAGENTA);
           // enableFalse();
        }
        
        if(b1==("O") && b4 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.MAGENTA);
            jButton4.setBackground(Color.MAGENTA);
            jButton7.setBackground(Color.MAGENTA);
           // enableFalse();
        }
        
        if(b2==("O") && b5 == ("O") && b8 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton2.setBackground(Color.MAGENTA);
            jButton5.setBackground(Color.MAGENTA);
            jButton8.setBackground(Color.MAGENTA);
            //enableFalse();
        }
        
        if(b3==("O") && b6 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.PINK);
            jButton6.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
           // enableFalse();
        }
        
        if(b1==("O") && b5 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton1.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton9.setBackground(Color.PINK);
           // enableFalse();
        }
        
        if(b3==("O") && b5 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            jButton3.setBackground(Color.PINK);
            jButton5.setBackground(Color.PINK);
            jButton7.setBackground(Color.PINK);
           // enableFalse();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        newGame = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");

        jlblPlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);

        jlblPlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlblPlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblPlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        exit.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        exit.setText("EXIT");
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exit.setMaximumSize(new java.awt.Dimension(200, 158));
        exit.setMinimumSize(new java.awt.Dimension(200, 158));
        exit.setPreferredSize(new java.awt.Dimension(200, 158));
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        newGame.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        newGame.setText("NEW GAME");
        newGame.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newGame.setMaximumSize(new java.awt.Dimension(200, 158));
        newGame.setMinimumSize(new java.awt.Dimension(200, 158));
        newGame.setPreferredSize(new java.awt.Dimension(200, 158));
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        reset.setText("RESET");
        reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setMaximumSize(new java.awt.Dimension(200, 158));
        reset.setMinimumSize(new java.awt.Dimension(200, 158));
        reset.setPreferredSize(new java.awt.Dimension(200, 158));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGame, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reset, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 227, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 660, 630));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton1.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton1.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton1.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 20, 184, 181));

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton2.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton2.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton2.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 20, 184, 181));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton3.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton3.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton3.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 184, 181));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton6.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton6.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton6.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 228, 184, 181));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton4.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton4.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton4.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 228, 184, 181));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton5.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton5.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton5.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 228, 184, 181));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton7.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton7.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton7.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 184, 181));

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton8.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton8.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton8.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 184, 181));

        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        jButton9.setMaximumSize(new java.awt.Dimension(200, 158));
        jButton9.setMinimumSize(new java.awt.Dimension(200, 158));
        jButton9.setPreferredSize(new java.awt.Dimension(200, 158));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 184, 181));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 690, 630));

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TIC TAC TOE TRIO INFORMATICS MORTAL");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 1350, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1370, 100));

        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton10.setText("History");
        jButton10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 760, 370, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButton1.setText(startGame);
    
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic1.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic1.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.RED);
             checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic1.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jButton2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jButton6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jButton4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jButton9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jButton7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            //jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jButton8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic1.setBackground(Color.YELLOW);
            checker = false;
        }else{
            //jbtnTic2.setForeground(Color.BLACK);
            // jbtnTic2.setBackground(Color.RED);
            checker = true;
        }
        choose_a_Player();
        winningGame();
        //jbtnTic2.setEnabled(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jlblPlayerX.setText("0");
        jlblPlayerO.setText("0");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_newGameActionPerformed
        
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButton9.setEnabled(true);
        
        jButton1.setText("");
        jButton2.setText("");
        jButton3.setText("");
        jButton4.setText("");
        jButton5.setText("");
        jButton6.setText("");
        jButton7.setText("");
        jButton8.setText("");
        jButton9.setText("");
        
        jButton1.setBackground(Color.LIGHT_GRAY);
        jButton2.setBackground(Color.LIGHT_GRAY);
        jButton3.setBackground(Color.LIGHT_GRAY);
        jButton4.setBackground(Color.LIGHT_GRAY);
        jButton5.setBackground(Color.LIGHT_GRAY);
        jButton6.setBackground(Color.LIGHT_GRAY);
        jButton7.setBackground(Color.LIGHT_GRAY);
        jButton8.setBackground(Color.LIGHT_GRAY);
        jButton9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_resetActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    private javax.swing.JButton newGame;
    private javax.swing.JButton reset;
    // End of variables declaration//GEN-END:variables
}

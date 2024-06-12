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
    boolean check;
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
        playerX.setText(username); // Set playerX dengan username
        playerO.setText(username2); // Set playerO dengan username2
    }
    
    private void pilihPlayer(){
        if(startGame.equalsIgnoreCase("X")){
            startGame ="O";
        }else{
            startGame ="X";
        }
    }
    
    private void playerScore(){
        scorePlayerX.setText(String.valueOf(xCount));
        scorePlayerO.setText(String.valueOf(oCount));
    }
    
    private void enableFalse(){
        kotak1.setEnabled(false);
        kotak2.setEnabled(false);
        kotak3.setEnabled(false);
        kotak4.setEnabled(false);
        kotak5.setEnabled(false);
        kotak6.setEnabled(false);
        kotak7.setEnabled(false);
        kotak8.setEnabled(false);
        kotak9.setEnabled(false);
    }
    
    private void menang(){
        String b1 = kotak1.getText();
        String b2 = kotak2.getText();
        String b3 = kotak3.getText();
        
        String b4 = kotak4.getText();
        String b5 = kotak5.getText();
        String b6 = kotak6.getText();
        
        String b7 = kotak7.getText();
        String b8 = kotak8.getText();
        String b9 = kotak9.getText();
        
        if(b1==("X") & b2 == ("X") & b3 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak2.setBackground(Color.PINK);
            kotak3.setBackground(Color.PINK);
            xCount -=-1;
            enableFalse();
        }
        
        if(b4==("X") && b5 == ("X") && b6 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak4.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak6.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b7==("X") && b8 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak7.setBackground(Color.PINK);
            kotak8.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b1==("X") && b4 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak4.setBackground(Color.PINK);
            kotak7.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b2==("X") && b5 == ("X") && b8 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak2.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak8.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b3==("X") && b6 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak3.setBackground(Color.PINK);
            kotak6.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
         }
        
        if(b1==("X") && b5 == ("X") && b9 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b3==("X") && b5 == ("X") && b7 == ("X")){
            JOptionPane.showMessageDialog(this,"Player X Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount -=-1;
            playerScore();
            kotak3.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak7.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b1==("O") && b2 == ("O") && b3 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak2.setBackground(Color.PINK);
            kotak3.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b4==("O") && b5 == ("O") && b6 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak4.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak6.setBackground(Color.PINK);
            enableFalse();
       }
        
        if(b7==("O") && b8 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak7.setBackground(Color.PINK);
            kotak8.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b1==("O") && b4 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak4.setBackground(Color.PINK);
            kotak7.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b2==("O") && b5 == ("O") && b8 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak2.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak8.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b3==("O") && b6 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak3.setBackground(Color.PINK);
            kotak6.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b1==("O") && b5 == ("O") && b9 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak1.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak9.setBackground(Color.PINK);
            enableFalse();
        }
        
        if(b3==("O") && b5 == ("O") && b7 == ("O")){
            JOptionPane.showMessageDialog(this,"Player O Wins", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount -=-1;
            playerScore();
            kotak3.setBackground(Color.PINK);
            kotak5.setBackground(Color.PINK);
            kotak7.setBackground(Color.PINK);
            enableFalse();
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
        playerX = new javax.swing.JLabel();
        playerO = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        scorePlayerX = new javax.swing.JLabel();
        scorePlayerO = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        exitButton = new javax.swing.JButton();
        newGameButton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        kotak1 = new javax.swing.JButton();
        kotak2 = new javax.swing.JButton();
        kotak3 = new javax.swing.JButton();
        kotak6 = new javax.swing.JButton();
        kotak4 = new javax.swing.JButton();
        kotak5 = new javax.swing.JButton();
        kotak7 = new javax.swing.JButton();
        kotak8 = new javax.swing.JButton();
        kotak9 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        historyDatabase = new javax.swing.JButton();

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

        playerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        playerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerX.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        playerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        playerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        playerO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        playerO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("=");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("=");

        scorePlayerX.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        scorePlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorePlayerX.setText("0");
        scorePlayerX.setOpaque(true);

        scorePlayerO.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        scorePlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scorePlayerO.setText("0");
        scorePlayerO.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(playerO, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(playerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scorePlayerO, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scorePlayerX, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scorePlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(playerX, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(scorePlayerO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerO, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, -1, -1));

        jPanel5.setBackground(new java.awt.Color(255, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        exitButton.setText("EXIT");
        exitButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        exitButton.setMaximumSize(new java.awt.Dimension(200, 158));
        exitButton.setMinimumSize(new java.awt.Dimension(200, 158));
        exitButton.setPreferredSize(new java.awt.Dimension(200, 158));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        newGameButton.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        newGameButton.setText("NEW GAME");
        newGameButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        newGameButton.setMaximumSize(new java.awt.Dimension(200, 158));
        newGameButton.setMinimumSize(new java.awt.Dimension(200, 158));
        newGameButton.setPreferredSize(new java.awt.Dimension(200, 158));
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        resetButton.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        resetButton.setText("RESET");
        resetButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        resetButton.setMaximumSize(new java.awt.Dimension(200, 158));
        resetButton.setMinimumSize(new java.awt.Dimension(200, 158));
        resetButton.setPreferredSize(new java.awt.Dimension(200, 158));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                    .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 227, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 120, 660, 630));

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        kotak1.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak1.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak1.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak1.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak1ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 20, 184, 181));

        kotak2.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak2.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak2.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak2.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak2ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak2, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 20, 184, 181));

        kotak3.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak3.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak3.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak3.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak3ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 184, 181));

        kotak6.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak6.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak6.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak6.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak6ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 228, 184, 181));

        kotak4.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak4.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak4.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak4.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak4ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 228, 184, 181));

        kotak5.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak5.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak5.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak5.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak5ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak5, new org.netbeans.lib.awtextra.AbsoluteConstraints(257, 228, 184, 181));

        kotak7.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak7.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak7.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak7.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak7ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 184, 181));

        kotak8.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak8.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak8.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak8.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak8ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 184, 181));

        kotak9.setFont(new java.awt.Font("Segoe UI", 1, 96)); // NOI18N
        kotak9.setMaximumSize(new java.awt.Dimension(200, 158));
        kotak9.setMinimumSize(new java.awt.Dimension(200, 158));
        kotak9.setPreferredSize(new java.awt.Dimension(200, 158));
        kotak9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kotak9ActionPerformed(evt);
            }
        });
        jPanel3.add(kotak9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 440, 184, 181));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 690, 630));

        jPanel6.setBackground(new java.awt.Color(255, 204, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 66)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("TIC TAC TOE TRIO INFORMATICS MORTAL");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 1350, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1370, 100));

        historyDatabase.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        historyDatabase.setText("History");
        historyDatabase.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        historyDatabase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyDatabaseActionPerformed(evt);
            }
        });
        jPanel1.add(historyDatabase, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 760, 370, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kotak1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak1ActionPerformed
        kotak1.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak1.setForeground(Color.BLACK);
            kotak1.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak1.setForeground(Color.BLACK);
            kotak1.setBackground(Color.RED);
             check = true;
        }
        pilihPlayer();
        menang();
        kotak1.setEnabled(false);
    }//GEN-LAST:event_kotak1ActionPerformed

    private void kotak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak2ActionPerformed
        kotak2.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak2.setForeground(Color.BLACK);
            kotak2.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak2.setForeground(Color.BLACK);
            kotak2.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak2.setEnabled(false);
    }//GEN-LAST:event_kotak2ActionPerformed

    private void kotak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak3ActionPerformed
        kotak3.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak3.setForeground(Color.BLACK);
            kotak3.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak3.setForeground(Color.BLACK);
            kotak3.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak3.setEnabled(false);
    }//GEN-LAST:event_kotak3ActionPerformed

    private void kotak6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak6ActionPerformed
        kotak6.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak6.setForeground(Color.BLACK);
            kotak6.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak6.setForeground(Color.BLACK);
            kotak6.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak6.setEnabled(false);
    }//GEN-LAST:event_kotak6ActionPerformed

    private void kotak4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak4ActionPerformed
        kotak4.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak4.setForeground(Color.BLACK);
            kotak4.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak4.setForeground(Color.BLACK);
            kotak4.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak4.setEnabled(false);
    }//GEN-LAST:event_kotak4ActionPerformed

    private void kotak5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak5ActionPerformed
        kotak5.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak5.setForeground(Color.BLACK);
            kotak5.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak5.setForeground(Color.BLACK);
            kotak5.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak5.setEnabled(false);
    }//GEN-LAST:event_kotak5ActionPerformed

    private void kotak9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak9ActionPerformed
        kotak9.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak9.setForeground(Color.BLACK);
            kotak9.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak9.setForeground(Color.BLACK);
            kotak9.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak9.setEnabled(false);
    }//GEN-LAST:event_kotak9ActionPerformed

    private void kotak7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak7ActionPerformed
        kotak7.setText(startGame);
        if(startGame.equalsIgnoreCase("X")){
            kotak7.setForeground(Color.BLACK);
            kotak7.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak7.setForeground(Color.BLACK);
            kotak7.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak7.setEnabled(false);
    }//GEN-LAST:event_kotak7ActionPerformed

    private void kotak8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak8ActionPerformed
        kotak8.setText(startGame);
        if (startGame.equalsIgnoreCase("X")){
            kotak8.setForeground(Color.BLACK);
            kotak8.setBackground(Color.YELLOW);
            check = false;
        }else{
            kotak8.setForeground(Color.BLACK);
            kotak8.setBackground(Color.RED);
            check = true;
        }
        pilihPlayer();
        menang();
        kotak8.setEnabled(false);
    }//GEN-LAST:event_kotak8ActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit","Tic Tac Toe",JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        kotak1.setEnabled(true);
        kotak2.setEnabled(true);
        kotak3.setEnabled(true);
        kotak4.setEnabled(true);
        kotak5.setEnabled(true);
        kotak6.setEnabled(true);
        kotak7.setEnabled(true);
        kotak8.setEnabled(true);
        kotak9.setEnabled(true);
        
        kotak1.setText("");
        kotak2.setText("");
        kotak3.setText("");
        kotak4.setText("");
        kotak5.setText("");
        kotak6.setText("");
        kotak7.setText("");
        kotak8.setText("");
        kotak9.setText("");
        
        scorePlayerX.setText("0");
        xCount = 0;
        scorePlayerO.setText("0");
        oCount = 0;
        
        kotak1.setBackground(Color.LIGHT_GRAY);
        kotak2.setBackground(Color.LIGHT_GRAY);
        kotak3.setBackground(Color.LIGHT_GRAY);
        kotak4.setBackground(Color.LIGHT_GRAY);
        kotak5.setBackground(Color.LIGHT_GRAY);
        kotak6.setBackground(Color.LIGHT_GRAY);
        kotak7.setBackground(Color.LIGHT_GRAY);
        kotak8.setBackground(Color.LIGHT_GRAY);
        kotak9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_newGameButtonActionPerformed
        
    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        kotak1.setEnabled(true);
        kotak2.setEnabled(true);
        kotak3.setEnabled(true);
        kotak4.setEnabled(true);
        kotak5.setEnabled(true);
        kotak6.setEnabled(true);
        kotak7.setEnabled(true);
        kotak8.setEnabled(true);
        kotak9.setEnabled(true);
        
        kotak1.setText("");
        kotak2.setText("");
        kotak3.setText("");
        kotak4.setText("");
        kotak5.setText("");
        kotak6.setText("");
        kotak7.setText("");
        kotak8.setText("");
        kotak9.setText("");
        
        kotak1.setBackground(Color.LIGHT_GRAY);
        kotak2.setBackground(Color.LIGHT_GRAY);
        kotak3.setBackground(Color.LIGHT_GRAY);
        kotak4.setBackground(Color.LIGHT_GRAY);
        kotak5.setBackground(Color.LIGHT_GRAY);
        kotak6.setBackground(Color.LIGHT_GRAY);
        kotak7.setBackground(Color.LIGHT_GRAY);
        kotak8.setBackground(Color.LIGHT_GRAY);
        kotak9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_resetButtonActionPerformed

    private void historyDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyDatabaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_historyDatabaseActionPerformed

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
    private javax.swing.JButton exitButton;
    private javax.swing.JButton historyDatabase;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JButton kotak1;
    private javax.swing.JButton kotak2;
    private javax.swing.JButton kotak3;
    private javax.swing.JButton kotak4;
    private javax.swing.JButton kotak5;
    private javax.swing.JButton kotak6;
    private javax.swing.JButton kotak7;
    private javax.swing.JButton kotak8;
    private javax.swing.JButton kotak9;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel scorePlayerO;
    private javax.swing.JLabel scorePlayerX;
    // End of variables declaration//GEN-END:variables
}

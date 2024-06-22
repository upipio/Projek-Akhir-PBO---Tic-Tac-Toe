/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe.java;

import java.awt.Color;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Luthfi
 */
interface Score{ // interface menghitung perkiraan yang berhubungan dengan score
    default void pilihPlayer(String currentPlayer){
        if(currentPlayer.equalsIgnoreCase("O")){
            currentPlayer = "X";
        }else{
            currentPlayer = "O";
        }
    }
    void playerScore();
    static void methodDC(JButton kotak1, JButton kotak2, JButton kotak3, JButton kotak4, JButton kotak5, JButton kotak6, JButton kotak7, JButton kotak8, JButton kotak9){
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
    
    kotak1.setBackground(Color.LIGHT_GRAY); // set default
    kotak2.setBackground(Color.LIGHT_GRAY);
    kotak3.setBackground(Color.LIGHT_GRAY);
    kotak4.setBackground(Color.LIGHT_GRAY);
    kotak5.setBackground(Color.LIGHT_GRAY);
    kotak6.setBackground(Color.LIGHT_GRAY);
    kotak7.setBackground(Color.LIGHT_GRAY);
    kotak8.setBackground(Color.LIGHT_GRAY);
    kotak9.setBackground(Color.LIGHT_GRAY);
    }

}
public class Game extends JFrame implements Score{ // super class
    private String startGame ="X";
    private int xCount = 0;
    private int oCount = 0;
    private boolean check;
    private JFrame frame;
    public Bugger bug;
    public Game bug1;
    
    /**
     * Membuat public game
     */
    public Game(){ // konstruktor
        initComponents(); // Inisialisasi dri GUI
        bug = new Bugger(kotak1, kotak2, kotak3, kotak4, kotak5, kotak6, kotak7, kotak8, kotak9);
        kotak1 = bug.getKotak1();
        kotak2 = bug.getKotak2();
        kotak3 = bug.getKotak3();
        kotak4 = bug.getKotak4();
        kotak5 = bug.getKotak5();
        kotak6 = bug.getKotak6();
        kotak7 = bug.getKotak7();
        kotak8 = bug.getKotak8();
        kotak9 = bug.getKotak9();
    }
    
    public void checkBuggerInstance() {
        if (bug instanceof Bugger) {
            Bugger buggerObj = (Bugger) bug; // Downcasting
           // buggerObj.enableFalse();
        }
    }
    
    public Connection getConnection(){ // koneksi
        Connection con;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost/tictactoe", "root", "");
            return con;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }
    
    public void saveScore(int playerXScore, int playerOScore){ // save skor
        String namaX = playerX.getText();
        String namaO = playerO.getText();
        
        
        Connection con = getConnection();
        PreparedStatement ps;
        try{
            String query = "INSERT INTO game_scores(Nama_X, Nama_O, player_x, player_o) VALUES(?, ?, ?, ?)"; //create
            ps = con.prepareStatement(query);
            ps.setString(1, namaX);
            ps.setString(2, namaO);
            ps.setInt(3, playerXScore);
            ps.setInt(4, playerOScore);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    
    public void showScorePopup(){ // ref https://layar.yarsi.ac.id/pluginfile.php/448179/mod_resource/content/2/MySQLMain.java
        Connection con = getConnection();
        Statement st;
        ResultSet rs;
        StringBuilder sb = new StringBuilder();
        try{
            st = con.createStatement();
            String query = "SELECT * FROM game_scores"; //read
            rs = st.executeQuery(query);
            while (rs.next()){
                sb.append(rs.getString("Nama_X")+ " = ").append(rs.getInt("player_x"))
                  .append(", " + rs.getString("Nama_O") + " = ").append(rs.getInt("player_o")).append("\n");
            }
            JOptionPane.showMessageDialog(this, sb.toString(), "Game Scores", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    /**
     * 
     * @param username untuk mengambil input username X
     * @param username2 untuk mengambil input username O
     */
    public Game(String username, String username2){ // overloading
        initComponents();
        playerX.setText(username); // Set playerX dengan username
        playerO.setText(username2); // Set playerO dengan username2
    }
    
    public void pilihPlayer(){ // start player xoxo
        if(startGame.equalsIgnoreCase("X")){
            startGame ="O";
        }else{
            startGame ="X";
        }
    }
    @Override
    public void playerScore(){ // set score design
        scorePlayerX.setText(String.valueOf(xCount));
        scorePlayerO.setText(String.valueOf(oCount));
    }
    
    public void showGameStatus(String status) {
        JOptionPane.showMessageDialog(this, status, "Game Status", JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
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
        delete = new javax.swing.JButton();
        update = new javax.swing.JButton();
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

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

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

        delete.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        delete.setText("DELETE");
        delete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        update.setText("UPDATE");
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
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
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(exitButton, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(newGameButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        historyDatabase.setText("Show History");
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
         if (kotak1.getText().isEmpty()) {
            kotak1.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak1.setForeground(Color.RED);
            } else {
                kotak1.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak1ActionPerformed

    private void kotak2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak2ActionPerformed
        if (kotak2.getText().isEmpty()) {
            kotak2.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak2.setForeground(Color.RED);
            } else {
                kotak2.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak2ActionPerformed

    private void kotak3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak3ActionPerformed
        if (kotak3.getText().isEmpty()) {
            kotak3.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak3.setForeground(Color.RED);
            } else {
                kotak3.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak3ActionPerformed

    private void kotak6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak6ActionPerformed
        if (kotak6.getText().isEmpty()) {
            kotak6.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak6.setForeground(Color.RED);
            } else {
                kotak6.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak6ActionPerformed

    private void kotak4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak4ActionPerformed
        if (kotak4.getText().isEmpty()) {
            kotak4.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak4.setForeground(Color.RED);
            } else {
                kotak4.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak4ActionPerformed

    private void kotak5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak5ActionPerformed
        if (kotak5.getText().isEmpty()) {
            kotak5.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak5.setForeground(Color.RED);
            } else {
                kotak5.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak5ActionPerformed

    private void kotak9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak9ActionPerformed
        if (kotak9.getText().isEmpty()) {
            kotak9.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak9.setForeground(Color.RED);
            } else {
                kotak9.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak9ActionPerformed

    private void kotak7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak7ActionPerformed
        if (kotak7.getText().isEmpty()) {
            kotak7.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak7.setForeground(Color.RED);
            } else {
                kotak7.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
    }//GEN-LAST:event_kotak7ActionPerformed

    private void kotak8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kotak8ActionPerformed
        if (kotak8.getText().isEmpty()) {
            kotak8.setText(startGame);
            if (startGame.equalsIgnoreCase("X")) {
                kotak8.setForeground(Color.RED);
            } else {
                kotak8.setForeground(Color.BLUE);
            }
            pilihPlayer();
            //menang();
            endGame();
        }
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
        // reset game reset score
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
        // reset game saja
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
        
        if(xCount <= 0 && oCount <= 0){
                resetBoard(true);
            }
            
        
    }//GEN-LAST:event_resetButtonActionPerformed

    private void historyDatabaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyDatabaseActionPerformed
        showScorePopup();// pop up panel score
    }//GEN-LAST:event_historyDatabaseActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        setVisible(false);
        new Delete().setVisible(true);
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Update().setVisible(true);
    }//GEN-LAST:event_updateActionPerformed

    private void endGame(){ // mengakhiri semuanya
        String[] lines = {
            kotak1.getText() + kotak2.getText() + kotak3.getText(),
            kotak4.getText() + kotak5.getText() + kotak6.getText(),
            kotak7.getText() + kotak8.getText() + kotak9.getText(),
            kotak1.getText() + kotak4.getText() + kotak7.getText(),
            kotak2.getText() + kotak5.getText() + kotak8.getText(),
            kotak3.getText() + kotak6.getText() + kotak9.getText(),
            kotak1.getText() + kotak5.getText() + kotak9.getText(),
            kotak3.getText() + kotak5.getText() + kotak7.getText() // pengecekan tiap kotak berisi xoxo
        };

        for(String line : lines){
            if(line.equals("XXX")){ // method line setiap kotak terdapat horizontal/vertical/diagonal XXX
                //Game gameObj = (Game) bug; // Upcasting
                //gameObj.showGameStatus("Player X Wins!"); // Memanggil metode yang di-override
                JOptionPane.showMessageDialog(this, "Player X Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                xCount++;
                playerScore();
                saveScore(xCount, oCount);
                resetBoard();
                bug.enableFalse();
                return;
            }else if (line.equals("OOO")){ // sama dengan diatas tapi OOO
                //Game gameObj = (Game) bug; // Upcasting
                //gameObj.showGameStatus("Player O Wins!"); // Memanggil method yang telah di ubah
                JOptionPane.showMessageDialog(this, "Player O Wins!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
                oCount++;
                playerScore();
                saveScore(xCount, oCount);
                resetBoard();
                bug.enableFalse();
                return;
            }
        }

        if (isBoardFull()){ // bugging jika seri
            //Game gameObj = (Game) bug; // Upcasting
            //gameObj.showGameStatus("It's a Draw!"); // Memanggil metode yang di-override
   
            JOptionPane.showMessageDialog(this, "Draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            saveScore(xCount, oCount);
            resetBoard();
            bug.enableFalse();
        }
    }

    private boolean isBoardFull(){ // cek jika kotaknya penuh dengan xoxo
        return !kotak1.getText().isEmpty() && !kotak2.getText().isEmpty() && !kotak3.getText().isEmpty()
            && !kotak4.getText().isEmpty() && !kotak5.getText().isEmpty() && !kotak6.getText().isEmpty()
            && !kotak7.getText().isEmpty() && !kotak8.getText().isEmpty() && !kotak9.getText().isEmpty();
    }

    private void resetBoard(){ // reset otomatis jika gamenya kelar berbeda dengan tombol reset manual
        Score.methodDC(kotak1, kotak2, kotak3, kotak4, kotak5, kotak6, kotak7, kotak8, kotak9);
        startGame = "X";
    }
    
    private void resetBoard(boolean resetScores) { // overloading
    resetBoard();  // reset kotak

    if (resetScores) {
        // Reset skor
        xCount = 0;
        oCount = 0;
        playerScore();  // menampilkan score
    }
}
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
    private javax.swing.JButton delete;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton historyDatabase;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JButton kotak1;
    public javax.swing.JButton kotak2;
    public javax.swing.JButton kotak3;
    public javax.swing.JButton kotak4;
    public javax.swing.JButton kotak5;
    public javax.swing.JButton kotak6;
    public javax.swing.JButton kotak7;
    public javax.swing.JButton kotak8;
    public javax.swing.JButton kotak9;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel playerO;
    private javax.swing.JLabel playerX;
    private javax.swing.JButton resetButton;
    private javax.swing.JLabel scorePlayerO;
    private javax.swing.JLabel scorePlayerX;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
class Bugger extends Game{ // subclass
    JButton kotak1, kotak2, kotak3, kotak4, kotak5, kotak6, kotak7, kotak8, kotak9;
    public Bugger(JButton kotak1, JButton kotak2, JButton kotak3, JButton kotak4, JButton kotak5, JButton kotak6, JButton kotak7, JButton kotak8, JButton kotak9){// dari parent class
        super();
        this.kotak1 = kotak1;
        this.kotak2 = kotak2;
        this.kotak3 = kotak3;
        this.kotak4 = kotak4;
        this.kotak5 = kotak5;
        this.kotak6 = kotak6;
        this.kotak7 = kotak7;
        this.kotak8 = kotak8;
        this.kotak9 = kotak9;
    }
    public void setKotak1(JButton kotak1){ // setter
        this.kotak1 = kotak1;}
    public void setKotak2(JButton kotak2){
        this.kotak2 = kotak2;}
    public void setKotak3(JButton kotak3){
        this.kotak3 = kotak3;}
    public void setKotak4(JButton kotak4){
        this.kotak4 = kotak4;}
    public void setKotak5(JButton kotak5){
        this.kotak5 = kotak5;}
    public void setKotak6(JButton kotak1){
        this.kotak6 = kotak6;}
    public void setKotak7(JButton kotak1){
        this.kotak7 = kotak7;}
    public void setKotak8(JButton kotak1){
        this.kotak8 = kotak8;}
    public void setKotak9(JButton kotak1){
        this.kotak9 = kotak9;}
    public JButton getKotak1(){ // getter
        return kotak1;}
    public JButton getKotak2(){
        return kotak2;}
    public JButton getKotak3(){
        return kotak3;}
    public JButton getKotak4(){
        return kotak4;}
    public JButton getKotak5(){
        return kotak5;}
    public JButton getKotak6(){
        return kotak6;}
    public JButton getKotak7(){
        return kotak7;}
    public JButton getKotak8(){
        return kotak8;}
    public JButton getKotak9(){
        return kotak9;}
    public void enableFalse(){ // disable klik 2x
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
    
    @Override
    public void showGameStatus(String status) {
        JOptionPane.showMessageDialog(this, "Bugger: " + status, "Bugger Game Status", JOptionPane.WARNING_MESSAGE);
    }
}
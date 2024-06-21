/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TicTacToe.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author sultanhafidzh
 */
public class Koneksi {
     private static Connection connect;
    
    public static Connection getKoneksi(){
        if(connect == null){
            try{
                String url = "jdbc:mysql://localhost:3306/tictactoe";
                String user = "root";
                String password = "";
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Connected Successfully");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("Error!");
            }
        }
        return connect;}

    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import java.sql.Connection; // conexão SQL para Java
import java.sql.DriverManager; // driver de conexão SQL para Java
import java.sql.ResultSet;
import java.sql.SQLException; // classe para tratamento de exceções
import java.sql.Statement;
/**
 *
 * @author Diego Martins Souza
 */
public class Conexao {
 public Connection getConnection() {
    try {
        return DriverManager.getConnection("jdbc:mysql://localhost/cliente","root","");
            }catch(SQLException excecao){
    
    throw new RuntimeException(excecao);
        }
    }
}
    
    
    

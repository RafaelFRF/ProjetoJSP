package com.blog.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

  public static java.sql.Connection conectar(){
    java.sql.Connection con = null;
    String url = "jdbc:mysql://localhost:3306/blog";
    String user = "root";
    String password = "";
    try {
      // Class.forName("org.mysql.Driver");
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
    try {
      con = DriverManager.getConnection(url, user, password);
    } catch (SQLException e) {
      return  con;
    }
    return con;
  }

}

package com.blog.connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {

  public static java.sql.Connection Connect(){
    java.sql.Connection con = null;
    String url = "jdbc:mysql://localhost:3306/agenda";
    String user = "root";
    String password = "root";
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

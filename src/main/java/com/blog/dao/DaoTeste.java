package com.blog.dao;

import com.blog.connection.Connection;

public class DaoTeste {

  public static String salvar(){
    if(Connection.connect() !=null){
      return "conectado.";
    }
    return "erro de conexão!";
  }

}

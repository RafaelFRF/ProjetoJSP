package com.blog.dao;

import com.blog.connection.Conexao;

public class DaoTeste {

  public static String salvar(){
    if(Conexao.conectar() !=null){
      return "conectado.";
    }
    return "erro de conexão!";
  }

}

package com.blog.dao;

import com.blog.connection.Conexao;
import com.blog.entidades.Posts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoPosts {

  public static List<Posts> getLastPosts() {
    Connection con = Conexao.conectar();
    List<Posts> posts = new ArrayList<Posts>();

    if (con != null){
      try {
        PreparedStatement stm = con.prepareStatement("select * from posts order by idPosts desc limit 10;");
        ResultSet rs = stm.executeQuery();

        while (rs.next()) {
          Posts post = new Posts();
          post.setIdPosts(rs.getInt("idPosts"));
          post.setTitlePost(rs.getString("titlePost"));
          post.setTextPost(rs.getString("textPost"));
          posts.add(post);
        }
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return posts;
  }

}

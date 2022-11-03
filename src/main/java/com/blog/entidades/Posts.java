package com.blog.entidades;

public class Posts {

  private int idPosts;
  private String titlePost;
  private String textPost;

  public Posts(int idPosts, String titlePost, String textPost) {
    this.idPosts = idPosts;
    this.titlePost = titlePost;
    this.textPost = textPost;
  }

  public Posts() {}

  public int getIdPosts() {
    return idPosts;
  }

  public void setIdPosts(int idPosts) {
    this.idPosts = idPosts;
  }

  public String getTitlePost() {
    return titlePost;
  }

  public void setTitlePost(String titlePost) {
    this.titlePost = titlePost;
  }

  public String getTextPost() {
    return textPost;
  }

  public void setTextPost(String textPost) {
    this.textPost = textPost;
  }

}

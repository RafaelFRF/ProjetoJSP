package com.blog.entidades;

public class Comments {

  private int idComments;
  private String textComment;
  private String validateComment = "n";
  private int users_idUsers;
  private int posts_idPosts;

  public Comments() {}

  public Comments(int idComments, String textComment, String validateComment, int users_idUsers, int posts_idPosts) {
    this.idComments = idComments;
    this.textComment = textComment;
    this.validateComment = validateComment;
    this.users_idUsers = users_idUsers;
    this.posts_idPosts = posts_idPosts;
  }

  public int getIdComments() {
    return idComments;
  }

  public void setIdComments(int idComments) {
    this.idComments = idComments;
  }

  public String getTextComment() {
    return textComment;
  }

  public void setTextComment(String textComment) {
    this.textComment = textComment;
  }

  public String getValidateComment() {
    return validateComment;
  }

  public void setValidateComment(String validateComment) {
    this.validateComment = validateComment;
  }

  public int getUsers_idUsers() {
    return users_idUsers;
  }

  public void setUsers_idUsers(int users_idUsers) {
    this.users_idUsers = users_idUsers;
  }

  public int getPosts_idPosts() {
    return posts_idPosts;
  }

  public void setPosts_idPosts(int posts_idPosts) {
    this.posts_idPosts = posts_idPosts;
  }
}

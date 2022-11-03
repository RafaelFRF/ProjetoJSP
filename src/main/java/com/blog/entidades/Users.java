package com.blog.entidades;

public class Users {

  private int idUsers;
  private String emailUser;
  private String passwordUser;
  private String typeUser;

  public Users() {}

  public Users(int idUsers, String emailUser, String passwordUser, String typeUser) {
    this.idUsers = idUsers;
    this.emailUser = emailUser;
    this.passwordUser = passwordUser;
    this.typeUser = typeUser;
  }

  public int getIdUsers() {
    return idUsers;
  }

  public void setIdUsers(int idUsers) {
    this.idUsers = idUsers;
  }

  public String getEmailUser() {
    return emailUser;
  }

  public void setEmailUser(String emailUser) {
    this.emailUser = emailUser;
  }

  public String getPasswordUser() {
    return passwordUser;
  }

  public void setPasswordUser(String passwordUser) {
    this.passwordUser = passwordUser;
  }

  public String getTypeUser() {
    return typeUser;
  }

  public void setTypeUser(String typeUser) {
    this.typeUser = typeUser;
  }
}

package com.example.conexion;

import javax.persistence.*;

import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
//para que lombok nos genere seters y getters automáticamente
@Data
public class User {
  
	/*se indica que este campo es una llave primarioa*/
  @Id
  /*se autoincrem*/
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;

  private String name;

  private String email;

  /*public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }*/
}


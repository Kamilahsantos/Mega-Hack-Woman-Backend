package com.megahack.apoiame.model;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name = "users")
public class User {


  private Long id;

    private String email;

  private String name;

  private String surname;

  private String username;

  private String password;

  private Date birthDate;

  private String state;

  private String city;


  private LocalDateTime created_at;

  private LocalDateTime updatedAt;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "email", length = 255, nullable = false)
  @NotNull(message = "Please input a email")
  @Size(max = 255)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Column(name = "name", length = 255, nullable = false)
  @NotNull(message = "Please input a name")
  @Size(max = 255)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "surname", length = 255,  nullable = false)
  @NotNull(message = "Please input a surname")
  @Size(max = 255)
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Column(name = "username", length = 255,  nullable = false)
  @NotNull(message = "Please input a username")
  @Size(max = 255)
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Column(name = "password", length = 255, nullable = false)
  @NotNull(message = "Please input a password")
  @Size(max = 255)
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Column(name = "birthDate",length = 255,  nullable = false)
  @NotNull(message = "Please input a birthDate")
  @Size(max = 255)
  public Date getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(Date birthDate) {
    this.birthDate = birthDate;
  }

  @Column(name = "state", length = 255,  nullable = false)
  @NotNull(message = "Please input a state")
  @Size(max = 255)
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Column(name = "city", length = 255, nullable = false)
  @NotNull(message = "Please input a city")
  @Size(max = 255)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Column(name = "created_at", updatable = false)
  @CreatedDate
  @CreationTimestamp
  public LocalDateTime getCreated_at() {
    return created_at;
  }

  public void setCreated_at(LocalDateTime created_at) {
    this.created_at = created_at;
  }

  @Column(name = "updatedAt", nullable = true)
  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }



  public User(Long id, String email, String name, String surname, String username, String password, Date birthDate, String state, String city, LocalDateTime created_at, LocalDateTime updatedAt) {
    this.id = id;
    this.email = email;
    this.name = name;
    this.surname = surname;
    this.username = username;
    this.password = password;
    this.birthDate = birthDate;
    this.state = state;
    this.city = city;
    this.created_at = created_at;
    this.updatedAt = updatedAt;
  }


  public User() {
  }


  @Override
  public String toString() {
    return "Network [id=" + id + ", email=" + email + ", name=" + name + ", surname=" + surname + ", username=" + username
      + ", password=" + password    + ", birthDate=" + birthDate  + ", state=" + state   + ", city=" + city + ", created_at=" + created_at  + ", updatedAt=" + updatedAt+ "]";
  }
}

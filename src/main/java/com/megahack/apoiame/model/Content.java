package com.megahack.apoiame.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "content")
public class Content {

  private Long id;
  private String title;
  private String description;
  private String link;

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "title",  length = 255, nullable = false)
  @NotNull(message = "Please input a name")
  @Size(max = 255)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Column(name = "description", length = 255, nullable = false)
  @NotNull(message = "Please input a description")
  @Size(max = 255)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name = "link", length = 255, nullable = false)
  @NotNull(message = "Please input a link")
  @Size(max = 255)
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }



  public Content(Long id, String title, String description, String link) {
    this.id = id;
    this.title = title;
    this.description = description;
    this.link = link;
  }

  public Content() {
  }


  @Override
  public String toString() {
    return "Content [id=" + id + ", title=" + title + ", description=" + description + ", link=" + link
      + "]";
  }
}

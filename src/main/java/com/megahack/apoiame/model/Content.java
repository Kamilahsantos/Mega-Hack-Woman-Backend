package com.megahack.apoiame.model;

import javax.persistence.*;

@Entity
@Table(name = "content")
public class Content {

  private Long id;
  private String title;
  private String description;
  private String link;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "title", nullable = false)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Column(name = "description", nullable = false)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Column(name = "link", nullable = false)
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

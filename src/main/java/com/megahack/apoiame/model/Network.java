package com.megahack.apoiame.model;

import javax.persistence.*;

@Entity
@Table(name = "network")
public class Network {




  public Network() {
  }
  private Long id;
  private String name;
  private String area;
  private String address;
  private String companyName;
  private String job;
  private String jobDescription;



  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "name", nullable = false)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "area", nullable = false)
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }
  @Column(name = "address", nullable = false)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Column(name = "companyName", nullable = false)
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Column(name = "job", nullable = false)
  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Column(name = "jobDescription", nullable = false)
  public String getJobDescription() {
    return jobDescription;
  }

  public void setJobDescription(String jobDescription) {
    this.jobDescription = jobDescription;
  }

  public Network(Long id, String name, String area, String address, String companyName, String job, String jobDescription) {
    this.id = id;
    this.name = name;
    this.area = area;
    this.address = address;
    this.companyName = companyName;
    this.job = job;
    this.jobDescription = jobDescription;
  }

  @Override
  public String toString() {
    return "Network [id=" + id + ", name=" + name + ", area=" + area + ", address=" + address + ", companyName=" + companyName
      + ", job=" + job    + ", jobDescription=" + jobDescription   + "]";
  }


}

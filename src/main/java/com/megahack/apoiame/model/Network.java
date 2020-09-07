package com.megahack.apoiame.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
  @GeneratedValue(strategy = GenerationType.SEQUENCE)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @Column(name = "name",  length = 255,  nullable = false)
  @NotNull(message = "Please input a name")
  @Size(max = 255)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Column(name = "area",length = 255,  nullable = false)
  @NotNull(message = "Please input a area")
  @Size(max = 255)
  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }


  @Column(name = "address",length = 255,  nullable = false)
  @NotNull(message = "Please input a address ")
  @Size(max = 255)
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Column(name = "companyName", length = 255, nullable = false)
  @NotNull(message = "Please input a companyName ")
  @Size(max = 255)
  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  @Column(name = "job",length = 255,  nullable = false)
  @NotNull(message = "Please input a job ")
  @Size(max = 255)
  public String getJob() {
    return job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  @Column(name = "jobDescription", length = 255,  nullable = false)
  @NotNull(message = "Please input a jobDescription ")
  @Size(max = 255)
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

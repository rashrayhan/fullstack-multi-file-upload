package com.example.fileupload.model;

@Entity
public class FileInfo {
  private String name;
  private String url;

  @Transient
  private String test;

  public FileInfo(String name, String url) {
    this.name = name;
    this.url = url;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getUrl() {
    return this.url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public String getTest() {
    return this.test;
  }

  public void getTest(String test) {
    this.test = test;
  }
}

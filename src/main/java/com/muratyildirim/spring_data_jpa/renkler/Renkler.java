package com.muratyildirim.spring_data_jpa.renkler;

import jakarta.persistence.*;

@Entity
public class Renkler {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Integer id;

  @Column(name = "Adi")
  private String adi;

  public Renkler() {
  }

  public Renkler(String adi, Integer id) {
    this.adi = adi;
    this.id = id;
  }

  public String getAdi() {
    return adi;
  }

  public void setAdi(String adi) {
    this.adi = adi;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }
}

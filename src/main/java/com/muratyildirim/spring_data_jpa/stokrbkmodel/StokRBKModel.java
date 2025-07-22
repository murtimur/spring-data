package com.muratyildirim.spring_data_jpa.stokrbkmodel;

import java.util.List;

import com.muratyildirim.spring_data_jpa.stokrbk.StokRBK;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class StokRBKModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Integer id;

  @Column(name = "Kodu", length = 20)
  private String kodu;

  @Column(name = "Adi", length = 60)
  private String adi;

  @Column(name = "BedenTipi")
  private Integer bedenTipi;

  @Column(name = "KavalaTipi")
  private Integer kavalaTipi;

  @Column(name = "Fiyatlandirma")
  private Byte fiyatlandirma;

  @Column(name = "AsortiId")
  private Integer asortiId;

  @OneToMany(mappedBy = "model", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<StokRBK> stokRBKList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getKodu() {
    return kodu;
  }

  public void setKodu(String kodu) {
    this.kodu = kodu;
  }

  public String getAdi() {
    return adi;
  }

  public void setAdi(String adi) {
    this.adi = adi;
  }

  public Integer getBedenTipi() {
    return bedenTipi;
  }

  public void setBedenTipi(Integer bedenTipi) {
    this.bedenTipi = bedenTipi;
  }

  public Integer getKavalaTipi() {
    return kavalaTipi;
  }

  public void setKavalaTipi(Integer kavalaTipi) {
    this.kavalaTipi = kavalaTipi;
  }

  public Byte getFiyatlandirma() {
    return fiyatlandirma;
  }

  public void setFiyatlandirma(Byte fiyatlandirma) {
    this.fiyatlandirma = fiyatlandirma;
  }

  public Integer getAsortiId() {
    return asortiId;
  }

  public void setAsortiId(Integer asortiId) {
    this.asortiId = asortiId;
  }

  public List<StokRBK> getStokRBKList() {
    return stokRBKList;
  }

  public void setStokRBKList(List<StokRBK> stokRBKList) {
    this.stokRBKList = stokRBKList;
  }

}

package com.muratyildirim.spring_data_jpa.birimler;

import java.math.BigDecimal;
import java.util.Date;

import com.muratyildirim.spring_data_jpa.barkodlar.Barkodlar;
import com.muratyildirim.spring_data_jpa.stoklar.Stoklar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Birimler {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "StokId", insertable = false, updatable = false)
  private Stoklar stok;

  @Column(name = "StokId")
  private Integer stokId;

  @Column(name = "Adi", length = 5)
  private String adi;

  @Column(name = "Aciklama", length = 10)
  private String aciklama;

  @Column(name = "Carpan")
  private BigDecimal carpan;

  @Column(name = "KDVGrubu")
  private Byte kdvGrubu;

  @Column(name = "KDVDahil")
  private Boolean kdvDahil;

  @Column(name = "OTVGrubu")
  private Byte otvGrubu;

  @Column(name = "Maliyeti")
  private BigDecimal maliyeti;

  @Column(name = "Opsiyon")
  private Byte opsiyon;

  @Column(name = "FiyatDegistirmeTarihi")
  private Date fiyatDegistirmeTarihi;

  @Column(name = "Fiyat1")
  private BigDecimal fiyat1;

  @Column(name = "PB1", length = 3)
  private String pb1;

  @Column(name = "Fiyat2")
  private BigDecimal fiyat2;

  @Column(name = "PB2", length = 3)
  private String pb2;

  @Column(name = "Fiyat3")
  private BigDecimal fiyat3;

  @Column(name = "PB3", length = 3)
  private String pb3;

  @OneToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "BarkodId", insertable = false, updatable = false)
  private Barkodlar barkod;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Stoklar getStok() {
    return stok;
  }

  public void setStok(Stoklar stok) {
    this.stok = stok;
  }

  public String getAdi() {
    return adi;
  }

  public void setAdi(String adi) {
    this.adi = adi;
  }

  public String getAciklama() {
    return aciklama;
  }

  public void setAciklama(String aciklama) {
    this.aciklama = aciklama;
  }

  public BigDecimal getCarpan() {
    return carpan;
  }

  public void setCarpan(BigDecimal carpan) {
    this.carpan = carpan;
  }

  public Barkodlar getBarkod() {
    return barkod;
  }

  public void setBarkod(Barkodlar barkod) {
    this.barkod = barkod;
  }

  public Byte getKdvGrubu() {
    return kdvGrubu;
  }

  public void setKdvGrubu(Byte kdvGrubu) {
    this.kdvGrubu = kdvGrubu;
  }

  public Boolean getKdvDahil() {
    return kdvDahil;
  }

  public void setKdvDahil(Boolean kdvDahil) {
    this.kdvDahil = kdvDahil;
  }

  public Byte getOtvGrubu() {
    return otvGrubu;
  }

  public void setOtvGrubu(Byte otvGrubu) {
    this.otvGrubu = otvGrubu;
  }

  public BigDecimal getMaliyeti() {
    return maliyeti;
  }

  public void setMaliyeti(BigDecimal maliyeti) {
    this.maliyeti = maliyeti;
  }

  public Byte getOpsiyon() {
    return opsiyon;
  }

  public void setOpsiyon(Byte opsiyon) {
    this.opsiyon = opsiyon;
  }

  public Date getFiyatDegistirmeTarihi() {
    return fiyatDegistirmeTarihi;
  }

  public void setFiyatDegistirmeTarihi(Date fiyatDegistirmeTarihi) {
    this.fiyatDegistirmeTarihi = fiyatDegistirmeTarihi;
  }

  public BigDecimal getFiyat1() {
    return fiyat1;
  }

  public void setFiyat1(BigDecimal fiyat1) {
    this.fiyat1 = fiyat1;
  }

  public String getPb1() {
    return pb1;
  }

  public void setPb1(String pb1) {
    this.pb1 = pb1;
  }

  public BigDecimal getFiyat2() {
    return fiyat2;
  }

  public void setFiyat2(BigDecimal fiyat2) {
    this.fiyat2 = fiyat2;
  }

  public String getPb2() {
    return pb2;
  }

  public void setPb2(String pb2) {
    this.pb2 = pb2;
  }

  public BigDecimal getFiyat3() {
    return fiyat3;
  }

  public void setFiyat3(BigDecimal fiyat3) {
    this.fiyat3 = fiyat3;
  }

  public String getPb3() {
    return pb3;
  }

  public void setPb3(String pb3) {
    this.pb3 = pb3;
  }

  public Integer getStokId() {
    return stokId;
  }

  public void setStokId(Integer stokId) {
    this.stokId = stokId;
  }
}

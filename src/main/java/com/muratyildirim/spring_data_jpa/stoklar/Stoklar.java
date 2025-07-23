package com.muratyildirim.spring_data_jpa.stoklar;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.muratyildirim.spring_data_jpa.birimler.Birimler;
import com.muratyildirim.spring_data_jpa.stokrbk.StokRBK;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Stoklar {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "Id")
  private Integer id;

  @Column(name = "StokKodu", length = 40)
  private String stokKodu;

  @Column(name = "StokAdi", length = 80)
  private String stokAdi;

  @Column(name = "StokTipi")
  private Byte stokTipi;

  @Column(name = "AnaBirim")
  private Integer anaBirim;

  @Column(name = "VarsayilanBirim")
  private Integer varsayilanBirim;

  @Column(name = "SiparisBirimi")
  private Integer siparisBirimi;

  @Column(name = "Durum")
  private Byte durum;

  @Column(name = "OzelKod0")
  private Integer ozelKod0;
  @Column(name = "OzelKod1")
  private Integer ozelKod1;
  @Column(name = "OzelKod2")
  private Integer ozelKod2;
  @Column(name = "OzelKod3")
  private Integer ozelKod3;
  @Column(name = "OzelKod4")
  private Integer ozelKod4;
  @Column(name = "OzelKod5")
  private Integer ozelKod5;
  @Column(name = "OzelKod6")
  private Integer ozelKod6;
  @Column(name = "OzelKod7")
  private Integer ozelKod7;
  @Column(name = "OzelKod8")
  private Integer ozelKod8;
  @Column(name = "OzelKod9")
  private Integer ozelKod9;
  @Column(name = "OzelKod10")
  private Integer ozelKod10;
  @Column(name = "OzelKod11")
  private Integer ozelKod11;
  @Column(name = "OzelKod12")
  private Integer ozelKod12;

  @Column(name = "KritikSeviye")
  private BigDecimal kritikSeviye;

  @Column(name = "OptimumSeviye")
  private BigDecimal optimumSeviye;

  @Column(name = "HemenTeslim")
  private Boolean hemenTeslim;

  @Column(name = "Tarih")
  private Date tarih;

  @Column(name = "KurulumSuresi")
  private Short kurulumSuresi;

  @Column(name = "Prim")
  private BigDecimal prim;

  @Column(name = "Taksit")
  private Byte taksit;

  @Column(name = "AlisFiyati")
  private BigDecimal alisFiyati;

  @Column(name = "AlisPB", length = 3)
  private String alisPB;

  @Column(name = "Tanimi", length = 500)
  private String tanimi;

  @Column(name = "Grubu")
  private Integer grubu;

  @Column(name = "HesapId")
  private Integer hesapId;

  @Column(name = "SatisIskonto")
  private BigDecimal satisIskonto;

  @Column(name = "AlisIskonto")
  private BigDecimal alisIskonto;

  @Column(name = "Seri", length = 50)
  private String seri;

  @Column(name = "GTIP", length = 20)
  private String gtip;

  @OneToMany(mappedBy = "stok", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Birimler> birimler;

  @OneToMany(mappedBy = "stok", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<StokRBK> stokRBKList;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getStokKodu() {
    return stokKodu;
  }

  public void setStokKodu(String stokKodu) {
    this.stokKodu = stokKodu;
  }

  public String getStokAdi() {
    return stokAdi;
  }

  public void setStokAdi(String stokAdi) {
    this.stokAdi = stokAdi;
  }

  public Byte getStokTipi() {
    return stokTipi;
  }

  public void setStokTipi(Byte stokTipi) {
    this.stokTipi = stokTipi;
  }

  public Integer getAnaBirim() {
    return anaBirim;
  }

  public void setAnaBirim(Integer anaBirim) {
    this.anaBirim = anaBirim;
  }

  public Integer getVarsayilanBirim() {
    return varsayilanBirim;
  }

  public void setVarsayilanBirim(Integer varsayilanBirim) {
    this.varsayilanBirim = varsayilanBirim;
  }

  public Integer getSiparisBirimi() {
    return siparisBirimi;
  }

  public void setSiparisBirimi(Integer siparisBirimi) {
    this.siparisBirimi = siparisBirimi;
  }

  public Byte getDurum() {
    return durum;
  }

  public void setDurum(Byte durum) {
    this.durum = durum;
  }

  public Integer getOzelKod0() {
    return ozelKod0;
  }

  public void setOzelKod0(Integer ozelKod0) {
    this.ozelKod0 = ozelKod0;
  }

  public Integer getOzelKod1() {
    return ozelKod1;
  }

  public void setOzelKod1(Integer ozelKod1) {
    this.ozelKod1 = ozelKod1;
  }

  public Integer getOzelKod2() {
    return ozelKod2;
  }

  public void setOzelKod2(Integer ozelKod2) {
    this.ozelKod2 = ozelKod2;
  }

  public Integer getOzelKod3() {
    return ozelKod3;
  }

  public void setOzelKod3(Integer ozelKod3) {
    this.ozelKod3 = ozelKod3;
  }

  public Integer getOzelKod4() {
    return ozelKod4;
  }

  public void setOzelKod4(Integer ozelKod4) {
    this.ozelKod4 = ozelKod4;
  }

  public Integer getOzelKod5() {
    return ozelKod5;
  }

  public void setOzelKod5(Integer ozelKod5) {
    this.ozelKod5 = ozelKod5;
  }

  public Integer getOzelKod6() {
    return ozelKod6;
  }

  public void setOzelKod6(Integer ozelKod6) {
    this.ozelKod6 = ozelKod6;
  }

  public Integer getOzelKod7() {
    return ozelKod7;
  }

  public void setOzelKod7(Integer ozelKod7) {
    this.ozelKod7 = ozelKod7;
  }

  public Integer getOzelKod8() {
    return ozelKod8;
  }

  public void setOzelKod8(Integer ozelKod8) {
    this.ozelKod8 = ozelKod8;
  }

  public Integer getOzelKod9() {
    return ozelKod9;
  }

  public void setOzelKod9(Integer ozelKod9) {
    this.ozelKod9 = ozelKod9;
  }

  public Integer getOzelKod10() {
    return ozelKod10;
  }

  public void setOzelKod10(Integer ozelKod10) {
    this.ozelKod10 = ozelKod10;
  }

  public Integer getOzelKod11() {
    return ozelKod11;
  }

  public void setOzelKod11(Integer ozelKod11) {
    this.ozelKod11 = ozelKod11;
  }

  public Integer getOzelKod12() {
    return ozelKod12;
  }

  public void setOzelKod12(Integer ozelKod12) {
    this.ozelKod12 = ozelKod12;
  }

  public BigDecimal getKritikSeviye() {
    return kritikSeviye;
  }

  public void setKritikSeviye(BigDecimal kritikSeviye) {
    this.kritikSeviye = kritikSeviye;
  }

  public BigDecimal getOptimumSeviye() {
    return optimumSeviye;
  }

  public void setOptimumSeviye(BigDecimal optimumSeviye) {
    this.optimumSeviye = optimumSeviye;
  }

  public Boolean getHemenTeslim() {
    return hemenTeslim;
  }

  public void setHemenTeslim(Boolean hemenTeslim) {
    this.hemenTeslim = hemenTeslim;
  }

  public Date getTarih() {
    return tarih;
  }

  public void setTarih(Date tarih) {
    this.tarih = tarih;
  }

  public Short getKurulumSuresi() {
    return kurulumSuresi;
  }

  public void setKurulumSuresi(Short kurulumSuresi) {
    this.kurulumSuresi = kurulumSuresi;
  }

  public BigDecimal getPrim() {
    return prim;
  }

  public void setPrim(BigDecimal prim) {
    this.prim = prim;
  }

  public Byte getTaksit() {
    return taksit;
  }

  public void setTaksit(Byte taksit) {
    this.taksit = taksit;
  }

  public BigDecimal getAlisFiyati() {
    return alisFiyati;
  }

  public void setAlisFiyati(BigDecimal alisFiyati) {
    this.alisFiyati = alisFiyati;
  }

  public String getAlisPB() {
    return alisPB;
  }

  public void setAlisPB(String alisPB) {
    this.alisPB = alisPB;
  }

  public String getTanimi() {
    return tanimi;
  }

  public void setTanimi(String tanimi) {
    this.tanimi = tanimi;
  }

  public Integer getGrubu() {
    return grubu;
  }

  public void setGrubu(Integer grubu) {
    this.grubu = grubu;
  }

  public Integer getHesapId() {
    return hesapId;
  }

  public void setHesapId(Integer hesapId) {
    this.hesapId = hesapId;
  }

  public BigDecimal getSatisIskonto() {
    return satisIskonto;
  }

  public void setSatisIskonto(BigDecimal satisIskonto) {
    this.satisIskonto = satisIskonto;
  }

  public BigDecimal getAlisIskonto() {
    return alisIskonto;
  }

  public void setAlisIskonto(BigDecimal alisIskonto) {
    this.alisIskonto = alisIskonto;
  }

  public String getSeri() {
    return seri;
  }

  public void setSeri(String seri) {
    this.seri = seri;
  }

  public String getGtip() {
    return gtip;
  }

  public void setGtip(String gtip) {
    this.gtip = gtip;
  }

  public List<Birimler> getBirimler() {
    return birimler;
  }

  public void setBirimler(List<Birimler> birimler) {
    this.birimler = birimler;
  }

  public List<StokRBK> getStokRBKList() {
    return stokRBKList;
  }

  public void setStokRBKList(List<StokRBK> stokRBKList) {
    this.stokRBKList = stokRBKList;
  }
  
} 
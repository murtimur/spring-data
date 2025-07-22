package com.muratyildirim.spring_data_jpa.barkodlar.dto;

import java.math.BigDecimal;

public class BarkodlarDetayDTO {

  private String barkodu;
  private String birimAdi;
  private String stokAdi;
  private String stokKodu;
  private Integer stokId;
  private Integer barkodId;

  private Integer rbkId;
  private String beden;
  private String kavala;
  private String renkAdi;

  private Integer modelId;
  private String modelKodu;
  private String modelAdi;

  private Double envanter;

  private BigDecimal fiyat;
  private String paraBirimi;

  public String getBarkodu() {
    return barkodu;
  }

  public void setBarkodu(String barkodu) {
    this.barkodu = barkodu;
  }

  public String getBirimAdi() {
    return birimAdi;
  }

  public void setBirimAdi(String birimAdi) {
    this.birimAdi = birimAdi;
  }

  public String getStokAdi() {
    return stokAdi;
  }

  public void setStokAdi(String stokAdi) {
    this.stokAdi = stokAdi;
  }

  public String getStokKodu() {
    return stokKodu;
  }

  public void setStokKodu(String stokKodu) {
    this.stokKodu = stokKodu;
  }

  public Integer getStokId() {
    return stokId;
  }

  public void setStokId(Integer stokId) {
    this.stokId = stokId;
  }

  public Integer getRbkId() {
    return rbkId;
  }

  public void setRbkId(Integer rbkId) {
    this.rbkId = rbkId;
  }

  public String getBeden() {
    return beden;
  }

  public void setBeden(String beden) {
    this.beden = beden;
  }

  public String getKavala() {
    return kavala;
  }

  public void setKavala(String kavala) {
    this.kavala = kavala;
  }

  public Integer getModelId() {
    return modelId;
  }

  public void setModelId(Integer modelId) {
    this.modelId = modelId;
  }

  public String getModelKodu() {
    return modelKodu;
  }

  public void setModelKodu(String modelKodu) {
    this.modelKodu = modelKodu;
  }

  public String getModelAdi() {
    return modelAdi;
  }

  public void setModelAdi(String modelAdi) {
    this.modelAdi = modelAdi;
  }

  public String getRenkAdi() {
    return renkAdi;
  }

  public void setRenkAdi(String renkAdi) {
    this.renkAdi = renkAdi;
  }

  public Double getEnvanter() {
    return envanter;
  }

  public void setEnvanter(Double envanter) {
    this.envanter = envanter;
  }

  public BigDecimal getFiyat() {
    return fiyat;
  }

  public void setFiyat(BigDecimal fiyat) {
    this.fiyat = fiyat;
  }

  public String getParaBirimi() {
    return paraBirimi;
  }

  public void setParaBirimi(String paraBirimi) {
    this.paraBirimi = paraBirimi;
  }

  public Integer getBarkodId() {
    return barkodId;
  }

  public void setBarkodId(Integer barkodId) {
    this.barkodId = barkodId;
  }
}

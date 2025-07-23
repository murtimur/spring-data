package com.muratyildirim.spring_data_jpa.depodetaylienvanter;

import jakarta.persistence.*;

import org.hibernate.annotations.Subselect;
import org.springframework.data.annotation.Immutable;

import com.muratyildirim.spring_data_jpa.stoklar.Stoklar;

@Entity
@Table(name = "DepoDetayliEnvanter")
@Immutable
@Subselect("SELECT * FROM DepoDetayliEnvanter")//burada view adi yazilir bu Entity class view e karsilik geliyor
public class DepodetayliEnvanter {

	@Id
	@Column(name = "Id")
	private Integer id;

	@Column(name = "SubeId")
	private Short subeId;

	@Column(name = "StokKodu")
	private String stokKodu;

	@Column(name = "StokAdi")
	private String stokAdi;

	@Column(name = "StokTipi")
	private String stokTipi;

	@Column(name = "Durum")
	private Boolean durum;

	@Column(name = "OzelKod0")
	private String ozelKod0;

	@Column(name = "OzelKod1")
	private String ozelKod1;

	@Column(name = "OzelKod2")
	private String ozelKod2;

	@Column(name = "OzelKod3")
	private String ozelKod3;

	@Column(name = "OzelKod4")
	private String ozelKod4;

	@Column(name = "OzelKod5")
	private String ozelKod5;

	@Column(name = "OzelKod6")
	private String ozelKod6;

	@Column(name = "OzelKod7")
	private String ozelKod7;

	@Column(name = "OzelKod8")
	private String ozelKod8;

	@Column(name = "OzelKod9")
	private String ozelKod9;

	@Column(name = "OzelKod10")
	private String ozelKod10;

	@Column(name = "OzelKod11")
	private String ozelKod11;

	@Column(name = "OzelKod12")
	private String ozelKod12;

	@Column(name = "HemenTeslim")
	private Boolean hemenTeslim;

	@Column(name = "KurulumSuresi")
	private Integer kurulumSuresi;

	@Column(name = "BirimId")
	private Long birimId;

	@Column(name = "BirimAdi")
	private String birimAdi;

	@Column(name = "BirimAciklama")
	private String birimAciklama;

	@Column(name = "Carpan")
	private Double carpan;

	@Column(name = "Envanter")
	private Double envanter;

	@Column(name = "SubeMevcudu")
	private Double subeMevcudu;

	@Column(name = "Satilabilir")
	private Double satilabilir;

	@Column(name = "DTGiris")
	private Double dtGiris;

	@Column(name = "DTCikis")
	private Double dtCikis;

	@Column(name = "BaskaSubeIcin")
	private Double baskaSubeIcin;

	@Column(name = "BaskaSubede")
	private Double baskaSubede;

	@Column(name = "SevkBekleyen")
	private Double sevkBekleyen;

	@Column(name = "Ceyizlik")
	private Double ceyizlik;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Id", insertable = false, updatable = false) // View'deki S.Id = Stok.Id
	private Stoklar stok;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getSubeId() {
		return subeId;
	}

	public void setSubeId(Short subeId) {
		this.subeId = subeId;
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

	public String getStokTipi() {
		return stokTipi;
	}

	public void setStokTipi(String stokTipi) {
		this.stokTipi = stokTipi;
	}

	public Boolean getDurum() {
		return durum;
	}

	public void setDurum(Boolean durum) {
		this.durum = durum;
	}

	public String getOzelKod0() {
		return ozelKod0;
	}

	public void setOzelKod0(String ozelKod0) {
		this.ozelKod0 = ozelKod0;
	}

	public String getOzelKod1() {
		return ozelKod1;
	}

	public void setOzelKod1(String ozelKod1) {
		this.ozelKod1 = ozelKod1;
	}

	public String getOzelKod2() {
		return ozelKod2;
	}

	public void setOzelKod2(String ozelKod2) {
		this.ozelKod2 = ozelKod2;
	}

	public String getOzelKod3() {
		return ozelKod3;
	}

	public void setOzelKod3(String ozelKod3) {
		this.ozelKod3 = ozelKod3;
	}

	public String getOzelKod4() {
		return ozelKod4;
	}

	public void setOzelKod4(String ozelKod4) {
		this.ozelKod4 = ozelKod4;
	}

	public String getOzelKod5() {
		return ozelKod5;
	}

	public void setOzelKod5(String ozelKod5) {
		this.ozelKod5 = ozelKod5;
	}

	public String getOzelKod6() {
		return ozelKod6;
	}

	public void setOzelKod6(String ozelKod6) {
		this.ozelKod6 = ozelKod6;
	}

	public String getOzelKod7() {
		return ozelKod7;
	}

	public void setOzelKod7(String ozelKod7) {
		this.ozelKod7 = ozelKod7;
	}

	public String getOzelKod8() {
		return ozelKod8;
	}

	public void setOzelKod8(String ozelKod8) {
		this.ozelKod8 = ozelKod8;
	}

	public String getOzelKod9() {
		return ozelKod9;
	}

	public void setOzelKod9(String ozelKod9) {
		this.ozelKod9 = ozelKod9;
	}

	public String getOzelKod10() {
		return ozelKod10;
	}

	public void setOzelKod10(String ozelKod10) {
		this.ozelKod10 = ozelKod10;
	}

	public String getOzelKod11() {
		return ozelKod11;
	}

	public void setOzelKod11(String ozelKod11) {
		this.ozelKod11 = ozelKod11;
	}

	public String getOzelKod12() {
		return ozelKod12;
	}

	public void setOzelKod12(String ozelKod12) {
		this.ozelKod12 = ozelKod12;
	}

	public Boolean getHemenTeslim() {
		return hemenTeslim;
	}

	public void setHemenTeslim(Boolean hemenTeslim) {
		this.hemenTeslim = hemenTeslim;
	}

	public Integer getKurulumSuresi() {
		return kurulumSuresi;
	}

	public void setKurulumSuresi(Integer kurulumSuresi) {
		this.kurulumSuresi = kurulumSuresi;
	}

	public Long getBirimId() {
		return birimId;
	}

	public void setBirimId(Long birimId) {
		this.birimId = birimId;
	}

	public String getBirimAdi() {
		return birimAdi;
	}

	public void setBirimAdi(String birimAdi) {
		this.birimAdi = birimAdi;
	}

	public String getBirimAciklama() {
		return birimAciklama;
	}

	public void setBirimAciklama(String birimAciklama) {
		this.birimAciklama = birimAciklama;
	}

	public Double getCarpan() {
		return carpan;
	}

	public void setCarpan(Double carpan) {
		this.carpan = carpan;
	}

	public Double getEnvanter() {
		return envanter;
	}

	public void setEnvanter(Double envanter) {
		this.envanter = envanter;
	}

	public Double getSubeMevcudu() {
		return subeMevcudu;
	}

	public void setSubeMevcudu(Double subeMevcudu) {
		this.subeMevcudu = subeMevcudu;
	}

	public Double getSatilabilir() {
		return satilabilir;
	}

	public void setSatilabilir(Double satilabilir) {
		this.satilabilir = satilabilir;
	}

	public Double getDtGiris() {
		return dtGiris;
	}

	public void setDtGiris(Double dtGiris) {
		this.dtGiris = dtGiris;
	}

	public Double getDtCikis() {
		return dtCikis;
	}

	public void setDtCikis(Double dtCikis) {
		this.dtCikis = dtCikis;
	}

	public Double getBaskaSubeIcin() {
		return baskaSubeIcin;
	}

	public void setBaskaSubeIcin(Double baskaSubeIcin) {
		this.baskaSubeIcin = baskaSubeIcin;
	}

	public Double getBaskaSubede() {
		return baskaSubede;
	}

	public void setBaskaSubede(Double baskaSubede) {
		this.baskaSubede = baskaSubede;
	}

	public Double getSevkBekleyen() {
		return sevkBekleyen;
	}

	public void setSevkBekleyen(Double sevkBekleyen) {
		this.sevkBekleyen = sevkBekleyen;
	}

	public Double getCeyizlik() {
		return ceyizlik;
	}

	public void setCeyizlik(Double ceyizlik) {
		this.ceyizlik = ceyizlik;
	}

	public Stoklar getStok() {
		return stok;
	}

	public void setStok(Stoklar stok) {
		this.stok = stok;
	}
}

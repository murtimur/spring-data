package com.muratyildirim.spring_data_jpa.barkodlar;

import com.muratyildirim.spring_data_jpa.birimler.Birimler;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Barkodlar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Id")
	private Integer id;

	@OneToOne(mappedBy = "barkod", cascade = CascadeType.ALL, orphanRemoval = true)
	private Birimler birimler;
	
	@Column(name = "Std")
	private Short std;
	
	@Column(name = "Barkodu")
	private String barkodu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Birimler getBirimler() {
		return birimler;
	}

	public void setBirimler(Birimler birimler) {
		this.birimler = birimler;
	}

	public Short getStd() {
		return std;
	}

	public void setStd(Short std) {
		this.std = std;
	}

	public String getBarkodu() {
		return barkodu;
	}

	public void setBarkodu(String barkodu) {
		this.barkodu = barkodu;
	}

}

package com.muratyildirim.spring_data_jpa.barkodlar.dto;

import com.muratyildirim.spring_data_jpa.birimler.Birimler;

public class BarkodlarDTO {
	
	private Integer id;
	
	private Birimler birimler;
	
	private Short Std;
	
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
		return Std;
	}

	public void setStd(Short std) {
		Std = std;
	}

	public String getBarkodu() {
		return barkodu;
	}

	public void setBarkodu(String barkodu) {
		this.barkodu = barkodu;
	}

}

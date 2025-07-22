package com.muratyildirim.spring_data_jpa.stokrbk;

import com.muratyildirim.spring_data_jpa.stoklar.Stoklar;
import com.muratyildirim.spring_data_jpa.stokrbkmodel.StokRBKModel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class StokRBK {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "StokId")
    private Stoklar stok;

    @ManyToOne
    @JoinColumn(name = "ModelId")
    private StokRBKModel model;

    @Column(name = "Renk")
    private Integer renk;

    @Column(name = "Beden", length = 8)
    private String beden;

    @Column(name = "Kavala", length = 8)
    private String kavala;

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

	public StokRBKModel getModel() {
		return model;
	}

	public void setModel(StokRBKModel model) {
		this.model = model;
	}

	public Integer getRenk() {
		return renk;
	}

	public void setRenk(Integer renk) {
		this.renk = renk;
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

}

package com.muratyildirim.spring_data_jpa.barkodlar;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.muratyildirim.spring_data_jpa.barkodlar.dto.BarkodlarDetayDTO;
import com.muratyildirim.spring_data_jpa.barkodlar.dto.BarkodlarSearchDTO;
import com.muratyildirim.spring_data_jpa.birimler.Birimler;
import com.muratyildirim.spring_data_jpa.depodetaylienvanter.DepodetayliEnvanterService;
import com.muratyildirim.spring_data_jpa.renkler.RenklerService;
import com.muratyildirim.spring_data_jpa.renkler.dto.RenklerDTO;
import com.muratyildirim.spring_data_jpa.shared.ConvertModel;
import com.muratyildirim.spring_data_jpa.stoklar.Stoklar;
import com.muratyildirim.spring_data_jpa.stokrbk.StokRBK;
import com.muratyildirim.spring_data_jpa.stokrbkmodel.StokRBKModel;

import java.math.BigDecimal;

@Service
public class BarkodlarService {

	BarkodlarRepository barkodlarRepository;
	RenklerService renklerService;
	DepodetayliEnvanterService depodetayliEnvanterService;
	ConvertModel convertModel;

	public BarkodlarService(BarkodlarRepository barkodlarRepository, ConvertModel convertModel,
			RenklerService renklerService, DepodetayliEnvanterService depodetayliEnvanterService) {
		this.barkodlarRepository = barkodlarRepository;
		this.convertModel = convertModel;
		this.renklerService = renklerService;
		this.depodetayliEnvanterService = depodetayliEnvanterService;
	}

	public BarkodlarDetayDTO getBarkodDetayRBK(BarkodlarSearchDTO barkodu) {
		Barkodlar barkod = getBarkodEntity(barkodu);
		if (barkod == null)
			return null;
		Birimler birim = barkod.getBirimler();
		Stoklar stok = birim.getStok();
		if (stok == null)
			return null;
		BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
		setTemelBilgiler(dto, barkod, birim, stok);
		setFiyatBilgileri(dto, birim, barkodu.fiyat());
		setEnvanterBilgisi(dto, stok.getId(), barkodu.subeId());
		setRBKBilgisi(dto, stok);
		setModelBilgisi(dto, stok);
		return dto;
	}

	public BarkodlarDetayDTO getBarkodDetay(BarkodlarSearchDTO barkodu) {
		Barkodlar barkod = barkodlarRepository.findByBarkoduWithStokNotRenk(barkodu.barkodu());
		if (barkod == null)
			return null;
		Birimler birim = barkod.getBirimler();
		Stoklar stok = birim.getStok();
		if (stok == null)
			return null;
		BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
		setTemelBilgiler(dto, barkod, birim, stok);
		setFiyatBilgileri(dto, birim, barkodu.fiyat());
		setEnvanterBilgisi(dto, stok.getId(), barkodu.subeId());
		setRBKBilgisi(dto, stok);
		setModelBilgisi(dto, stok);
		return dto;
	}

	public BarkodlarDetayDTO getDetayByStokKoduRBK(BarkodlarSearchDTO stokKodu) {
		Barkodlar barkod = barkodlarRepository.findByStokKoduRBK(stokKodu.barkodu());
		if (barkod == null || barkod.getBirimler() == null)
			return null;
		Birimler birim = barkod.getBirimler();
		Stoklar stok = birim.getStok();
		if (stok == null)
			return null;
		BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
		setTemelBilgiler(dto, barkod, birim, stok);
		setFiyatBilgileri(dto, birim, stokKodu.fiyat());
		setEnvanterBilgisi(dto, stok.getId(), stokKodu.subeId());
		setRBKBilgisi(dto, stok);
		setModelBilgisi(dto, stok);
		return dto;
	}

	public BarkodlarDetayDTO getDetayByStokKodu(BarkodlarSearchDTO stokKodu) {
		Barkodlar barkod = barkodlarRepository.findByStokKodu(stokKodu.barkodu());
		if (barkod == null || barkod.getBirimler() == null)
			return null;
		Birimler birim = barkod.getBirimler();
		Stoklar stok = birim.getStok();
		if (stok == null)
			return null;
		BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
		setTemelBilgiler(dto, barkod, birim, stok);
		setFiyatBilgileri(dto, birim, stokKodu.fiyat());
		setEnvanterBilgisi(dto, stok.getId(), stokKodu.subeId());
		setModelBilgisi(dto, stok);
		return dto;
	}

	public Page<BarkodlarDetayDTO> searchPagedByStokKoduRBK(BarkodlarSearchDTO stokKodu, Pageable pageable) {
		return barkodlarRepository.findByStoklarStokKoduRbk(stokKodu.barkodu(), pageable).map(barkod -> {
			Birimler birim = barkod.getBirimler();
			Stoklar stok = birim.getStok();
			BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
			setTemelBilgiler(dto, barkod, birim, stok);
			setFiyatBilgileri(dto, birim, stokKodu.fiyat());
			setEnvanterBilgisi(dto, stok.getId(), stokKodu.subeId());
			setRBKBilgisi(dto, stok);
			setModelBilgisi(dto, stok);
			return dto;
		});
	}

	public Page<BarkodlarDetayDTO> searchPagedByStokKodu(BarkodlarSearchDTO stokKodu, Pageable pageable) {
		return barkodlarRepository.findByStoklarStokKodu(stokKodu.barkodu(), pageable).map(barkod -> {
			Birimler birim = barkod.getBirimler();
			Stoklar stok = birim.getStok();
			BarkodlarDetayDTO dto = new BarkodlarDetayDTO();
			setTemelBilgiler(dto, barkod, birim, stok);
			setFiyatBilgileri(dto, birim, stokKodu.fiyat());
			setEnvanterBilgisi(dto, stok.getId(), stokKodu.subeId());
			setModelBilgisi(dto, stok);
			return dto;
		});
	}

	private Barkodlar getBarkodEntity(BarkodlarSearchDTO barkodu) {
		Barkodlar barkodEntity = barkodlarRepository.findByBarkoduWithStok(barkodu.barkodu());
		if (barkodEntity == null || barkodEntity.getBirimler() == null)
			return null;
		return barkodEntity;
	}

	private void setTemelBilgiler(BarkodlarDetayDTO dto, Barkodlar barkod, Birimler birim, Stoklar stok) {
		dto.setBarkodu(barkod.getBarkodu());
		dto.setBirimAdi(birim.getAdi());
		dto.setStokAdi(stok.getStokAdi());
		dto.setStokKodu(stok.getStokKodu());
		dto.setStokId(stok.getId());
		dto.setBarkodId(barkod.getId());
	}

	private void setFiyatBilgileri(BarkodlarDetayDTO dto, Birimler birim, int fiyatIndex) {
		String kolon = "Fiyat" + fiyatIndex;
		dto.setFiyat(getSatisFiyati(birim, kolon));
		dto.setParaBirimi(getPBByKolon(birim, kolon));
	}

	private void setEnvanterBilgisi(BarkodlarDetayDTO dto, Integer stokId, Short subeId) {
		dto.setEnvanter(getEnvanter(stokId, subeId));
	}

	private void setRBKBilgisi(BarkodlarDetayDTO dto, Stoklar stok) {
		StokRBK rbk = getStokRBK(stok);
		if (rbk != null) {
			dto.setRbkId(rbk.getId());
			dto.setBeden(rbk.getBeden());
			dto.setKavala(rbk.getKavala());
			RenklerDTO renk = renklerService.getRenk(rbk.getRenk());
			dto.setRenkAdi(renk.getAdi());
		}
	}

	private void setModelBilgisi(BarkodlarDetayDTO dto, Stoklar stok) {
		StokRBKModel model = getStokRBKModel(stok);
		if (model != null) {
			dto.setModelId(model.getId());
			dto.setModelKodu(model.getKodu());
			dto.setModelAdi(model.getAdi());
		}
	}

	private StokRBK getStokRBK(Stoklar stok) {
		return stok.getStokRBKList().isEmpty() ? null : stok.getStokRBKList().get(0);
	}

	private StokRBKModel getStokRBKModel(Stoklar stok) {
		StokRBK rbk = getStokRBK(stok);
		return rbk != null ? rbk.getModel() : null;
	}

	private Double getEnvanter(Integer id, Short subeId) {
		var envanterDTO = depodetayliEnvanterService.getEnvanter(id, subeId);
		return envanterDTO != null ? envanterDTO.getEnvanter() : 0.0;
	}

	private BigDecimal getSatisFiyati(Birimler birim, String kolon) {
		return switch (kolon) {
		case "Fiyat1" -> birim.getFiyat1();
		case "Fiyat2" -> birim.getFiyat2();
		case "Fiyat3" -> birim.getFiyat3();
		default -> null;
		};
	}

	private String getPBByKolon(Birimler birim, String kolon) {
		return switch (kolon) {
		case "Fiyat1" -> birim.getPb1();
		case "Fiyat2" -> birim.getPb2();
		case "Fiyat3" -> birim.getPb3();
		default -> null;
		};
	}

}

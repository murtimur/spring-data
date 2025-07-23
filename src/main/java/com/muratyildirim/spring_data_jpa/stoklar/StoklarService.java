package com.muratyildirim.spring_data_jpa.stoklar;

import java.util.List;

import org.springframework.stereotype.Service;

import com.muratyildirim.spring_data_jpa.birimler.Birimler;

@Service
public class StoklarService {

	StoklarRepository stoklarRepository;

	public StoklarService(StoklarRepository stoklarRepository) {
		this.stoklarRepository = stoklarRepository;
	}

	public Stoklar save(Stoklar stok, List<Birimler> birimlerList) {
		for (Birimler birim : birimlerList) {
			birim.setStok(stok);
		}
		stok.setBirimler(birimlerList);
		return stoklarRepository.save(stok);
	}

}

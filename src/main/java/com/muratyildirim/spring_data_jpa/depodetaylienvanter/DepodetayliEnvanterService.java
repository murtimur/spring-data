package com.muratyildirim.spring_data_jpa.depodetaylienvanter;

import org.springframework.stereotype.Service;

import com.muratyildirim.spring_data_jpa.depodetaylienvanter.dto.DepodetayliEnvanterDTO;
import com.muratyildirim.spring_data_jpa.shared.ConvertModel;

@Service
public class DepodetayliEnvanterService {

	DepodetayliEnvanterRepository depodetayliEnvanterRepository;

	ConvertModel convertModel;

	public DepodetayliEnvanterService(DepodetayliEnvanterRepository depodetayliEnvanterRepository,
			ConvertModel convertModel) {
		this.depodetayliEnvanterRepository = depodetayliEnvanterRepository;
		this.convertModel = convertModel;
	}

	public DepodetayliEnvanterDTO getEnvanter(Integer stokId, Short subeId) {
		DepodetayliEnvanter inDB = depodetayliEnvanterRepository.findByStokIdAndSubeId(stokId, subeId);
		if (inDB == null)
			return null;
		return convertModel.convertObject(inDB, DepodetayliEnvanterDTO.class);
	}

}

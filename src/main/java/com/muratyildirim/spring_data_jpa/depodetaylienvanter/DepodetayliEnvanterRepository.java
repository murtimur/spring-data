package com.muratyildirim.spring_data_jpa.depodetaylienvanter;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepodetayliEnvanterRepository extends JpaRepository<DepodetayliEnvanter, Integer> {

	DepodetayliEnvanter findByStokIdAndSubeId(Integer stokId, Short subeId);

}

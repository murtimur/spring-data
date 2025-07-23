package com.muratyildirim.spring_data_jpa.stoklar;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoklarController {
	
	StoklarService stoklarService;
	
	public StoklarController(StoklarService stoklarService) {
		this.stoklarService = stoklarService;
	}

}

package com.muratyildirim.spring_data_jpa.birimler.dto;

import java.math.BigDecimal;
import java.util.Date;

public record BirimlerDTO(Integer id, Integer stokId, String adi, String aciklama, BigDecimal carpan, Byte kdvGrubu,
		Boolean kdvDahil, Byte otvGrubu, BigDecimal maliyeti, Byte opsiyon, Date fiyatDegistirmeTarihi,
		BigDecimal fiyat1, String pb1, BigDecimal fiyat2, String pb2, BigDecimal fiyat3, String pb3) {
}

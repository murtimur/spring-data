package com.muratyildirim.spring_data_jpa.stoklar.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import com.muratyildirim.spring_data_jpa.birimler.Birimler;
import com.muratyildirim.spring_data_jpa.stokrbk.StokRBK;

import jakarta.validation.constraints.NotBlank;

public record StoklarCreateDTO(Integer id, @NotBlank String stokKodu, @NotBlank String stokAdi, Byte stokTipi, Integer anaBirim,
		Integer varsayilanBirim, Integer siparisBirimi, Byte durum, Integer ozelKod0, Integer ozelKod1,
		Integer ozelKod2, Integer ozelKod3, Integer ozelKod4, Integer ozelKod5, Integer ozelKod6, Integer ozelKod7,
		Integer ozelKod8, Integer ozelKod9, Integer ozelKod10, Integer ozelKod11, Integer ozelKod12,
		BigDecimal kritikSeviye, BigDecimal optimumSeviye, Boolean hemenTeslim, Date tarih, Short kurulumSuresi,
		BigDecimal prim, Byte taksit, BigDecimal alisFiyati, String alisPB, String tanimi, Integer grubu,
		Integer hesapId, BigDecimal satisIskonto, BigDecimal alisIskonto, String seri, String gtip,
		List<Birimler> birimler, List<StokRBK> stokRBKList) {
}

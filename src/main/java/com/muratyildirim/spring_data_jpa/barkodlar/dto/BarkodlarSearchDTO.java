package com.muratyildirim.spring_data_jpa.barkodlar.dto;

public record BarkodlarSearchDTO(String barkodu, Short subeId, Integer fiyat, String paraBirimi) {
}

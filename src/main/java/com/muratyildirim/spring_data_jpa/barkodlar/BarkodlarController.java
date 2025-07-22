package com.muratyildirim.spring_data_jpa.barkodlar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.muratyildirim.spring_data_jpa.barkodlar.dto.BarkodlarDetayDTO;
import com.muratyildirim.spring_data_jpa.barkodlar.dto.BarkodlarSearchDTO;

@RestController
public class BarkodlarController {

  @Autowired
  BarkodlarService barkodlarService;

  @PostMapping("/api/v1/stok")
  ResponseEntity<BarkodlarDetayDTO> getBarkodDetay(@RequestBody BarkodlarSearchDTO barkodu) {
    BarkodlarDetayDTO dto = barkodlarService.getBarkodDetayRBK(barkodu);
    if (dto != null) return ResponseEntity.ok(dto);
    dto = barkodlarService.getBarkodDetay(barkodu);
    if (dto != null) return ResponseEntity.ok(dto);
    dto = barkodlarService.getDetayByStokKodu(barkodu);
    if (dto != null) return ResponseEntity.ok(dto);
    return ResponseEntity.ok(dto);
  }

  @PostMapping("/api/v1/stoklar")
  ResponseEntity<Page<BarkodlarDetayDTO>> getSearchBarkod(@RequestBody BarkodlarSearchDTO barkodu, Pageable pageable) {
    Page<BarkodlarDetayDTO> page = barkodlarService.searchPagedByStokKoduRBK(barkodu, pageable);
    if (page == null) page = barkodlarService.searchPagedByStokKodu(barkodu, pageable);
    if (page == null || page.isEmpty()) return ResponseEntity.notFound().build();
    return ResponseEntity.ok(page);
  }

}

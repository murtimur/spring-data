package com.muratyildirim.spring_data_jpa.barkodlar;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BarkodlarRepository extends JpaRepository<Barkodlar, Integer> {

  @Query("""
          SELECT b
          FROM Barkodlar b
          LEFT JOIN FETCH b.birimler birim
          WHERE b.barkodu = :barkodu
            AND (
              (:fiyatKolonu = 'Fiyat1' AND birim.fiyat1 = :fiyat) OR
              (:fiyatKolonu = 'Fiyat2' AND birim.fiyat2 = :fiyat) OR
              (:fiyatKolonu = 'Fiyat3' AND birim.fiyat3 = :fiyat)
            )
      """)
  Barkodlar findByBarkoduWithDynamicFiyat(@Param("barkodu") String barkodu, @Param("fiyat") Integer fiyat,
                                          @Param("fiyatKolonu") String fiyatKolonu);

  @Query("""
          SELECT b
          FROM Barkodlar b
          LEFT JOIN FETCH b.birimler birim
          LEFT JOIN FETCH birim.stok stok
          LEFT JOIN FETCH stok.stokRBKList stokRBK
          LEFT JOIN FETCH stokRBK.model model
          WHERE b.barkodu = :barkodu
      """)
  Barkodlar findByBarkoduWithStok(@Param("barkodu") String barkodu);

  @Query("""
      SELECT b
      FROM Barkodlar b
      LEFT JOIN FETCH b.birimler birim
      LEFT JOIN FETCH birim.stok stok
      WHERE b.barkodu = :barkodu
      """)
  Barkodlar findByBarkoduWithStokNotRenk(@Param("barkodu") String barkodu);

  @Query("""
      SELECT b
          FROM Barkodlar b
          LEFT JOIN FETCH b.birimler birim
          LEFT JOIN FETCH birim.stok stok
          LEFT JOIN FETCH stok.stokRBKList stokRBK
          LEFT JOIN FETCH stokRBK.model model
          WHERE stok.stokKodu = :stokKodu
      """)
  Barkodlar findByStokKoduRBK(@Param("stokKodu") String stokKodu);

  @Query("""
      SELECT b
          FROM Barkodlar b
          LEFT JOIN FETCH b.birimler birim
          LEFT JOIN FETCH birim.stok stok
          WHERE stok.stokKodu = :stokKodu
      """)
  Barkodlar findByStokKodu(@Param("stokKodu") String stokKodu);

  @Query("""
      SELECT b
      FROM Barkodlar b
      LEFT JOIN FETCH b.birimler birim
      LEFT JOIN FETCH birim.stok stok
      LEFT JOIN FETCH stok.stokRBKList stokRBK
      LEFT JOIN FETCH stokRBK.model model
      WHERE stok.stokKodu LIKE %:stokKodu%
      """)
  Page<Barkodlar> findByStoklarStokKoduRbk(@Param("stokKodu") String stokKodu, Pageable pageable);

  @Query("""
      SELECT b
      FROM Barkodlar b
      LEFT JOIN FETCH b.birimler birim
      LEFT JOIN FETCH birim.stok stok
      WHERE stok.stokKodu LIKE %:stokKodu%
      """)
  Page<Barkodlar> findByStoklarStokKodu(@Param("stokKodu") String stokKodu, Pageable pageable);

}

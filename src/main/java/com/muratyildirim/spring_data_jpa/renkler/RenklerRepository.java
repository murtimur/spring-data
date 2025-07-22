package com.muratyildirim.spring_data_jpa.renkler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RenklerRepository extends JpaRepository<Renkler, Integer> {
	
	@Query("select r from Renkler r where id=:id")
	public Renkler getRenk(@Param("id") Integer id);


}

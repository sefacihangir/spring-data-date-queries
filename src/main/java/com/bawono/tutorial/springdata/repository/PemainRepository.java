package com.bawono.tutorial.springdata.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bawono.tutorial.springdata.model.Pemain;

@Repository("pemainRepository")
public interface PemainRepository extends JpaRepository<Pemain, Long> {
	public List<Pemain> findByTanggalLahirAfter(Date tanggal);

	public List<Pemain> findByTanggalLahirBefore(Date tanggal);

	public List<Pemain> findByTanggalLahirBetween(Date tanggalAwal, Date tanggalAkhir);
}

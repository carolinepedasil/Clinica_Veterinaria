package com.clinicaveterinaria.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicaveterinaria.entity.Procedimento;

public interface ProcedimentoRepository extends JpaRepository<Procedimento,Long>{
}

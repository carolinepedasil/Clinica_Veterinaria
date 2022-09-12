package com.clinicaveterinaria.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicaveterinaria.entity.Agendamento;

public interface AgendamentoRepository extends JpaRepository<Agendamento,Long>{
}

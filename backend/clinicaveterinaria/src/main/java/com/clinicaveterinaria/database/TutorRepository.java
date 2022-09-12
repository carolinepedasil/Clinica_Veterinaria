package com.clinicaveterinaria.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicaveterinaria.entity.Tutor;

public interface TutorRepository extends JpaRepository<Tutor,Long>{
}

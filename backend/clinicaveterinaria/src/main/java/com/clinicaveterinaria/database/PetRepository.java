package com.clinicaveterinaria.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clinicaveterinaria.entity.Pet;

public interface PetRepository extends JpaRepository<Pet,Long>{
}

package com.clinicaveterinaria.controller;

import java.util.List;

import com.clinicaveterinaria.database.PetRepository;
import com.clinicaveterinaria.entity.Pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pet")
public class PetController {
	
    @Autowired
    private PetRepository petRepositorio;

    @GetMapping
    public List<Pet> listarPets(){
        return petRepositorio.findAll();
    }

    @PostMapping
    public void adicionarPet(@RequestBody Pet pet){
    	petRepositorio.save(pet);
    }

    @PutMapping
    public void editarPet(@RequestBody Pet pet){
        if(pet.getId() > 0)
        	petRepositorio.save(pet);
    }

    @DeleteMapping("/{id}")
    public void removerPet(@PathVariable Long id){
    	petRepositorio.deleteById(id);
    }
    
}

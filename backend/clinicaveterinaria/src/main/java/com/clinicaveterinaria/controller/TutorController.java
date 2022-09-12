package com.clinicaveterinaria.controller;

import java.util.List;

import com.clinicaveterinaria.database.TutorRepository;
import com.clinicaveterinaria.entity.Tutor;

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
@RequestMapping("/tutor")
public class TutorController {
	
    @Autowired
    private TutorRepository tutorRepositorio;

    @GetMapping
    public List<Tutor> listarTutores(){
        return tutorRepositorio.findAll();
    }

    @PostMapping
    public void adicionarTutor(@RequestBody Tutor tutor){
    	tutorRepositorio.save(tutor);
    }

    @PutMapping
    public void editarTutor(@RequestBody Tutor tutor){
        if(tutor.getId() > 0)
        tutorRepositorio.save(tutor);
    }

    @DeleteMapping("/{id}")
    public void removerTutor(@PathVariable Long id){
    	tutorRepositorio.deleteById(id);
    }
    
}

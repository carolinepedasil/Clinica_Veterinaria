package com.clinicaveterinaria.controller;

import java.util.List;

import com.clinicaveterinaria.database.AgendamentoRepository;
import com.clinicaveterinaria.entity.Agendamento;

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
@RequestMapping("/agendamento")
public class AgendamentoController {
	
    @Autowired
    private AgendamentoRepository agendamentoRepositorio;

    @GetMapping
    public List<Agendamento> listarAgendamentos(){
        return agendamentoRepositorio.findAll();
    }

    @PostMapping
    public void adicionarAgendamento(@RequestBody Agendamento agendamento){
    	agendamentoRepositorio.save(agendamento);
    }

    @PutMapping
    public void editarAgendamento(@RequestBody Agendamento agendamento){
        if(agendamento.getId() > 0)
            agendamentoRepositorio.save(agendamento);
    }

    @DeleteMapping("/{id}")
    public void removerAgendamento(@PathVariable Long id){
    	agendamentoRepositorio.deleteById(id);
    }
    
}

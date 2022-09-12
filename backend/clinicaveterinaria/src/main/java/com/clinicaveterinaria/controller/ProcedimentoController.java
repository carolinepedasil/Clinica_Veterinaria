package com.clinicaveterinaria.controller;

import java.util.List;

import com.clinicaveterinaria.database.ProcedimentoRepository;
import com.clinicaveterinaria.entity.Procedimento;

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
@RequestMapping("/procedimento")
public class ProcedimentoController {
	
    @Autowired
    private ProcedimentoRepository procedimentoRepositorio;

    @GetMapping
    public List<Procedimento> listarProcedimentos(){
        return procedimentoRepositorio.findAll();
    }

    @PostMapping
    public void adicionarProcedimento(@RequestBody Procedimento procedimento){
    	procedimentoRepositorio.save(procedimento);
    }

    @PutMapping
    public void editarProcedimento(@RequestBody Procedimento procedimento){
        if(procedimento.getId() > 0)
            procedimentoRepositorio.save(procedimento);
    }

    @DeleteMapping("/{id}")
    public void removerProcedimento(@PathVariable Long id){
    	procedimentoRepositorio.deleteById(id);
    }
    
}

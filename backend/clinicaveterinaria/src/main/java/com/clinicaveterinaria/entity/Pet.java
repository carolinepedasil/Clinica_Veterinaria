package com.clinicaveterinaria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.clinicaveterinaria.enums.Porte;
import com.clinicaveterinaria.enums.SexoDoAnimal;

@Entity
public class Pet {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private Number idade;
    @Column(nullable = false)
    private String raca;
    @Column(nullable = false)
    private String especie;
    @Column(nullable = false)
    private Porte porte;
    @Column(nullable = false)
    private SexoDoAnimal sexo;
    
	public Pet(Long id, String nome, Number idade, String raca, String especie, Porte porte, SexoDoAnimal sexo) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.raca = raca;
		this.especie = especie;
		this.porte = porte;
		this.sexo = sexo;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Number getIdade() {
		return idade;
	}

	public String getRaca() {
		return raca;
	}

	public String getEspecie() {
		return especie;
	}

	public Porte getPorte() {
		return porte;
	}

	public SexoDoAnimal getSexo() {
		return sexo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(Number idade) {
		this.idade = idade;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setPorte(Porte porte) {
		this.porte = porte;
	}

	public void setSexo(SexoDoAnimal sexo) {
		this.sexo = sexo;
	}

}

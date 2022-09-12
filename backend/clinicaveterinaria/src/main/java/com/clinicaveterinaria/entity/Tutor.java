package com.clinicaveterinaria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Tutor {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nome;
    @Column(nullable = false)
    private String endereco;
    @Column(nullable = false)
    private Number telefone;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String documento;
    @Column(nullable = false)
    private Pet pet;

	public Tutor(Long id, String nome, String endereco, Number telefone, String email, String documento, Pet pet) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.documento = documento;
		this.pet = pet;
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public Number getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getDocumento() {
		return documento;
	}

	public Pet getPet() {
		return pet;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setTelefone(Number telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

}

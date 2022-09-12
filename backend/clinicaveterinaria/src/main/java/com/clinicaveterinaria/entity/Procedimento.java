package com.clinicaveterinaria.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procedimento {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private boolean consultaComum;
    @Column(nullable = false)
    private boolean vacina;
	@Column(nullable = false)
    private boolean castracao;
	@Column(nullable = false)
    private boolean internacao;

	public Procedimento(Long id, boolean consultaComum, boolean vacina, boolean castracao, boolean internacao) {
		this.id = id;
		this.consultaComum = consultaComum;
		this.vacina = vacina;
		this.castracao = castracao;
		this.internacao = internacao;
	}

	public Long getId() {
		return id;
	}

	public boolean isConsultaComum() {
		return consultaComum;
	}

	public boolean isVacina() {
		return vacina;
	}

	public boolean isCastracao() {
		return castracao;
	}
	
	public boolean isInternacao() {
		return internacao;
	}

	public void setConsultaComum(boolean consultaComum) {
		this.consultaComum = consultaComum;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public void setCastracao(boolean castracao) {
		this.castracao = castracao;
	}

	public void setInternacao(boolean internacao) {
		this.internacao = internacao;
	}

}

package com.clinicaveterinaria.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.clinicaveterinaria.enums.StatusDoAgendamento;

@Entity
public class Agendamento {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private Tutor tutor;
    @Column(nullable = false)
    private Procedimento procedimento;
	@Column(nullable = false)
    private Date dataHora;
	@Column(nullable = false)
    private StatusDoAgendamento status;

	public Agendamento(Long id, Tutor tutor, Procedimento procedimento, Date dataHora, StatusDoAgendamento status) {
		this.id = id;
		this.tutor = tutor;
		this.procedimento = procedimento;
		this.dataHora = dataHora;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public Tutor getTutor() {
		return tutor;
	}

	public Procedimento getProcedimento() {
		return procedimento;
	}

	public Date getDataHora() {
		return dataHora;
	}
	
	public StatusDoAgendamento getStatus() {
		return status;
	}

	public void setTutor(Tutor tutor) {
		this.tutor = tutor;
	}

	public void setProcedimento(Procedimento procedimento) {
		this.procedimento = procedimento;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public void setStatus(StatusDoAgendamento status) {
		this.status = status;
	}

}

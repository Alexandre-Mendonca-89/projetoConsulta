package br.edu.ifms.consulta.dto;

import java.io.Serializable;

import br.edu.ifms.consulta.modelo.Paciente;

public class PacienteDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private int cpf;
	
	public PacienteDto() {
		// TODO Auto-generated constructor stub
	}

	public PacienteDto(Paciente paciente) {
		super();
		this.id = paciente.getId();
		this.nome = paciente.getNome();
		this.cpf = paciente.getCpf();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	
	
}

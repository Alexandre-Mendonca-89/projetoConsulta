package br.edu.ifms.consulta.dto;

import java.io.Serializable;

import br.edu.ifms.consulta.modelo.Medico;

public class MedicoDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long id;
	private String nome;
	private String area;
	
	public MedicoDto() {
		// TODO Auto-generated constructor stub
	}

	public MedicoDto(Medico medico) {
		super();
		this.id = medico.getId();
		this.nome = medico.getNome();
		this.area = medico.getArea();
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}

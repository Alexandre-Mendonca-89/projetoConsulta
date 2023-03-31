package br.edu.ifms.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.consulta.dto.MedicoDto;
import br.edu.ifms.consulta.modelo.Medico;
import br.edu.ifms.consulta.repository.RepositoryMedico;

@Service
public class MedicoService {
	@Autowired
	private RepositoryMedico repositoryMedico;
	
		
	public List<Medico> buscarTodos(){
		return repositoryMedico.findAll();
	}	
	
	public Medico buscarPorId(Long id) {
		Optional<Medico> medico = repositoryMedico.findById(id);
		return medico.orElseThrow();		
	}
	public Medico inserir(Medico medico) {
		medico.setId(null);
		return repositoryMedico.save(medico);
	}
	
	public void remover(Long id) {
		buscarPorId(id);
		repositoryMedico.deleteById(id);		
	}
	
	public Medico atualizar(Medico medico) {
		Medico medicoNovo = buscarPorId(medico.getId());		
		medicoNovo.setNome(medico.getNome());
		medicoNovo.setArea(medico.getArea());
		return repositoryMedico.save(medicoNovo);
	}
	
	public Medico fromDto(MedicoDto medicoDto) {
		return new Medico(medicoDto.getId(),medicoDto.getNome(),medicoDto.getArea());
	}
}


package br.edu.ifms.consulta.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.consulta.dto.PacienteDto;
import br.edu.ifms.consulta.modelo.Paciente;
import br.edu.ifms.consulta.repository.RepositoryPaciente;

@Service
public class PacienteService {
	@Autowired
	private RepositoryPaciente repositoryPaciente;
	
		
	public List<Paciente> buscarTodos(){
		return repositoryPaciente.findAll();
	}	
	
	public Paciente buscarPorId(Long id) {
		Optional<Paciente> paciente = repositoryPaciente.findById(id);
		return paciente.orElseThrow();		
	}
	public Paciente inserir(Paciente paciente) {
		paciente.setId(null);
		return repositoryPaciente.save(paciente);
	}
	
	public void remover(Long id) {
		buscarPorId(id);
		repositoryPaciente.deleteById(id);		
	}
	
	public Paciente atualizar(Paciente paciente) {
		Paciente pacienteNovo = buscarPorId(paciente.getId());		
		pacienteNovo.setNome(paciente.getNome());
		pacienteNovo.setCpf(paciente.getCpf());
		return repositoryPaciente.save(pacienteNovo);
	}
	
	public Paciente fromDto(PacienteDto pacienteDto) {
		return new Paciente(pacienteDto.getId(),pacienteDto.getNome(),pacienteDto.getCpf());
	}
}


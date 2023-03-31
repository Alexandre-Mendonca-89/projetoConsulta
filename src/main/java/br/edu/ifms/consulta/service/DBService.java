package br.edu.ifms.consulta.service;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ifms.consulta.modelo.Medico;
import br.edu.ifms.consulta.modelo.Paciente;
import br.edu.ifms.consulta.repository.RepositoryMedico;
import br.edu.ifms.consulta.repository.RepositoryPaciente;

@Service
public class DBService {
	
	@Autowired
	RepositoryMedico repositoryMedico;
	
	@Autowired
	RepositoryPaciente repositoryPaciente;
	
	
	public void instantiateTestDatabase() throws ParseException {
		
		Paciente p1 = new Paciente(null, "Alexandre", 1234556789);
		Paciente p2 = new Paciente(null, "Fulano", 987654321);
		Paciente p3 = new Paciente(null, "Sicrano", 0102030405);
		Paciente p4 = new Paciente(null, "Fulano de novo", 1425364758);
		Paciente p5 = new Paciente(null, "Beltrano", 1020304050);
		
		Medico m1 = new Medico(null, "Walter", "Clinico Geral");		
		Medico m2 = new Medico(null, "Lalter", "Ginecologista");			
		Medico m3 = new Medico(null, "Juca", "Dentista");	
		
		m1.getMedico().addAll(Arrays.asList(p1));
		
		
		repositoryPaciente.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
		repositoryMedico.saveAll(Arrays.asList(m1, m2, m3));
		
	}
}
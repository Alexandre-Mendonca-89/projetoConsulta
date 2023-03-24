package br.edu.ifms.consulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ifms.consulta.modelo.Paciente;
@Repository
public interface RepositoryPaciente extends JpaRepository<Paciente, Long>{

}

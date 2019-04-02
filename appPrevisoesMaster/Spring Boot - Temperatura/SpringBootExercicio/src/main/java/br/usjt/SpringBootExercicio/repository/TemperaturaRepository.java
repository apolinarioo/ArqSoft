package br.usjt.SpringBootExercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.usjt.SpringBootExercicio.model.Temperatura;

public interface TemperaturaRepository extends JpaRepository<Temperatura, Long>{

	
}

	package br.usjt.SpringBootExercicio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.SpringBootExercicio.model.Temperatura;
import br.usjt.SpringBootExercicio.repository.TemperaturaRepository;

@Controller
public class TemperaturaController {
	//a injeção de dependência ocorre aqui
	@Autowired
	private TemperaturaRepository temperaturaRepo;

	@GetMapping ("/temperatura")
	public ModelAndView listarTemperatura () {
		
	//passe o nome da página ao construtor
	ModelAndView mv = new ModelAndView ("lista_temperatura");
	
	//Busque a coleção com o repositório
	List <Temperatura> temperaturas = temperaturaRepo.findAll();
	
	//adicione a coleção ao objeto ModelAndView
	mv.addObject("Temperatura", temperaturas);
	
	//para modelar o formulário
	mv.addObject(new Temperatura());
	
	//devolva o ModelAndView
	return mv;
	}
	
	@PostMapping("/temperatura")
	public String salvar (Temperatura temperatura) {
		temperaturaRepo.save(temperatura);
		return "redirect:/temperatura";
	} 
}



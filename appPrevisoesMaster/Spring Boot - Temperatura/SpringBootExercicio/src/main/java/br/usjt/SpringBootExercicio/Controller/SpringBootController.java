package br.usjt.SpringBootExercicio.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringBootController {
	
	@GetMapping ("/tempo")
		public String tempo() {
		return "temperatura_spring_boot";
	}

}

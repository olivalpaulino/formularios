package com.dobackaofront.formularios;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDoBack {
	
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("pessoa", new Pessoa());
		return mv;
	}
	
	@PostMapping("/salvar")
	public String salvar(Pessoa p) {
		if (p.getId() == null) {
			p.setId(pessoas.size());
			pessoas.add(p);
		} else {
			System.out.println("Editando o ID da Pessoas: "+p.getId());
			pessoas.get(p.getId()).setNome(p.getNome());
			pessoas.get(p.getId()).setEmail(p.getEmail());
			pessoas.get(p.getId()).setWhatsapp(p.getWhatsapp());
			
		}
		
		return "redirect:/cadastros";

	}
	
	@GetMapping("/cadastros")
	public ModelAndView mostrarCadastros() {
		ModelAndView mv = new ModelAndView("cadastros");
		mv.addObject("pessoas", pessoas);
		return mv;
	}
	
	@GetMapping("/editar/{id}")
	public ModelAndView editar(@PathVariable("id") Integer id) {
		System.out.println("Editar id: "+id);
		ModelAndView mv = new ModelAndView("index");
		pessoas.get(id).setId(id);
		mv.addObject("pessoa", pessoas.get(id));
		return mv;
	}
}

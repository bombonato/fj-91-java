package br.com.caelum.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.modelo.Pessoa;

@Controller
public class PessoasController {
	
	 @RequestMapping("/cadastro")
     public String executa() {
		 return "cadastro";
     }
	 
    @RequestMapping("/adiciona")
    public String adiciona(Pessoa pessoa, Model model) {
        // app real gravaria no BD
        model.addAttribute("pessoa", pessoa);
        return "tr";
    }
	 
}

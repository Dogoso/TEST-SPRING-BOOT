package com.doglab.main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.doglab.main.services.CadastroService;
import com.doglab.main.services.ProdutoService;

@Controller
@RequestMapping("/produtos")
public class CadastroProdutoController {
	
	// Define o ponto de injeção instanciando a classe.
	@Autowired
	CadastroService cadastroService;
	@Autowired
	ProdutoService produtoService;
	
	@RequestMapping(value = "/cadastro", method = RequestMethod.GET)
	public String cadastroProdutos() {
		return "cadastro";
	}
	
	/* Logicamente apenas no POST são enviados 
	 * informações/parâmetros, logo não tem sentido
	 * requisitar um parâmetro em um GET.
	 */
	@RequestMapping(value = "/cadastro", method = RequestMethod.POST)
	public ModelAndView cadastroProdutos(@RequestParam String name, @RequestParam String value) {
		ModelAndView mv = new ModelAndView();
		if(cadastroService.validateCadastro(name, value)) {
			mv.addObject("name", name);
			mv.addObject("value", value);
			mv.setViewName("index");
		}else {
			mv.addObject("msg", "Insira todas as informações!");
			mv.setViewName("cadastro");
		}
		return mv;
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("product_list", produtoService.allProducts());
		mv.setViewName("listar");
		return mv;
	}
	
}

package br.com.pagamento.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.pagamento.sistema.model.Pagamento;
import br.com.pagamento.sistema.service.IPagamentoService;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {
	
	@Autowired
	private IPagamentoService service;

	@GetMapping("/")
	public String pagaginaInicial() {
		return "paginaInicial";
	}

	@PostMapping("/salvar")
	public String salvarPagamento(@ModelAttribute Pagamento pagamento, Model model) {
		// @ ModelAttribute vincula as informações do formulario a um objeto
		return "adicionarPagamento";

	}

	@GetMapping("/adicionar")
	public String adicionarPagamento() {
		return "adicionarPagamento";

	}

	@GetMapping("/editar")
	public String editarPagamento() {
		return "editarPagamento";

	}

	@GetMapping("/listar")
	public String listarPagamento() {
		return "listarPagamentos";
	}

}

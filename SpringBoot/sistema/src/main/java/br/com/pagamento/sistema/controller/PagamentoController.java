package br.com.pagamento.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pagamento")
public class PagamentoController {

	@GetMapping("/")
	public String pagaginaInicial() {
		return "paginaInicial";
	}

	@PostMapping("/salvar")
	public String salvarPagamento() {
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

package br.com.pagamento.sistema.service;

import java.util.List;

import br.com.pagamento.sistema.model.Pagamento;

public interface IPagamentoService {
	
	public Pagamento salvarPagamento(Pagamento pagamento);
	
	public List<Pagamento> listarPagamentos();
	
	public Pagamento buscarPagamnentoUnico(Long id);
	
	public void deletarPagamento(Long id);
	
	public void atualizarPagamento(Pagamento pagamento);
	

}

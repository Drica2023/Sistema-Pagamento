package br.com.pagamento.sistema.exception;



public class PagamentoNotFoundException extends RuntimeException {
	
	
	// identificador de versão
	// classe Serializable
	// final a variavel é definida uma única vez
	// long => um int com maior quantidade de números disponiveis
	private static final long serialVersionUID = 1L;
	
	// Cosnstrutor vazio
	public PagamentoNotFoundException() {
		super();
		
	}
	
	// construtor com uma mensagem 
	public PagamentoNotFoundException(String mensagemCustomizada) {
		super(mensagemCustomizada);
		
		
		
	}

}

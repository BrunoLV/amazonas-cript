package br.com.porto.amazonas.criptografia.exceptions;

/**
 * Exception customizada para encapsular as exceptions lançadas nas ações de criptografia.
 * @author Bruno Luiz Viana
 *
 */
public class CriptografiaException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public CriptografiaException() {
		super();
	}
	
	public CriptografiaException(String mensagem) {
		super(mensagem);
	}
	
	public CriptografiaException(Throwable causa) {
		super(causa);
	}
	
	public CriptografiaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	} 

} // fim da classe CriptografiaException
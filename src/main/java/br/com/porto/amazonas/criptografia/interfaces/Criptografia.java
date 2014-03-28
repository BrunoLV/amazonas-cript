package br.com.porto.amazonas.criptografia.interfaces;

import br.com.porto.amazonas.criptografia.exceptions.CriptografiaException;

/**
 * Interface para os componentes de criptografia.
 * @author Bruno Luiz Viana
 *
 */
public interface Criptografia {
	
	/**
	 * Método utilizado para realizar criptografia das informações passadas para o método.
	 * @param value
	 * @return
	 * @throws CriptografiaException
	 */
	String criptografar(String value) throws CriptografiaException;
	
} // fim da interface Criptografia
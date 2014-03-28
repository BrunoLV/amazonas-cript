package br.com.porto.amazonas.criptografia.implementacao;

import br.com.porto.amazonas.criptografia.exceptions.CriptografiaException;
import br.com.porto.amazonas.criptografia.interfaces.Criptografia;

/**
 * Classe de criptografia.
 * Algoritmo: SHA-512
 * @author Bruno Luiz Viana
 *
 */
public class CriptografiaSHA512 extends CriptografiaGenerica implements Criptografia {
	
	private static final String ALGORITMO = "SHA-512";
	
	public CriptografiaSHA512() {
	} // método construtor
	
	public String criptografar(String valor) throws CriptografiaException {
		return criptografarComAlgoritmo(ALGORITMO, valor);
	} // fim do método criptografar

} // fim da classe CriptografiaSHA512
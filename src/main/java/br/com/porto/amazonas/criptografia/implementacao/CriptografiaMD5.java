package br.com.porto.amazonas.criptografia.implementacao;

import br.com.porto.amazonas.criptografia.exceptions.CriptografiaException;
import br.com.porto.amazonas.criptografia.interfaces.Criptografia;

public class CriptografiaMD5 extends CriptografiaGenerica implements Criptografia {
	
	private static final String ALGORITMO = "MD5";
	
	public CriptografiaMD5() {
	}

	public String criptografar(String value) throws CriptografiaException {
		return criptografarComAlgoritmo(ALGORITMO, value);
	}

}

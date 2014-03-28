package br.com.porto.amazonas.criptografia.implementacao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Base64;

import br.com.porto.amazonas.criptografia.exceptions.CriptografiaException;

/**
 * Classe abstrata que cont�m o comportamente padr�o de qualquer classe de criptografia.
 * @author Bruno Luiz Viana
 *
 */
public abstract class CriptografiaGenerica {
	
	private MessageDigest messageDigest;
	private Base64 encoder;
	
	/**
	 * M�todo utilizado para definir o algoritmo que será utilizado.
	 * @param algoritmo
	 * @throws CriptografiaException
	 */
	protected void usarAlgoritmo(String algoritmo) throws CriptografiaException {
		if (messageDigest == null || messageDigest.getAlgorithm() != algoritmo) {
			try {
				messageDigest = MessageDigest.getInstance(algoritmo);
			} catch (NoSuchAlgorithmException e) {
				throw new CriptografiaException(e.getMessage(), e.getCause());
			} // fim do bloco try/catch
		} // fim do bloco if
		if (encoder == null) {
			encoder = new Base64();
		} // fim od bloco if
	} // fim do método usarAlgoritmo
	
	/**
	 * M�todo utilizado para realizar a criptografia com o algoritmo informado.
	 * @param algoritmo
	 * @param valor
	 * @return
	 * @throws CriptografiaException
	 */
	protected String criptografarComAlgoritmo(String algoritmo, String valor) throws CriptografiaException {
		if (valor == null) {
			throw new IllegalArgumentException("O valor � nulo");
		} // fim do bloco if
		usarAlgoritmo(algoritmo);
		byte[] hash = messageDigest.digest(valor.getBytes());
		return encoder.encodeToString(hash);
	} // fim do m�todo criptografarComAlgoritmo

} // fim da classe CriptografiaGenerica
package br.com.ftd.oneroster.exception;

public abstract class EntityNotFoundException extends NegocioException {

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(String mensagem) {
		super(mensagem);
	}
	
}

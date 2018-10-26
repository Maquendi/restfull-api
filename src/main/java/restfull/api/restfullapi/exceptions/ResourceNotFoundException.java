package restfull.api.restfullapi.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Class<?> className, Long id) {
		super("Could not find " + className.getCanonicalName() + " with id " + id);
	}
	
}

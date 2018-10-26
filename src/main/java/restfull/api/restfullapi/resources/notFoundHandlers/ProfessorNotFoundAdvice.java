package restfull.api.restfullapi.resources.notFoundHandlers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.HttpStatus;

import restfull.api.restfullapi.exceptions.ResourceNotFoundException;

@ControllerAdvice
public class ProfessorNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String employeeNotFoundHandler(ResourceNotFoundException ex) {
		return ex.getMessage();
	}

}

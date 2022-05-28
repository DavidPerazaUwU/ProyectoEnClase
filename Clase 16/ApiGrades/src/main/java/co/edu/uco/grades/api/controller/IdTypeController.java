package co.edu.uco.grades.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/idtype")
public class IDTypeController {
	
	@GetMapping("/dummy")
	public IdTypeDTO getDummy() {
		return new IdTypeDTO();
	}
	
	@PostMapping
	public ResponseEntity<Response<IdType >>
		
		Validator<IdTypeDTO> validator = new CreateIdTypeValidator();
		List<String> messages = UtilObject.getUtilObject().getDefault(validator.validate(dto), new ArrayList<>());
		Response<IdTypeDTO> response = new Response<>();
		ResponseEntity<Response>> resonseEntity;
		HttpStatus statusCode = HttpStatus.BAD_REQUEST;
		
		if (messages.isEmpty()) {
			try {
				IdTypeFacade facade = new IdTypeFacadeImpl();
				facade.create(dto);	
				messages.add("Id type was create succesfully!");
				statusCode = HttpStatus.OK;
			}catch (GradesExpection exception) {
				if(ExceptionType.TECHNICAL.equals(exception.getType())) {
					messages.add("There was a problem trying to registres the new id Type. Please try again"){
					System.err.println(exception.getLocation()));
					System.err.println(exception.getType()));
					System.err.println(exception.getMessage()));
					exception.getRootException().printSackTrace();
				}else {
					messages.add
					System.err.println(exception.getType()));
					System.err.println(exception.getMessage()));
					exception.getRootException().printSackTrace();		
			}	
		}catch (Exception exception) {	
			messages.add("there was an unexpeced problem trying to registrer the new id Type");
			exception.printStackTrace();
			}
		
		
				
	}}
	
	response.setMessage(messages);
	responseEntity = new ResponseEntity<>(response,statusCode);

	
	@PutMapping("/{id}")
	public void update(@PathVariable("id") int id,@RequestBody dTypDTO dto) {
		System.out.println("Estoy en actualizar!");
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") int id) {
		System.out.println("Estoy en Eliminar!");
	}
	
	@GetMapping("/{id}")
	public void fingById(@PathVariable("id") int id) {
		System.out.println("Estoy en consultar por id!");
	}
	@GetMapping("/{id}")
	public void fin() {
		System.out.println("Estoy en consultar todos!");
	}	

}

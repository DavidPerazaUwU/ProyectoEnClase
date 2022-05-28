package co.edu.uco.grades.api.controller.validators.idtype;

import java.util.ArrayList;
import java.util.List;


import co.edu.grades.api.controller.validators.Validator;
import co.edu.grades.grades.dto.IdTypeDTO;
import co.edu.uco.crosscuting.util.object.UtilObject;

public class CreateValidator implements Validator<idTYpeDTO>{
	
	private List<String> validationMessages = new ArrayList<>();
	
	@Override
	public List<String> validate(IdTypeDTO dto){
		if(UtilObject.getUtilObject().isNull(dto)) {
			validationMessages.add("It´s not possible validate 	Id type Data");
		}
		
		dto.validateName
		
		return validationMessages;
	}
}

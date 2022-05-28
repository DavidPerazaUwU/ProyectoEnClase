package co.edu.uco.businesslogic.business.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.IdTypeBusiness;
import co.edu.uco.crosscuting.util.object.UtilObject;
import co.edu.uco.grade.dto.IdTypeDTO;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;

public class IdTypeBusinessImpl implements IdTypeBusiness{

	
	private DAOFactory daoFactory;
	
	public IdTypeBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's no possible create a IdTypeBusinessImpl whem the DAOfactory is null");
		}
		
		this.daoFactory = daoFactory;
	}
	
	@Override
	public void create(IdTypeDTO dto) {
		validateIdTypeDoesNotExistWithSameName(dto);
		daoFactory.getIdTypeDAO().create(dto);
	}
	
	private void validateIdTypeDoesNotExistWithSameName(IdTypeDTO dto) {
		IdTypeDTO dtovalidator = new IdTypeDTO();
		dtovalidator.setName(dto.getName());
		
		List<IdTypeDTO> list = daoFactory.getIdTypeDAO().find(dtoValidator);
		
		if (!list.isEmpty()) {
			var message ="An Id Type with the same name already exists!";
			throw GradesException.buildBusinessLogicException(message);
		}
	}

	@Override
	public void update(IdTypeDTO dto) {
		daoFactory.getIdTypeDAO().update(dto);
		
	}

	@Override
	public void delete(int id) {
		daoFactory.getIdTypeDAO().delete(id);
		
	}

	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto) {
		
		return daoFactory.getIdTypeDAO().find(dto);
	}
	
	

}

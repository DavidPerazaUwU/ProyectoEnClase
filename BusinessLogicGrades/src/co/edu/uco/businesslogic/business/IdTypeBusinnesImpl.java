package co.edu.uco.businesslogic.business;

import java.util
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;



public class IdTypeBusinnesImpl implements IdTypeBusiness {
	
	private DAOFactory daoFactory;
	
	public IdTypeBusinessImpl(DAOFactory daoFactory) {
		if (UtilObject.getUtilObject().isNull(daoFactory)) {
			throw GradesException.buildTechnicalBusinessLogicException("It's not possible create a IdTypeBusinessImpl when the DAOFactoy is null");
		}
	this.daoFactory= daoFactory;

}

		this.daoFactory = daoFactory;
	}
	
	@Override
	public void create(IdTypeDTO dto) {
		daoFactory.getIdTypeDAO().create(dto);
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
	public List<IdTypeDTO> find(IdTypeDTO dto){
		return daoFactory.getIdTypeDAO().find(dto);
	}
	
	
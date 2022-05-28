package co.edu.uco.grades.businesslogic.facade.impl;

import java.util.List;

import co.edu.uco.businesslogic.business.impl.IdTypeBusinessImpl;
import co.edu.uco.businesslogic.business.IdTypeBusiness;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.factory.DAOFactory;
import co.edu.uco.grade.dto.IdTypeDTO;

public abstract class IdTypeFacadelmpl implements IdTypeFacade {		

	
	
	@Override
	public void create(IdTypeDTO dto) {
	
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransaction();
	
			IdTypeBusiness idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.create(dto);
	
			daoFactory.commitTransaction(); 
		}catch (GradesException exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollbackTransaction();
			var message = "There was a problem trying to create the new IdType on create method in IdType on create method in IdTypeFacadelmpl ";
			throw GradesException.buildTechnicalBusinessLogicException(null);		
		}finally {
			daoFactory.closeConnection();
		}
	}
	
	@Override
	public void update(IdTypeDTO dto) {
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransaction();
	
			IdTypeBusinessImpl idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.update(dto);
	
			daoFactory.commitTransaction(); 
		}catch (GradesException exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollbackTransaction();
			var message = "There was a problem trying to update the new IdType on create method in IdType on create method in IdTypeFacadelmpl ";
			throw GradesException.buildTechnicalBusinessLogicException(null);		
		}finally {
			daoFactory.closeConnection();
		}
	}

	
	@Override
	public void delete(int id) {
		
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransaction();
	
			IdTypeBusinessImpl idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.delete(id);
	
			daoFactory.commitTransaction(); 
		}catch (GradesException exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollbackTransaction();
			var message = "There was a problem trying to delete the IdType on delete method in IdType on create method in IdTypeFacadelmpl ";
			throw GradesException.buildTechnicalBusinessLogicException(null);		
		}finally {
			daoFactory.closeConnection();
		}
	}
	
	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto){
		DAOFactory daoFactory = DAOFactory.getDaoFactory();
		try {
			IdTypeBusinessImpl idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			return idTypeBusiness.find(dto);
		}catch (GradesException exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollbackTransaction();
			var message = "There was a problem trying to find the IdType on find method in IdType on create method in IdTypeFacadelmpl ";
			throw GradesException.buildTechnicalBusinessLogicException(null);		
		}finally {
			daoFactory.closeConnection();
		}
	}


}



	
	
	
	
	
	
	
	
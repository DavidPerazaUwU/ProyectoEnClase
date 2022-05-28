package co.edu.uco.grades.businesslogic.facade.impl;

import co.edu.uco.grades.data.factory.DAOFactory;

public class IdTypeFacadelmpl implements IdTypeFacade{		

	private DAOFactory daoFActory =DAOFactory.getDaoFactory();
		
	@Override
	public void create(IdTypeDTO dto) {
	
		DaoFacory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransacion();
	
			IdTypeBussines idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.create(dto);
	
			daoFactory.commitTransacton();
		}catch (GradesExpetion exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollackTransaction();
			var message = "There was a problem trying to create the new IdType on create method in IdType on create method in IdTypeFacadelmpl ");
			throw GradesExpetion.buildTechnicalBussinesLogicException(null);		
		}finally {
			daoFacory.closeConnection();
		}
	}
	
@Override
public void update(IdTypeDTO dto) {
	
	public void update(IdTypeDTO dto) {
		
		DaoFacory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransacion();
	
			IdTypeBussines idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.update(dto);
	
			daoFactory.commitTransacton();
		}catch (GradesExpetion exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollackTransaction();
			var message = "There was a problem trying to update the new IdType on create method in IdType on create method in IdTypeFacadelmpl ");
			throw GradesExpetion.buildTechnicalBussinesLogicException(null);		
		}finally {
			daoFacory.closeConnection();
		}
	}
}
	
	
@Override 
public void delete(IdTypeDTO dto) {
	
	public void delete(IdTypeDTO dto) {
		
		DaoFacory daoFactory = DAOFactory.getDaoFactory();
		try {
			daoFactory.initTransacion();
	
			IdTypeBussines idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
			idTypeBusiness.delete(dto);
	
			daoFactory.commitTransacton();
		}catch (GradesExpetion exception) {
		daoFactory.rollbackTransaction();
			throw exception;
		}catch (Exception exception) {
		daoFactory.rollackTransaction();
			var message = "There was a problem trying to delete the new IdType on create method in IdType on create method in IdTypeFacadelmpl ");
			throw GradesExpetion.buildTechnicalBussinesLogicException(null);		
		}finally {
			daoFacory.closeConnection();
		}
	}
	
	@Override
	public List<IdTypeDTO> find(IdTypeDTO dto){
		DAOFactory daoFactor = DAOFactory.getDataFactory();
	
			try {
				daoFactory.initTransacion();
		
				IdTypeBussines idTypeBusiness = new IdTypeBusinessImpl(daoFactory);
				return idTypeBusiness.find(dto);
			}catch (GradesExpetion exception) {
			daoFactory.rollbackTransaction();
				throw exception;
			}catch (Exception exception) {
			daoFactory.rollackTransaction();
				var message = "There was a problem trying to find the new IdType on create method in IdType on create method in IdTypeFacadelmpl ");
				throw GradesExpetion.buildTechnicalBussinesLogicException(null);		
			}finally {
				daoFacory.closeConnection();
			}
		}
	}

}
	
	
	
	
	
	
	
	
	
}
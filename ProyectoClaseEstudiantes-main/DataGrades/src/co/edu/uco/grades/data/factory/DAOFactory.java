package co.edu.uco.grades.data.factory;


import javax.swing.AbstractAction;

import co.edu.uco.grades.data.dao.StundentDAO;

public abstract class DAOFactory {
	
	public static DAOFactory getDAOFactory() {
		return null;
	}
	
	public abstract void commit();
	
	public abstract  void rollback();
	
	protected abstract void openConnection();
	
	public abstract void closeConnection();
	
	public abstract void getConnection();
	
	public abstract StundentDAO getStundentDAO();

}

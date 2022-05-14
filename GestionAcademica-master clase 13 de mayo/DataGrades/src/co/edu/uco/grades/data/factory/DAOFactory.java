package co.edu.uco.grades.data.factory;

import java.sql.Connection;

import co.edu.uco.grades.data.dao.StudentDAO;

public abstract class DAOFactory {
	
	public static DAOFactory getDaoFactory() {
		return null;
	}
	
	protected abstract void openConnection();
	
	protected abstract Connection getConnection();
	
	public abstract void initTransaction();
	
	public abstract void closeConnection();
	
	public abstract void rollbackTransaction();
	
	public abstract void commitTransaction();
	
	public abstract StudentDAO getStudentDAO();
	
}

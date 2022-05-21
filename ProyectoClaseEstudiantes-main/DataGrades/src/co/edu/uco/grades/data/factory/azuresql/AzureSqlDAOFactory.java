package co.edu.uco.grades.data.factory.azuresql;

import co.edu.uco.crosscuting.util.object.UtilObject;
import co.edu.uco.crosscuting.util.sql.UtilConnection;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.dao.StundentDAO;
import co.edu.uco.grades.data.factory.DAOFactory;
import java.sql.Connection;

public class AzureSqlDAOFactory extends DAOFactory {

	private Connection connection;

	private AzureSqlDAOFactory() {
		openConnection();
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub

	}

	@Override
	public void openConnection() {
		if (!UtilObject.getUtilObject().isNull(connection) && !UtilConnection.isClosed(connection)) {
			throw GradesException.buildTechnicalMessage("it's not possible open a connection because its already is open");
		}

	}

	@Override
	public void closeConnection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void getConnection() {
		// TODO Auto-generated method stub

	}

	@Override
	public StundentDAO getStundentDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}

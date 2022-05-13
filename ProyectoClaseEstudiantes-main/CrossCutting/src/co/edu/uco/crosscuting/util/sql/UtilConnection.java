package co.edu.uco.crosscuting.util.sql;

import java.sql.Connection;
import java.sql.SQLException;

import co.edu.uco.crosscuting.exception.GeneralException;
import co.edu.uco.crosscuting.util.object.UtilObject;

public class UtilConnection {

	private UtilConnection() {

	}

	public static boolean isClosed(Connection connection) {

		if (UtilObject.getUtilObject().isNull(connection)) {
			throw GeneralException.build("Connection is null!!");
		}
		try {
			return connection.isClosed();
		} catch (SQLException exception) {
			throw GeneralException.build("Problems trying to validate if conncection was cloased!");
		}
	}
}

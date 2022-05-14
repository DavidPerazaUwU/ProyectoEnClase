package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.dao.StudentDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.StudentDTO;

public class StudentAzureSqlDAO extends ConnectionSQL implements StudentDAO {

	private StudentAzureSqlDAO(Connection connection) {
		super(connection);
	}
	
	public static StudentDAO build(Connection connection) {
		return new StudentAzureSqlDAO(connection);
	}

	@Override
	public void create(StudentDTO student) {
		String sql = "INSERT INTO Stundent(idNumber, idType, name, email) VALUES(?,?,?,?)";
		
		try(PreparedStatement preparedStatement = getConnection().prepareStatement(sql)){
			preparedStatement.setString(1, student.getIdNumber());
			preparedStatement.setInt(2, student.getIdType().getId());
		}catch (SQLException exception){
			
			throw GradesException.buildTechnicalDataException("There was a problem trying to create a new studend registry on sql server", exception);
			
		}catch (Exception exception) {
			
			throw GradesException.buildTechnicalDataException("There was an unexpected problem trying to create a new studend registry on sql server", exception);
			
		}
		
	}

	@Override
	public void update(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find(StudentDTO student) {
		// TODO Auto-generated method stub
		
	}

}

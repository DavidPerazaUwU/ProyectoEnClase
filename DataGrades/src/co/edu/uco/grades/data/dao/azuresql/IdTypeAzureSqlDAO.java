package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.edu.uco.crosscutting.util.numeric.UtilNumeric;
import co.edu.uco.crosscutting.util.object.UtilObject;
import co.edu.uco.crosscutting.util.text.UtilText;
import co.edu.uco.grades.crosscutting.exception.GradesException;
import co.edu.uco.grades.data.dao.IdTypeDAO;
import co.edu.uco.grades.data.dao.connection.ConnectionSQL;
import co.edu.uco.grades.dto.IdTypeDTO;

public class IdTypeAzureSqlDAO extends ConnectionSQL implements IdTypeDAO {

		
	private IdTypeAzureSqlDAO(Connection connection) {
		super(connection);
	}

	public static IdTypeDAO build(Connection connection) {
		return new IdTypeAzureSqlDAO(connection);
	}

	@Override
	public void create(IdTypeDTO idType) {
		String sql = "INSERT INTO IdType(name) VALUES (?)";

		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setString(1, idType.getName());

			preparedStatement.executeUpdate();

		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to create the new IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on Azure SQL Server", exception);
		}
	}

	@Override
	public void update(IdTypeDTO idType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void find(IdTypeDTO idType) {
		// TODO Auto-generated method stub
	}
}
	public List<IdTypeDTO > find(idTypeDTO idType) {
		
		boolean setWhere = true;
		List<Object> parameters = new ArrayList<>();
		List<IdTypeDTO> results = new ArrayList<IdTypeDTO>();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT id, name").append(SPACE);
		sb.append("FROM idType").append(SPACE);
		sb.append("ORDER BY NAME ASC");
		
		try (PreparedStatement preparedStatement = getConnection().prepareStatement()) {
			
				for (int index = 0; index < parameters.size(); index++) {
					preparedStatement.setObject(index +1, parameters.get(index));
				}	
			preparedStatement.setString(1, idType.getName());

			preparedStatement.executeUpdate();
			
			try (ResultSet resulSet = preparedStatement.executeQuey()){
				
			
		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to create the new IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on Azure SQL Server", exception);
		
			try (ResultSet resulSet = preparedStatement.executeQuey()){
				
				
			} catch (SQLException exception1) {
				throw GradesException.buildTechnicalDataException("There was a problem trying to create the new IdType on Azure SQL Server", exception1);
			} catch (Exception exception1) {
				throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on Azure SQL Server", exception1);
			}	
	}
	return results; 
	
		if(!UtilObject.getUtilObject().isNull(idType)) {
			
			sb.append("WHERE").append(SPACE);
			sb.append(" WHERE id = ?");
			parameters.add(idType.getId());
			setWhere = false;
		}	
			if(UtilNumeric.getUtilNumeric.isGreaterThan(idType.getId()));
			sb.append(setWhere ? "WHERE" : "AND" );
			sb.append("name = ?");
			parameters.add(UtilText.trm(idType.getName()));
		}
		if(!UtilText.isEmpty(idType.getName())) {
	}
}}
	private List<IdTypeDTO> assembleResults(ResultSet resultSet) {
		List<IdTypeDTO>results = new ArrayList<>();
		
		try {
			while (resultSet.next()) {
			
			}
		catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to recover the IdTypes on Azure SQL")
			catch (SQLException exception) {
				throw GradesException.buildTechnicalDataException("An unexpected problem trying to recover the IdTypes on Azure SQL")
		
private List<IdTypeDTO> executeQuery(PreparedStatement prepareR)			
		}
		return results;
	}
	private IdTypeDTO assembleDTO(ResultSet resultSet) {

		IdTypeDTO dto =new IdTypeDTO();
		try {
			dto.setId(resultSet.getInt("id"));
			dto.setName(resultSet.getString("name"));
		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to assemble the IdTypes on Azure SQL")
		}
		return dto;
	}
	
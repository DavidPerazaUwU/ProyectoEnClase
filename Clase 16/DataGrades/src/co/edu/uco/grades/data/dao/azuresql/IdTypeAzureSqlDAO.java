package co.edu.uco.grades.data.dao.azuresql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import co.edu.uco.grades.crosscutting.util.text.UtilText.SPACE;
import co.edu.uco.crosscutting.util.numeric.UtilNumeric;
import co.edu.uco.crosscutting.util.object.UtilObject;
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
			
			

		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to create the new IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to create the new IdType on Azure SQL Server", exception);
		}
		
		
	@Override
	public void update(IdTypeDTO idType) {
		String sql = "UPDATE IdType SET name = ?)";

		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setString(1, idType.getName());
			preparedStatement.setInt(2, idType.getId());

		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to update the IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to update the IdType on Azure SQL Server", exception);
		}
	}

	@Override
	public void delete(IdTypeDTO idType) {
		String sql = "DELETE FFROM IdType WHERE id = ?)";

		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {

			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
			
		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to delete the IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to delete the IdType on Azure SQL Server", exception);
		}

	}

	

	
	
	
	
	@Override
	public void <IdTypeDTO> find(IdTypeDTO idType) {
		
		boolean setWhere = true; 
		List<Object> parameters = new ArrayList<>();
		List<Object> results = new ArrayList<>();
	
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT	id, name");
		sb.append("FROM 	idType").append(SPACE);
		
		if(!UtilObject.getUtilObject().isNull/idType)){
			
			if(UtilNumeric.getUtilNumceric().isGreaterThan(idType.getId(), 0)) {
			
				sb.append("WHERE id = ?");
				parameters.add(idType.getId());
				setWhere = false;
			}
		
			if (UtilText.isEmpty(idType.getName())) {
				sb.append(setWhere ? "WHERE" :" AND ");
				sb.append("name = ?");
				parameters.add(UtilText.trim(idType.getName()));
			}
		}
		sb.append("ORDER BY name ASC");
		
		try (PreparedStatement preparedStatement = getConnection().prepareStatement(sb.toString())) {
			
			for (int index = 0; index < parameters.size(); index++) {
				preparedStatement.setObject(index +1, parameters.get(index));
			}	
			
			results = executeQuery(preparedStatement);
			
		} catch (SQLException exception1) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to retrives the IdTypes on Azure SQL Server", exception1);
		} catch (Exception exception1) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to retives the IdTypes on Azure SQL Server", exception1);
		}	
		
		return results;

	}
	
	private List<IdTypeDTO> executeQuery(PreparedStatement prepareStatement){	
		
		List<IdTypeDTO>results = new ArrayList<>();
			
		try (ResultSet resulSet = preparedStatement.executeQuery()){	
			results = assmbleResults(resultSet);
		}catch (GradesException exception) {
			throw expection;
		} catch (SQLException exception) {
			throw GradesException.buildTechnicalDataException("There was a problem trying to execute the query for recovery the IdType on Azure SQL Server", exception);
		} catch (Exception exception) {
			throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to execute the query for recovery the IdType on Azure SQL Server", exception);
		}
		
		return results;
	}
		
		private List<IdTypeDTO> assembleResults(ResultSet resultSet) {
			List<IdTypeDTO>results = new ArrayList<>();
			
			try {
				while (resultSet.next()) {
					result.add(assembleDTO(resultSet));
				}
			}catch (GradesException exception) {
				throw expection;
			}catch (SQLException exception) {
				throw GradesException.buildTechnicalDataException("There was a problem trying to recover the IdTypes on Azure SQL", exception);
			}catch (Exception exception) {
				throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to recover the IdTypes on Azure SQL",exception);
			}
			
			return results;
		}
		
		private IdTypeDTO assembleDTO(ResultSet resultSet) {

			IdTypeDTO dto =new IdTypeDTO();
			
			try {
				dto.setId(resultSet.getInt("id"));
				dto.setName(resultSet.getString("name"));
			} catch (SQLException exception) {
				throw GradesException.buildTechnicalDataException("There was a problem trying to assemble the IdTypes on Azure SQL", exception);
			}catch (Exception exception) {
				throw GradesException.buildTechnicalDataException("An unexpected problem has ocurred trying to assemble the IdTypes on Azure SQL",exception);
			}
				return dto;
		}}
		
		
			
	

package co.edu.uco.grades.businesslogic.facade;

import java.util.List;

import co.edu.uco.grade.dto.IdTypeDTO;

public interface IdTypeBusiness {
	
	void create(IdTypeDTO dto);
	
	void update (IdTypeDTO dto);
	
	void delete (int id);
	
	List<IdTypeDTO> find(IdTypeDTO dto);
	
}

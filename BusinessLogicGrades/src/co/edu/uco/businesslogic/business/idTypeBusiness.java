package co.edu.uco.businesslogic.business;

import java.util.List;

import co.edu.uco.grades.dto.IdTypeDTO;

public interface idTypeBusiness {
	
	void create(IdTypeDTO dto);
	
	void update(IdTypeDTO dto);
	
	void delete(int id);
	
	List<IdTypeDTO> fin(IdTypeDTO dto);

}

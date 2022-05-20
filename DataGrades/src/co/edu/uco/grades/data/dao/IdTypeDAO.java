package co.edu.uco.grades.data.dao;

import co.edu.uco.grades.dto.IdTypeDTO;

public interface IdTypeDAO {

	void create(IdTypeDTO idType);

	void update(IdTypeDTO idType);

	void delete(int id);

	void find(IdTypeDTO idType);
}

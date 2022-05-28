package co.edu.uco.grades.data.dao;

import co.edu.uco.grade.dto.StudentDTO;

public interface StundentDAO {
	
	void create(StudentDTO student);

	void update(StudentDTO student);

	void delete(int id);

	void find(StudentDTO student);
	
	
}

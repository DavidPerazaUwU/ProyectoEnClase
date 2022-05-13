package co.edu.uco.grades.data.dao;

import co.edu.uco.grade.dto.StudentDTO;

public interface StundentDAO {
	
	void create(StudentDTO stundent);
	
	void update(StudentDTO student);
	
	void Delete(int id);
	
	void find(StudentDTO stundent);
	
	
}

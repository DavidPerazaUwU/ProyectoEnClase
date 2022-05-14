package gestionacademicadocente.dominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Grupo {
	
	private Sede sede;
	private Profesor profesor;
	private Date fechaInicio;
	private Date fechaFin;
	private Materia materia;
	private String codigo;
	private List<EstudiantePorGrupo> estudiantes;
	private List<Nota> notas;
	
	public void matricularEstudiante(Estudiante estudiante) {
		EstudiantePorGrupo estudiantePorGrupo = new EstudiantePorGrupo(estudiante, this);
		obtenerEstudiantes().add(estudiantePorGrupo);
		/*El estudiante no se repita, no cruzar con otro grupo en el mismo horario y estdo matriculado(Terminar Registrar Nota)*/
	}
	public void registrarNota(Nota nota) {
		float suma = 0;
		for(int i = 0; i<notas.size();i++) {
			suma += notas.get(i).getPorcentaje();
		}
		if (suma+nota.getPorcentaje()<=100) {
			notas.add(nota);
		}else {
			System.out.println("No se puede ingresar la nota, el porcentaje superior a 100%");
		}
	}
	
	private List<EstudiantePorGrupo> obtenerEstudiantes(){
		
		if(estudiantes == null) {
			List<EstudiantePorGrupo> estudiantes = new ArrayList<>();
		}
		
		return estudiantes;
	}
	
	
}

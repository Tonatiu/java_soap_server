package com.escom.schoolsaes.dto;

import com.escom.schoolsaes.model.Alumno;

public class AlumnoDTO {

	private Alumno alumno;
	private String centroEstudios;
	private String carrera;

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public String getCentroEstudios() {
		return centroEstudios;
	}

	public void setCentroEstudios(String centroEstudios) {
		this.centroEstudios = centroEstudios;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

}

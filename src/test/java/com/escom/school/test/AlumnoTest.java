package com.escom.school.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.escom.schoolsaes.model.Alumno;
import com.escom.schoolsaes.model.Carrera;
import com.escom.schoolsaes.model.CarreraInstitucion;
import com.escom.schoolsaes.model.Centroestudios;
import com.escom.schoolsaes.service.AlumnoService;
import com.escom.schoolsaes.service.CarreraInstitucionService;
import com.escom.schoolsaes.service.CarreraService;
import com.escom.schoolsaes.service.CentroEstudiosService;

public class AlumnoTest{

	@Test
	public void test() {
		
		Alumno alumno;
		try {
			alumno = new AlumnoService().obtenerAlumno("2012630031","ARAUJO");
			if(alumno != null){
				
				System.out.println("Alumno:");
				System.out.println(alumno.getNombre()+" "+alumno.getAppat()+" "+alumno.getApmat());
				System.out.println("Actualiza Alumno");
				
				alumno.setTelefono("5555555");
				new AlumnoService().actualizarAlumno(alumno);
				
				CarreraInstitucion ci= new CarreraInstitucionService().obtenerCarreraInstitucion(alumno.getId_carrera());
				
				if(ci!=null){
					Centroestudios ce=new CentroEstudiosService().obtenerCentoEstudios(ci.getId_centroestudios());
					Carrera c=new CarreraService().obtenerCarrera(ci.getId_Carrera());
					
					if(ce != null && c!=null){
						System.out.println("El alumno esta incrito en:");
						System.out.println(ce.getNombre());
						System.out.println("En la carrera:"+c.getNombre());
					}
					
				}
				
				
				
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

}

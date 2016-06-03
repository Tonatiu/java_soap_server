package com.escom.school.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.escom.schoolsaes.model.Calificacion;
import com.escom.schoolsaes.service.CalificacionService;

public class CalificacionTest {

	@Test
	public void test() {
		
		Calificacion cal=new Calificacion();
		cal.setValor(new Float(10.00));
		int id=0;
		try {
			id = new CalificacionService().insertarCalificacion(cal);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Id insertado:"+cal.getId());
		
		
	}

}

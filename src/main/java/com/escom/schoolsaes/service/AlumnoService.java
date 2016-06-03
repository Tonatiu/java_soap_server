package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.AlumnoMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Alumno;
import com.escom.schoolsaes.model.AlumnoExample;
public class AlumnoService {
	
	private AlumnoMapper alumnoMapper;
	
	
	public List<Alumno> cargarTodos() throws IOException{
		AlumnoExample alumnoExample = new AlumnoExample();
		alumnoExample.createCriteria().andIdIsNotNull();
		return ejecutarExample(alumnoExample);
		
	}
	
	public Alumno obtenerAlumno(String boleta) throws IOException{
		AlumnoExample alumnoExample = new AlumnoExample();
		alumnoExample.createCriteria().andBoletaEqualTo(boleta);
		
		List<Alumno> alumnos=ejecutarExample(alumnoExample);
		if(alumnos != null && !alumnos.isEmpty())
			return alumnos.get(0);
		
		return null;
		
	}
	
	public Alumno obtenerAlumno(String boleta,String pass) throws IOException{
		AlumnoExample alumnoExample = new AlumnoExample();
		alumnoExample.createCriteria().andBoletaEqualTo(boleta).andAppatEqualTo(pass);
		
		List<Alumno> alumnos=ejecutarExample(alumnoExample);
		if(alumnos != null && !alumnos.isEmpty())
			return alumnos.get(0);
		
		return null;
		
	}
	
	
	public void actualizarAlumno(Alumno alumno) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			alumnoMapper = session.getMapper(AlumnoMapper.class);
			alumnoMapper.updateByPrimaryKey(alumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	public void agregarAlumno(Alumno alumno) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			alumnoMapper = session.getMapper(AlumnoMapper.class);
			alumnoMapper.insertSelective(alumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	public void eliminarAlumno(int idAlumno) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			alumnoMapper = session.getMapper(AlumnoMapper.class);
			alumnoMapper.deleteByPrimaryKey(idAlumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	private List<Alumno> ejecutarExample(AlumnoExample alumnoExample) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			alumnoMapper = session.getMapper(AlumnoMapper.class);
			
			return alumnoMapper.selectByExample(alumnoExample);
		}finally{
			if(session!=null)
				session.close();
		}
	}
	

}

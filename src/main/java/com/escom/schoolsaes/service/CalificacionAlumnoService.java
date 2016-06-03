package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.CalificacionAlumnoMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.CalificacionAlumno;
import com.escom.schoolsaes.model.CalificacionAlumnoExample;

public class CalificacionAlumnoService {
	
	private CalificacionAlumnoMapper calificacionAlumnoMapper;
	
	
	public List<CalificacionAlumno> obtenerCalificacionAlum(int idAlumno) throws IOException{
		CalificacionAlumnoExample calificacionAlumnoExample = new CalificacionAlumnoExample();
		calificacionAlumnoExample.createCriteria().andBoleta_alumnoEqualTo(idAlumno);
		
		return ejecutarExample(calificacionAlumnoExample);
	}
	
	public void insertarCalificacionAlumno(CalificacionAlumno calificacionAlumno)throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			calificacionAlumnoMapper = session.getMapper(CalificacionAlumnoMapper.class);
			calificacionAlumnoMapper.insertSelective(calificacionAlumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	public void actualizarCalificacionAlumno(CalificacionAlumno calificacionAlumno)throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			calificacionAlumnoMapper = session.getMapper(CalificacionAlumnoMapper.class);
			calificacionAlumnoMapper.updateByPrimaryKey(calificacionAlumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	public void eliminarCalificacionAlumno(int idCalificacionAlumno)throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			calificacionAlumnoMapper = session.getMapper(CalificacionAlumnoMapper.class);
			calificacionAlumnoMapper.deleteByPrimaryKey(idCalificacionAlumno);
			session.commit();
			
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	private List<CalificacionAlumno> ejecutarExample(CalificacionAlumnoExample calificacionAlumnoExample) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			calificacionAlumnoMapper = session.getMapper(CalificacionAlumnoMapper.class);
			
			return calificacionAlumnoMapper.selectByExample(calificacionAlumnoExample);
		}finally{
			if(session!=null)
				session.close();
		}
	}

}

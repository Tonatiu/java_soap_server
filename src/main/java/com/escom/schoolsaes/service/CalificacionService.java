package com.escom.schoolsaes.service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.CalificacionMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Calificacion;

public class CalificacionService {

	private CalificacionMapper calificacionMapper;

	public Calificacion obtenerCalificacion(int idCalificacion) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			calificacionMapper = session.getMapper(CalificacionMapper.class);
			return calificacionMapper.selectByPrimaryKey(idCalificacion);
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	public int insertarCalificacion(Calificacion calificacion) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			calificacionMapper = session.getMapper(CalificacionMapper.class);
			int id=calificacionMapper.insertSelective(calificacion);
			session.commit();
			return id;
		} finally {
			if (session != null)
				session.close();
			
		}
	}
	
	public void actualizarCalificacion(Calificacion calificacion) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			calificacionMapper = session.getMapper(CalificacionMapper.class);
			calificacionMapper.updateByPrimaryKey(calificacion);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	public void eliminarCalificacion(int idCalificacion) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			calificacionMapper = session.getMapper(CalificacionMapper.class);
			calificacionMapper.deleteByPrimaryKey(idCalificacion);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	

}

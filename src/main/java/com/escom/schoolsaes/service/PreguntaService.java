package com.escom.schoolsaes.service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.PreguntaMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Pregunta;

public class PreguntaService {
	
	private PreguntaMapper preguntaMapper;
	
	public Pregunta obtenerPregunta(int idPregunta) throws IOException{
		
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaMapper = session.getMapper(PreguntaMapper.class);
			return preguntaMapper.selectByPrimaryKey(idPregunta);
		} finally {
			if (session != null)
				session.close();
		}	
	}
	
	public void insertarPregunta(Pregunta pregunta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaMapper = session.getMapper(PreguntaMapper.class);
			preguntaMapper.insertSelective(pregunta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
		
	}
	
	public void actualizarPregunta(Pregunta pregunta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaMapper = session.getMapper(PreguntaMapper.class);
			preguntaMapper.updateByPrimaryKey(pregunta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
		
	}
	
	public void eliminarPregunta(int idPregunta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaMapper = session.getMapper(PreguntaMapper.class);
			preguntaMapper.deleteByPrimaryKey(idPregunta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
		
	}

}

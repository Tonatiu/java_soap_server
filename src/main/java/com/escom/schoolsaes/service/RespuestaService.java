package com.escom.schoolsaes.service;

import java.io.IOException;
import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.RespuestaMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Respuesta;

public class RespuestaService {

	private RespuestaMapper respuestaMapper;
	
	
	public Respuesta cargarRespuesta(int idRespuesta) throws IOException{
		
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			respuestaMapper = session.getMapper(RespuestaMapper.class);
			return respuestaMapper.selectByPrimaryKey(idRespuesta);
		} finally {
			if (session != null)
				session.close();
		}	
		
	}
	
	public void insertarRespuesta(Respuesta respuesta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			respuestaMapper = session.getMapper(RespuestaMapper.class);
			respuestaMapper.insertSelective(respuesta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
	}
	
	public void actualizarRespuesta(Respuesta respuesta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			respuestaMapper = session.getMapper(RespuestaMapper.class);
			respuestaMapper.updateByPrimaryKey(respuesta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
	}
	
	public void eliminarRespuesta(int idRespuesta) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			respuestaMapper = session.getMapper(RespuestaMapper.class);
			respuestaMapper.deleteByPrimaryKey(idRespuesta);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}	
	}
		
	
}

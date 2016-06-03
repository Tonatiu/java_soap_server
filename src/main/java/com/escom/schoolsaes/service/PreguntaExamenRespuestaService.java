package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.PreguntaExamenRespuestaMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.PreguntaExamenRespuesta;
import com.escom.schoolsaes.model.PreguntaExamenRespuestaExample;

public class PreguntaExamenRespuestaService {
	
	private PreguntaExamenRespuestaMapper preguntaExamenRespuestaMapper;
	
	public List<PreguntaExamenRespuesta> obtenerTodas(int idExamen) throws IOException{
		
		PreguntaExamenRespuestaExample per=new PreguntaExamenRespuestaExample();
		
		per.createCriteria().andId_examenEqualTo(idExamen);
		
		return ejecutarExample(per);
				
		
		
	}
	
	public void insertarPER(PreguntaExamenRespuesta per) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaExamenRespuestaMapper = session.getMapper(PreguntaExamenRespuestaMapper.class);

			preguntaExamenRespuestaMapper.insertSelective(per);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
		
	}
	
	public void actualizarPER(PreguntaExamenRespuesta per) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaExamenRespuestaMapper = session.getMapper(PreguntaExamenRespuestaMapper.class);

			preguntaExamenRespuestaMapper.updateByPrimaryKey(per);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
		
	}
	
	private List<PreguntaExamenRespuesta> ejecutarExample(PreguntaExamenRespuestaExample preguntaExamenRespuestaExample) throws IOException {
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			preguntaExamenRespuestaMapper = session.getMapper(PreguntaExamenRespuestaMapper.class);

			return preguntaExamenRespuestaMapper.selectByExample(preguntaExamenRespuestaExample);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

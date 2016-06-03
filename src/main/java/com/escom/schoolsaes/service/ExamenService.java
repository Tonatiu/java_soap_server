package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.ExamenMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Examen;
import com.escom.schoolsaes.model.ExamenExample;

public class ExamenService {

	private ExamenMapper examenMapper;

	public List<Examen> cargarTodos() throws IOException {

		ExamenExample examenExample = new ExamenExample();
		examenExample.createCriteria().andIdIsNotNull();
		return ejecutarExample(examenExample);

	}
	
	public Examen obtenerExamen(int idExamen) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			examenMapper = session.getMapper(ExamenMapper.class);
			return examenMapper.selectByPrimaryKey(idExamen);
			
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void insertarExamen(Examen examen) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			examenMapper = session.getMapper(ExamenMapper.class);
			examenMapper.insertSelective(examen);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void actualizarExamen(Examen examen) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			examenMapper = session.getMapper(ExamenMapper.class);
			examenMapper.updateByPrimaryKey(examen);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}

	}

	public void eliminarExamen(int idExamen) throws IOException {

		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			examenMapper = session.getMapper(ExamenMapper.class);
			examenMapper.deleteByPrimaryKey(idExamen);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}

	}

	private List<Examen> ejecutarExample(ExamenExample examenExample) throws IOException {
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			examenMapper = session.getMapper(ExamenMapper.class);

			return examenMapper.selectByExample(examenExample);
		} finally {
			if (session != null)
				session.close();
		}
	}

}

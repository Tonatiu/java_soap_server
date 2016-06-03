package com.escom.schoolsaes.service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.ParcialMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Parcial;

public class ParcialService {
	
	private ParcialMapper parcialMapper;
	
	public Parcial obtenerParcial(int idParcial) throws IOException{
		
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			parcialMapper = session.getMapper(ParcialMapper.class);
			return parcialMapper.selectByPrimaryKey(idParcial);
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	public void agregarParcial(Parcial parcial) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			parcialMapper = session.getMapper(ParcialMapper.class);
			parcialMapper.insertSelective(parcial);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	public void actualizarParcial(Parcial parcial) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			parcialMapper = session.getMapper(ParcialMapper.class);
			parcialMapper.updateByPrimaryKey(parcial);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
	}
	
	public void eliminarParcial(int idParcial) throws IOException{
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			parcialMapper = session.getMapper(ParcialMapper.class);
			parcialMapper.deleteByPrimaryKey(idParcial);
			session.commit();
		} finally {
			if (session != null)
				session.close();
		}
	}
		
}

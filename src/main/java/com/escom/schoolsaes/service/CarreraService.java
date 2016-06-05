package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.CarreraMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Carrera;
import com.escom.schoolsaes.model.CarreraExample;

public class CarreraService {
	
	private CarreraMapper carreraMapper;
	
	public Carrera obtenerCarrera(int idCarrera) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			carreraMapper = session.getMapper(CarreraMapper.class);
			
			return carreraMapper.selectByPrimaryKey(idCarrera);
		}finally{
			if(session!=null)
				session.close();
		}	
	}
	
	public List<Carrera> obtenerCarreras() throws IOException{
		CarreraExample carreraExample = new CarreraExample();
		carreraExample.createCriteria().andIdIsNotNull();
		return ejecutarExample(carreraExample);
	}
	
	private List<Carrera> ejecutarExample(CarreraExample carreraExample) throws IOException {
		SqlSession session = null;
		try {
			session = ConexionBD.obtenerConexion().openSession();
			carreraMapper = session.getMapper(CarreraMapper.class);

			return carreraMapper.selectByExample(carreraExample);
		} finally {
			if (session != null)
				session.close();
		}
	}
}

package com.escom.schoolsaes.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.CarreraInstitucionMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.CarreraInstitucion;
import com.escom.schoolsaes.model.CarreraInstitucionExample;

public class CarreraInstitucionService {
	
	private CarreraInstitucionMapper carreraInstitucionMapper;
	
	/*public CarreraInstitucion obtenerCarreraInstitucion(int idAlumno){
		
		CarreraInstitucionExample cie=new CarreraInstitucionExample();
		
		cie.createCriteria().and
		
		
		
		
	}*/
	
	public CarreraInstitucion obtenerCarreraInstitucion(int idCarreraIns) throws IOException{
		
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			carreraInstitucionMapper = session.getMapper(CarreraInstitucionMapper.class);
			
			return carreraInstitucionMapper.selectByPrimaryKey(idCarreraIns);
		}finally{
			if(session!=null)
				session.close();
		}
	}
	
	private List<CarreraInstitucion> ejecutarExample(CarreraInstitucionExample carreraInstitucionExample) throws IOException{
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			carreraInstitucionMapper = session.getMapper(CarreraInstitucionMapper.class);
			
			return carreraInstitucionMapper.selectByExample(carreraInstitucionExample);
		}finally{
			if(session!=null)
				session.close();
		}
	}

}

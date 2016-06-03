package com.escom.schoolsaes.service;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;

import com.escom.schoolsaes.dao.CentroestudiosMapper;
import com.escom.schoolsaes.db.ConexionBD;
import com.escom.schoolsaes.model.Centroestudios;

public class CentroEstudiosService {
	
	CentroestudiosMapper centroestudiosMapper;
	
	public Centroestudios obtenerCentoEstudios(int idCentroEstudios) throws IOException{
		
		SqlSession session=null;
		try{
			session=ConexionBD.obtenerConexion().openSession();
			centroestudiosMapper = session.getMapper(CentroestudiosMapper.class);
			
			return centroestudiosMapper.selectByPrimaryKey(idCentroEstudios);
		}finally{
			if(session!=null)
				session.close();
		}
		
	}

}

package com.escom.schoolsaes.db;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ConexionBD {

	public static SqlSessionFactory obtenerConexion() throws IOException {

		InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);

		return sqlSessionFactory;

	}

}

package com.escom.schoolsaes.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class PruebaWebService {
	
	@WebMethod(operationName="suma")
	public double suma(@WebParam(name="a")double a, @WebParam(name="b")double b) {
			System.out.println("Multiplica");
	      return a * b;
	}
}

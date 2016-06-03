package com.escom.schoolsaes.main;

import javax.xml.ws.Endpoint;

import com.escom.schoolsaes.ws.PruebaWebService;
import com.escom.schoolsaes.ws.SchoolsaesWS;

public class MainWS {

	public static void main(String[] args) {
		
		System.out.println("Iniciando Web Service .....");
		//Endpoint.publish("http://localhost:8080/PruebaWebService", new PruebaWebService());
		Endpoint.publish("http://localhost:8080/Schoolsaes", new SchoolsaesWS());
		System.out.println("Web Service iniciado :)");

	}

}

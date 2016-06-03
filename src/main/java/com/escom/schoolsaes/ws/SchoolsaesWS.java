package com.escom.schoolsaes.ws;

import java.io.IOException;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.escom.schoolsaes.dto.AlumnoDTO;
import com.escom.schoolsaes.model.Alumno;
import com.escom.schoolsaes.model.Calificacion;
import com.escom.schoolsaes.model.CalificacionAlumno;
import com.escom.schoolsaes.model.Carrera;
import com.escom.schoolsaes.model.CarreraInstitucion;
import com.escom.schoolsaes.model.Centroestudios;
import com.escom.schoolsaes.model.Examen;
import com.escom.schoolsaes.model.Parcial;
import com.escom.schoolsaes.model.Pregunta;
import com.escom.schoolsaes.model.PreguntaExamenRespuesta;
import com.escom.schoolsaes.model.Respuesta;
import com.escom.schoolsaes.service.AlumnoService;
import com.escom.schoolsaes.service.CalificacionAlumnoService;
import com.escom.schoolsaes.service.CalificacionService;
import com.escom.schoolsaes.service.CarreraInstitucionService;
import com.escom.schoolsaes.service.CarreraService;
import com.escom.schoolsaes.service.CentroEstudiosService;
import com.escom.schoolsaes.service.ExamenService;
import com.escom.schoolsaes.service.ParcialService;
import com.escom.schoolsaes.service.PreguntaExamenRespuestaService;
import com.escom.schoolsaes.service.PreguntaService;
import com.escom.schoolsaes.service.RespuestaService;

@WebService
public class SchoolsaesWS {
	
	
	@WebMethod(operationName="validarAlumno")
	public AlumnoDTO validarAlumno(@WebParam(name="boleta")String boleta,@WebParam(name="apellido")String pass){
		
		Alumno alumno;
		try {
			System.out.println("####################################");
			System.out.println("[info] Se recibe peticion");
			System.out.println("[info] Boleta: "+boleta);
			System.out.println("[info] Password: "+pass);
			alumno = new AlumnoService().obtenerAlumno(boleta,pass);
			if(alumno != null){
				AlumnoDTO alumnoDTO=new AlumnoDTO();
				alumnoDTO.setAlumno(alumno);
				
				System.out.println("Ingrea a sistema:");
				System.out.println("\t"+alumno.getNombre()+" "+alumno.getAppat()+" "+alumno.getApmat());
				
				
				CarreraInstitucion ci= new CarreraInstitucionService().obtenerCarreraInstitucion(alumno.getId_carrera());
				
				if(ci!=null){
					Centroestudios ce=new CentroEstudiosService().obtenerCentoEstudios(ci.getId_centroestudios());
					Carrera c=new CarreraService().obtenerCarrera(ci.getId_Carrera());
					
					if(ce != null && c!=null){
						
						System.out.println("El alumno esta incrito en:");
						System.out.println("\t"+ce.getNombre());
						System.out.println("En la carrera: "+c.getNombre());
						alumnoDTO.setCarrera(c.getNombre());
						alumnoDTO.setCentroEstudios(ce.getNombre());
					}
					
				}else{
					System.out.println("-----Sin planten asignado-----");
				}
				
				return alumnoDTO;
				
				
			}else{
				System.out.println("No se encontraron resultados");
				return null;
			}
				
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}finally {
			System.out.println("####################################\n");
		}
	}
	
	@WebMethod(operationName="obtenerCarrera")
	public Carrera obtenerCarrera(@WebParam(name="id")int id){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Carrera ");
			Carrera carr=new CarreraService().obtenerCarrera(id);
			System.out.println("Examen obtenido :)");
			return carr;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se cargo la Carrera :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int insertarAlumno(Alumno alumno){
		try {
			System.out.println("####################################");
			System.out.println("Operacion Agregar en Alumno");
			new AlumnoService().agregarAlumno(alumno);
			System.out.println("Agregado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Agrego :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actualizarAlumno(Alumno alumno){
		try {
			System.out.println("####################################");
			System.out.println("Operacion Actualizar en Alumno");
			new AlumnoService().actualizarAlumno(alumno);
			System.out.println("Actualizado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	
	@WebMethod
	public int eliminarAlumno(int idAlumno){
		try {
			System.out.println("####################################");
			System.out.println("Operacion Eliminar en Alumno");
			new AlumnoService().eliminarAlumno(idAlumno);
			System.out.println("Eliminado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Elimino :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod(operationName="obtenerCalificacionAlumno")
	public List<CalificacionAlumno> obtenerCalificacionAlumno(@WebParam(name="idAlumno")int idAlumno){
		try {
			System.out.println("####################################");
			System.out.println("Obtener Calificacion Alumno: "+idAlumno);
			List<CalificacionAlumno> cal=new CalificacionAlumnoService().obtenerCalificacionAlum(idAlumno);
			System.out.println("Calificacion Obtenidas :)");
			return cal;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error al obtener calificaciones :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int insertarCalificacionAlumno(CalificacionAlumno calificacionAlumno){
		try {
			System.out.println("####################################");
			System.out.println("Agregando Calificacion Alumno");
			new CalificacionAlumnoService().insertarCalificacionAlumno(calificacionAlumno);
			System.out.println("Agregando correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Agregando :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actulizarCalificacionAlumno(CalificacionAlumno calificacionAlumno){
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Calificacion Alumno");
			new CalificacionAlumnoService().actualizarCalificacionAlumno(calificacionAlumno);
			System.out.println("Actualido correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualido :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	/**
	 * Metdod regregsa el id del registro que se ha insertado
	 * @param calificacion
	 * @return
	 */
	@WebMethod
	public int insertarCalificacion(Calificacion calificacion){
		try {
			System.out.println("####################################");
			System.out.println("Insertando Calificacion ");
			new CalificacionService().insertarCalificacion(calificacion);
			System.out.println("Insertando :)");
			return calificacion.getId();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Insertando :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actualizarCalificacion(Calificacion calificacion){
		try {
			System.out.println("####################################");
			System.out.println("Actualizar Calificacion ");
			new CalificacionService().insertarCalificacion(calificacion);
			System.out.println("Actualido Correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualido :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod(operationName="obtenerCalificacion")
	public Calificacion obtenerCalificacion(@WebParam(name="id")int id){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Calificación ");
			Calificacion cal=new CalificacionService().obtenerCalificacion(id);
			System.out.println("Examen obtenido :)");
			return cal;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se cargo la califiación :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod(operationName="obtenerExamen")
	public Examen obtenerExamen(@WebParam(name="idExamen")int idExamen){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Examen ");
			Examen ex=new ExamenService().obtenerExamen(idExamen);
			System.out.println("Examen obtenido :)");
			return ex;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se cargo el examen :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public List<Examen> cargarTodosExamenes(){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Examenes ");
			List<Examen> ex=new ExamenService().cargarTodos();
			System.out.println("Examenes recuperados  :)");
			return ex;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Recuperaron los examenes :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actualizarExamen(Examen examen){
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Examen ");
			new ExamenService().actualizarExamen(examen);
			System.out.println("Actualizado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	/**
	 * Regresa el id del examen que se inserta
	 * @param examen
	 * @return
	 */
	@WebMethod
	public int insertarExamen(Examen examen){
		try {
			System.out.println("####################################");
			System.out.println("Insertando Examen ");
			new ExamenService().insertarExamen(examen);
			System.out.println("Insertado correctamente :)");
			return examen.getId();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Inserto :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	

	@WebMethod
	public int eliminarExamen(int idExamen){
		try {
			System.out.println("####################################");
			System.out.println("Eliminando Examen ");
			new ExamenService().eliminarExamen(idExamen);
			System.out.println("Eliminado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Elimino :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public Parcial cargarParcialByExamen(int idParcial){
		
		try {
			System.out.println("####################################");
			System.out.println("Cargando Parcial ");
			Parcial p=new ParcialService().obtenerParcial(idParcial);
			System.out.println("Obtenido correctamente :)");
			return p;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Cargo :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	/**
	 * Regresa el id del registro insertado
	 * @param parcial
	 * @return
	 */
	@WebMethod
	public int insertarParcialByExamen(Parcial parcial){
		
		try {
			System.out.println("####################################");
			System.out.println("Insertando Parcial ");
			new ParcialService().agregarParcial(parcial);
			System.out.println("Insertado correctamente :)");
			return parcial.getId();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Inserto :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actualizarParcialByExamen(Parcial parcial){
		
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Parcial ");
			new ParcialService().actualizarParcial(parcial);
			System.out.println("Actualizado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int eliminarParcialByExamen(int idParcial){
		
		try {
			System.out.println("####################################");
			System.out.println("Eliminando Parcial ");
			new ParcialService().eliminarParcial(idParcial);
			System.out.println("Eliminado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Elimino :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public List<PreguntaExamenRespuesta> obtenerPreguntaRespuestaExamen(int idExamen){
		
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Pregunta_Examen_Respuesta ");
			List<PreguntaExamenRespuesta> pr=new PreguntaExamenRespuestaService().obtenerTodas(idExamen);
			System.out.println("Obtenido correctamente :)");
			return pr;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Obtuvieron  :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int insertarPreguntaRespuestaExamen(PreguntaExamenRespuesta preguntaExamenRespuesta){
		
		try {
			System.out.println("####################################");
			System.out.println("Insertando Pregunta_Examen_Respuesta ");
			new PreguntaExamenRespuestaService().insertarPER(preguntaExamenRespuesta);
			System.out.println("Insertado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Inserto  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public int actualizarPreguntaRespuestaExamen(PreguntaExamenRespuesta preguntaExamenRespuesta){
		
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Pregunta_Examen_Respuesta ");
			new PreguntaExamenRespuestaService().actualizarPER(preguntaExamenRespuesta);
			System.out.println("Actualizado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
	}
	
	@WebMethod
	public Pregunta obtenerPregunta(int idPregunta){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Pregunta ");
			Pregunta p=new PreguntaService().obtenerPregunta(idPregunta);
			System.out.println("Obtenido correctamente :)");
			return p;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Obtuvo  :(");
			return null;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int insertarPregunta(Pregunta pregunta){
		try {
			System.out.println("####################################");
			System.out.println("Insertando Pregunta ");
			new PreguntaService().insertarPregunta(pregunta);
			System.out.println("Insertada correctamente :)");
			return pregunta.getId();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Inserto  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int actualizarPregunta(Pregunta pregunta){
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Pregunta ");
			new PreguntaService().actualizarPregunta(pregunta);
			System.out.println("Actualizada correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int eliminarPregunta(int idPregunta){
		try {
			System.out.println("####################################");
			System.out.println("Eliminando Pregunta ");
			new PreguntaService().eliminarPregunta(idPregunta);
			System.out.println("Eliminado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Elimino  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int obtenerRespuesta(int idRespuesta){
		try {
			System.out.println("####################################");
			System.out.println("Obteniendo Respuesta ");
			new RespuestaService().cargarRespuesta(idRespuesta);
			System.out.println("Obtenida correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Obtuvo  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	/**
	 * Regresa el id del registro insertado
	 * @param respuesta
	 * @return
	 */
	@WebMethod
	public int insertarRespuesta(Respuesta respuesta){
		try {
			System.out.println("####################################");
			System.out.println("Insertando Respuesta ");
			new RespuestaService().insertarRespuesta(respuesta);
			System.out.println("Insertada correctamente :)");
			return respuesta.getId();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Inserto  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int actualizarRespuesta(Respuesta respuesta){
		try {
			System.out.println("####################################");
			System.out.println("Actualizando Respuesta ");
			new RespuestaService().actualizarRespuesta(respuesta);
			System.out.println("Actualizada correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Actualizo  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	@WebMethod
	public int eliminarRespuesta(int idRespuesta){
		try {
			System.out.println("####################################");
			System.out.println("Eliminando Respuesta ");
			new RespuestaService().eliminarRespuesta(idRespuesta);
			System.out.println("Eliminado correctamente :)");
			return 1;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("No se Elimino  :(");
			return 0;
		}finally {
			System.out.println("####################################\n");	
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

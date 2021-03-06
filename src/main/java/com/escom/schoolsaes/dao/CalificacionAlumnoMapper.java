package com.escom.schoolsaes.dao;

import com.escom.schoolsaes.model.CalificacionAlumno;
import com.escom.schoolsaes.model.CalificacionAlumnoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CalificacionAlumnoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int countByExample(CalificacionAlumnoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByExample(CalificacionAlumnoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insert(CalificacionAlumno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insertSelective(CalificacionAlumno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    List<CalificacionAlumno> selectByExample(CalificacionAlumnoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    CalificacionAlumno selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExampleSelective(@Param("record") CalificacionAlumno record, @Param("example") CalificacionAlumnoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExample(@Param("record") CalificacionAlumno record, @Param("example") CalificacionAlumnoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKeySelective(CalificacionAlumno record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKey(CalificacionAlumno record);
}
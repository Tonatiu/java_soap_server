package com.escom.schoolsaes.dao;

import com.escom.schoolsaes.model.PreguntaExamenRespuesta;
import com.escom.schoolsaes.model.PreguntaExamenRespuestaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PreguntaExamenRespuestaMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int countByExample(PreguntaExamenRespuestaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByExample(PreguntaExamenRespuestaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insert(PreguntaExamenRespuesta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insertSelective(PreguntaExamenRespuesta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    List<PreguntaExamenRespuesta> selectByExample(PreguntaExamenRespuestaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    PreguntaExamenRespuesta selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExampleSelective(@Param("record") PreguntaExamenRespuesta record, @Param("example") PreguntaExamenRespuestaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExample(@Param("record") PreguntaExamenRespuesta record, @Param("example") PreguntaExamenRespuestaExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKeySelective(PreguntaExamenRespuesta record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pregunta_examen_respuesta
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKey(PreguntaExamenRespuesta record);
}
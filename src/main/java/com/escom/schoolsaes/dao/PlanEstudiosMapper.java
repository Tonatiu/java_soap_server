package com.escom.schoolsaes.dao;

import com.escom.schoolsaes.model.PlanEstudios;
import com.escom.schoolsaes.model.PlanEstudiosExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PlanEstudiosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int countByExample(PlanEstudiosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByExample(PlanEstudiosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insert(PlanEstudios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int insertSelective(PlanEstudios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    List<PlanEstudios> selectByExample(PlanEstudiosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    PlanEstudios selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExampleSelective(@Param("record") PlanEstudios record, @Param("example") PlanEstudiosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByExample(@Param("record") PlanEstudios record, @Param("example") PlanEstudiosExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKeySelective(PlanEstudios record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table plan_estudios
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    int updateByPrimaryKey(PlanEstudios record);
}
package com.escom.schoolsaes.model;

public class Pregunta {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pregunta.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column pregunta.nombre
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    private String nombre;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pregunta.id
     *
     * @return the value of pregunta.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pregunta.id
     *
     * @param id the value for pregunta.id
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column pregunta.nombre
     *
     * @return the value of pregunta.nombre
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column pregunta.nombre
     *
     * @param nombre the value for pregunta.nombre
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
package com.escom.schoolsaes.model;

import java.util.ArrayList;
import java.util.List;

public class CalificacionAlumnoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public CalificacionAlumnoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andId_examenIsNull() {
            addCriterion("id_examen is null");
            return (Criteria) this;
        }

        public Criteria andId_examenIsNotNull() {
            addCriterion("id_examen is not null");
            return (Criteria) this;
        }

        public Criteria andId_examenEqualTo(Integer value) {
            addCriterion("id_examen =", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenNotEqualTo(Integer value) {
            addCriterion("id_examen <>", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenGreaterThan(Integer value) {
            addCriterion("id_examen >", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_examen >=", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenLessThan(Integer value) {
            addCriterion("id_examen <", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenLessThanOrEqualTo(Integer value) {
            addCriterion("id_examen <=", value, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenIn(List<Integer> values) {
            addCriterion("id_examen in", values, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenNotIn(List<Integer> values) {
            addCriterion("id_examen not in", values, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenBetween(Integer value1, Integer value2) {
            addCriterion("id_examen between", value1, value2, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_examenNotBetween(Integer value1, Integer value2) {
            addCriterion("id_examen not between", value1, value2, "id_examen");
            return (Criteria) this;
        }

        public Criteria andId_calificacionIsNull() {
            addCriterion("id_calificacion is null");
            return (Criteria) this;
        }

        public Criteria andId_calificacionIsNotNull() {
            addCriterion("id_calificacion is not null");
            return (Criteria) this;
        }

        public Criteria andId_calificacionEqualTo(Integer value) {
            addCriterion("id_calificacion =", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionNotEqualTo(Integer value) {
            addCriterion("id_calificacion <>", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionGreaterThan(Integer value) {
            addCriterion("id_calificacion >", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionGreaterThanOrEqualTo(Integer value) {
            addCriterion("id_calificacion >=", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionLessThan(Integer value) {
            addCriterion("id_calificacion <", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionLessThanOrEqualTo(Integer value) {
            addCriterion("id_calificacion <=", value, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionIn(List<Integer> values) {
            addCriterion("id_calificacion in", values, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionNotIn(List<Integer> values) {
            addCriterion("id_calificacion not in", values, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionBetween(Integer value1, Integer value2) {
            addCriterion("id_calificacion between", value1, value2, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andId_calificacionNotBetween(Integer value1, Integer value2) {
            addCriterion("id_calificacion not between", value1, value2, "id_calificacion");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoIsNull() {
            addCriterion("boleta_alumno is null");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoIsNotNull() {
            addCriterion("boleta_alumno is not null");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoEqualTo(Integer value) {
            addCriterion("boleta_alumno =", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoNotEqualTo(Integer value) {
            addCriterion("boleta_alumno <>", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoGreaterThan(Integer value) {
            addCriterion("boleta_alumno >", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("boleta_alumno >=", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoLessThan(Integer value) {
            addCriterion("boleta_alumno <", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoLessThanOrEqualTo(Integer value) {
            addCriterion("boleta_alumno <=", value, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoIn(List<Integer> values) {
            addCriterion("boleta_alumno in", values, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoNotIn(List<Integer> values) {
            addCriterion("boleta_alumno not in", values, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoBetween(Integer value1, Integer value2) {
            addCriterion("boleta_alumno between", value1, value2, "boleta_alumno");
            return (Criteria) this;
        }

        public Criteria andBoleta_alumnoNotBetween(Integer value1, Integer value2) {
            addCriterion("boleta_alumno not between", value1, value2, "boleta_alumno");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table calificacion_alumno
     *
     * @mbggenerated do_not_delete_during_merge Thu May 26 13:30:53 CDT 2016
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table calificacion_alumno
     *
     * @mbggenerated Thu May 26 13:30:53 CDT 2016
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value) {
            super();
            this.condition = condition;
            this.value = value;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.betweenValue = true;
        }
    }
}
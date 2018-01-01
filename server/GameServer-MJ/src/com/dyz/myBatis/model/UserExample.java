package com.dyz.myBatis.model;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
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
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbggenerated
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

        public List<Criterion> getAllCriteria() {
            return criteria;
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

        public Criteria andFIdIsNull() {
            addCriterion("f_id is null");
            return (Criteria) this;
        }

        public Criteria andFIdIsNotNull() {
            addCriterion("f_id is not null");
            return (Criteria) this;
        }

        public Criteria andFIdEqualTo(Integer value) {
            addCriterion("f_id =", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotEqualTo(Integer value) {
            addCriterion("f_id <>", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThan(Integer value) {
            addCriterion("f_id >", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_id >=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThan(Integer value) {
            addCriterion("f_id <", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdLessThanOrEqualTo(Integer value) {
            addCriterion("f_id <=", value, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdIn(List<Integer> values) {
            addCriterion("f_id in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotIn(List<Integer> values) {
            addCriterion("f_id not in", values, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdBetween(Integer value1, Integer value2) {
            addCriterion("f_id between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFIdNotBetween(Integer value1, Integer value2) {
            addCriterion("f_id not between", value1, value2, "fId");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("f_name is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("f_name is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("f_name =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("f_name <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("f_name >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("f_name >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("f_name <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("f_name <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("f_name like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("f_name not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("f_name in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("f_name not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("f_name between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("f_name not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberIsNull() {
            addCriterion("f_phonenumber is null");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberIsNotNull() {
            addCriterion("f_phonenumber is not null");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberEqualTo(String value) {
            addCriterion("f_phonenumber =", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberNotEqualTo(String value) {
            addCriterion("f_phonenumber <>", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberGreaterThan(String value) {
            addCriterion("f_phonenumber >", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberGreaterThanOrEqualTo(String value) {
            addCriterion("f_phonenumber >=", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberLessThan(String value) {
            addCriterion("f_phonenumber <", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberLessThanOrEqualTo(String value) {
            addCriterion("f_phonenumber <=", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberLike(String value) {
            addCriterion("f_phonenumber like", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberNotLike(String value) {
            addCriterion("f_phonenumber not like", value, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberIn(List<String> values) {
            addCriterion("f_phonenumber in", values, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberNotIn(List<String> values) {
            addCriterion("f_phonenumber not in", values, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberBetween(String value1, String value2) {
            addCriterion("f_phonenumber between", value1, value2, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFPhonenumberNotBetween(String value1, String value2) {
            addCriterion("f_phonenumber not between", value1, value2, "fPhonenumber");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNull() {
            addCriterion("f_email is null");
            return (Criteria) this;
        }

        public Criteria andFEmailIsNotNull() {
            addCriterion("f_email is not null");
            return (Criteria) this;
        }

        public Criteria andFEmailEqualTo(String value) {
            addCriterion("f_email =", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotEqualTo(String value) {
            addCriterion("f_email <>", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThan(String value) {
            addCriterion("f_email >", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailGreaterThanOrEqualTo(String value) {
            addCriterion("f_email >=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThan(String value) {
            addCriterion("f_email <", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLessThanOrEqualTo(String value) {
            addCriterion("f_email <=", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailLike(String value) {
            addCriterion("f_email like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotLike(String value) {
            addCriterion("f_email not like", value, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailIn(List<String> values) {
            addCriterion("f_email in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotIn(List<String> values) {
            addCriterion("f_email not in", values, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailBetween(String value1, String value2) {
            addCriterion("f_email between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFEmailNotBetween(String value1, String value2) {
            addCriterion("f_email not between", value1, value2, "fEmail");
            return (Criteria) this;
        }

        public Criteria andFPasswdIsNull() {
            addCriterion("f_passwd is null");
            return (Criteria) this;
        }

        public Criteria andFPasswdIsNotNull() {
            addCriterion("f_passwd is not null");
            return (Criteria) this;
        }

        public Criteria andFPasswdEqualTo(String value) {
            addCriterion("f_passwd =", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdNotEqualTo(String value) {
            addCriterion("f_passwd <>", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdGreaterThan(String value) {
            addCriterion("f_passwd >", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("f_passwd >=", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdLessThan(String value) {
            addCriterion("f_passwd <", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdLessThanOrEqualTo(String value) {
            addCriterion("f_passwd <=", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdLike(String value) {
            addCriterion("f_passwd like", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdNotLike(String value) {
            addCriterion("f_passwd not like", value, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdIn(List<String> values) {
            addCriterion("f_passwd in", values, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdNotIn(List<String> values) {
            addCriterion("f_passwd not in", values, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdBetween(String value1, String value2) {
            addCriterion("f_passwd between", value1, value2, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFPasswdNotBetween(String value1, String value2) {
            addCriterion("f_passwd not between", value1, value2, "fPasswd");
            return (Criteria) this;
        }

        public Criteria andFRegdateIsNull() {
            addCriterion("f_regdate is null");
            return (Criteria) this;
        }

        public Criteria andFRegdateIsNotNull() {
            addCriterion("f_regdate is not null");
            return (Criteria) this;
        }

        public Criteria andFRegdateEqualTo(Long value) {
            addCriterion("f_regdate =", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateNotEqualTo(Long value) {
            addCriterion("f_regdate <>", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateGreaterThan(Long value) {
            addCriterion("f_regdate >", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateGreaterThanOrEqualTo(Long value) {
            addCriterion("f_regdate >=", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateLessThan(Long value) {
            addCriterion("f_regdate <", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateLessThanOrEqualTo(Long value) {
            addCriterion("f_regdate <=", value, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateIn(List<Long> values) {
            addCriterion("f_regdate in", values, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateNotIn(List<Long> values) {
            addCriterion("f_regdate not in", values, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateBetween(Long value1, Long value2) {
            addCriterion("f_regdate between", value1, value2, "fRegdate");
            return (Criteria) this;
        }

        public Criteria andFRegdateNotBetween(Long value1, Long value2) {
            addCriterion("f_regdate not between", value1, value2, "fRegdate");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table user
     *
     * @mbggenerated
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
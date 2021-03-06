package com.dyz.myBatis.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InviteExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table invite
	 * @mbggenerated
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table invite
	 * @mbggenerated
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table invite
	 * @mbggenerated
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public InviteExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
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
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table invite
	 * @mbggenerated
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table invite
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
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

		public Criteria andInviteidIsNull() {
			addCriterion("inviteId is null");
			return (Criteria) this;
		}

		public Criteria andInviteidIsNotNull() {
			addCriterion("inviteId is not null");
			return (Criteria) this;
		}

		public Criteria andInviteidEqualTo(Integer value) {
			addCriterion("inviteId =", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidNotEqualTo(Integer value) {
			addCriterion("inviteId <>", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidGreaterThan(Integer value) {
			addCriterion("inviteId >", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidGreaterThanOrEqualTo(Integer value) {
			addCriterion("inviteId >=", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidLessThan(Integer value) {
			addCriterion("inviteId <", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidLessThanOrEqualTo(Integer value) {
			addCriterion("inviteId <=", value, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidIn(List<Integer> values) {
			addCriterion("inviteId in", values, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidNotIn(List<Integer> values) {
			addCriterion("inviteId not in", values, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidBetween(Integer value1, Integer value2) {
			addCriterion("inviteId between", value1, value2, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInviteidNotBetween(Integer value1, Integer value2) {
			addCriterion("inviteId not between", value1, value2, "inviteid");
			return (Criteria) this;
		}

		public Criteria andInvitedidIsNull() {
			addCriterion("invitedid is null");
			return (Criteria) this;
		}

		public Criteria andInvitedidIsNotNull() {
			addCriterion("invitedid is not null");
			return (Criteria) this;
		}

		public Criteria andInvitedidEqualTo(Integer value) {
			addCriterion("invitedid =", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidNotEqualTo(Integer value) {
			addCriterion("invitedid <>", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidGreaterThan(Integer value) {
			addCriterion("invitedid >", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidGreaterThanOrEqualTo(Integer value) {
			addCriterion("invitedid >=", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidLessThan(Integer value) {
			addCriterion("invitedid <", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidLessThanOrEqualTo(Integer value) {
			addCriterion("invitedid <=", value, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidIn(List<Integer> values) {
			addCriterion("invitedid in", values, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidNotIn(List<Integer> values) {
			addCriterion("invitedid not in", values, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidBetween(Integer value1, Integer value2) {
			addCriterion("invitedid between", value1, value2, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitedidNotBetween(Integer value1, Integer value2) {
			addCriterion("invitedid not between", value1, value2, "invitedid");
			return (Criteria) this;
		}

		public Criteria andInvitetimeIsNull() {
			addCriterion("inviteTime is null");
			return (Criteria) this;
		}

		public Criteria andInvitetimeIsNotNull() {
			addCriterion("inviteTime is not null");
			return (Criteria) this;
		}

		public Criteria andInvitetimeEqualTo(Date value) {
			addCriterion("inviteTime =", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeNotEqualTo(Date value) {
			addCriterion("inviteTime <>", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeGreaterThan(Date value) {
			addCriterion("inviteTime >", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeGreaterThanOrEqualTo(Date value) {
			addCriterion("inviteTime >=", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeLessThan(Date value) {
			addCriterion("inviteTime <", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeLessThanOrEqualTo(Date value) {
			addCriterion("inviteTime <=", value, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeIn(List<Date> values) {
			addCriterion("inviteTime in", values, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeNotIn(List<Date> values) {
			addCriterion("inviteTime not in", values, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeBetween(Date value1, Date value2) {
			addCriterion("inviteTime between", value1, value2, "invitetime");
			return (Criteria) this;
		}

		public Criteria andInvitetimeNotBetween(Date value1, Date value2) {
			addCriterion("inviteTime not between", value1, value2, "invitetime");
			return (Criteria) this;
		}

		public Criteria andRewardIsNull() {
			addCriterion("reward is null");
			return (Criteria) this;
		}

		public Criteria andRewardIsNotNull() {
			addCriterion("reward is not null");
			return (Criteria) this;
		}

		public Criteria andRewardEqualTo(Integer value) {
			addCriterion("reward =", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardNotEqualTo(Integer value) {
			addCriterion("reward <>", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardGreaterThan(Integer value) {
			addCriterion("reward >", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardGreaterThanOrEqualTo(Integer value) {
			addCriterion("reward >=", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardLessThan(Integer value) {
			addCriterion("reward <", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardLessThanOrEqualTo(Integer value) {
			addCriterion("reward <=", value, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardIn(List<Integer> values) {
			addCriterion("reward in", values, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardNotIn(List<Integer> values) {
			addCriterion("reward not in", values, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardBetween(Integer value1, Integer value2) {
			addCriterion("reward between", value1, value2, "reward");
			return (Criteria) this;
		}

		public Criteria andRewardNotBetween(Integer value1, Integer value2) {
			addCriterion("reward not between", value1, value2, "reward");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table invite
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table invite
     *
     * @mbggenerated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}
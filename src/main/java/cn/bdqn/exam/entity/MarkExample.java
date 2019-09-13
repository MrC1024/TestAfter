package cn.bdqn.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class MarkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MarkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andMarkidIsNull() {
            addCriterion("markId is null");
            return (Criteria) this;
        }

        public Criteria andMarkidIsNotNull() {
            addCriterion("markId is not null");
            return (Criteria) this;
        }

        public Criteria andMarkidEqualTo(Integer value) {
            addCriterion("markId =", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidNotEqualTo(Integer value) {
            addCriterion("markId <>", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidGreaterThan(Integer value) {
            addCriterion("markId >", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("markId >=", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidLessThan(Integer value) {
            addCriterion("markId <", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidLessThanOrEqualTo(Integer value) {
            addCriterion("markId <=", value, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidIn(List<Integer> values) {
            addCriterion("markId in", values, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidNotIn(List<Integer> values) {
            addCriterion("markId not in", values, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidBetween(Integer value1, Integer value2) {
            addCriterion("markId between", value1, value2, "markid");
            return (Criteria) this;
        }

        public Criteria andMarkidNotBetween(Integer value1, Integer value2) {
            addCriterion("markId not between", value1, value2, "markid");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNull() {
            addCriterion("mScore is null");
            return (Criteria) this;
        }

        public Criteria andMscoreIsNotNull() {
            addCriterion("mScore is not null");
            return (Criteria) this;
        }

        public Criteria andMscoreEqualTo(String value) {
            addCriterion("mScore =", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotEqualTo(String value) {
            addCriterion("mScore <>", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThan(String value) {
            addCriterion("mScore >", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreGreaterThanOrEqualTo(String value) {
            addCriterion("mScore >=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThan(String value) {
            addCriterion("mScore <", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLessThanOrEqualTo(String value) {
            addCriterion("mScore <=", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreLike(String value) {
            addCriterion("mScore like", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotLike(String value) {
            addCriterion("mScore not like", value, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreIn(List<String> values) {
            addCriterion("mScore in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotIn(List<String> values) {
            addCriterion("mScore not in", values, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreBetween(String value1, String value2) {
            addCriterion("mScore between", value1, value2, "mscore");
            return (Criteria) this;
        }

        public Criteria andMscoreNotBetween(String value1, String value2) {
            addCriterion("mScore not between", value1, value2, "mscore");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_Id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_Id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_Id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_Id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_Id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_Id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_Id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_Id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_Id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_Id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_Id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_Id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidIsNull() {
            addCriterion("testpaperstepId is null");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidIsNotNull() {
            addCriterion("testpaperstepId is not null");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidEqualTo(Integer value) {
            addCriterion("testpaperstepId =", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidNotEqualTo(Integer value) {
            addCriterion("testpaperstepId <>", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidGreaterThan(Integer value) {
            addCriterion("testpaperstepId >", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidGreaterThanOrEqualTo(Integer value) {
            addCriterion("testpaperstepId >=", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidLessThan(Integer value) {
            addCriterion("testpaperstepId <", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidLessThanOrEqualTo(Integer value) {
            addCriterion("testpaperstepId <=", value, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidIn(List<Integer> values) {
            addCriterion("testpaperstepId in", values, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidNotIn(List<Integer> values) {
            addCriterion("testpaperstepId not in", values, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidBetween(Integer value1, Integer value2) {
            addCriterion("testpaperstepId between", value1, value2, "testpaperstepid");
            return (Criteria) this;
        }

        public Criteria andTestpaperstepidNotBetween(Integer value1, Integer value2) {
            addCriterion("testpaperstepId not between", value1, value2, "testpaperstepid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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
package cn.bdqn.exam.po;

import java.util.ArrayList;
import java.util.List;

public class OptionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OptionExample() {
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

        public Criteria andOidIsNull() {
            addCriterion("oID is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oID is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oID =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oID <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oID >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oID >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oID <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oID <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oID in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oID not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oID between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oID not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOnameIsNull() {
            addCriterion("oName is null");
            return (Criteria) this;
        }

        public Criteria andOnameIsNotNull() {
            addCriterion("oName is not null");
            return (Criteria) this;
        }

        public Criteria andOnameEqualTo(String value) {
            addCriterion("oName =", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotEqualTo(String value) {
            addCriterion("oName <>", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThan(String value) {
            addCriterion("oName >", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameGreaterThanOrEqualTo(String value) {
            addCriterion("oName >=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThan(String value) {
            addCriterion("oName <", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLessThanOrEqualTo(String value) {
            addCriterion("oName <=", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameLike(String value) {
            addCriterion("oName like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotLike(String value) {
            addCriterion("oName not like", value, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameIn(List<String> values) {
            addCriterion("oName in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotIn(List<String> values) {
            addCriterion("oName not in", values, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameBetween(String value1, String value2) {
            addCriterion("oName between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOnameNotBetween(String value1, String value2) {
            addCriterion("oName not between", value1, value2, "oname");
            return (Criteria) this;
        }

        public Criteria andOcountentIsNull() {
            addCriterion("ocountent is null");
            return (Criteria) this;
        }

        public Criteria andOcountentIsNotNull() {
            addCriterion("ocountent is not null");
            return (Criteria) this;
        }

        public Criteria andOcountentEqualTo(String value) {
            addCriterion("ocountent =", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentNotEqualTo(String value) {
            addCriterion("ocountent <>", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentGreaterThan(String value) {
            addCriterion("ocountent >", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentGreaterThanOrEqualTo(String value) {
            addCriterion("ocountent >=", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentLessThan(String value) {
            addCriterion("ocountent <", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentLessThanOrEqualTo(String value) {
            addCriterion("ocountent <=", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentLike(String value) {
            addCriterion("ocountent like", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentNotLike(String value) {
            addCriterion("ocountent not like", value, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentIn(List<String> values) {
            addCriterion("ocountent in", values, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentNotIn(List<String> values) {
            addCriterion("ocountent not in", values, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentBetween(String value1, String value2) {
            addCriterion("ocountent between", value1, value2, "ocountent");
            return (Criteria) this;
        }

        public Criteria andOcountentNotBetween(String value1, String value2) {
            addCriterion("ocountent not between", value1, value2, "ocountent");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNull() {
            addCriterion("answerID is null");
            return (Criteria) this;
        }

        public Criteria andAnsweridIsNotNull() {
            addCriterion("answerID is not null");
            return (Criteria) this;
        }

        public Criteria andAnsweridEqualTo(Integer value) {
            addCriterion("answerID =", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotEqualTo(Integer value) {
            addCriterion("answerID <>", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThan(Integer value) {
            addCriterion("answerID >", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridGreaterThanOrEqualTo(Integer value) {
            addCriterion("answerID >=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThan(Integer value) {
            addCriterion("answerID <", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridLessThanOrEqualTo(Integer value) {
            addCriterion("answerID <=", value, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridIn(List<Integer> values) {
            addCriterion("answerID in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotIn(List<Integer> values) {
            addCriterion("answerID not in", values, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridBetween(Integer value1, Integer value2) {
            addCriterion("answerID between", value1, value2, "answerid");
            return (Criteria) this;
        }

        public Criteria andAnsweridNotBetween(Integer value1, Integer value2) {
            addCriterion("answerID not between", value1, value2, "answerid");
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
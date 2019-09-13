package cn.bdqn.exam.po;

import java.util.ArrayList;
import java.util.List;

public class VtypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VtypeExample() {
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

        public Criteria andVtypeidIsNull() {
            addCriterion("vTypeId is null");
            return (Criteria) this;
        }

        public Criteria andVtypeidIsNotNull() {
            addCriterion("vTypeId is not null");
            return (Criteria) this;
        }

        public Criteria andVtypeidEqualTo(Integer value) {
            addCriterion("vTypeId =", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotEqualTo(Integer value) {
            addCriterion("vTypeId <>", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidGreaterThan(Integer value) {
            addCriterion("vTypeId >", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vTypeId >=", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidLessThan(Integer value) {
            addCriterion("vTypeId <", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidLessThanOrEqualTo(Integer value) {
            addCriterion("vTypeId <=", value, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidIn(List<Integer> values) {
            addCriterion("vTypeId in", values, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotIn(List<Integer> values) {
            addCriterion("vTypeId not in", values, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidBetween(Integer value1, Integer value2) {
            addCriterion("vTypeId between", value1, value2, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypeidNotBetween(Integer value1, Integer value2) {
            addCriterion("vTypeId not between", value1, value2, "vtypeid");
            return (Criteria) this;
        }

        public Criteria andVtypenameIsNull() {
            addCriterion("vTypeName is null");
            return (Criteria) this;
        }

        public Criteria andVtypenameIsNotNull() {
            addCriterion("vTypeName is not null");
            return (Criteria) this;
        }

        public Criteria andVtypenameEqualTo(String value) {
            addCriterion("vTypeName =", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameNotEqualTo(String value) {
            addCriterion("vTypeName <>", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameGreaterThan(String value) {
            addCriterion("vTypeName >", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameGreaterThanOrEqualTo(String value) {
            addCriterion("vTypeName >=", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameLessThan(String value) {
            addCriterion("vTypeName <", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameLessThanOrEqualTo(String value) {
            addCriterion("vTypeName <=", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameLike(String value) {
            addCriterion("vTypeName like", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameNotLike(String value) {
            addCriterion("vTypeName not like", value, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameIn(List<String> values) {
            addCriterion("vTypeName in", values, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameNotIn(List<String> values) {
            addCriterion("vTypeName not in", values, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameBetween(String value1, String value2) {
            addCriterion("vTypeName between", value1, value2, "vtypename");
            return (Criteria) this;
        }

        public Criteria andVtypenameNotBetween(String value1, String value2) {
            addCriterion("vTypeName not between", value1, value2, "vtypename");
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
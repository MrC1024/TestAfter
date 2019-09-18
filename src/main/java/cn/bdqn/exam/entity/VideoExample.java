package cn.bdqn.exam.entity;

import java.util.ArrayList;
import java.util.List;

public class VideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public VideoExample() {
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

        public Criteria andVidIsNull() {
            addCriterion("vid is null");
            return (Criteria) this;
        }

        public Criteria andVidIsNotNull() {
            addCriterion("vid is not null");
            return (Criteria) this;
        }

        public Criteria andVidEqualTo(Integer value) {
            addCriterion("vid =", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotEqualTo(Integer value) {
            addCriterion("vid <>", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThan(Integer value) {
            addCriterion("vid >", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidGreaterThanOrEqualTo(Integer value) {
            addCriterion("vid >=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThan(Integer value) {
            addCriterion("vid <", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidLessThanOrEqualTo(Integer value) {
            addCriterion("vid <=", value, "vid");
            return (Criteria) this;
        }

        public Criteria andVidIn(List<Integer> values) {
            addCriterion("vid in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotIn(List<Integer> values) {
            addCriterion("vid not in", values, "vid");
            return (Criteria) this;
        }

        public Criteria andVidBetween(Integer value1, Integer value2) {
            addCriterion("vid between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVidNotBetween(Integer value1, Integer value2) {
            addCriterion("vid not between", value1, value2, "vid");
            return (Criteria) this;
        }

        public Criteria andVnameIsNull() {
            addCriterion("vName is null");
            return (Criteria) this;
        }

        public Criteria andVnameIsNotNull() {
            addCriterion("vName is not null");
            return (Criteria) this;
        }

        public Criteria andVnameEqualTo(String value) {
            addCriterion("vName =", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotEqualTo(String value) {
            addCriterion("vName <>", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThan(String value) {
            addCriterion("vName >", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameGreaterThanOrEqualTo(String value) {
            addCriterion("vName >=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThan(String value) {
            addCriterion("vName <", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLessThanOrEqualTo(String value) {
            addCriterion("vName <=", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameLike(String value) {
            addCriterion("vName like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotLike(String value) {
            addCriterion("vName not like", value, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameIn(List<String> values) {
            addCriterion("vName in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotIn(List<String> values) {
            addCriterion("vName not in", values, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameBetween(String value1, String value2) {
            addCriterion("vName between", value1, value2, "vname");
            return (Criteria) this;
        }

        public Criteria andVnameNotBetween(String value1, String value2) {
            addCriterion("vName not between", value1, value2, "vname");
            return (Criteria) this;
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

        public Criteria andPathIsNull() {
            addCriterion("path is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("path is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("path =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("path <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("path >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("path >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("path <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("path <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("path like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("path not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("path in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("path not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("path between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("path not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeIsNull() {
            addCriterion("lengthoftime is null");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeIsNotNull() {
            addCriterion("lengthoftime is not null");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeEqualTo(String value) {
            addCriterion("lengthoftime =", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeNotEqualTo(String value) {
            addCriterion("lengthoftime <>", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeGreaterThan(String value) {
            addCriterion("lengthoftime >", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeGreaterThanOrEqualTo(String value) {
            addCriterion("lengthoftime >=", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeLessThan(String value) {
            addCriterion("lengthoftime <", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeLessThanOrEqualTo(String value) {
            addCriterion("lengthoftime <=", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeLike(String value) {
            addCriterion("lengthoftime like", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeNotLike(String value) {
            addCriterion("lengthoftime not like", value, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeIn(List<String> values) {
            addCriterion("lengthoftime in", values, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeNotIn(List<String> values) {
            addCriterion("lengthoftime not in", values, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeBetween(String value1, String value2) {
            addCriterion("lengthoftime between", value1, value2, "lengthoftime");
            return (Criteria) this;
        }

        public Criteria andLengthoftimeNotBetween(String value1, String value2) {
            addCriterion("lengthoftime not between", value1, value2, "lengthoftime");
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
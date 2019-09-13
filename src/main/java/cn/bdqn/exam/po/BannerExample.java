package cn.bdqn.exam.po;

import java.util.ArrayList;
import java.util.List;

public class BannerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BannerExample() {
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

        public Criteria andBanidIsNull() {
            addCriterion("banId is null");
            return (Criteria) this;
        }

        public Criteria andBanidIsNotNull() {
            addCriterion("banId is not null");
            return (Criteria) this;
        }

        public Criteria andBanidEqualTo(Integer value) {
            addCriterion("banId =", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotEqualTo(Integer value) {
            addCriterion("banId <>", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThan(Integer value) {
            addCriterion("banId >", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("banId >=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThan(Integer value) {
            addCriterion("banId <", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidLessThanOrEqualTo(Integer value) {
            addCriterion("banId <=", value, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidIn(List<Integer> values) {
            addCriterion("banId in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotIn(List<Integer> values) {
            addCriterion("banId not in", values, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidBetween(Integer value1, Integer value2) {
            addCriterion("banId between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andBanidNotBetween(Integer value1, Integer value2) {
            addCriterion("banId not between", value1, value2, "banid");
            return (Criteria) this;
        }

        public Criteria andBanpathIsNull() {
            addCriterion("banPath is null");
            return (Criteria) this;
        }

        public Criteria andBanpathIsNotNull() {
            addCriterion("banPath is not null");
            return (Criteria) this;
        }

        public Criteria andBanpathEqualTo(String value) {
            addCriterion("banPath =", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathNotEqualTo(String value) {
            addCriterion("banPath <>", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathGreaterThan(String value) {
            addCriterion("banPath >", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathGreaterThanOrEqualTo(String value) {
            addCriterion("banPath >=", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathLessThan(String value) {
            addCriterion("banPath <", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathLessThanOrEqualTo(String value) {
            addCriterion("banPath <=", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathLike(String value) {
            addCriterion("banPath like", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathNotLike(String value) {
            addCriterion("banPath not like", value, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathIn(List<String> values) {
            addCriterion("banPath in", values, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathNotIn(List<String> values) {
            addCriterion("banPath not in", values, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathBetween(String value1, String value2) {
            addCriterion("banPath between", value1, value2, "banpath");
            return (Criteria) this;
        }

        public Criteria andBanpathNotBetween(String value1, String value2) {
            addCriterion("banPath not between", value1, value2, "banpath");
            return (Criteria) this;
        }

        public Criteria andBannameIsNull() {
            addCriterion("banName is null");
            return (Criteria) this;
        }

        public Criteria andBannameIsNotNull() {
            addCriterion("banName is not null");
            return (Criteria) this;
        }

        public Criteria andBannameEqualTo(String value) {
            addCriterion("banName =", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotEqualTo(String value) {
            addCriterion("banName <>", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameGreaterThan(String value) {
            addCriterion("banName >", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameGreaterThanOrEqualTo(String value) {
            addCriterion("banName >=", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLessThan(String value) {
            addCriterion("banName <", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLessThanOrEqualTo(String value) {
            addCriterion("banName <=", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameLike(String value) {
            addCriterion("banName like", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotLike(String value) {
            addCriterion("banName not like", value, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameIn(List<String> values) {
            addCriterion("banName in", values, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotIn(List<String> values) {
            addCriterion("banName not in", values, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameBetween(String value1, String value2) {
            addCriterion("banName between", value1, value2, "banname");
            return (Criteria) this;
        }

        public Criteria andBannameNotBetween(String value1, String value2) {
            addCriterion("banName not between", value1, value2, "banname");
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
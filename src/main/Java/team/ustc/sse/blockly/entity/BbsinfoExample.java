package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbsinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbsinfoExample() {
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

        public Criteria andBbsidIsNull() {
            addCriterion("bbsID is null");
            return (Criteria) this;
        }

        public Criteria andBbsidIsNotNull() {
            addCriterion("bbsID is not null");
            return (Criteria) this;
        }

        public Criteria andBbsidEqualTo(Integer value) {
            addCriterion("bbsID =", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidNotEqualTo(Integer value) {
            addCriterion("bbsID <>", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidGreaterThan(Integer value) {
            addCriterion("bbsID >", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bbsID >=", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidLessThan(Integer value) {
            addCriterion("bbsID <", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidLessThanOrEqualTo(Integer value) {
            addCriterion("bbsID <=", value, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidIn(List<Integer> values) {
            addCriterion("bbsID in", values, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidNotIn(List<Integer> values) {
            addCriterion("bbsID not in", values, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidBetween(Integer value1, Integer value2) {
            addCriterion("bbsID between", value1, value2, "bbsid");
            return (Criteria) this;
        }

        public Criteria andBbsidNotBetween(Integer value1, Integer value2) {
            addCriterion("bbsID not between", value1, value2, "bbsid");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNull() {
            addCriterion("studentID is null");
            return (Criteria) this;
        }

        public Criteria andStudentidIsNotNull() {
            addCriterion("studentID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentidEqualTo(Integer value) {
            addCriterion("studentID =", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotEqualTo(Integer value) {
            addCriterion("studentID <>", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThan(Integer value) {
            addCriterion("studentID >", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentID >=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThan(Integer value) {
            addCriterion("studentID <", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidLessThanOrEqualTo(Integer value) {
            addCriterion("studentID <=", value, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidIn(List<Integer> values) {
            addCriterion("studentID in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotIn(List<Integer> values) {
            addCriterion("studentID not in", values, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidBetween(Integer value1, Integer value2) {
            addCriterion("studentID between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andStudentidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentID not between", value1, value2, "studentid");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNull() {
            addCriterion("postDate is null");
            return (Criteria) this;
        }

        public Criteria andPostdateIsNotNull() {
            addCriterion("postDate is not null");
            return (Criteria) this;
        }

        public Criteria andPostdateEqualTo(Date value) {
            addCriterion("postDate =", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotEqualTo(Date value) {
            addCriterion("postDate <>", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThan(Date value) {
            addCriterion("postDate >", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateGreaterThanOrEqualTo(Date value) {
            addCriterion("postDate >=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThan(Date value) {
            addCriterion("postDate <", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateLessThanOrEqualTo(Date value) {
            addCriterion("postDate <=", value, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateIn(List<Date> values) {
            addCriterion("postDate in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotIn(List<Date> values) {
            addCriterion("postDate not in", values, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateBetween(Date value1, Date value2) {
            addCriterion("postDate between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andPostdateNotBetween(Date value1, Date value2) {
            addCriterion("postDate not between", value1, value2, "postdate");
            return (Criteria) this;
        }

        public Criteria andThemeIsNull() {
            addCriterion("theme is null");
            return (Criteria) this;
        }

        public Criteria andThemeIsNotNull() {
            addCriterion("theme is not null");
            return (Criteria) this;
        }

        public Criteria andThemeEqualTo(String value) {
            addCriterion("theme =", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotEqualTo(String value) {
            addCriterion("theme <>", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThan(String value) {
            addCriterion("theme >", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeGreaterThanOrEqualTo(String value) {
            addCriterion("theme >=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThan(String value) {
            addCriterion("theme <", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLessThanOrEqualTo(String value) {
            addCriterion("theme <=", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeLike(String value) {
            addCriterion("theme like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotLike(String value) {
            addCriterion("theme not like", value, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeIn(List<String> values) {
            addCriterion("theme in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotIn(List<String> values) {
            addCriterion("theme not in", values, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeBetween(String value1, String value2) {
            addCriterion("theme between", value1, value2, "theme");
            return (Criteria) this;
        }

        public Criteria andThemeNotBetween(String value1, String value2) {
            addCriterion("theme not between", value1, value2, "theme");
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
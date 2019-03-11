package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CheckoutpointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckoutpointExample() {
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

        protected void addCriterionForJDBCTime(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value.getTime()), property);
        }

        protected void addCriterionForJDBCTime(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Time> timeList = new ArrayList<java.sql.Time>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                timeList.add(new java.sql.Time(iter.next().getTime()));
            }
            addCriterion(condition, timeList, property);
        }

        protected void addCriterionForJDBCTime(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Time(value1.getTime()), new java.sql.Time(value2.getTime()), property);
        }

        public Criteria andCheckoutpointidIsNull() {
            addCriterion("checkOutPointID is null");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidIsNotNull() {
            addCriterion("checkOutPointID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidEqualTo(Integer value) {
            addCriterion("checkOutPointID =", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidNotEqualTo(Integer value) {
            addCriterion("checkOutPointID <>", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidGreaterThan(Integer value) {
            addCriterion("checkOutPointID >", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkOutPointID >=", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidLessThan(Integer value) {
            addCriterion("checkOutPointID <", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidLessThanOrEqualTo(Integer value) {
            addCriterion("checkOutPointID <=", value, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidIn(List<Integer> values) {
            addCriterion("checkOutPointID in", values, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidNotIn(List<Integer> values) {
            addCriterion("checkOutPointID not in", values, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidBetween(Integer value1, Integer value2) {
            addCriterion("checkOutPointID between", value1, value2, "checkoutpointid");
            return (Criteria) this;
        }

        public Criteria andCheckoutpointidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkOutPointID not between", value1, value2, "checkoutpointid");
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

        public Criteria andToaltimeIsNull() {
            addCriterion("toalTime is null");
            return (Criteria) this;
        }

        public Criteria andToaltimeIsNotNull() {
            addCriterion("toalTime is not null");
            return (Criteria) this;
        }

        public Criteria andToaltimeEqualTo(Date value) {
            addCriterionForJDBCTime("toalTime =", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotEqualTo(Date value) {
            addCriterionForJDBCTime("toalTime <>", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThan(Date value) {
            addCriterionForJDBCTime("toalTime >", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("toalTime >=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThan(Date value) {
            addCriterionForJDBCTime("toalTime <", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCTime("toalTime <=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeIn(List<Date> values) {
            addCriterionForJDBCTime("toalTime in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotIn(List<Date> values) {
            addCriterionForJDBCTime("toalTime not in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("toalTime between", value1, value2, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCTime("toalTime not between", value1, value2, "toaltime");
            return (Criteria) this;
        }

        public Criteria andProgramIsNull() {
            addCriterion("program is null");
            return (Criteria) this;
        }

        public Criteria andProgramIsNotNull() {
            addCriterion("program is not null");
            return (Criteria) this;
        }

        public Criteria andProgramEqualTo(String value) {
            addCriterion("program =", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotEqualTo(String value) {
            addCriterion("program <>", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramGreaterThan(String value) {
            addCriterion("program >", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramGreaterThanOrEqualTo(String value) {
            addCriterion("program >=", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLessThan(String value) {
            addCriterion("program <", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLessThanOrEqualTo(String value) {
            addCriterion("program <=", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramLike(String value) {
            addCriterion("program like", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotLike(String value) {
            addCriterion("program not like", value, "program");
            return (Criteria) this;
        }

        public Criteria andProgramIn(List<String> values) {
            addCriterion("program in", values, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotIn(List<String> values) {
            addCriterion("program not in", values, "program");
            return (Criteria) this;
        }

        public Criteria andProgramBetween(String value1, String value2) {
            addCriterion("program between", value1, value2, "program");
            return (Criteria) this;
        }

        public Criteria andProgramNotBetween(String value1, String value2) {
            addCriterion("program not between", value1, value2, "program");
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
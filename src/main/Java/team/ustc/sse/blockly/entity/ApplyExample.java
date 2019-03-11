package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ApplyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ApplyExample() {
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

        public Criteria andGuardianidIsNull() {
            addCriterion("guardianID is null");
            return (Criteria) this;
        }

        public Criteria andGuardianidIsNotNull() {
            addCriterion("guardianID is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianidEqualTo(Integer value) {
            addCriterion("guardianID =", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidNotEqualTo(Integer value) {
            addCriterion("guardianID <>", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidGreaterThan(Integer value) {
            addCriterion("guardianID >", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidGreaterThanOrEqualTo(Integer value) {
            addCriterion("guardianID >=", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidLessThan(Integer value) {
            addCriterion("guardianID <", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidLessThanOrEqualTo(Integer value) {
            addCriterion("guardianID <=", value, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidIn(List<Integer> values) {
            addCriterion("guardianID in", values, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidNotIn(List<Integer> values) {
            addCriterion("guardianID not in", values, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidBetween(Integer value1, Integer value2) {
            addCriterion("guardianID between", value1, value2, "guardianid");
            return (Criteria) this;
        }

        public Criteria andGuardianidNotBetween(Integer value1, Integer value2) {
            addCriterion("guardianID not between", value1, value2, "guardianid");
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

        public Criteria andApplydateIsNull() {
            addCriterion("applyDate is null");
            return (Criteria) this;
        }

        public Criteria andApplydateIsNotNull() {
            addCriterion("applyDate is not null");
            return (Criteria) this;
        }

        public Criteria andApplydateEqualTo(Date value) {
            addCriterion("applyDate =", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotEqualTo(Date value) {
            addCriterion("applyDate <>", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThan(Date value) {
            addCriterion("applyDate >", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateGreaterThanOrEqualTo(Date value) {
            addCriterion("applyDate >=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThan(Date value) {
            addCriterion("applyDate <", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateLessThanOrEqualTo(Date value) {
            addCriterion("applyDate <=", value, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateIn(List<Date> values) {
            addCriterion("applyDate in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotIn(List<Date> values) {
            addCriterion("applyDate not in", values, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateBetween(Date value1, Date value2) {
            addCriterion("applyDate between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplydateNotBetween(Date value1, Date value2) {
            addCriterion("applyDate not between", value1, value2, "applydate");
            return (Criteria) this;
        }

        public Criteria andApplysubmitIsNull() {
            addCriterion("applySubmit is null");
            return (Criteria) this;
        }

        public Criteria andApplysubmitIsNotNull() {
            addCriterion("applySubmit is not null");
            return (Criteria) this;
        }

        public Criteria andApplysubmitEqualTo(Boolean value) {
            addCriterion("applySubmit =", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitNotEqualTo(Boolean value) {
            addCriterion("applySubmit <>", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitGreaterThan(Boolean value) {
            addCriterion("applySubmit >", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("applySubmit >=", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitLessThan(Boolean value) {
            addCriterion("applySubmit <", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitLessThanOrEqualTo(Boolean value) {
            addCriterion("applySubmit <=", value, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitIn(List<Boolean> values) {
            addCriterion("applySubmit in", values, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitNotIn(List<Boolean> values) {
            addCriterion("applySubmit not in", values, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitBetween(Boolean value1, Boolean value2) {
            addCriterion("applySubmit between", value1, value2, "applysubmit");
            return (Criteria) this;
        }

        public Criteria andApplysubmitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("applySubmit not between", value1, value2, "applysubmit");
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
package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentloginmessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentloginmessageExample() {
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

        public Criteria andStudentloginidIsNull() {
            addCriterion("studentLoginID is null");
            return (Criteria) this;
        }

        public Criteria andStudentloginidIsNotNull() {
            addCriterion("studentLoginID is not null");
            return (Criteria) this;
        }

        public Criteria andStudentloginidEqualTo(Integer value) {
            addCriterion("studentLoginID =", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidNotEqualTo(Integer value) {
            addCriterion("studentLoginID <>", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidGreaterThan(Integer value) {
            addCriterion("studentLoginID >", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentLoginID >=", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidLessThan(Integer value) {
            addCriterion("studentLoginID <", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidLessThanOrEqualTo(Integer value) {
            addCriterion("studentLoginID <=", value, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidIn(List<Integer> values) {
            addCriterion("studentLoginID in", values, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidNotIn(List<Integer> values) {
            addCriterion("studentLoginID not in", values, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidBetween(Integer value1, Integer value2) {
            addCriterion("studentLoginID between", value1, value2, "studentloginid");
            return (Criteria) this;
        }

        public Criteria andStudentloginidNotBetween(Integer value1, Integer value2) {
            addCriterion("studentLoginID not between", value1, value2, "studentloginid");
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

        public Criteria andLoginipIsNull() {
            addCriterion("loginIP is null");
            return (Criteria) this;
        }

        public Criteria andLoginipIsNotNull() {
            addCriterion("loginIP is not null");
            return (Criteria) this;
        }

        public Criteria andLoginipEqualTo(String value) {
            addCriterion("loginIP =", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotEqualTo(String value) {
            addCriterion("loginIP <>", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThan(String value) {
            addCriterion("loginIP >", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipGreaterThanOrEqualTo(String value) {
            addCriterion("loginIP >=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThan(String value) {
            addCriterion("loginIP <", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLessThanOrEqualTo(String value) {
            addCriterion("loginIP <=", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipLike(String value) {
            addCriterion("loginIP like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotLike(String value) {
            addCriterion("loginIP not like", value, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipIn(List<String> values) {
            addCriterion("loginIP in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotIn(List<String> values) {
            addCriterion("loginIP not in", values, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipBetween(String value1, String value2) {
            addCriterion("loginIP between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLoginipNotBetween(String value1, String value2) {
            addCriterion("loginIP not between", value1, value2, "loginip");
            return (Criteria) this;
        }

        public Criteria andLogindataIsNull() {
            addCriterion("loginData is null");
            return (Criteria) this;
        }

        public Criteria andLogindataIsNotNull() {
            addCriterion("loginData is not null");
            return (Criteria) this;
        }

        public Criteria andLogindataEqualTo(Date value) {
            addCriterion("loginData =", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataNotEqualTo(Date value) {
            addCriterion("loginData <>", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataGreaterThan(Date value) {
            addCriterion("loginData >", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataGreaterThanOrEqualTo(Date value) {
            addCriterion("loginData >=", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataLessThan(Date value) {
            addCriterion("loginData <", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataLessThanOrEqualTo(Date value) {
            addCriterion("loginData <=", value, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataIn(List<Date> values) {
            addCriterion("loginData in", values, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataNotIn(List<Date> values) {
            addCriterion("loginData not in", values, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataBetween(Date value1, Date value2) {
            addCriterion("loginData between", value1, value2, "logindata");
            return (Criteria) this;
        }

        public Criteria andLogindataNotBetween(Date value1, Date value2) {
            addCriterion("loginData not between", value1, value2, "logindata");
            return (Criteria) this;
        }

        public Criteria andLoginmessageIsNull() {
            addCriterion("loginMessage is null");
            return (Criteria) this;
        }

        public Criteria andLoginmessageIsNotNull() {
            addCriterion("loginMessage is not null");
            return (Criteria) this;
        }

        public Criteria andLoginmessageEqualTo(String value) {
            addCriterion("loginMessage =", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageNotEqualTo(String value) {
            addCriterion("loginMessage <>", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageGreaterThan(String value) {
            addCriterion("loginMessage >", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageGreaterThanOrEqualTo(String value) {
            addCriterion("loginMessage >=", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageLessThan(String value) {
            addCriterion("loginMessage <", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageLessThanOrEqualTo(String value) {
            addCriterion("loginMessage <=", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageLike(String value) {
            addCriterion("loginMessage like", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageNotLike(String value) {
            addCriterion("loginMessage not like", value, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageIn(List<String> values) {
            addCriterion("loginMessage in", values, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageNotIn(List<String> values) {
            addCriterion("loginMessage not in", values, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageBetween(String value1, String value2) {
            addCriterion("loginMessage between", value1, value2, "loginmessage");
            return (Criteria) this;
        }

        public Criteria andLoginmessageNotBetween(String value1, String value2) {
            addCriterion("loginMessage not between", value1, value2, "loginmessage");
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
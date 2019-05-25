package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
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

        public Criteria andCheckpointidIsNull() {
            addCriterion("checkpointID is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointidIsNotNull() {
            addCriterion("checkpointID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointidEqualTo(Integer value) {
            addCriterion("checkpointID =", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotEqualTo(Integer value) {
            addCriterion("checkpointID <>", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidGreaterThan(Integer value) {
            addCriterion("checkpointID >", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkpointID >=", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidLessThan(Integer value) {
            addCriterion("checkpointID <", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidLessThanOrEqualTo(Integer value) {
            addCriterion("checkpointID <=", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidIn(List<Integer> values) {
            addCriterion("checkpointID in", values, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotIn(List<Integer> values) {
            addCriterion("checkpointID not in", values, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidBetween(Integer value1, Integer value2) {
            addCriterion("checkpointID between", value1, value2, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkpointID not between", value1, value2, "checkpointid");
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

        public Criteria andToaltimeEqualTo(Integer value) {
            addCriterion("toalTime =", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotEqualTo(Integer value) {
            addCriterion("toalTime <>", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThan(Integer value) {
            addCriterion("toalTime >", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("toalTime >=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThan(Integer value) {
            addCriterion("toalTime <", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("toalTime <=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeIn(List<Integer> values) {
            addCriterion("toalTime in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotIn(List<Integer> values) {
            addCriterion("toalTime not in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeBetween(Integer value1, Integer value2) {
            addCriterion("toalTime between", value1, value2, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("toalTime not between", value1, value2, "toaltime");
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

        public Criteria andSavetimeIsNull() {
            addCriterion("saveTime is null");
            return (Criteria) this;
        }

        public Criteria andSavetimeIsNotNull() {
            addCriterion("saveTime is not null");
            return (Criteria) this;
        }

        public Criteria andSavetimeEqualTo(Date value) {
            addCriterion("saveTime =", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotEqualTo(Date value) {
            addCriterion("saveTime <>", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThan(Date value) {
            addCriterion("saveTime >", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("saveTime >=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThan(Date value) {
            addCriterion("saveTime <", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeLessThanOrEqualTo(Date value) {
            addCriterion("saveTime <=", value, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeIn(List<Date> values) {
            addCriterion("saveTime in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotIn(List<Date> values) {
            addCriterion("saveTime not in", values, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeBetween(Date value1, Date value2) {
            addCriterion("saveTime between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andSavetimeNotBetween(Date value1, Date value2) {
            addCriterion("saveTime not between", value1, value2, "savetime");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNull() {
            addCriterion("isSuccess is null");
            return (Criteria) this;
        }

        public Criteria andIssuccessIsNotNull() {
            addCriterion("isSuccess is not null");
            return (Criteria) this;
        }

        public Criteria andIssuccessEqualTo(Integer value) {
            addCriterion("isSuccess =", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotEqualTo(Integer value) {
            addCriterion("isSuccess <>", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThan(Integer value) {
            addCriterion("isSuccess >", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("isSuccess >=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThan(Integer value) {
            addCriterion("isSuccess <", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessLessThanOrEqualTo(Integer value) {
            addCriterion("isSuccess <=", value, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessIn(List<Integer> values) {
            addCriterion("isSuccess in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotIn(List<Integer> values) {
            addCriterion("isSuccess not in", values, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess between", value1, value2, "issuccess");
            return (Criteria) this;
        }

        public Criteria andIssuccessNotBetween(Integer value1, Integer value2) {
            addCriterion("isSuccess not between", value1, value2, "issuccess");
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
package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FreedommodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FreedommodeExample() {
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

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeIsNull() {
            addCriterion("freeModeSaveTime is null");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeIsNotNull() {
            addCriterion("freeModeSaveTime is not null");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeEqualTo(Date value) {
            addCriterion("freeModeSaveTime =", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeNotEqualTo(Date value) {
            addCriterion("freeModeSaveTime <>", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeGreaterThan(Date value) {
            addCriterion("freeModeSaveTime >", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("freeModeSaveTime >=", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeLessThan(Date value) {
            addCriterion("freeModeSaveTime <", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeLessThanOrEqualTo(Date value) {
            addCriterion("freeModeSaveTime <=", value, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeIn(List<Date> values) {
            addCriterion("freeModeSaveTime in", values, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeNotIn(List<Date> values) {
            addCriterion("freeModeSaveTime not in", values, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeBetween(Date value1, Date value2) {
            addCriterion("freeModeSaveTime between", value1, value2, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andFreemodesavetimeNotBetween(Date value1, Date value2) {
            addCriterion("freeModeSaveTime not between", value1, value2, "freemodesavetime");
            return (Criteria) this;
        }

        public Criteria andToaltimeIsNull() {
            addCriterion("toaltime is null");
            return (Criteria) this;
        }

        public Criteria andToaltimeIsNotNull() {
            addCriterion("toaltime is not null");
            return (Criteria) this;
        }

        public Criteria andToaltimeEqualTo(Integer value) {
            addCriterion("toaltime =", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotEqualTo(Integer value) {
            addCriterion("toaltime <>", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThan(Integer value) {
            addCriterion("toaltime >", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("toaltime >=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThan(Integer value) {
            addCriterion("toaltime <", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeLessThanOrEqualTo(Integer value) {
            addCriterion("toaltime <=", value, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeIn(List<Integer> values) {
            addCriterion("toaltime in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotIn(List<Integer> values) {
            addCriterion("toaltime not in", values, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeBetween(Integer value1, Integer value2) {
            addCriterion("toaltime between", value1, value2, "toaltime");
            return (Criteria) this;
        }

        public Criteria andToaltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("toaltime not between", value1, value2, "toaltime");
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
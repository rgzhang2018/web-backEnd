package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BbstalkExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BbstalkExample() {
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

        public Criteria andTalkidIsNull() {
            addCriterion("talkID is null");
            return (Criteria) this;
        }

        public Criteria andTalkidIsNotNull() {
            addCriterion("talkID is not null");
            return (Criteria) this;
        }

        public Criteria andTalkidEqualTo(Integer value) {
            addCriterion("talkID =", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotEqualTo(Integer value) {
            addCriterion("talkID <>", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidGreaterThan(Integer value) {
            addCriterion("talkID >", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("talkID >=", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidLessThan(Integer value) {
            addCriterion("talkID <", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidLessThanOrEqualTo(Integer value) {
            addCriterion("talkID <=", value, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidIn(List<Integer> values) {
            addCriterion("talkID in", values, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotIn(List<Integer> values) {
            addCriterion("talkID not in", values, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidBetween(Integer value1, Integer value2) {
            addCriterion("talkID between", value1, value2, "talkid");
            return (Criteria) this;
        }

        public Criteria andTalkidNotBetween(Integer value1, Integer value2) {
            addCriterion("talkID not between", value1, value2, "talkid");
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

        public Criteria andTalktoIsNull() {
            addCriterion("talkTo is null");
            return (Criteria) this;
        }

        public Criteria andTalktoIsNotNull() {
            addCriterion("talkTo is not null");
            return (Criteria) this;
        }

        public Criteria andTalktoEqualTo(Integer value) {
            addCriterion("talkTo =", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoNotEqualTo(Integer value) {
            addCriterion("talkTo <>", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoGreaterThan(Integer value) {
            addCriterion("talkTo >", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoGreaterThanOrEqualTo(Integer value) {
            addCriterion("talkTo >=", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoLessThan(Integer value) {
            addCriterion("talkTo <", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoLessThanOrEqualTo(Integer value) {
            addCriterion("talkTo <=", value, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoIn(List<Integer> values) {
            addCriterion("talkTo in", values, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoNotIn(List<Integer> values) {
            addCriterion("talkTo not in", values, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoBetween(Integer value1, Integer value2) {
            addCriterion("talkTo between", value1, value2, "talkto");
            return (Criteria) this;
        }

        public Criteria andTalktoNotBetween(Integer value1, Integer value2) {
            addCriterion("talkTo not between", value1, value2, "talkto");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNull() {
            addCriterion("likeCount is null");
            return (Criteria) this;
        }

        public Criteria andLikecountIsNotNull() {
            addCriterion("likeCount is not null");
            return (Criteria) this;
        }

        public Criteria andLikecountEqualTo(Integer value) {
            addCriterion("likeCount =", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotEqualTo(Integer value) {
            addCriterion("likeCount <>", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThan(Integer value) {
            addCriterion("likeCount >", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("likeCount >=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThan(Integer value) {
            addCriterion("likeCount <", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountLessThanOrEqualTo(Integer value) {
            addCriterion("likeCount <=", value, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountIn(List<Integer> values) {
            addCriterion("likeCount in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotIn(List<Integer> values) {
            addCriterion("likeCount not in", values, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountBetween(Integer value1, Integer value2) {
            addCriterion("likeCount between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andLikecountNotBetween(Integer value1, Integer value2) {
            addCriterion("likeCount not between", value1, value2, "likecount");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageIsNull() {
            addCriterion("BBSTalkMessage is null");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageIsNotNull() {
            addCriterion("BBSTalkMessage is not null");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageEqualTo(String value) {
            addCriterion("BBSTalkMessage =", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageNotEqualTo(String value) {
            addCriterion("BBSTalkMessage <>", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageGreaterThan(String value) {
            addCriterion("BBSTalkMessage >", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageGreaterThanOrEqualTo(String value) {
            addCriterion("BBSTalkMessage >=", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageLessThan(String value) {
            addCriterion("BBSTalkMessage <", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageLessThanOrEqualTo(String value) {
            addCriterion("BBSTalkMessage <=", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageLike(String value) {
            addCriterion("BBSTalkMessage like", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageNotLike(String value) {
            addCriterion("BBSTalkMessage not like", value, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageIn(List<String> values) {
            addCriterion("BBSTalkMessage in", values, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageNotIn(List<String> values) {
            addCriterion("BBSTalkMessage not in", values, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageBetween(String value1, String value2) {
            addCriterion("BBSTalkMessage between", value1, value2, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalkmessageNotBetween(String value1, String value2) {
            addCriterion("BBSTalkMessage not between", value1, value2, "bbstalkmessage");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeIsNull() {
            addCriterion("bbstalkTime is null");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeIsNotNull() {
            addCriterion("bbstalkTime is not null");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeEqualTo(Date value) {
            addCriterion("bbstalkTime =", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeNotEqualTo(Date value) {
            addCriterion("bbstalkTime <>", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeGreaterThan(Date value) {
            addCriterion("bbstalkTime >", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bbstalkTime >=", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeLessThan(Date value) {
            addCriterion("bbstalkTime <", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeLessThanOrEqualTo(Date value) {
            addCriterion("bbstalkTime <=", value, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeIn(List<Date> values) {
            addCriterion("bbstalkTime in", values, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeNotIn(List<Date> values) {
            addCriterion("bbstalkTime not in", values, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeBetween(Date value1, Date value2) {
            addCriterion("bbstalkTime between", value1, value2, "bbstalktime");
            return (Criteria) this;
        }

        public Criteria andBbstalktimeNotBetween(Date value1, Date value2) {
            addCriterion("bbstalkTime not between", value1, value2, "bbstalktime");
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
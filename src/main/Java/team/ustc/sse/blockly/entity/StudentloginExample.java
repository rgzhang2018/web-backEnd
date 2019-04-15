package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.List;

public class StudentloginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentloginExample() {
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

        public Criteria andStudentaccountIsNull() {
            addCriterion("studentAccount is null");
            return (Criteria) this;
        }

        public Criteria andStudentaccountIsNotNull() {
            addCriterion("studentAccount is not null");
            return (Criteria) this;
        }

        public Criteria andStudentaccountEqualTo(String value) {
            addCriterion("studentAccount =", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountNotEqualTo(String value) {
            addCriterion("studentAccount <>", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountGreaterThan(String value) {
            addCriterion("studentAccount >", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountGreaterThanOrEqualTo(String value) {
            addCriterion("studentAccount >=", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountLessThan(String value) {
            addCriterion("studentAccount <", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountLessThanOrEqualTo(String value) {
            addCriterion("studentAccount <=", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountLike(String value) {
            addCriterion("studentAccount like", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountNotLike(String value) {
            addCriterion("studentAccount not like", value, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountIn(List<String> values) {
            addCriterion("studentAccount in", values, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountNotIn(List<String> values) {
            addCriterion("studentAccount not in", values, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountBetween(String value1, String value2) {
            addCriterion("studentAccount between", value1, value2, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentaccountNotBetween(String value1, String value2) {
            addCriterion("studentAccount not between", value1, value2, "studentaccount");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNull() {
            addCriterion("studentPassword is null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIsNotNull() {
            addCriterion("studentPassword is not null");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordEqualTo(String value) {
            addCriterion("studentPassword =", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotEqualTo(String value) {
            addCriterion("studentPassword <>", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThan(String value) {
            addCriterion("studentPassword >", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("studentPassword >=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThan(String value) {
            addCriterion("studentPassword <", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLessThanOrEqualTo(String value) {
            addCriterion("studentPassword <=", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordLike(String value) {
            addCriterion("studentPassword like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotLike(String value) {
            addCriterion("studentPassword not like", value, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordIn(List<String> values) {
            addCriterion("studentPassword in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotIn(List<String> values) {
            addCriterion("studentPassword not in", values, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordBetween(String value1, String value2) {
            addCriterion("studentPassword between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andStudentpasswordNotBetween(String value1, String value2) {
            addCriterion("studentPassword not between", value1, value2, "studentpassword");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("nickname is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("nickname is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("nickname =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("nickname <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("nickname >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("nickname >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("nickname <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("nickname <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("nickname like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("nickname not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("nickname in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("nickname not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("nickname between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("nickname not between", value1, value2, "nickname");
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
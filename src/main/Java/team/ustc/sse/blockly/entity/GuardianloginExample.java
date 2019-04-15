package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.List;

public class GuardianloginExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuardianloginExample() {
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

        public Criteria andGuardianaccountIsNull() {
            addCriterion("guardianAccount is null");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountIsNotNull() {
            addCriterion("guardianAccount is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountEqualTo(String value) {
            addCriterion("guardianAccount =", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountNotEqualTo(String value) {
            addCriterion("guardianAccount <>", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountGreaterThan(String value) {
            addCriterion("guardianAccount >", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountGreaterThanOrEqualTo(String value) {
            addCriterion("guardianAccount >=", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountLessThan(String value) {
            addCriterion("guardianAccount <", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountLessThanOrEqualTo(String value) {
            addCriterion("guardianAccount <=", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountLike(String value) {
            addCriterion("guardianAccount like", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountNotLike(String value) {
            addCriterion("guardianAccount not like", value, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountIn(List<String> values) {
            addCriterion("guardianAccount in", values, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountNotIn(List<String> values) {
            addCriterion("guardianAccount not in", values, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountBetween(String value1, String value2) {
            addCriterion("guardianAccount between", value1, value2, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianaccountNotBetween(String value1, String value2) {
            addCriterion("guardianAccount not between", value1, value2, "guardianaccount");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordIsNull() {
            addCriterion("guardianPassword is null");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordIsNotNull() {
            addCriterion("guardianPassword is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordEqualTo(String value) {
            addCriterion("guardianPassword =", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordNotEqualTo(String value) {
            addCriterion("guardianPassword <>", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordGreaterThan(String value) {
            addCriterion("guardianPassword >", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("guardianPassword >=", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordLessThan(String value) {
            addCriterion("guardianPassword <", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordLessThanOrEqualTo(String value) {
            addCriterion("guardianPassword <=", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordLike(String value) {
            addCriterion("guardianPassword like", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordNotLike(String value) {
            addCriterion("guardianPassword not like", value, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordIn(List<String> values) {
            addCriterion("guardianPassword in", values, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordNotIn(List<String> values) {
            addCriterion("guardianPassword not in", values, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordBetween(String value1, String value2) {
            addCriterion("guardianPassword between", value1, value2, "guardianpassword");
            return (Criteria) this;
        }

        public Criteria andGuardianpasswordNotBetween(String value1, String value2) {
            addCriterion("guardianPassword not between", value1, value2, "guardianpassword");
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
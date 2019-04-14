package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GuardianExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GuardianExample() {
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

        public Criteria andGuardiannameIsNull() {
            addCriterion("guardianName is null");
            return (Criteria) this;
        }

        public Criteria andGuardiannameIsNotNull() {
            addCriterion("guardianName is not null");
            return (Criteria) this;
        }

        public Criteria andGuardiannameEqualTo(String value) {
            addCriterion("guardianName =", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameNotEqualTo(String value) {
            addCriterion("guardianName <>", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameGreaterThan(String value) {
            addCriterion("guardianName >", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameGreaterThanOrEqualTo(String value) {
            addCriterion("guardianName >=", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameLessThan(String value) {
            addCriterion("guardianName <", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameLessThanOrEqualTo(String value) {
            addCriterion("guardianName <=", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameLike(String value) {
            addCriterion("guardianName like", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameNotLike(String value) {
            addCriterion("guardianName not like", value, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameIn(List<String> values) {
            addCriterion("guardianName in", values, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameNotIn(List<String> values) {
            addCriterion("guardianName not in", values, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameBetween(String value1, String value2) {
            addCriterion("guardianName between", value1, value2, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiannameNotBetween(String value1, String value2) {
            addCriterion("guardianName not between", value1, value2, "guardianname");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderIsNull() {
            addCriterion("guardianGender is null");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderIsNotNull() {
            addCriterion("guardianGender is not null");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderEqualTo(String value) {
            addCriterion("guardianGender =", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderNotEqualTo(String value) {
            addCriterion("guardianGender <>", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderGreaterThan(String value) {
            addCriterion("guardianGender >", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderGreaterThanOrEqualTo(String value) {
            addCriterion("guardianGender >=", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderLessThan(String value) {
            addCriterion("guardianGender <", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderLessThanOrEqualTo(String value) {
            addCriterion("guardianGender <=", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderLike(String value) {
            addCriterion("guardianGender like", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderNotLike(String value) {
            addCriterion("guardianGender not like", value, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderIn(List<String> values) {
            addCriterion("guardianGender in", values, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderNotIn(List<String> values) {
            addCriterion("guardianGender not in", values, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderBetween(String value1, String value2) {
            addCriterion("guardianGender between", value1, value2, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardiangenderNotBetween(String value1, String value2) {
            addCriterion("guardianGender not between", value1, value2, "guardiangender");
            return (Criteria) this;
        }

        public Criteria andGuardianemailIsNull() {
            addCriterion("guardianEmail is null");
            return (Criteria) this;
        }

        public Criteria andGuardianemailIsNotNull() {
            addCriterion("guardianEmail is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianemailEqualTo(String value) {
            addCriterion("guardianEmail =", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailNotEqualTo(String value) {
            addCriterion("guardianEmail <>", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailGreaterThan(String value) {
            addCriterion("guardianEmail >", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailGreaterThanOrEqualTo(String value) {
            addCriterion("guardianEmail >=", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailLessThan(String value) {
            addCriterion("guardianEmail <", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailLessThanOrEqualTo(String value) {
            addCriterion("guardianEmail <=", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailLike(String value) {
            addCriterion("guardianEmail like", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailNotLike(String value) {
            addCriterion("guardianEmail not like", value, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailIn(List<String> values) {
            addCriterion("guardianEmail in", values, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailNotIn(List<String> values) {
            addCriterion("guardianEmail not in", values, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailBetween(String value1, String value2) {
            addCriterion("guardianEmail between", value1, value2, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianemailNotBetween(String value1, String value2) {
            addCriterion("guardianEmail not between", value1, value2, "guardianemail");
            return (Criteria) this;
        }

        public Criteria andGuardianageIsNull() {
            addCriterion("guardianAge is null");
            return (Criteria) this;
        }

        public Criteria andGuardianageIsNotNull() {
            addCriterion("guardianAge is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianageEqualTo(Integer value) {
            addCriterion("guardianAge =", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageNotEqualTo(Integer value) {
            addCriterion("guardianAge <>", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageGreaterThan(Integer value) {
            addCriterion("guardianAge >", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageGreaterThanOrEqualTo(Integer value) {
            addCriterion("guardianAge >=", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageLessThan(Integer value) {
            addCriterion("guardianAge <", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageLessThanOrEqualTo(Integer value) {
            addCriterion("guardianAge <=", value, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageIn(List<Integer> values) {
            addCriterion("guardianAge in", values, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageNotIn(List<Integer> values) {
            addCriterion("guardianAge not in", values, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageBetween(Integer value1, Integer value2) {
            addCriterion("guardianAge between", value1, value2, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianageNotBetween(Integer value1, Integer value2) {
            addCriterion("guardianAge not between", value1, value2, "guardianage");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneIsNull() {
            addCriterion("guardianPhone is null");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneIsNotNull() {
            addCriterion("guardianPhone is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneEqualTo(String value) {
            addCriterion("guardianPhone =", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneNotEqualTo(String value) {
            addCriterion("guardianPhone <>", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneGreaterThan(String value) {
            addCriterion("guardianPhone >", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneGreaterThanOrEqualTo(String value) {
            addCriterion("guardianPhone >=", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneLessThan(String value) {
            addCriterion("guardianPhone <", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneLessThanOrEqualTo(String value) {
            addCriterion("guardianPhone <=", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneLike(String value) {
            addCriterion("guardianPhone like", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneNotLike(String value) {
            addCriterion("guardianPhone not like", value, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneIn(List<String> values) {
            addCriterion("guardianPhone in", values, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneNotIn(List<String> values) {
            addCriterion("guardianPhone not in", values, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneBetween(String value1, String value2) {
            addCriterion("guardianPhone between", value1, value2, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianphoneNotBetween(String value1, String value2) {
            addCriterion("guardianPhone not between", value1, value2, "guardianphone");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressIsNull() {
            addCriterion("guardianAddress is null");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressIsNotNull() {
            addCriterion("guardianAddress is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressEqualTo(String value) {
            addCriterion("guardianAddress =", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressNotEqualTo(String value) {
            addCriterion("guardianAddress <>", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressGreaterThan(String value) {
            addCriterion("guardianAddress >", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressGreaterThanOrEqualTo(String value) {
            addCriterion("guardianAddress >=", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressLessThan(String value) {
            addCriterion("guardianAddress <", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressLessThanOrEqualTo(String value) {
            addCriterion("guardianAddress <=", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressLike(String value) {
            addCriterion("guardianAddress like", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressNotLike(String value) {
            addCriterion("guardianAddress not like", value, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressIn(List<String> values) {
            addCriterion("guardianAddress in", values, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressNotIn(List<String> values) {
            addCriterion("guardianAddress not in", values, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressBetween(String value1, String value2) {
            addCriterion("guardianAddress between", value1, value2, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianaddressNotBetween(String value1, String value2) {
            addCriterion("guardianAddress not between", value1, value2, "guardianaddress");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkIsNull() {
            addCriterion("guardianRemark is null");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkIsNotNull() {
            addCriterion("guardianRemark is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkEqualTo(String value) {
            addCriterion("guardianRemark =", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkNotEqualTo(String value) {
            addCriterion("guardianRemark <>", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkGreaterThan(String value) {
            addCriterion("guardianRemark >", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkGreaterThanOrEqualTo(String value) {
            addCriterion("guardianRemark >=", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkLessThan(String value) {
            addCriterion("guardianRemark <", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkLessThanOrEqualTo(String value) {
            addCriterion("guardianRemark <=", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkLike(String value) {
            addCriterion("guardianRemark like", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkNotLike(String value) {
            addCriterion("guardianRemark not like", value, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkIn(List<String> values) {
            addCriterion("guardianRemark in", values, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkNotIn(List<String> values) {
            addCriterion("guardianRemark not in", values, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkBetween(String value1, String value2) {
            addCriterion("guardianRemark between", value1, value2, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianremarkNotBetween(String value1, String value2) {
            addCriterion("guardianRemark not between", value1, value2, "guardianremark");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeIsNull() {
            addCriterion("guardianRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeIsNotNull() {
            addCriterion("guardianRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeEqualTo(Date value) {
            addCriterion("guardianRegisterTime =", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeNotEqualTo(Date value) {
            addCriterion("guardianRegisterTime <>", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeGreaterThan(Date value) {
            addCriterion("guardianRegisterTime >", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("guardianRegisterTime >=", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeLessThan(Date value) {
            addCriterion("guardianRegisterTime <", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("guardianRegisterTime <=", value, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeIn(List<Date> values) {
            addCriterion("guardianRegisterTime in", values, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeNotIn(List<Date> values) {
            addCriterion("guardianRegisterTime not in", values, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeBetween(Date value1, Date value2) {
            addCriterion("guardianRegisterTime between", value1, value2, "guardianregistertime");
            return (Criteria) this;
        }

        public Criteria andGuardianregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("guardianRegisterTime not between", value1, value2, "guardianregistertime");
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
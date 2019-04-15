package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminidIsNull() {
            addCriterion("adminID is null");
            return (Criteria) this;
        }

        public Criteria andAdminidIsNotNull() {
            addCriterion("adminID is not null");
            return (Criteria) this;
        }

        public Criteria andAdminidEqualTo(Integer value) {
            addCriterion("adminID =", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotEqualTo(Integer value) {
            addCriterion("adminID <>", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThan(Integer value) {
            addCriterion("adminID >", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminID >=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThan(Integer value) {
            addCriterion("adminID <", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidLessThanOrEqualTo(Integer value) {
            addCriterion("adminID <=", value, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidIn(List<Integer> values) {
            addCriterion("adminID in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotIn(List<Integer> values) {
            addCriterion("adminID not in", values, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidBetween(Integer value1, Integer value2) {
            addCriterion("adminID between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminidNotBetween(Integer value1, Integer value2) {
            addCriterion("adminID not between", value1, value2, "adminid");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNull() {
            addCriterion("adminAccount is null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIsNotNull() {
            addCriterion("adminAccount is not null");
            return (Criteria) this;
        }

        public Criteria andAdminaccountEqualTo(String value) {
            addCriterion("adminAccount =", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotEqualTo(String value) {
            addCriterion("adminAccount <>", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThan(String value) {
            addCriterion("adminAccount >", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountGreaterThanOrEqualTo(String value) {
            addCriterion("adminAccount >=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThan(String value) {
            addCriterion("adminAccount <", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLessThanOrEqualTo(String value) {
            addCriterion("adminAccount <=", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountLike(String value) {
            addCriterion("adminAccount like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotLike(String value) {
            addCriterion("adminAccount not like", value, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountIn(List<String> values) {
            addCriterion("adminAccount in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotIn(List<String> values) {
            addCriterion("adminAccount not in", values, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountBetween(String value1, String value2) {
            addCriterion("adminAccount between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminaccountNotBetween(String value1, String value2) {
            addCriterion("adminAccount not between", value1, value2, "adminaccount");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("adminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("adminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("adminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("adminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("adminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("adminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("adminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("adminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("adminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("adminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("adminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("adminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("adminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminlevalIsNull() {
            addCriterion("adminLeval is null");
            return (Criteria) this;
        }

        public Criteria andAdminlevalIsNotNull() {
            addCriterion("adminLeval is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlevalEqualTo(Integer value) {
            addCriterion("adminLeval =", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalNotEqualTo(Integer value) {
            addCriterion("adminLeval <>", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalGreaterThan(Integer value) {
            addCriterion("adminLeval >", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalGreaterThanOrEqualTo(Integer value) {
            addCriterion("adminLeval >=", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalLessThan(Integer value) {
            addCriterion("adminLeval <", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalLessThanOrEqualTo(Integer value) {
            addCriterion("adminLeval <=", value, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalIn(List<Integer> values) {
            addCriterion("adminLeval in", values, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalNotIn(List<Integer> values) {
            addCriterion("adminLeval not in", values, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalBetween(Integer value1, Integer value2) {
            addCriterion("adminLeval between", value1, value2, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminlevalNotBetween(Integer value1, Integer value2) {
            addCriterion("adminLeval not between", value1, value2, "adminleval");
            return (Criteria) this;
        }

        public Criteria andAdminmessageIsNull() {
            addCriterion("adminMessage is null");
            return (Criteria) this;
        }

        public Criteria andAdminmessageIsNotNull() {
            addCriterion("adminMessage is not null");
            return (Criteria) this;
        }

        public Criteria andAdminmessageEqualTo(String value) {
            addCriterion("adminMessage =", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageNotEqualTo(String value) {
            addCriterion("adminMessage <>", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageGreaterThan(String value) {
            addCriterion("adminMessage >", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageGreaterThanOrEqualTo(String value) {
            addCriterion("adminMessage >=", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageLessThan(String value) {
            addCriterion("adminMessage <", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageLessThanOrEqualTo(String value) {
            addCriterion("adminMessage <=", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageLike(String value) {
            addCriterion("adminMessage like", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageNotLike(String value) {
            addCriterion("adminMessage not like", value, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageIn(List<String> values) {
            addCriterion("adminMessage in", values, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageNotIn(List<String> values) {
            addCriterion("adminMessage not in", values, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageBetween(String value1, String value2) {
            addCriterion("adminMessage between", value1, value2, "adminmessage");
            return (Criteria) this;
        }

        public Criteria andAdminmessageNotBetween(String value1, String value2) {
            addCriterion("adminMessage not between", value1, value2, "adminmessage");
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
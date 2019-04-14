package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CheckpointExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CheckpointExample() {
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

        public Criteria andCheckpointidIsNull() {
            addCriterion("checkPointID is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointidIsNotNull() {
            addCriterion("checkPointID is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointidEqualTo(Integer value) {
            addCriterion("checkPointID =", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotEqualTo(Integer value) {
            addCriterion("checkPointID <>", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidGreaterThan(Integer value) {
            addCriterion("checkPointID >", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkPointID >=", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidLessThan(Integer value) {
            addCriterion("checkPointID <", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidLessThanOrEqualTo(Integer value) {
            addCriterion("checkPointID <=", value, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidIn(List<Integer> values) {
            addCriterion("checkPointID in", values, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotIn(List<Integer> values) {
            addCriterion("checkPointID not in", values, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidBetween(Integer value1, Integer value2) {
            addCriterion("checkPointID between", value1, value2, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointidNotBetween(Integer value1, Integer value2) {
            addCriterion("checkPointID not between", value1, value2, "checkpointid");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameIsNull() {
            addCriterion("checkPointName is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameIsNotNull() {
            addCriterion("checkPointName is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameEqualTo(String value) {
            addCriterion("checkPointName =", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameNotEqualTo(String value) {
            addCriterion("checkPointName <>", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameGreaterThan(String value) {
            addCriterion("checkPointName >", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameGreaterThanOrEqualTo(String value) {
            addCriterion("checkPointName >=", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameLessThan(String value) {
            addCriterion("checkPointName <", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameLessThanOrEqualTo(String value) {
            addCriterion("checkPointName <=", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameLike(String value) {
            addCriterion("checkPointName like", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameNotLike(String value) {
            addCriterion("checkPointName not like", value, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameIn(List<String> values) {
            addCriterion("checkPointName in", values, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameNotIn(List<String> values) {
            addCriterion("checkPointName not in", values, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameBetween(String value1, String value2) {
            addCriterion("checkPointName between", value1, value2, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointnameNotBetween(String value1, String value2) {
            addCriterion("checkPointName not between", value1, value2, "checkpointname");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelIsNull() {
            addCriterion("checkPointLevel is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelIsNotNull() {
            addCriterion("checkPointLevel is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelEqualTo(Integer value) {
            addCriterion("checkPointLevel =", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelNotEqualTo(Integer value) {
            addCriterion("checkPointLevel <>", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelGreaterThan(Integer value) {
            addCriterion("checkPointLevel >", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkPointLevel >=", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelLessThan(Integer value) {
            addCriterion("checkPointLevel <", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelLessThanOrEqualTo(Integer value) {
            addCriterion("checkPointLevel <=", value, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelIn(List<Integer> values) {
            addCriterion("checkPointLevel in", values, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelNotIn(List<Integer> values) {
            addCriterion("checkPointLevel not in", values, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelBetween(Integer value1, Integer value2) {
            addCriterion("checkPointLevel between", value1, value2, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("checkPointLevel not between", value1, value2, "checkpointlevel");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateIsNull() {
            addCriterion("checkPointCate is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateIsNotNull() {
            addCriterion("checkPointCate is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateEqualTo(Integer value) {
            addCriterion("checkPointCate =", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateNotEqualTo(Integer value) {
            addCriterion("checkPointCate <>", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateGreaterThan(Integer value) {
            addCriterion("checkPointCate >", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateGreaterThanOrEqualTo(Integer value) {
            addCriterion("checkPointCate >=", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateLessThan(Integer value) {
            addCriterion("checkPointCate <", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateLessThanOrEqualTo(Integer value) {
            addCriterion("checkPointCate <=", value, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateIn(List<Integer> values) {
            addCriterion("checkPointCate in", values, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateNotIn(List<Integer> values) {
            addCriterion("checkPointCate not in", values, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateBetween(Integer value1, Integer value2) {
            addCriterion("checkPointCate between", value1, value2, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcateNotBetween(Integer value1, Integer value2) {
            addCriterion("checkPointCate not between", value1, value2, "checkpointcate");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeIsNull() {
            addCriterion("checkpointCode is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeIsNotNull() {
            addCriterion("checkpointCode is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeEqualTo(String value) {
            addCriterion("checkpointCode =", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeNotEqualTo(String value) {
            addCriterion("checkpointCode <>", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeGreaterThan(String value) {
            addCriterion("checkpointCode >", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeGreaterThanOrEqualTo(String value) {
            addCriterion("checkpointCode >=", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeLessThan(String value) {
            addCriterion("checkpointCode <", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeLessThanOrEqualTo(String value) {
            addCriterion("checkpointCode <=", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeLike(String value) {
            addCriterion("checkpointCode like", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeNotLike(String value) {
            addCriterion("checkpointCode not like", value, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeIn(List<String> values) {
            addCriterion("checkpointCode in", values, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeNotIn(List<String> values) {
            addCriterion("checkpointCode not in", values, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeBetween(String value1, String value2) {
            addCriterion("checkpointCode between", value1, value2, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointcodeNotBetween(String value1, String value2) {
            addCriterion("checkpointCode not between", value1, value2, "checkpointcode");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataIsNull() {
            addCriterion("checkpointData is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataIsNotNull() {
            addCriterion("checkpointData is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataEqualTo(Date value) {
            addCriterion("checkpointData =", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataNotEqualTo(Date value) {
            addCriterion("checkpointData <>", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataGreaterThan(Date value) {
            addCriterion("checkpointData >", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataGreaterThanOrEqualTo(Date value) {
            addCriterion("checkpointData >=", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataLessThan(Date value) {
            addCriterion("checkpointData <", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataLessThanOrEqualTo(Date value) {
            addCriterion("checkpointData <=", value, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataIn(List<Date> values) {
            addCriterion("checkpointData in", values, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataNotIn(List<Date> values) {
            addCriterion("checkpointData not in", values, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataBetween(Date value1, Date value2) {
            addCriterion("checkpointData between", value1, value2, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointdataNotBetween(Date value1, Date value2) {
            addCriterion("checkpointData not between", value1, value2, "checkpointdata");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkIsNull() {
            addCriterion("checkpointRemark is null");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkIsNotNull() {
            addCriterion("checkpointRemark is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkEqualTo(String value) {
            addCriterion("checkpointRemark =", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkNotEqualTo(String value) {
            addCriterion("checkpointRemark <>", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkGreaterThan(String value) {
            addCriterion("checkpointRemark >", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkGreaterThanOrEqualTo(String value) {
            addCriterion("checkpointRemark >=", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkLessThan(String value) {
            addCriterion("checkpointRemark <", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkLessThanOrEqualTo(String value) {
            addCriterion("checkpointRemark <=", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkLike(String value) {
            addCriterion("checkpointRemark like", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkNotLike(String value) {
            addCriterion("checkpointRemark not like", value, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkIn(List<String> values) {
            addCriterion("checkpointRemark in", values, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkNotIn(List<String> values) {
            addCriterion("checkpointRemark not in", values, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkBetween(String value1, String value2) {
            addCriterion("checkpointRemark between", value1, value2, "checkpointremark");
            return (Criteria) this;
        }

        public Criteria andCheckpointremarkNotBetween(String value1, String value2) {
            addCriterion("checkpointRemark not between", value1, value2, "checkpointremark");
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
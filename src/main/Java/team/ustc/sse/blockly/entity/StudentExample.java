package team.ustc.sse.blockly.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StudentExample() {
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

        public Criteria andStudentnameIsNull() {
            addCriterion("studentName is null");
            return (Criteria) this;
        }

        public Criteria andStudentnameIsNotNull() {
            addCriterion("studentName is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnameEqualTo(String value) {
            addCriterion("studentName =", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotEqualTo(String value) {
            addCriterion("studentName <>", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThan(String value) {
            addCriterion("studentName >", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameGreaterThanOrEqualTo(String value) {
            addCriterion("studentName >=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThan(String value) {
            addCriterion("studentName <", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLessThanOrEqualTo(String value) {
            addCriterion("studentName <=", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameLike(String value) {
            addCriterion("studentName like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotLike(String value) {
            addCriterion("studentName not like", value, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameIn(List<String> values) {
            addCriterion("studentName in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotIn(List<String> values) {
            addCriterion("studentName not in", values, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameBetween(String value1, String value2) {
            addCriterion("studentName between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentnameNotBetween(String value1, String value2) {
            addCriterion("studentName not between", value1, value2, "studentname");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIsNull() {
            addCriterion("studentGender is null");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIsNotNull() {
            addCriterion("studentGender is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgenderEqualTo(String value) {
            addCriterion("studentGender =", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotEqualTo(String value) {
            addCriterion("studentGender <>", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderGreaterThan(String value) {
            addCriterion("studentGender >", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderGreaterThanOrEqualTo(String value) {
            addCriterion("studentGender >=", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLessThan(String value) {
            addCriterion("studentGender <", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLessThanOrEqualTo(String value) {
            addCriterion("studentGender <=", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderLike(String value) {
            addCriterion("studentGender like", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotLike(String value) {
            addCriterion("studentGender not like", value, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderIn(List<String> values) {
            addCriterion("studentGender in", values, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotIn(List<String> values) {
            addCriterion("studentGender not in", values, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderBetween(String value1, String value2) {
            addCriterion("studentGender between", value1, value2, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentgenderNotBetween(String value1, String value2) {
            addCriterion("studentGender not between", value1, value2, "studentgender");
            return (Criteria) this;
        }

        public Criteria andStudentemailIsNull() {
            addCriterion("studentEmail is null");
            return (Criteria) this;
        }

        public Criteria andStudentemailIsNotNull() {
            addCriterion("studentEmail is not null");
            return (Criteria) this;
        }

        public Criteria andStudentemailEqualTo(String value) {
            addCriterion("studentEmail =", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotEqualTo(String value) {
            addCriterion("studentEmail <>", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailGreaterThan(String value) {
            addCriterion("studentEmail >", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailGreaterThanOrEqualTo(String value) {
            addCriterion("studentEmail >=", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLessThan(String value) {
            addCriterion("studentEmail <", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLessThanOrEqualTo(String value) {
            addCriterion("studentEmail <=", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailLike(String value) {
            addCriterion("studentEmail like", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotLike(String value) {
            addCriterion("studentEmail not like", value, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailIn(List<String> values) {
            addCriterion("studentEmail in", values, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotIn(List<String> values) {
            addCriterion("studentEmail not in", values, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailBetween(String value1, String value2) {
            addCriterion("studentEmail between", value1, value2, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentemailNotBetween(String value1, String value2) {
            addCriterion("studentEmail not between", value1, value2, "studentemail");
            return (Criteria) this;
        }

        public Criteria andStudentageIsNull() {
            addCriterion("studentAge is null");
            return (Criteria) this;
        }

        public Criteria andStudentageIsNotNull() {
            addCriterion("studentAge is not null");
            return (Criteria) this;
        }

        public Criteria andStudentageEqualTo(Integer value) {
            addCriterion("studentAge =", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotEqualTo(Integer value) {
            addCriterion("studentAge <>", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageGreaterThan(Integer value) {
            addCriterion("studentAge >", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageGreaterThanOrEqualTo(Integer value) {
            addCriterion("studentAge >=", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageLessThan(Integer value) {
            addCriterion("studentAge <", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageLessThanOrEqualTo(Integer value) {
            addCriterion("studentAge <=", value, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageIn(List<Integer> values) {
            addCriterion("studentAge in", values, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotIn(List<Integer> values) {
            addCriterion("studentAge not in", values, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageBetween(Integer value1, Integer value2) {
            addCriterion("studentAge between", value1, value2, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentageNotBetween(Integer value1, Integer value2) {
            addCriterion("studentAge not between", value1, value2, "studentage");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNull() {
            addCriterion("studentPhone is null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIsNotNull() {
            addCriterion("studentPhone is not null");
            return (Criteria) this;
        }

        public Criteria andStudentphoneEqualTo(String value) {
            addCriterion("studentPhone =", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotEqualTo(String value) {
            addCriterion("studentPhone <>", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThan(String value) {
            addCriterion("studentPhone >", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneGreaterThanOrEqualTo(String value) {
            addCriterion("studentPhone >=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThan(String value) {
            addCriterion("studentPhone <", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLessThanOrEqualTo(String value) {
            addCriterion("studentPhone <=", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneLike(String value) {
            addCriterion("studentPhone like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotLike(String value) {
            addCriterion("studentPhone not like", value, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneIn(List<String> values) {
            addCriterion("studentPhone in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotIn(List<String> values) {
            addCriterion("studentPhone not in", values, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneBetween(String value1, String value2) {
            addCriterion("studentPhone between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentphoneNotBetween(String value1, String value2) {
            addCriterion("studentPhone not between", value1, value2, "studentphone");
            return (Criteria) this;
        }

        public Criteria andStudentschoolIsNull() {
            addCriterion("studentSchool is null");
            return (Criteria) this;
        }

        public Criteria andStudentschoolIsNotNull() {
            addCriterion("studentSchool is not null");
            return (Criteria) this;
        }

        public Criteria andStudentschoolEqualTo(String value) {
            addCriterion("studentSchool =", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolNotEqualTo(String value) {
            addCriterion("studentSchool <>", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolGreaterThan(String value) {
            addCriterion("studentSchool >", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolGreaterThanOrEqualTo(String value) {
            addCriterion("studentSchool >=", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolLessThan(String value) {
            addCriterion("studentSchool <", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolLessThanOrEqualTo(String value) {
            addCriterion("studentSchool <=", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolLike(String value) {
            addCriterion("studentSchool like", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolNotLike(String value) {
            addCriterion("studentSchool not like", value, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolIn(List<String> values) {
            addCriterion("studentSchool in", values, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolNotIn(List<String> values) {
            addCriterion("studentSchool not in", values, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolBetween(String value1, String value2) {
            addCriterion("studentSchool between", value1, value2, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentschoolNotBetween(String value1, String value2) {
            addCriterion("studentSchool not between", value1, value2, "studentschool");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNull() {
            addCriterion("studentNumber is null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIsNotNull() {
            addCriterion("studentNumber is not null");
            return (Criteria) this;
        }

        public Criteria andStudentnumberEqualTo(String value) {
            addCriterion("studentNumber =", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotEqualTo(String value) {
            addCriterion("studentNumber <>", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThan(String value) {
            addCriterion("studentNumber >", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberGreaterThanOrEqualTo(String value) {
            addCriterion("studentNumber >=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThan(String value) {
            addCriterion("studentNumber <", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLessThanOrEqualTo(String value) {
            addCriterion("studentNumber <=", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberLike(String value) {
            addCriterion("studentNumber like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotLike(String value) {
            addCriterion("studentNumber not like", value, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberIn(List<String> values) {
            addCriterion("studentNumber in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotIn(List<String> values) {
            addCriterion("studentNumber not in", values, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberBetween(String value1, String value2) {
            addCriterion("studentNumber between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentnumberNotBetween(String value1, String value2) {
            addCriterion("studentNumber not between", value1, value2, "studentnumber");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIsNull() {
            addCriterion("studentGrade is null");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIsNotNull() {
            addCriterion("studentGrade is not null");
            return (Criteria) this;
        }

        public Criteria andStudentgradeEqualTo(String value) {
            addCriterion("studentGrade =", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotEqualTo(String value) {
            addCriterion("studentGrade <>", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeGreaterThan(String value) {
            addCriterion("studentGrade >", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeGreaterThanOrEqualTo(String value) {
            addCriterion("studentGrade >=", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLessThan(String value) {
            addCriterion("studentGrade <", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLessThanOrEqualTo(String value) {
            addCriterion("studentGrade <=", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeLike(String value) {
            addCriterion("studentGrade like", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotLike(String value) {
            addCriterion("studentGrade not like", value, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeIn(List<String> values) {
            addCriterion("studentGrade in", values, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotIn(List<String> values) {
            addCriterion("studentGrade not in", values, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeBetween(String value1, String value2) {
            addCriterion("studentGrade between", value1, value2, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentgradeNotBetween(String value1, String value2) {
            addCriterion("studentGrade not between", value1, value2, "studentgrade");
            return (Criteria) this;
        }

        public Criteria andStudentremarkIsNull() {
            addCriterion("studentRemark is null");
            return (Criteria) this;
        }

        public Criteria andStudentremarkIsNotNull() {
            addCriterion("studentRemark is not null");
            return (Criteria) this;
        }

        public Criteria andStudentremarkEqualTo(String value) {
            addCriterion("studentRemark =", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkNotEqualTo(String value) {
            addCriterion("studentRemark <>", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkGreaterThan(String value) {
            addCriterion("studentRemark >", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkGreaterThanOrEqualTo(String value) {
            addCriterion("studentRemark >=", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkLessThan(String value) {
            addCriterion("studentRemark <", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkLessThanOrEqualTo(String value) {
            addCriterion("studentRemark <=", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkLike(String value) {
            addCriterion("studentRemark like", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkNotLike(String value) {
            addCriterion("studentRemark not like", value, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkIn(List<String> values) {
            addCriterion("studentRemark in", values, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkNotIn(List<String> values) {
            addCriterion("studentRemark not in", values, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkBetween(String value1, String value2) {
            addCriterion("studentRemark between", value1, value2, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentremarkNotBetween(String value1, String value2) {
            addCriterion("studentRemark not between", value1, value2, "studentremark");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeIsNull() {
            addCriterion("studentRegisterTime is null");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeIsNotNull() {
            addCriterion("studentRegisterTime is not null");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeEqualTo(Date value) {
            addCriterion("studentRegisterTime =", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeNotEqualTo(Date value) {
            addCriterion("studentRegisterTime <>", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeGreaterThan(Date value) {
            addCriterion("studentRegisterTime >", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeGreaterThanOrEqualTo(Date value) {
            addCriterion("studentRegisterTime >=", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeLessThan(Date value) {
            addCriterion("studentRegisterTime <", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeLessThanOrEqualTo(Date value) {
            addCriterion("studentRegisterTime <=", value, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeIn(List<Date> values) {
            addCriterion("studentRegisterTime in", values, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeNotIn(List<Date> values) {
            addCriterion("studentRegisterTime not in", values, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeBetween(Date value1, Date value2) {
            addCriterion("studentRegisterTime between", value1, value2, "studentregistertime");
            return (Criteria) this;
        }

        public Criteria andStudentregistertimeNotBetween(Date value1, Date value2) {
            addCriterion("studentRegisterTime not between", value1, value2, "studentregistertime");
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
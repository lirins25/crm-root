package com.lirins.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ConsigneeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ConsigneeExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNull() {
            addCriterion("consignee_name is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIsNotNull() {
            addCriterion("consignee_name is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameEqualTo(String value) {
            addCriterion("consignee_name =", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotEqualTo(String value) {
            addCriterion("consignee_name <>", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThan(String value) {
            addCriterion("consignee_name >", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_name >=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThan(String value) {
            addCriterion("consignee_name <", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLessThanOrEqualTo(String value) {
            addCriterion("consignee_name <=", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameLike(String value) {
            addCriterion("consignee_name like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotLike(String value) {
            addCriterion("consignee_name not like", value, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameIn(List<String> values) {
            addCriterion("consignee_name in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotIn(List<String> values) {
            addCriterion("consignee_name not in", values, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameBetween(String value1, String value2) {
            addCriterion("consignee_name between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneeNameNotBetween(String value1, String value2) {
            addCriterion("consignee_name not between", value1, value2, "consigneeName");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIsNull() {
            addCriterion("consignee_postcode is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIsNotNull() {
            addCriterion("consignee_postcode is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeEqualTo(String value) {
            addCriterion("consignee_postcode =", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotEqualTo(String value) {
            addCriterion("consignee_postcode <>", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeGreaterThan(String value) {
            addCriterion("consignee_postcode >", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_postcode >=", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLessThan(String value) {
            addCriterion("consignee_postcode <", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLessThanOrEqualTo(String value) {
            addCriterion("consignee_postcode <=", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeLike(String value) {
            addCriterion("consignee_postcode like", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotLike(String value) {
            addCriterion("consignee_postcode not like", value, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeIn(List<String> values) {
            addCriterion("consignee_postcode in", values, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotIn(List<String> values) {
            addCriterion("consignee_postcode not in", values, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeBetween(String value1, String value2) {
            addCriterion("consignee_postcode between", value1, value2, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneePostcodeNotBetween(String value1, String value2) {
            addCriterion("consignee_postcode not between", value1, value2, "consigneePostcode");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNull() {
            addCriterion("consignee_address is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIsNotNull() {
            addCriterion("consignee_address is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressEqualTo(String value) {
            addCriterion("consignee_address =", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotEqualTo(String value) {
            addCriterion("consignee_address <>", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThan(String value) {
            addCriterion("consignee_address >", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_address >=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThan(String value) {
            addCriterion("consignee_address <", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLessThanOrEqualTo(String value) {
            addCriterion("consignee_address <=", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressLike(String value) {
            addCriterion("consignee_address like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotLike(String value) {
            addCriterion("consignee_address not like", value, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressIn(List<String> values) {
            addCriterion("consignee_address in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotIn(List<String> values) {
            addCriterion("consignee_address not in", values, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressBetween(String value1, String value2) {
            addCriterion("consignee_address between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeAddressNotBetween(String value1, String value2) {
            addCriterion("consignee_address not between", value1, value2, "consigneeAddress");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNull() {
            addCriterion("consignee_email is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIsNotNull() {
            addCriterion("consignee_email is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailEqualTo(String value) {
            addCriterion("consignee_email =", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotEqualTo(String value) {
            addCriterion("consignee_email <>", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThan(String value) {
            addCriterion("consignee_email >", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_email >=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThan(String value) {
            addCriterion("consignee_email <", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLessThanOrEqualTo(String value) {
            addCriterion("consignee_email <=", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailLike(String value) {
            addCriterion("consignee_email like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotLike(String value) {
            addCriterion("consignee_email not like", value, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailIn(List<String> values) {
            addCriterion("consignee_email in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotIn(List<String> values) {
            addCriterion("consignee_email not in", values, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailBetween(String value1, String value2) {
            addCriterion("consignee_email between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneeEmailNotBetween(String value1, String value2) {
            addCriterion("consignee_email not between", value1, value2, "consigneeEmail");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNull() {
            addCriterion("consignee_phone is null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIsNotNull() {
            addCriterion("consignee_phone is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneEqualTo(String value) {
            addCriterion("consignee_phone =", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotEqualTo(String value) {
            addCriterion("consignee_phone <>", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThan(String value) {
            addCriterion("consignee_phone >", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_phone >=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThan(String value) {
            addCriterion("consignee_phone <", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLessThanOrEqualTo(String value) {
            addCriterion("consignee_phone <=", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneLike(String value) {
            addCriterion("consignee_phone like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotLike(String value) {
            addCriterion("consignee_phone not like", value, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneIn(List<String> values) {
            addCriterion("consignee_phone in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotIn(List<String> values) {
            addCriterion("consignee_phone not in", values, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneBetween(String value1, String value2) {
            addCriterion("consignee_phone between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andConsigneePhoneNotBetween(String value1, String value2) {
            addCriterion("consignee_phone not between", value1, value2, "consigneePhone");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIsNull() {
            addCriterion("distribution_mode is null");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIsNotNull() {
            addCriterion("distribution_mode is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionModeEqualTo(String value) {
            addCriterion("distribution_mode =", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotEqualTo(String value) {
            addCriterion("distribution_mode <>", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeGreaterThan(String value) {
            addCriterion("distribution_mode >", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeGreaterThanOrEqualTo(String value) {
            addCriterion("distribution_mode >=", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLessThan(String value) {
            addCriterion("distribution_mode <", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLessThanOrEqualTo(String value) {
            addCriterion("distribution_mode <=", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeLike(String value) {
            addCriterion("distribution_mode like", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotLike(String value) {
            addCriterion("distribution_mode not like", value, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeIn(List<String> values) {
            addCriterion("distribution_mode in", values, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotIn(List<String> values) {
            addCriterion("distribution_mode not in", values, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeBetween(String value1, String value2) {
            addCriterion("distribution_mode between", value1, value2, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionModeNotBetween(String value1, String value2) {
            addCriterion("distribution_mode not between", value1, value2, "distributionMode");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceIsNull() {
            addCriterion("distribution_price is null");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceIsNotNull() {
            addCriterion("distribution_price is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceEqualTo(Double value) {
            addCriterion("distribution_price =", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceNotEqualTo(Double value) {
            addCriterion("distribution_price <>", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceGreaterThan(Double value) {
            addCriterion("distribution_price >", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("distribution_price >=", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceLessThan(Double value) {
            addCriterion("distribution_price <", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceLessThanOrEqualTo(Double value) {
            addCriterion("distribution_price <=", value, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceIn(List<Double> values) {
            addCriterion("distribution_price in", values, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceNotIn(List<Double> values) {
            addCriterion("distribution_price not in", values, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceBetween(Double value1, Double value2) {
            addCriterion("distribution_price between", value1, value2, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andDistributionPriceNotBetween(Double value1, Double value2) {
            addCriterion("distribution_price not between", value1, value2, "distributionPrice");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeIsNull() {
            addCriterion("consignee_gettime is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeIsNotNull() {
            addCriterion("consignee_gettime is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeEqualTo(Date value) {
            addCriterion("consignee_gettime =", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeNotEqualTo(Date value) {
            addCriterion("consignee_gettime <>", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeGreaterThan(Date value) {
            addCriterion("consignee_gettime >", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consignee_gettime >=", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeLessThan(Date value) {
            addCriterion("consignee_gettime <", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeLessThanOrEqualTo(Date value) {
            addCriterion("consignee_gettime <=", value, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeIn(List<Date> values) {
            addCriterion("consignee_gettime in", values, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeNotIn(List<Date> values) {
            addCriterion("consignee_gettime not in", values, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeBetween(Date value1, Date value2) {
            addCriterion("consignee_gettime between", value1, value2, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeGettimeNotBetween(Date value1, Date value2) {
            addCriterion("consignee_gettime not between", value1, value2, "consigneeGettime");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteIsNull() {
            addCriterion("consignee_note is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteIsNotNull() {
            addCriterion("consignee_note is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteEqualTo(String value) {
            addCriterion("consignee_note =", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteNotEqualTo(String value) {
            addCriterion("consignee_note <>", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteGreaterThan(String value) {
            addCriterion("consignee_note >", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("consignee_note >=", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteLessThan(String value) {
            addCriterion("consignee_note <", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteLessThanOrEqualTo(String value) {
            addCriterion("consignee_note <=", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteLike(String value) {
            addCriterion("consignee_note like", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteNotLike(String value) {
            addCriterion("consignee_note not like", value, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteIn(List<String> values) {
            addCriterion("consignee_note in", values, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteNotIn(List<String> values) {
            addCriterion("consignee_note not in", values, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteBetween(String value1, String value2) {
            addCriterion("consignee_note between", value1, value2, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andConsigneeNoteNotBetween(String value1, String value2) {
            addCriterion("consignee_note not between", value1, value2, "consigneeNote");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Date value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Date value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Date value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Date value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Date value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Date> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Date> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Date value1, Date value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Date value1, Date value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNull() {
            addCriterion("creator_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIsNotNull() {
            addCriterion("creator_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorIdEqualTo(Long value) {
            addCriterion("creator_id =", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotEqualTo(Long value) {
            addCriterion("creator_id <>", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThan(Long value) {
            addCriterion("creator_id >", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("creator_id >=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThan(Long value) {
            addCriterion("creator_id <", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdLessThanOrEqualTo(Long value) {
            addCriterion("creator_id <=", value, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdIn(List<Long> values) {
            addCriterion("creator_id in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotIn(List<Long> values) {
            addCriterion("creator_id not in", values, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdBetween(Long value1, Long value2) {
            addCriterion("creator_id between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andCreatorIdNotBetween(Long value1, Long value2) {
            addCriterion("creator_id not between", value1, value2, "creatorId");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNull() {
            addCriterion("update_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIsNotNull() {
            addCriterion("update_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateIdEqualTo(Long value) {
            addCriterion("update_id =", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotEqualTo(Long value) {
            addCriterion("update_id <>", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThan(Long value) {
            addCriterion("update_id >", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_id >=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThan(Long value) {
            addCriterion("update_id <", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdLessThanOrEqualTo(Long value) {
            addCriterion("update_id <=", value, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdIn(List<Long> values) {
            addCriterion("update_id in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotIn(List<Long> values) {
            addCriterion("update_id not in", values, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdBetween(Long value1, Long value2) {
            addCriterion("update_id between", value1, value2, "updateId");
            return (Criteria) this;
        }

        public Criteria andUpdateIdNotBetween(Long value1, Long value2) {
            addCriterion("update_id not between", value1, value2, "updateId");
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
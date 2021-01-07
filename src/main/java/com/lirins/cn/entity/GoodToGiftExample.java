package com.lirins.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodToGiftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodToGiftExample() {
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

        public Criteria andGoodToGiftIdIsNull() {
            addCriterion("good_to_gift_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdIsNotNull() {
            addCriterion("good_to_gift_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdEqualTo(Long value) {
            addCriterion("good_to_gift_id =", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdNotEqualTo(Long value) {
            addCriterion("good_to_gift_id <>", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdGreaterThan(Long value) {
            addCriterion("good_to_gift_id >", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_to_gift_id >=", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdLessThan(Long value) {
            addCriterion("good_to_gift_id <", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdLessThanOrEqualTo(Long value) {
            addCriterion("good_to_gift_id <=", value, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdIn(List<Long> values) {
            addCriterion("good_to_gift_id in", values, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdNotIn(List<Long> values) {
            addCriterion("good_to_gift_id not in", values, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdBetween(Long value1, Long value2) {
            addCriterion("good_to_gift_id between", value1, value2, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftIdNotBetween(Long value1, Long value2) {
            addCriterion("good_to_gift_id not between", value1, value2, "goodToGiftId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNull() {
            addCriterion("good_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodIdIsNotNull() {
            addCriterion("good_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodIdEqualTo(Long value) {
            addCriterion("good_id =", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotEqualTo(Long value) {
            addCriterion("good_id <>", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThan(Long value) {
            addCriterion("good_id >", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("good_id >=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThan(Long value) {
            addCriterion("good_id <", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdLessThanOrEqualTo(Long value) {
            addCriterion("good_id <=", value, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdIn(List<Long> values) {
            addCriterion("good_id in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotIn(List<Long> values) {
            addCriterion("good_id not in", values, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdBetween(Long value1, Long value2) {
            addCriterion("good_id between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodIdNotBetween(Long value1, Long value2) {
            addCriterion("good_id not between", value1, value2, "goodId");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNull() {
            addCriterion("good_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodNameIsNotNull() {
            addCriterion("good_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNameEqualTo(String value) {
            addCriterion("good_name =", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotEqualTo(String value) {
            addCriterion("good_name <>", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThan(String value) {
            addCriterion("good_name >", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameGreaterThanOrEqualTo(String value) {
            addCriterion("good_name >=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThan(String value) {
            addCriterion("good_name <", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLessThanOrEqualTo(String value) {
            addCriterion("good_name <=", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameLike(String value) {
            addCriterion("good_name like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotLike(String value) {
            addCriterion("good_name not like", value, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameIn(List<String> values) {
            addCriterion("good_name in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotIn(List<String> values) {
            addCriterion("good_name not in", values, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameBetween(String value1, String value2) {
            addCriterion("good_name between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andGoodNameNotBetween(String value1, String value2) {
            addCriterion("good_name not between", value1, value2, "goodName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Long value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Long value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Long value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Long value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Long> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Long> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Long value1, Long value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(String value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(String value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(String value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(String value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(String value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(String value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLike(String value) {
            addCriterion("brand_id like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotLike(String value) {
            addCriterion("brand_id not like", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<String> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<String> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(String value1, String value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(String value1, String value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNull() {
            addCriterion("good_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIsNotNull() {
            addCriterion("good_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodPriceEqualTo(Double value) {
            addCriterion("good_price =", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotEqualTo(Double value) {
            addCriterion("good_price <>", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThan(Double value) {
            addCriterion("good_price >", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("good_price >=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThan(Double value) {
            addCriterion("good_price <", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceLessThanOrEqualTo(Double value) {
            addCriterion("good_price <=", value, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceIn(List<Double> values) {
            addCriterion("good_price in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotIn(List<Double> values) {
            addCriterion("good_price not in", values, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceBetween(Double value1, Double value2) {
            addCriterion("good_price between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodPriceNotBetween(Double value1, Double value2) {
            addCriterion("good_price not between", value1, value2, "goodPrice");
            return (Criteria) this;
        }

        public Criteria andGoodCostIsNull() {
            addCriterion("good_cost is null");
            return (Criteria) this;
        }

        public Criteria andGoodCostIsNotNull() {
            addCriterion("good_cost is not null");
            return (Criteria) this;
        }

        public Criteria andGoodCostEqualTo(Double value) {
            addCriterion("good_cost =", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostNotEqualTo(Double value) {
            addCriterion("good_cost <>", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostGreaterThan(Double value) {
            addCriterion("good_cost >", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostGreaterThanOrEqualTo(Double value) {
            addCriterion("good_cost >=", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostLessThan(Double value) {
            addCriterion("good_cost <", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostLessThanOrEqualTo(Double value) {
            addCriterion("good_cost <=", value, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostIn(List<Double> values) {
            addCriterion("good_cost in", values, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostNotIn(List<Double> values) {
            addCriterion("good_cost not in", values, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostBetween(Double value1, Double value2) {
            addCriterion("good_cost between", value1, value2, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodCostNotBetween(Double value1, Double value2) {
            addCriterion("good_cost not between", value1, value2, "goodCost");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberIsNull() {
            addCriterion("good_to_gift_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberIsNotNull() {
            addCriterion("good_to_gift_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberEqualTo(Long value) {
            addCriterion("good_to_gift_number =", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberNotEqualTo(Long value) {
            addCriterion("good_to_gift_number <>", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberGreaterThan(Long value) {
            addCriterion("good_to_gift_number >", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("good_to_gift_number >=", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberLessThan(Long value) {
            addCriterion("good_to_gift_number <", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberLessThanOrEqualTo(Long value) {
            addCriterion("good_to_gift_number <=", value, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberIn(List<Long> values) {
            addCriterion("good_to_gift_number in", values, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberNotIn(List<Long> values) {
            addCriterion("good_to_gift_number not in", values, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberBetween(Long value1, Long value2) {
            addCriterion("good_to_gift_number between", value1, value2, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andGoodToGiftNumberNotBetween(Long value1, Long value2) {
            addCriterion("good_to_gift_number not between", value1, value2, "goodToGiftNumber");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNull() {
            addCriterion("auditor is null");
            return (Criteria) this;
        }

        public Criteria andAuditorIsNotNull() {
            addCriterion("auditor is not null");
            return (Criteria) this;
        }

        public Criteria andAuditorEqualTo(String value) {
            addCriterion("auditor =", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotEqualTo(String value) {
            addCriterion("auditor <>", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThan(String value) {
            addCriterion("auditor >", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorGreaterThanOrEqualTo(String value) {
            addCriterion("auditor >=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThan(String value) {
            addCriterion("auditor <", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLessThanOrEqualTo(String value) {
            addCriterion("auditor <=", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorLike(String value) {
            addCriterion("auditor like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotLike(String value) {
            addCriterion("auditor not like", value, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorIn(List<String> values) {
            addCriterion("auditor in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotIn(List<String> values) {
            addCriterion("auditor not in", values, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorBetween(String value1, String value2) {
            addCriterion("auditor between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditorNotBetween(String value1, String value2) {
            addCriterion("auditor not between", value1, value2, "auditor");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIsNull() {
            addCriterion("audit_idea is null");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIsNotNull() {
            addCriterion("audit_idea is not null");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaEqualTo(String value) {
            addCriterion("audit_idea =", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotEqualTo(String value) {
            addCriterion("audit_idea <>", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaGreaterThan(String value) {
            addCriterion("audit_idea >", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaGreaterThanOrEqualTo(String value) {
            addCriterion("audit_idea >=", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLessThan(String value) {
            addCriterion("audit_idea <", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLessThanOrEqualTo(String value) {
            addCriterion("audit_idea <=", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaLike(String value) {
            addCriterion("audit_idea like", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotLike(String value) {
            addCriterion("audit_idea not like", value, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaIn(List<String> values) {
            addCriterion("audit_idea in", values, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotIn(List<String> values) {
            addCriterion("audit_idea not in", values, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaBetween(String value1, String value2) {
            addCriterion("audit_idea between", value1, value2, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditIdeaNotBetween(String value1, String value2) {
            addCriterion("audit_idea not between", value1, value2, "auditIdea");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNull() {
            addCriterion("audit_state is null");
            return (Criteria) this;
        }

        public Criteria andAuditStateIsNotNull() {
            addCriterion("audit_state is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStateEqualTo(String value) {
            addCriterion("audit_state =", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotEqualTo(String value) {
            addCriterion("audit_state <>", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThan(String value) {
            addCriterion("audit_state >", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateGreaterThanOrEqualTo(String value) {
            addCriterion("audit_state >=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThan(String value) {
            addCriterion("audit_state <", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLessThanOrEqualTo(String value) {
            addCriterion("audit_state <=", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateLike(String value) {
            addCriterion("audit_state like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotLike(String value) {
            addCriterion("audit_state not like", value, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateIn(List<String> values) {
            addCriterion("audit_state in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotIn(List<String> values) {
            addCriterion("audit_state not in", values, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateBetween(String value1, String value2) {
            addCriterion("audit_state between", value1, value2, "auditState");
            return (Criteria) this;
        }

        public Criteria andAuditStateNotBetween(String value1, String value2) {
            addCriterion("audit_state not between", value1, value2, "auditState");
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
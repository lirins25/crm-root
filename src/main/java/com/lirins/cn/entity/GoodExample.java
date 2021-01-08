package com.lirins.cn.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GoodExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GoodExample() {
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

        public Criteria andGoodNumberIsNull() {
            addCriterion("good_number is null");
            return (Criteria) this;
        }

        public Criteria andGoodNumberIsNotNull() {
            addCriterion("good_number is not null");
            return (Criteria) this;
        }

        public Criteria andGoodNumberEqualTo(Long value) {
            addCriterion("good_number =", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotEqualTo(Long value) {
            addCriterion("good_number <>", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberGreaterThan(Long value) {
            addCriterion("good_number >", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("good_number >=", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberLessThan(Long value) {
            addCriterion("good_number <", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberLessThanOrEqualTo(Long value) {
            addCriterion("good_number <=", value, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberIn(List<Long> values) {
            addCriterion("good_number in", values, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotIn(List<Long> values) {
            addCriterion("good_number not in", values, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberBetween(Long value1, Long value2) {
            addCriterion("good_number between", value1, value2, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodNumberNotBetween(Long value1, Long value2) {
            addCriterion("good_number not between", value1, value2, "goodNumber");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNull() {
            addCriterion("good_state is null");
            return (Criteria) this;
        }

        public Criteria andGoodStateIsNotNull() {
            addCriterion("good_state is not null");
            return (Criteria) this;
        }

        public Criteria andGoodStateEqualTo(String value) {
            addCriterion("good_state =", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotEqualTo(String value) {
            addCriterion("good_state <>", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThan(String value) {
            addCriterion("good_state >", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateGreaterThanOrEqualTo(String value) {
            addCriterion("good_state >=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThan(String value) {
            addCriterion("good_state <", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLessThanOrEqualTo(String value) {
            addCriterion("good_state <=", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateLike(String value) {
            addCriterion("good_state like", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotLike(String value) {
            addCriterion("good_state not like", value, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateIn(List<String> values) {
            addCriterion("good_state in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotIn(List<String> values) {
            addCriterion("good_state not in", values, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateBetween(String value1, String value2) {
            addCriterion("good_state between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodStateNotBetween(String value1, String value2) {
            addCriterion("good_state not between", value1, value2, "goodState");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountIsNull() {
            addCriterion("good_discount is null");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountIsNotNull() {
            addCriterion("good_discount is not null");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountEqualTo(Double value) {
            addCriterion("good_discount =", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountNotEqualTo(Double value) {
            addCriterion("good_discount <>", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountGreaterThan(Double value) {
            addCriterion("good_discount >", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("good_discount >=", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountLessThan(Double value) {
            addCriterion("good_discount <", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountLessThanOrEqualTo(Double value) {
            addCriterion("good_discount <=", value, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountIn(List<Double> values) {
            addCriterion("good_discount in", values, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountNotIn(List<Double> values) {
            addCriterion("good_discount not in", values, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountBetween(Double value1, Double value2) {
            addCriterion("good_discount between", value1, value2, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodDiscountNotBetween(Double value1, Double value2) {
            addCriterion("good_discount not between", value1, value2, "goodDiscount");
            return (Criteria) this;
        }

        public Criteria andGoodGiftIsNull() {
            addCriterion("good_gift is null");
            return (Criteria) this;
        }

        public Criteria andGoodGiftIsNotNull() {
            addCriterion("good_gift is not null");
            return (Criteria) this;
        }

        public Criteria andGoodGiftEqualTo(String value) {
            addCriterion("good_gift =", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftNotEqualTo(String value) {
            addCriterion("good_gift <>", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftGreaterThan(String value) {
            addCriterion("good_gift >", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftGreaterThanOrEqualTo(String value) {
            addCriterion("good_gift >=", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftLessThan(String value) {
            addCriterion("good_gift <", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftLessThanOrEqualTo(String value) {
            addCriterion("good_gift <=", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftLike(String value) {
            addCriterion("good_gift like", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftNotLike(String value) {
            addCriterion("good_gift not like", value, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftIn(List<String> values) {
            addCriterion("good_gift in", values, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftNotIn(List<String> values) {
            addCriterion("good_gift not in", values, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftBetween(String value1, String value2) {
            addCriterion("good_gift between", value1, value2, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodGiftNotBetween(String value1, String value2) {
            addCriterion("good_gift not between", value1, value2, "goodGift");
            return (Criteria) this;
        }

        public Criteria andGoodImgIsNull() {
            addCriterion("good_img is null");
            return (Criteria) this;
        }

        public Criteria andGoodImgIsNotNull() {
            addCriterion("good_img is not null");
            return (Criteria) this;
        }

        public Criteria andGoodImgEqualTo(String value) {
            addCriterion("good_img =", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgNotEqualTo(String value) {
            addCriterion("good_img <>", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgGreaterThan(String value) {
            addCriterion("good_img >", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgGreaterThanOrEqualTo(String value) {
            addCriterion("good_img >=", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgLessThan(String value) {
            addCriterion("good_img <", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgLessThanOrEqualTo(String value) {
            addCriterion("good_img <=", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgLike(String value) {
            addCriterion("good_img like", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgNotLike(String value) {
            addCriterion("good_img not like", value, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgIn(List<String> values) {
            addCriterion("good_img in", values, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgNotIn(List<String> values) {
            addCriterion("good_img not in", values, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgBetween(String value1, String value2) {
            addCriterion("good_img between", value1, value2, "goodImg");
            return (Criteria) this;
        }

        public Criteria andGoodImgNotBetween(String value1, String value2) {
            addCriterion("good_img not between", value1, value2, "goodImg");
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
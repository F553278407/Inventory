package io.jxunix.domain;

public class Goods {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.category_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private String categoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.purchase_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Integer purchaseNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.sale_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Integer saleNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column goods.delisting
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    private Boolean delisting;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.id
     *
     * @return the value of goods.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.id
     *
     * @param id the value for goods.id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.name
     *
     * @return the value of goods.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.name
     *
     * @param name the value for goods.name
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.category_id
     *
     * @return the value of goods.category_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.category_id
     *
     * @param categoryId the value for goods.category_id
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId == null ? null : categoryId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.purchase_num
     *
     * @return the value of goods.purchase_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Integer getPurchaseNum() {
        return purchaseNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.purchase_num
     *
     * @param purchaseNum the value for goods.purchase_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setPurchaseNum(Integer purchaseNum) {
        this.purchaseNum = purchaseNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.sale_num
     *
     * @return the value of goods.sale_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Integer getSaleNum() {
        return saleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.sale_num
     *
     * @param saleNum the value for goods.sale_num
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setSaleNum(Integer saleNum) {
        this.saleNum = saleNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column goods.delisting
     *
     * @return the value of goods.delisting
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public Boolean getDelisting() {
        return delisting;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column goods.delisting
     *
     * @param delisting the value for goods.delisting
     *
     * @mbggenerated Mon Jun 20 12:35:50 CST 2016
     */
    public void setDelisting(Boolean delisting) {
        this.delisting = delisting;
    }
}
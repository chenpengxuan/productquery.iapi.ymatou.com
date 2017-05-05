package com.ymatou.productquery.domain.model;

import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangyong on 2017/4/6.
 */
public class Catalogs {
    @Property("spid")
    private String productId;

    @Property("updatetime")
    private Date updateTime;

    @Property("cid")
    private String catalogId;//	规格编号

    @Property("sid")
    private int sellerId;//	买手编号

    @Property("sku")
    private String sku;//	sku

    @Property("presale")
    private boolean isPreSale;//	是否预售规格

    @Property("earnest")
    private Double earnest;//	定金

    @Property("price")
    private Double price;//	原价

    @Property("newp")
    private Double newGuestPrice;//	新客价

    @Property("vip")
    private Double vipPrice;//	VIP价

    @Property("stock")
    private int stock;//	规格库存

    @Property("mdeliv")
    private int ExtraDelivery;//规格多物流类型

    private List<PropertyInfo> props;//	规格属性列表

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public boolean isPreSale() {
        return isPreSale;
    }

    public void setPreSale(boolean preSale) {
        this.isPreSale = preSale;
    }

    public Double getEarnest() {
        return earnest;
    }

    public void setEarnest(Double earnest) {
        this.earnest = earnest;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getNewGuestPrice() {
        return newGuestPrice;
    }

    public void setNewGuestPrice(Double newGuestPrice) {
        this.newGuestPrice = newGuestPrice;
    }

    public Double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Double vipPrice) {
        this.vipPrice = vipPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<PropertyInfo> getProps() {
        return props;
    }

    public void setProps(List<PropertyInfo> props) {
        this.props = props;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getExtraDelivery() {
        return ExtraDelivery;
    }

    public void setExtraDelivery(int extraDelivery) {
        ExtraDelivery = extraDelivery;
    }
}

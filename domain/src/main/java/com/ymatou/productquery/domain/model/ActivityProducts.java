package com.ymatou.productquery.domain.model;

import com.ymatou.productquery.domain.model.cache.CacheActivityProductInfo;
import com.ymatou.productquery.infrastructure.util.Utils;
import org.mongodb.morphia.annotations.Property;

import java.util.Date;
import java.util.List;

/**
 * Created by zhangyong on 2017/4/6.
 */
public class ActivityProducts {
    @Property("spid")
    private String productId;

    @Property("updatetime")
    private Date updateTime;

    @Property("aid")
    private int activityId;

    @Property("aname")
    private String activityName;

    @Property("inaid")
    private int productInActivityId;

    @Property("start")
    private Date startTime;

    @Property("end")
    private Date endTime;

    @Property("market")
    private Double marketPrice;

    @Property("alimit")
    private int activityLimit;

    @Property("plimit")
    private int productLimit;

    @Property("isolation")
    private boolean isTradeIsolation;

    @Property("nbuyer")
    private boolean isNewBuyer;

    @Property("part")
    private boolean isPartCatalogs;

    private List<ActivityCatalogInfo> catalogs;

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public int getProductInActivityId() {
        return productInActivityId;
    }

    public void setProductInActivityId(int productInActivityId) {
        this.productInActivityId = productInActivityId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public int getActivityLimit() {
        return activityLimit;
    }

    public void setActivityLimit(int activityLimit) {
        this.activityLimit = activityLimit;
    }

    public int getProductLimit() {
        return productLimit;
    }

    public void setProductLimit(int productLimit) {
        this.productLimit = productLimit;
    }

    public boolean isTradeIsolation() {
        return isTradeIsolation;
    }

    public void setTradeIsolation(boolean tradeIsolation) {
        isTradeIsolation = tradeIsolation;
    }

    public boolean isNewBuyer() {
        return isNewBuyer;
    }

    public void setNewBuyer(boolean newBuyer) {
        isNewBuyer = newBuyer;
    }

    public boolean isPartCatalogs() {
        return isPartCatalogs;
    }

    public void setPartCatalogs(boolean partCatalogs) {
        isPartCatalogs = partCatalogs;
    }

    public List<ActivityCatalogInfo> getCatalogs() {
        return catalogs;
    }

    public void setCatalogs(List<ActivityCatalogInfo> catalogs) {
        this.catalogs = catalogs;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 数据转换器
     * @return
     */
    public CacheActivityProductInfo convertDtoToCacheData(){
        CacheActivityProductInfo cacheActivityProductInfo = new CacheActivityProductInfo();
        Utils.copyProperties(cacheActivityProductInfo,this);
        return cacheActivityProductInfo;
    }
}


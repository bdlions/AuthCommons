package com.bdlions.dto;

/**
 *
 * @author nazmul hasan
 */
public class Stat {
    private Product product;
    private String date;
    private String clicks;
    private String impressions;
    private String ctr;
    private double cost;
    private Currency costUnit;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getClicks() {
        return clicks;
    }

    public void setClicks(String clicks) {
        this.clicks = clicks;
    }

    public String getImpressions() {
        return impressions;
    }

    public void setImpressions(String impressions) {
        this.impressions = impressions;
    }

    public String getCtr() {
        return ctr;
    }

    public void setCtr(String ctr) {
        this.ctr = ctr;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Currency getCostUnit() {
        return costUnit;
    }

    public void setCostUnit(Currency costUnit) {
        this.costUnit = costUnit;
    }
    
}

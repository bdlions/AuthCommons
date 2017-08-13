package com.auction.dto;

/**
 *
 * @author nazmul hasan
 */
public class ProductBid {
    private int id;
    private String referenceId;
    private User user;
    private Product product;
    private long createdOn;
    private String createdTime;
    private double price;
    private Currency currency;
    private CurrencyUnit currencyUnit;
    
    //this will not be added into database. 
    private String bidTime;
    public ProductBid()
    {
        this.user = new User();
        this.product = new Product();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(long createdOn) {
        this.createdOn = createdOn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public CurrencyUnit getCurrencyUnit() {
        return currencyUnit;
    }

    public void setCurrencyUnit(CurrencyUnit currencyUnit) {
        this.currencyUnit = currencyUnit;
    }

    public String getBidTime() {
        return bidTime;
    }

    public void setBidTime(String bidTime) {
        this.bidTime = bidTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }    
}

package com.auction.dto;

import java.io.Serializable;

/**
 *
 * @author nazmul hasan
 */
public class ProductAvailabilities implements Serializable{
    private int id;
    private Availability availability;
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    
}
